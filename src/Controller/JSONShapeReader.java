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
package Controller;

import Controller.Event.ShapeEvent;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class JSONShapeReader extends ShapeReader {

    // ListOfShapeEvents is an inner class used to wrap a list of 
    // ShapeEvent objects which hold shape details
    static class ListOfShapeEvents {

        List<ShapeEvent> listOfShapeEvents;
    }

    private ListOfShapeEvents los; // list of all the shapes

    private Gson gson; // gson object used to "parse" the JSON

    public JSONShapeReader() {
        gson = new Gson();
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
        BufferedReader br = new BufferedReader(new FileReader(file));
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
            super.storeShape(se);
        }
    }

    /**
     * This method is used to create some initial data in the JSON file which
     * can then be loaded later
     *
     * @param file the file into which to write the JSON
     */
//    public static void generateTestJSON(String file) {
//        List<ShapeEvent> list = new ArrayList<>();
//        // load in some hard-coded shapes
//        list.add(new ShapeEvent(20, 40, 30, 90, Color.red, 5, ShapeType.LINE, "SHAPE"));
//        list.add(new ShapeEvent(20, 40, 70, 90, Color.blue, 5, ShapeType.OVAL, "SHAPE"));
//        ListOfShapeEvents los = new ListOfShapeEvents();
//        los.listOfShapeEvents = list;
//        Gson gson = new Gson();
//        String json = gson.toJson(los); // convert the object to a JSON string
//
//        try {
//            FileWriter writer = new FileWriter(file);
//            writer.write(json); // write the JSON string to file
//            writer.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

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
        System.out.println("Lines loaded = " + getSlList().size());
        System.out.println("Ovals loaded = " + getOlList().size());
        System.out.println("Triangles loaded = " + getStList().size());
        System.out.println("Quadrilateral  loaded = " + getQlList().size());
    }
}
