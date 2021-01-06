package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_11;

public class Array2_11 {
    public static double[] array(double count) {
        int size = (int) ((count / (Math.sqrt(count))) - 1);
        double[] massiv = new double[size];
        int j = 0;
        for (int i = 1; i <= Math.sqrt(count); i++) {
            if (count % i == 0) {
                massiv[j] = i;
                j++;
            }
        }
        return massiv;
    }
}
