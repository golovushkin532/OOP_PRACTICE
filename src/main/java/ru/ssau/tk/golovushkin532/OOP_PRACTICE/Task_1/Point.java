package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1;

class Point {
    public final double x;
    public final double y;
    public final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return ("(" + x + ", " + y + ", " + z + ")");
    }

    public double length() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }


    public static void main(String[] args) {
        Point onePoint = new Point(4, 8, 1);
        Point secondPoint = new Point(7, 14, 2);
        Point thirdPoint = new Point(-5, -6, -7);

        System.out.println(onePoint);
        System.out.println(secondPoint);
        System.out.println(thirdPoint);
    }
}
