
package models;

import java.util.ArrayList;

public class Point {
    private static boolean isFirstRequest = true;
    private double x_1;
    private double y_1;

    private static double x_2;
    private static double y_2;

    private double distance;

    public Point(double x, double y) {
        this.x_1 = x_2;
        this.y_1 = y_2;
        x_2 = x;
        y_2 = y;
    }

    public double getDistance(double x, double y) {
        if (isFirstRequest) {
            this.distance = 0;
            isFirstRequest = false;
        } else {
            x_2 = x;
            y_2 = y;


            this.distance = Math.sqrt((x_2 - x_1) * (x_2 - x_1) + (y_2 - y_1) * (y_2 - y_1));
        }
        return distance;
    }


    public String toString(double x, double y) {
        return "Point in shape " + "x: " + x + " y: " + y;
    }

    // toString
}