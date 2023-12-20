import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MyApplication {
    public static void main(String[] args) {
        // Create 10 random points
        Point[] points = new Point[10];
        for (int i = 0; i < 10; i++) {
            points[i] = new Point(Math.random() * 10, Math.random() * 10);
        }

        // Create a shape with the random points
        Shape myShape = new Shape(points);

        // Test methods
        System.out.println("Perimeter: " + myShape.perimeter());
        System.out.println("Longest Side: " + myShape.longestSide());
        System.out.println("Average Side: " + myShape.averageSide());
    }
}
