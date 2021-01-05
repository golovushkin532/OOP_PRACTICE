package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_10;

public class Array2_10 {
    static double[] GeometricProgression(double first, double step, int size) {
        double[] massiv = new double[size];
        massiv[0] = 1;
        for (int i = 1; i < size; i++) {
            massiv[i] = massiv[i - 1] * step;
        }
        return massiv;
    }
}
