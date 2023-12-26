// MyApplication.java
import models.Point;
import models.Shape;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class MyApplication {
    public static void main(String[] args) {
        // Read coordinates from file.
        Point[] points = readPointsFromFile("coordinates.txt");

        // Create a shape with the read points
        Shape myShape = new Shape(points);

        // Test methods
        System.out.println("Perimeter: " + myShape.perimeter());
        System.out.println("Longest Side: " + myShape.longestSide());
        System.out.println("Average Side: " + myShape.averageSide());
    }
    // Method to read points from file and create Point objects
    private static Point[] readPointsFromFile(String fileName) {
        ArrayList<Point> pointsList = new ArrayList<>();

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            // Read each line in the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] coordinates = line.split(" ");
                double x = Double.parseDouble(coordinates[0]);
                double y = Double.parseDouble(coordinates[1]);
                pointsList.add(new Point(x, y));// Create Point object and add to list
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            // Error message if file not found
            System.out.println("File not found: " + e.getMessage());
        }

        return pointsList.toArray(new Point[0]);
    }
}

