package models;

import java.util.ArrayList;
import java.util.List;

public class Shape {

    private List<Point> pointList = new ArrayList<>();


    public void addPoint(Point point) {
        pointList.add(point);
    }


    public double calculatePerimeter() {
        double perimeter = 0;
        int pointListSize = pointList.size();

        for(int i = 0; i < pointListSize - 1; i++) {
            Point a = pointList.get(i);
            Point b = pointList.get(i + 1);

            perimeter += a.distance(b);
        }

        Point last = pointList.get(pointListSize - 1);
        Point first = pointList.get(0);

        perimeter += last.distance(first);

        return perimeter;
    }


    public double getAverageSide() {
        return calculatePerimeter() / pointList.size();
    }


    public double getLongestSide() {
        double longestSide = 0;
        int pointListSize = pointList.size();

        for(int i = 0; i < pointListSize - 1; i++) {
            Point a = pointList.get(i);
            Point b = pointList.get(i + 1);

            double distanceSide = a.distance(b);

            if (longestSide < distanceSide) {
                longestSide = distanceSide;
            }
        }

        Point last = pointList.get(pointListSize - 1);
        Point first = pointList.get(0);

        double distanceSide = last.distance(first);

        if (longestSide < distanceSide) {
            longestSide = distanceSide;
        }

        return longestSide;
    }


    public List<Point> getPointList() {
        return pointList;
    }

    public void setPointList(List<Point> pointList) {
        this.pointList = pointList;
    }
}
