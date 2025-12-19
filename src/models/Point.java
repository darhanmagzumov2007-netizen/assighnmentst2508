package models;

public class Point {
    private double x;
    private double y;

   
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
   
    public double distance(Point dest) {
        double dx = dest.x - this.x;
        double dy = dest.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}

