/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Thread;

import Controller.XMLShapeReader;
import Model.SimpleQuadrilateral;
import View.DrawerMain;
import View.DrawingPanel;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Malik
 */
public class GameThread extends Thread {

    private static DrawingPanel DrawingPanel;
    public static Boolean Game = false; //Must be true for the game to run
    private long n = 33; //Refresh rate of game
    private int DrawingPanelHeight;
    private double gravity = 1;
    private int Score = 0;
    private boolean FirstRun = true;
    public int NumberOfShapes = 4;

    public GameThread(DrawingPanel drawingpanel, Boolean GameRunning) {
        GameThread.DrawingPanel = drawingpanel;
        GameThread.Game = GameRunning;
        FirstRun = true;
    }

    public void HandleCurrentShape(SimpleQuadrilateral Shape) {

        //OR, if the mouse coordinates are within the shape before it hits the ground:  
        if (ShapeClicked(Shape.getVertices().get(0).x, Shape.getVertices().get(0).y,
                Shape.getVertices().get(1).x, Shape.getVertices().get(1).y,
                Shape.getVertices().get(2).x, Shape.getVertices().get(2).y,
                Shape.getVertices().get(3).x, Shape.getVertices().get(3).y,
                DrawingPanel.getMouseX(), DrawingPanel.getMouseY())) {
            System.out.println("Shape clicked!");
            for (int j = 0; j < Shape.getVertices().size(); j++) {
                Shape.getVertices().get(j).y = Shape.getVertices().get(j).y - DrawingPanelHeight;
            }
            Score++;
        }

        //For each coordinate on the shape:
        Boolean HitTheGround = false;

        for (int m = 0; m < Shape.getVertices().size(); m++) {
            //If the coordinate is 1 value below the ground:
            if (Shape.getVertices().get(m).y > DrawingPanelHeight) {
                HitTheGround = true;
                Game = false;
            }
        }

        if (HitTheGround == false) {
            for (int j = 0; j < Shape.getVertices().size(); j++) {
                Shape.getVertices().get(j).y = Shape.getVertices().get(j).y + (int) gravity;
            }
        }
    }

    public void gravity() {
        //Get height and width of the drawing panel
        Rectangle r = DrawingPanel.getBounds();
        DrawingPanelHeight = r.height - 1;
        //Go through all the shapes currently on screen
        for (int i = 0; i < NumberOfShapes; i++) {
            //While looking at this particular sqaure:
            SimpleQuadrilateral Shape = (SimpleQuadrilateral) (DrawingPanel.getShapes().get(i));
            //System.out.println(Shape.getVertices().get(0).toString() + Shape.getVertices().get(1).toString() + Shape.getVertices().get(2) + Shape.getVertices().get(3));
            //Do the following:
            HandleCurrentShape(Shape);
        }
        if (DrawingPanel.getShapes().size() != NumberOfShapes) {
            DrawingPanel.getShapes().remove(NumberOfShapes);
        }
        gravity = gravity + 0.02; //Speed up the gravity to make the shapes fall faster
        DrawingPanel.repaint();
    }

    @Override
    public void run() {
        while (Game) {
            if (FirstRun) {
                //The following will only run once
                AnimationThread.AnimationRunning = false;
                Game = true;
                DrawingPanel.clearDisplay();
                GenerateFallingShapes();
                FirstRun = false;
            }
            //This part will run in a loop until the user loses the game
            gravity();
            try {
                Thread.sleep(n);
            } catch (InterruptedException ex) {
            }
        }
        if (!Game) {
            //The game is over, tell the user
            DrawerMain.GameModeLabel.setText("Game Over! Score : " + Score);
        }
    }

    private void GenerateFallingShapes() {
        try {
            XMLShapeReader shapeReader = new XMLShapeReader();
            shapeReader.getShapesFromFile("game_shapes.xml");
            List listOfShapes = new ArrayList();
            listOfShapes.addAll(XMLShapeReader.getQlList());
            System.out.println(XMLShapeReader.getQlList().toString());
            DrawingPanel.setShapes(listOfShapes);
            DrawingPanel.repaint();

        } catch (ParserConfigurationException | SAXException | IOException ex) {
        }
    }

    static float FindAreaOfRectangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (float) Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
    }

    static boolean ShapeClicked(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x, int y) {
        float A = FindAreaOfRectangle(x1, y1, x2, y2, x3, y3) + FindAreaOfRectangle(x1, y1, x4, y4, x3, y3);
        float A1 = FindAreaOfRectangle(x, y, x1, y1, x2, y2);
        float A2 = FindAreaOfRectangle(x, y, x2, y2, x3, y3);
        float A3 = FindAreaOfRectangle(x, y, x3, y3, x4, y4);
        float A4 = FindAreaOfRectangle(x, y, x1, y1, x4, y4);
        return (A == A1 + A2 + A3 + A4);
    }
}
