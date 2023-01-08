import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssignmentOne {
    public static Point getPoint(String line) {
        String[] coordinates = line.split(", ");

        int x = Integer.parseInt(coordinates[0]);
        int y = Integer.parseInt(coordinates[1]);

        Point point = new Point(x, y);

        return point;
    }

    public static void main(String[] args) {
        try {
            File points = new File("src/file1.txt");
            Scanner scanner = new Scanner(points);

            Point origin = new Point(0, 0);

            while (scanner.hasNextLine()) {
                Point point = getPoint(scanner.nextLine());

                System.out.println("Distance from: " + point + " to " + origin + " = " + point.distance(origin));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        try {
            File points = new File("src/file2.txt");
            Scanner scanner = new Scanner(points);

            Shape shape = new Shape();

            while (scanner.hasNextLine()) {
                Point point = getPoint(scanner.nextLine());
                shape.addPoint(point);
            }

            System.out.println("Shape's Points: ");
            for (Point point : shape.getPoints()) {
                System.out.println(point);
            }

            System.out.println("Shape's Perimeter: " + shape.calculatePerimeter());
            System.out.println("Shape's Longest side: " + shape.getLongestSide());
            System.out.println("Shape's Average side: " + shape.getAverageSide());

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}