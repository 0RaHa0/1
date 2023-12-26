package models;
// 2D point representation.
public class Point {
    private double x;
    private double y;
    // Constructor: sets initial coordinates for the point
    public Point (double x,double y) {
        this.x=x;
        this.y=y;

    }
    // Calculates distance between two points
    public double distanceTo(Point destination) {
        double deltaX = destination.x - this.x;
        double deltaY = destination.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    // Returns string representation of the point
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
