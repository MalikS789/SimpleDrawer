/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Event.ShapeEvent;
import static Controller.ShapeType.LINE;
import static Controller.ShapeType.OVAL;
import static Controller.ShapeType.TRIANGLE;
import Model.SimpleLine;
import Model.SimpleOval;
import Model.SimpleQuadrilateral;
import Model.SimpleTriangle;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import static Controller.ShapeType.QUADRILATERAL;

/**
 *
 * @author Malik
 */
public class ShapeReader {

    protected static List<SimpleLine> slList; // list of lines
    protected static List<SimpleOval> olList; // list of ovals
    protected static List<SimpleTriangle> stList; //list of triangles
    protected static List<SimpleQuadrilateral> qlList; //list of quadrilaterals

    public ShapeReader() {
        slList = new ArrayList<>();
        olList = new ArrayList<>();
        stList = new ArrayList<>();
        qlList = new ArrayList<>();
    }

    /**
     *
     * @return the list of line shapes
     */
    public static List<SimpleLine> getSlList() {
        return slList;
    }

    /**
     *
     * @return the list of oval shapes
     */
    public static List<SimpleOval> getOlList() {
        return olList;
    }

    /**
     *
     * @return the list of triangle shapes
     */
    public static List<SimpleTriangle> getStList() {
        return stList;
    }

    public static List<SimpleQuadrilateral> getQlList() {
        return qlList;
    }

    /**
     * Called each time a shape has been read. The shape is stored in the
     * appropriate list according to type.
     *
     * @param se the ShapeEvent object containing details of the shape to be
     * stored.
     */
    public void storeShape(ShapeEvent se) {
        switch (se.getShapeType()) {
            case LINE: // store the line
                List<Point> LinePoints = new ArrayList<>();
                LinePoints.add(new Point(se.getXStart(), se.getYStart()));
                LinePoints.add(new Point(se.getXEnd(), se.getYEnd()));
                SimpleLine sl = new SimpleLine(LinePoints, se.getColour(), se.getThickness(), ShapeType.LINE);
                slList.add(sl);
                break;
            case OVAL: // store the oval
                List<Point> OvalPoints = new ArrayList<>();
                OvalPoints.add(new Point(se.getXStart(), se.getYStart()));
                OvalPoints.add(new Point(se.getXEnd(), se.getYEnd()));
                SimpleOval ol = new SimpleOval(OvalPoints, se.getColour(), se.getThickness(), ShapeType.OVAL);
                olList.add(ol);
                break;
            case TRIANGLE:
                List<Point> TrianglePoints = new ArrayList<>();
                TrianglePoints.add(new Point(se.getXStart(), se.getYStart()));
                TrianglePoints.add(new Point(se.getXextra(), se.getYextra()));
                TrianglePoints.add(new Point(se.getXEnd(), se.getYEnd()));
                SimpleTriangle st = new SimpleTriangle(TrianglePoints, se.getColour(), se.getThickness(), ShapeType.TRIANGLE);
                stList.add(st);
                break;
            case QUADRILATERAL: // store the quadrilateral
                List<Point> QuadrilateralPoints = new ArrayList<>();
                QuadrilateralPoints.add(new Point(se.getXStart(), se.getYStart()));
                QuadrilateralPoints.add(new Point(se.getXextra(), se.getYextra()));
                QuadrilateralPoints.add(new Point(se.getXXextra(), se.getYYextra()));
                QuadrilateralPoints.add(new Point(se.getXEnd(), se.getYEnd()));
                SimpleQuadrilateral ss = new SimpleQuadrilateral(QuadrilateralPoints, se.getColour(), se.getThickness(), ShapeType.QUADRILATERAL);
                qlList.add(ss);
                break;
        }
    }
}
