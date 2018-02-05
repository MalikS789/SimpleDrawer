/*
 * JSONShapeREader.java
 *
 * @author Gill Windall
 *
 * Used to read shapes from a file stored in JSON format.  Uses the Gson
 * library to convert the JSON from the file into Java objects in memory.
 * You can read more about Gson at https://code.google.com/p/google-gson/
 *
 */
package simpledrawer;

import com.google.gson.*;
import java.awt.Color;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JSONShapeReader {

    // ListOfShapeEvents is an inner class used to wrap a list of 
    // ShapeEvent objects which hold shape details
    static class ListOfShapeEvents {

        List<ShapeEvent> listOfShapeEvents;
    }

    private ListOfShapeEvents los; // list of all the shapes
    private List<SimpleLine> slList; // list of lines
    private List<SimpleOval> olList; // list of ovals
    private List<SimpleTriangle> stList; // list of triangles
    private List<SimpleSquare> ssList;

    private Gson gson; // gson object used to "parse" the JSON

    public JSONShapeReader() {
        gson = new Gson();
        slList = new ArrayList<>();
        olList = new ArrayList<>();
        stList = new ArrayList<>();
        ssList = new ArrayList<>();
    }

    /**
     * Read the shapes in JSON format from file. The shapes are initially read
     * into a single list (listOfShapeEvents) and then split into separate lists
     * according to type of shape.
     *
     * @param file the file from which to read the JSON
     * @throws FileNotFoundException
     */
    public void getShapesFromFile(String file) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(
                new FileReader(file));
        los = gson.fromJson(br, ListOfShapeEvents.class); // load the shapes
        storeShapes(); // store in separate lists according to type
    }

    /**
     * Read through the list of shapes that have been loaded from file and
     * create an appropriate shape object according to type and store it in the
     * relevant list.
     */
    private void storeShapes() {

        for (ShapeEvent se : los.listOfShapeEvents) {
            switch (se.getShapeType()) {
                case LINE:  // store the line
                    SimpleLine sl = new SimpleLine(se.getXStart(), se.getYStart(), se.getYStart(), se.getYEnd(), se.getColour(), se.getThickness(), ShapeType.LINE);
                    slList.add(sl);
                    break;
                case OVAL:  // store the oval
                    SimpleOval ol = new SimpleOval(se.getXStart(), se.getYStart(), se.getYStart(), se.getYEnd(), se.getColour(), se.getThickness(), ShapeType.OVAL);
                    olList.add(ol);
                    break;
                case TRIANGLE:  // store the triangle
                    List<Point> currentPoints = new ArrayList<>();
                    Point nextPoint = new Point();
                    nextPoint.x = se.getXStart();
                    nextPoint.y = se.getYStart();
                    currentPoints.add(nextPoint);
                    nextPoint.x = se.getYStart();
                    nextPoint.y = se.getYEnd();
                    currentPoints.add(nextPoint);
                    nextPoint.x = se.getXextra();
                    nextPoint.y = se.getYextra();
                    currentPoints.add(nextPoint);
                    SimpleTriangle st = new SimpleTriangle(currentPoints, se.getColour(), se.getThickness(), ShapeType.TRIANGLE);
                    stList.add(st);
                    break;
                case SQUARE:  // store the square
                    List<Point> currentPointss = new ArrayList<>();
                    Point nextPointt = new Point();
                    nextPointt.x = se.getXStart();
                    nextPointt.y = se.getYStart();
                    currentPointss.add(nextPointt);
                    nextPointt.x = se.getYStart();
                    nextPointt.y = se.getYEnd();
                    currentPointss.add(nextPointt);
                    nextPointt.x = se.getXextra();
                    nextPointt.y = se.getYextra();
                    currentPointss.add(nextPointt);
                    nextPointt.x = se.getXXextra();
                    nextPointt.y = se.getYYextra();
                    currentPointss.add(nextPointt);
                    SimpleSquare ss = new SimpleSquare(currentPointss, se.getColour(), se.getThickness(), ShapeType.SQUARE);
                    ssList.add(ss);
                    break;
            }
        }
    }

    /**
     *
     * @return the list of line shapes
     */
    public List<SimpleLine> getSlList() {
        return slList;
    }

    /**
     *
     * @return the list of oval shapes
     */
    public List<SimpleOval> getOlList() {
        return olList;
    }

    /**
     *
     * @return the list of triangle shapes
     */
    public List<SimpleTriangle> getStList() {
        return stList;
    }

    public List<SimpleSquare> getSsList() {
        return ssList;
    }

    /**
     * This method is used to create some initial data in the JSON file which
     * can then be loaded later
     *
     * @param file the file into which to write the JSON
     */
    private static void generateTestJSON(String file) {
        List<ShapeEvent> list = new ArrayList<>();
        // load in some hard-coded shapes
        list.add(new ShapeEvent(20, 40, 30, 90, Color.red, 5, ShapeType.LINE, "SHAPE"));
        list.add(new ShapeEvent(20, 40, 70, 90, Color.blue, 5, ShapeType.OVAL, "SHAPE"));
        list.add(new ShapeEvent(80, 95, 70, 45, Color.green, 5, ShapeType.LINE, "SHAPE"));
        ListOfShapeEvents los = new ListOfShapeEvents();
        los.listOfShapeEvents = list;
        Gson gson = new Gson();
        String json = gson.toJson(los); // convert the object to a JSON string

        try {
            FileWriter writer = new FileWriter(file);
            writer.write(json); // write the JSON string to file
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Main method is just for testing in standalone mode
     *
     * @param args unused
     */
    public static void main(String[] args) throws FileNotFoundException {

//        generateTestJSON("stored_shapes.json"); // uncomment if you wish to 
        // create a file of JSON
        // Read the JSON from file and output number of lines and number
        // of ovals read.
        JSONShapeReader me = new JSONShapeReader();
        me.getShapesFromFile("stored_shapes.json");
        System.out.println("Lines loaded = " + me.slList.size());
        System.out.println("Ovals loaded = " + me.olList.size());
        System.out.println("Triangles loaded = " + me.stList.size());
    }
}
