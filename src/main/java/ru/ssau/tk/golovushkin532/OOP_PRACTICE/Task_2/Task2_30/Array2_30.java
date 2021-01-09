package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_30;

public class Array2_30 {
    static int[][] array(int size) {
        int[][] massiv = new int[size][];
        int k = 1;
        for (int i = 0; i < size; i++) {
            massiv[i] = new int[size - i];
            for (int j = 0; j < size - i; j++) {
                massiv[i][j] = k;
                k++;
            }
        }
        return massiv;
    }
}
