import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\user\\IdeaProjects\\assighnmentst2508\\src\\source");

        Scanner sc = new Scanner(file);

        Shape shape = new Shape();

        while (sc.hasNextDouble()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getAverage());
        System.out.println(shape.getLongest());
    }
}

