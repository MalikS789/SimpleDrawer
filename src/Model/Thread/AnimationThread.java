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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ms2721o
 */
public class AnimationThread extends Thread {

    private DrawingPanel DrawingPanel;
    private int timer = 1; //set this to 0 if you want dont want the thread to loop
    private double gravity = 9.8;

    public AnimationThread(DrawingPanel drawingpanel, int Timer) {
        this.DrawingPanel = drawingpanel;
        this.timer = Timer;
    }

    @Override
    public void run() {

        while (timer > 0) {
            //Get height and width of the drawing panel
            Rectangle r = DrawingPanel.getBounds();
            int h = r.height - 1;
            //int w = r.width; 

            //Go through all the shapes currently on screen
            for (int i = 0; i < DrawingPanel.getShapes().size(); i++) {

                //While looking at this particular shape:
                Object currentShape = DrawingPanel.getShapes().get(i);

                //Do the following:
                if (currentShape instanceof SimpleLine) {
                    SimpleLine Shape = (SimpleLine) currentShape;

                    //Check we haven't hit the ground
                    for (int k = 0; k < Shape.getVertices().size(); k++) {
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

                } else if (currentShape instanceof SimpleOval) {
                    SimpleOval Shape = (SimpleOval) currentShape;

                    //Check we haven't hit the ground
                    for (int k = 0; k < Shape.getVertices().size(); k++) {
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

                } else if (currentShape instanceof SimpleTriangle) {
                    SimpleTriangle Shape = (SimpleTriangle) currentShape;

                    //Check we haven't hit the ground
                    for (int k = 0; k < Shape.getVertices().size(); k++) {
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

                } else if (currentShape instanceof SimpleQuadrilateral) {
                    SimpleQuadrilateral Shape = (SimpleQuadrilateral) currentShape;

                    //Check we haven't hit the ground
                    for (int k = 0; k < Shape.getVertices().size(); k++) {
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
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(AnimationThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            DrawingPanel.repaint();
        }
    }
}
