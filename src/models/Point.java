package models;

public class Point {
    private double x;
    private double y;

    // constructor having both parameters
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // distance(Point dest) - distance from current point to the dest point
    public double distance(Point dest) {
        double dx = dest.x - this.x;
        double dy = dest.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    // toString
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}

