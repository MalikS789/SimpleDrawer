/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Event.ShapeEvent;
import Event.ShapeType;
import static Event.ShapeType.LINE;
import static Event.ShapeType.OVAL;
import static Event.ShapeType.SQUARE;
import static Event.ShapeType.TRIANGLE;
import Model.SimpleLine;
import Model.SimpleOval;
import Model.SimpleSquare;
import Model.SimpleTriangle;
import java.awt.Point;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.SAXException;

/**
 *
 * @author Malik
 */
public class ShapeReader {

    public static List<SimpleLine> slList; // list of lines
    public static List<SimpleOval> olList; // list of ovals
    public static List<SimpleTriangle> stList; //list of triangles
    public static List<SimpleSquare> ssList; //list of squares

    public ShapeReader() {
        slList = new ArrayList<>();
        olList = new ArrayList<>();
        stList = new ArrayList<>();
        ssList = new ArrayList<>();
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

    public static List<SimpleSquare> getSsList() {
        return ssList;
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
                SimpleLine sl = new SimpleLine(se.getXStart(), se.getYStart(), se.getXEnd(), se.getYEnd(), se.getColour(), se.getThickness(), ShapeType.LINE);
                slList.add(sl);
                break;
            case OVAL: // store the oval
                SimpleOval ol = new SimpleOval(se.getXStart(), se.getYStart(), se.getXEnd(), se.getYEnd(), se.getColour(), se.getThickness(), ShapeType.OVAL);
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
            case SQUARE: // store the square
                List<Point> SquarePoints = new ArrayList<>();
                SquarePoints.add(new Point(se.getXStart(), se.getYStart()));
                SquarePoints.add(new Point(se.getXextra(), se.getYextra()));
                SquarePoints.add(new Point(se.getXXextra(), se.getYYextra())); 
                SquarePoints.add(new Point(se.getXEnd(), se.getYEnd()));
                SimpleSquare ss = new SimpleSquare(SquarePoints, se.getColour(), se.getThickness(), ShapeType.SQUARE);
                ssList.add(ss);
                break;
        }
    }
}
