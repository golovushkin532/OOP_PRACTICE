package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_5;

public class Array2_5 {
    public static int[] array(int size) {
        int[] massiv = new int[size];
        massiv[0] = 0;
        massiv[1] = 1;
        for (int i = 2; i < massiv.length; i++) {
            massiv[i] = massiv[i - 1] + massiv[i - 2];
        }
        return massiv;
    }
}
