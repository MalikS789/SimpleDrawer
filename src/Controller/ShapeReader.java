/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.SimpleLine;
import Model.SimpleOval;
import Model.SimpleSquare;
import Model.SimpleTriangle;
import java.util.ArrayList;
import java.util.List;

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
}
