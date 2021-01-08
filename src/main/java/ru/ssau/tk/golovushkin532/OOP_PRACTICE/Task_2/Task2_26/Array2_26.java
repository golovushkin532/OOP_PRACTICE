package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_26;

public class Array2_26 {
    static int[] array(int[] array) {
        int[] massiv = new int[array.length / 2 + (array.length % 2 == 0 ? 0 : 1)];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = array[2 * i] + (2 * i + 1 < array.length ? array[2 * i + 1] : 0);
        }
        return massiv;
    }
}
