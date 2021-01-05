package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_9;

public class Array2_9 {
    public static double[] progression(int size, int first, int difference) {
        double[] massiv = new double[size];
        for (int i = 0; i != massiv.length; i++) {
            massiv[i] = first + i * difference;
        }
        return massiv;
    }
}
