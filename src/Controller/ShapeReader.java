/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Event.ShapeEvent;
import Model.ShapeType;
import Model.SimpleLine;
import Model.SimpleOval;
import Model.SimpleSquare;
import Model.SimpleTriangle;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Malik
 */
public class ShapeReader {

    protected List<SimpleLine> slList; // list of lines
    protected List<SimpleOval> olList; // list of ovals
    protected List<SimpleTriangle> stList; //list of triangles
    protected List<SimpleSquare> ssList; //list of squares

    public ShapeReader() {
        slList = new ArrayList<>();
        olList = new ArrayList<>();
        stList = new ArrayList<>();
        ssList = new ArrayList<>();
    }

    protected void StoreShapes(ShapeEvent se) {
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

    public List<SimpleLine> getSlList() {
        return slList;
    }

    public List<SimpleOval> getOlList() {
        return olList;
    }

    public List<SimpleTriangle> getStList() {
        return stList;
    }

    public List<SimpleSquare> getSsList() {
        return ssList;
    }
}
