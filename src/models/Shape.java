package models;

import java.util.ArrayList;

public class Shape {

    private final ArrayList<Point> points = new ArrayList<>();


    public void addPoint(Point p) {
        points.add(p);
    }


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

    public double getAverage() {
        int n = points.size();
        if (n < 2) return 0.0;

        return calculatePerimeter() / n;
    }

    public double getLongest() {
        int n = points.size();
        if (n < 2) {
            return 0.0;
        }


        double longest = 0.0;
        for (int i = 0; i < n; i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % n);
            double side = current.distance(next);
            if (side > longest) {
                longest = side;
            }
        }

        return longest;
    }
}

