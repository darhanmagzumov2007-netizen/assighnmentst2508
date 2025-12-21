package models;

public class Point {
    private double x;
    private double y;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double distance(Point dest) {
        double distance_x = this.x - dest.getX();
        double distance_y = this.y - dest.getY();

        return Math.sqrt(Math.pow(distance_x, 2) + Math.pow(distance_y, 2));
    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}