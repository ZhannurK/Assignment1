package models;

public class Point {
    private double x;
    private double y;

    // Constructor with both parameters
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Calculate distance between two points
    public double distance(Point dest) {
        double deltaX = dest.x - this.x;
        double deltaY = dest.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Getter methods for x and y if needed
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
