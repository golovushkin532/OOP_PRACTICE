package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_8;

public class Array2_8 {
    public static double[] array(int size) {
        double[] massiv = new double[size];
        int j = 1;
        for (int i = 0; i < massiv.length; i++) {
            if (j % 3 == 0) {
                j++;
            }
            massiv[i] = j;
            j++;
        }
        return massiv;
    }
}
