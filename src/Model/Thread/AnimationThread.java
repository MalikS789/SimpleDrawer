/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Thread;

import Model.SimpleLine;
import Model.SimpleOval;
import Model.SimpleQuadrilateral;
import Model.SimpleTriangle;
import View.DrawingPanel;
import java.awt.Rectangle;

/**
 *
 * @author ms2721o
 */
public class AnimationThread extends Thread {

    private final DrawingPanel DrawingPanel;
    public static Boolean AnimationRunning = false;
    private double gravity = 1; //Value of gravity
    public final int n = 10; //refresh rate of the animation (ms)
    public int h; //height of drawingPanel (pixels)

    public AnimationThread(DrawingPanel drawingpanel, Boolean AnimationRunning) {
        this.DrawingPanel = drawingpanel;
        this.AnimationRunning = AnimationRunning;
    }

    public void HandleCurrentShape(Object currentShape) {
        if (currentShape instanceof SimpleLine) {
            SimpleLine Shape = (SimpleLine) currentShape;

            //Check we haven't hit the ground
            Boolean HitTheGround = false;
            for (int m = 0; m < Shape.getVertices().size(); m++) {
                if (Shape.getVertices().get(m).y > h) {
                    HitTheGround = true;
                }
            }
            if (!HitTheGround) {
                //Go through all points on the shape, and make them move
                for (int j = 0; j < Shape.getVertices().size(); j++) {
                    Shape.getVertices().get(j).y = Shape.getVertices().get(j).y + (int) gravity;
                }
            }

        } else if (currentShape instanceof SimpleOval) {
            SimpleOval Shape = (SimpleOval) currentShape;

            //Check we haven't hit the ground
            Boolean HitTheGround = false;
            for (int m = 0; m < Shape.getVertices().size(); m++) {
                if (Shape.getVertices().get(m).y > h) {
                    HitTheGround = true;
                }
            }
            if (!HitTheGround) {
                //Go through all points on the shape, and make them move
                for (int j = 0; j < Shape.getVertices().size(); j++) {
                    Shape.getVertices().get(j).y = Shape.getVertices().get(j).y + (int) gravity;
                }
            }

        } else if (currentShape instanceof SimpleTriangle) {
            SimpleTriangle Shape = (SimpleTriangle) currentShape;

            //Check we haven't hit the ground
            Boolean HitTheGround = false;
            for (int m = 0; m < Shape.getVertices().size(); m++) {
                if (Shape.getVertices().get(m).y > h) {
                    HitTheGround = true;
                }
            }
            if (!HitTheGround) {
                //Go through all points on the shape, and make them move
                for (int j = 0; j < Shape.getVertices().size(); j++) {
                    Shape.getVertices().get(j).y = Shape.getVertices().get(j).y + (int) gravity;
                }
            }

        } else if (currentShape instanceof SimpleQuadrilateral) {
            SimpleQuadrilateral Shape = (SimpleQuadrilateral) currentShape;

            //Check we haven't hit the ground
            Boolean HitTheGround = false;
            for (int m = 0; m < Shape.getVertices().size(); m++) {
                if (Shape.getVertices().get(m).y > h) {
                    HitTheGround = true;
                }
            }
            if (!HitTheGround) {
                //Go through all points on the shape, and make them move
                for (int j = 0; j < Shape.getVertices().size(); j++) {
                    Shape.getVertices().get(j).y = Shape.getVertices().get(j).y + (int) gravity;
                }
            }

        }
    }

    public void gravity() {
        //Get height and width of the drawing panel
        Rectangle r = DrawingPanel.getBounds();
        h = r.height - 1;
        //int w = r.width; 

        //Go through all the shapes currently on screen
        for (int i = 0; i < DrawingPanel.getShapes().size(); i++) {

            //While looking at this particular shape:
            Object currentShape = DrawingPanel.getShapes().get(i);

            //Do the following:
            HandleCurrentShape(currentShape);
        }
        DrawingPanel.repaint();
    }

    @Override
    public void run() {
        if (GameThread.Game) {
            GameThread.Game = false;
        }
        while (AnimationRunning && !GameThread.Game) {
            gravity();
            try {
                Thread.sleep(n);
            } catch (InterruptedException ex) {
            }
        }
    }
}
