public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getXaxis() {
        return x;
    }

    public int getYaxis() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(point.getXaxis() - x, 2) + Math.pow(point.getYaxis() - y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}