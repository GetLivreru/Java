import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;

    public Shape() {
        points = new ArrayList<Point>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        int length = points.size();

        for (int i = 0; i < length; i++) {
            perimeter += points.get(i).distance(points.get(i == length - 1 ? 0 : i + 1));
        }

        return perimeter;
    }

    public double getLongestSide() {
        double longestSide = 0;
        int length = points.size();

        for (int i = 0; i < length; i++) {
            double sideLength;

            sideLength = points.get(i).distance(points.get(i == length - 1 ? 0 : i + 1));

            if (sideLength > longestSide) {
                longestSide = sideLength;
            }
        }

        return longestSide;
    }

    public double getAverageSide() {
        double perimeter = calculatePerimeter();

        return perimeter / points.size();
    }
}