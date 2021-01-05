package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_3;

public class Array2_3 {
    public static int[] array(int size) {
        int[] massiv = new int[size];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = 2 * i + 1;
        }
        return massiv;
    }
}
