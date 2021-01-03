package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1;

public class Points {
    public static double DELTA = 0.00005;

    private Points() {
    }

    public static Point sum(Point a, Point b) {
        return new Point(a.getX() + b.getX(), a.getY() + b.getY(), a.getZ() + b.getZ());
    }

    public static Point subtract(Point a, Point b) {
        return new Point(a.getX() - b.getX(), a.getY() - b.getY(), a.getZ() - b.getZ());
    }

    public static Point multiply(Point a, Point b) {
        return new Point(a.getX() * b.getX(), a.getY() * b.getY(), a.getZ() * b.getZ());
    }

    public static Point devide(Point a, Point b) {
        return new Point(a.getX() / b.getX(), a.getY() / b.getY(), a.getZ() / b.getZ());
    }

    public static Point enlarge(Point a, double alfa) {
        return new Point(a.getX() * alfa, a.getY() * alfa, a.getZ() * alfa);
    }

    public static double length(Point a) {
        return a.length();
    }

    public static Point opposite(Point a) {
        return new Point(-a.getX(), -a.getY(), -a.getZ());
    }

    public static Point inverse(Point a) {
        return new Point(1 / a.getX(), 1 / a.getY(), 1 / a.getZ());
    }

    public static double scalarProduct(Point a, Point b) {
        return a.getX() * b.getX() + a.getY() * b.getY() + a.getZ() * b.getZ();
    }

    public static Point vectorProduct(Point a, Point b) {
        return new Point(a.getY() * b.getZ() - a.getZ() * b.getY(), a.getZ() * b.getX() - a.getX() * b.getZ(), a.getX() * b.getY() - a.getY() * b.getX());
    }

    private static boolean equalsApproximately(double a, double b) {
        return Math.abs(a - b) < DELTA;
    }

    public static boolean equalsApproximately(Point a, Point b) {
        return equalsApproximately(a.getX(), b.getX()) && equalsApproximately(a.getY(), b.getY()) && equalsApproximately(a.getZ(), b.getZ());
    }

}

