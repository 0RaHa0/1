// models/Shape.java
package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;

    public Shape(Point[] points) {
        this.points = new ArrayList<>();
        for (Point point : points) {
            this.points.add(point);
        }
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public double perimeter() {
        double perimeter = 0;
        int size = points.size();
        for (int i = 0; i < size; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % size);
            perimeter += currentPoint.distanceTo(nextPoint);
        }
        return perimeter;
    }

    public double longestSide() {
        double longestSide = 0;
        int size = points.size();
        for (int i = 0; i < size; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % size);
            double sideLength = currentPoint.distanceTo(nextPoint);
            if (sideLength > longestSide) {
                longestSide = sideLength;
            }
        }
        return longestSide;
    }

    public double averageSide() {
        int size = points.size();
        if (size <= 1) {
            return 0;
        }

        double totalSideLength = perimeter();
        return totalSideLength / size;
    }
}

