package models;

import java.util.ArrayList;

public class Shape {
    // container of Points (e.g. ArrayList<Point>)
    private final ArrayList<Point> points = new ArrayList<>();

    // addPoint(Point) - adds to the container
    public void addPoint(Point p) {
        points.add(p);
    }

    // calculatePerimeter()
    public double calculatePerimeter() {
        int n = points.size();
        if (n < 2) return 0.0;

        double perimeter = 0.0;
        for (int i = 0; i < n; i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % n);
            perimeter += current.distance(next);
        }
        return perimeter;
    }
    // getAverageSide()
    public double getAverageSide() {
        int n = points.size();
        if (n < 2) return 0.0;
        return calculatePerimeter() / n;
    }
    // getLongestSide()
    public double getLongestSide() {
        int n = points.size();
        if (n < 2) return 0.0;

        double longest = 0.0;
        for (int i = 0; i < n; i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % n);
            double side = current.distance(next);
            if (side > longest) longest = side;
        }
        return longest;
    }
}

