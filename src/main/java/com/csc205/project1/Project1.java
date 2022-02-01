package com.csc205.project1;

import java.awt.*;

/**
 * Driver class used to test Point implementation for Project 1.
 *
 * @author Ray Hedgecock - Thuan Nguyen
 * @version 1.2
 */

class Point{

    // Variables
    private double x,y;

    // Default Constructor
    public Point(){
        x = y = 0;
    }

    // Parameterized Constructor
    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }

    // Find distance between the stored point and provided point
    // Using the distance between two points formula
    public double distance(Point p){
        double dist = Math.sqrt( Math.pow((this.x-p.getX()),2)+Math.pow((this.y-p.getY()),2));
        return dist;
    }

    // GetX function
    public double getX() {
        return x;
    }

    // SetX function
    public void setX(double x) {
        this.x = x;
    }

    // GetY function
    public double getY() {
        return y;
    }

    // SetY function
    public void setY(double y) {
        this.y = y;
    }

    // Change the values variables x and y with new values
    public void setPoint(double new_x, double new_y){
        this.x = new_x;
        this.y = new_y;
    }

    // Shifting x by distance provided in parameter
    public void shiftX(double dist){
        this.x+=dist;
    }

    // Shifting y by distance provided in parameter
    public void shiftY(double dist){
        this.y+=dist;
    }

    // Rotating the point , by given angle provided in radians
    public void rotate(double radian){
        this.x = (x*(Math.cos(radian)))-(y*(Math.sin(radian)));
        this.y = (x*(Math.sin(radian)))+(y*(Math.cos(radian)));
    }

    // Overriding the toString 
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}


// Tester class
public class Project1 {

    public static void main(String[] args) {

        System.out.println("Project 1 : Point Tester\n");

        Point a = new Point(3.0, 1.0);
        Point b = new Point();
        b.setPoint(6.0, 5.0);

        System.out.println("Point 1: " + a);
        System.out.println("Point 2: " + b);

        System.out.println("\nDistance: " + a.distance(b));

        double rotation = Math.PI / 2.0;
        a.rotate(rotation);
        System.out.println("\nRotated a " + rotation + ": " + a);

        Point b2 = new Point(b.getX(), b.getY());
        b.shiftX(4);
        b.shiftY(-2);
        System.out.println("Shifted b " + b.distance(b2) + " away from original position: " + b);

    }
}
