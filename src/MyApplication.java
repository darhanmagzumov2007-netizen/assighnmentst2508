import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\Users\user\IdeaProjects\assighnmentst2508\src\MyApplication.java");
        Scanner sc = new Scanner(file);
        sc.useLocale(Locale.US);
        sc.useDelimiter("[,\\n\\r]+");



        Shape shape = new Shape();

        while (sc.hasNextDouble()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }
        sc.close();

        System.out.println(shape.calculatePerimeterDarkhan());
        System.out.println(shape.getAverageDarkhan());
        System.out.println(shape.getLongestDarkhan());
    }
}
// submission
