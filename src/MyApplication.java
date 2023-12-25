import models.Point;
import models.Shape;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/nurahmadakbergen/IdeaProjects/test/out/production/test/source.txt");

        Scanner scan = new Scanner(file);

        Shape shape = new Shape();
        int sidesCount = 0;

        while (scan.hasNext()) {
            sidesCount = sidesCount + 1;
            double x = scan.nextDouble();
            double y = scan.nextDouble();

            Point point = new Point(x, y);


            System.out.println("Distance: " + point.getDistance(x, y));
            System.out.println(point.toString(x, y));
            shape.addPoint(point);
            shape.calculatePerimeter(point.getDistance(x, y));

        }

        System.out.println("Perimeter of shape: " + shape.getPerimeter());
        System.out.println("Average of shape: " + shape.getAverageSide(sidesCount));
        System.out.println("Longest of shape: " + shape.getLongestSide());



    }
}