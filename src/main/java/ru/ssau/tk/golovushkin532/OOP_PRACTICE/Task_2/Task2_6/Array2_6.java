package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_6;

public class Array2_6 {
    public static int[] array(int size) {
        int[] massiv = new int[size];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = (int) Math.pow(i, 2);
        }
        return massiv;
    }
}
