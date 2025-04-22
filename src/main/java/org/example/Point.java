package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // (0,0) noktasıyla uzaklık
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // Başka bir Point objesine uzaklık
    public double distance(Point p) {
        int dx = p.x - this.x;
        int dy = p.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Verilen koordinata uzaklık
    public double distance(int a, int b) {
        int dx = a - this.x;
        int dy = b - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
