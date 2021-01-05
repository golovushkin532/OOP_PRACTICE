package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_2;

public class Array2_2 {
    public static int[] array(int size) {
        int[] massiv = new int[size];
        massiv[0] = 2;
        massiv[size - 1] = 2;
        for (int i = 1; i < massiv.length - 1; i++) {
            massiv[i] = 1;
        }
        return massiv;
    }
}
