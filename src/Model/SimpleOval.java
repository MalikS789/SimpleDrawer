/*
 * SimpleOval.java
 *
 * @author Gill Windall
 *
 * Represents an oval that can be drawn on a drawing area
 *
 */
package Model;

import java.awt.Color;
import java.awt.Point;
import java.util.List;
import javax.ejb.Stateless;
import Controller.ShapeType;
import Model.Interface.SimpleArea;

@Stateless
public class SimpleOval extends SimpleShape implements SimpleArea {

    public SimpleOval(List<Point> v, Color c, int t, ShapeType so) {
        super(v, c, t, so);
    }

    /**
     *
     * @return the area in pixels of the ellipse. Does this always work?
     */
    public double getArea() {
        int line1 = getVertices().get(1).x - getVertices().get(0).x;
        int line2 = getVertices().get(1).y - getVertices().get(0).y;
        System.out.println(line1 + ", " + line2 + " " + Math.PI * line1 / 2 * line2 / 2);
        return Math.PI * line1 / 2 * line2 / 2;
    }

    public int getxBottomRight() {
        return this.vertices.get(1).x;
    }

    public void setxBottomRight(int temp) {
        this.vertices.get(1).x = temp;
    }

    public int getyBottomRight() {
        return this.vertices.get(1).y;
    }

    public void setyBottomRight(int temp) {
        this.vertices.get(1).y = temp;
    }
}
