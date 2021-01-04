package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1;

public class PrintType {
    public static void printType(byte arg) {
        System.out.println("byte");
    }

    public static void printType(char arg) {
        System.out.println("char");
    }

    public static void printType(short arg) {
        System.out.println("short");
    }

    public static void printType(int arg) {
        System.out.println("int");
    }

    public static void printType(long arg) {
        System.out.println("long");
    }

    public static void printType(float arg) {
        System.out.println("float");
    }

    public static void printType(double arg) {
        System.out.println("double");
    }

    public static void printType(boolean arg) {
        System.out.println("boolean");
    }

    public static void printType(Object arg) {
        if (arg == null) {
            System.out.println("null");
        } else {
            System.out.println(arg.getClass());
        }
    }
}
