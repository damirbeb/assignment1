package models;

public class Shape {
    private Point[] points;

    // Constructor to initialize a shape with an array of points
    public Shape(Point[] points) {
        this.points = points;
    }

    // Calculate and return the perimeter of the shape
    public double perimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.length - 1; i++) {
            perimeter += points[i].distanceTo(points[i + 1]);
        }
        perimeter += points[points.length - 1].distanceTo(points[0]); // Closing the shape
        return perimeter;
    }

    // Find and return the length of the longest side in the shape
    public double longestSide() {
        double longestSide = 0;
        for (int i = 0; i < points.length - 1; i++) {
            double sideLength = points[i].distanceTo(points[i + 1]);
            if (sideLength > longestSide) {
                longestSide = sideLength;
            }
        }
        longestSide = Math.max(longestSide, points[points.length - 1].distanceTo(points[0])); // Closing the shape
        return longestSide;
    }

    // Calculate and return the average length of the sides in the shape
    public double averageSide() {
        double totalSideLength = 0;
        for (int i = 0; i < points.length - 1; i++) {
            totalSideLength += points[i].distanceTo(points[i + 1]);
        }
        totalSideLength += points[points.length - 1].distanceTo(points[0]); // Closing the shape
        return totalSideLength / points.length;
    }
}

