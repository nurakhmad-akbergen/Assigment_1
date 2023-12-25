package models;

import java.util.ArrayList;

public class Shape {


    ArrayList<Point> pointsList = new ArrayList<>();
    private static double Perimeter;
    private static double LongestSide = 0.0;


    public Shape(){

    }

    public void addPoint(Point point){
        this.pointsList.add(point);
    }

    public void calculatePerimeter(double distance){
        Perimeter += distance;
        if(distance > LongestSide){
            LongestSide = distance;
        }
    }

    public double getPerimeter() {
        return Perimeter;
    }

    public double getAverageSide(int sidesCount){
        return Perimeter / sidesCount;
    }

    public double getLongestSide(){
        return LongestSide;
    }


    // getLongestSide()
}