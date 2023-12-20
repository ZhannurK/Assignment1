package models;

import java.util.ArrayList;


public class Shape {
    private ArrayList<Point> points;

    public Shape() {
        this.points = new ArrayList<>();
    }

    // Add a point to the container
    public void addPoint(Point point) {
        points.add(point);
    }

    // Calculate the perimeter of the shape
    public double calculatePerimeter() {
        double perimeter = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            perimeter += points.get(i).distance(points.get(i + 1));
        }

        // Add the distance between the last and the first point to close the shape
        perimeter += points.get(points.size() - 1).distance(points.get(0));

        return perimeter;
    }

    // Find the longest distance between any two points in the shape
    public double getLongestDistance() {
        if (points.size() < 2) {
            // Not enough points to find a distance
            return 0.0;
        }

        double longestDistance = points.get(points.size() - 1).distance(points.get(0));
        for (int i = 0; i < points.size() - 1; i++) {
            double distance = points.get(i).distance(points.get(i+1));
            longestDistance = Math.max(longestDistance, distance);
        }

        return longestDistance;
    }
    public double getAvarageDistance() {
        return calculatePerimeter()/points.size();
    }
}
