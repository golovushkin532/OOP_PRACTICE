package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_27;

public class Array2_27 {
    static boolean[] array(int[] array) {
        boolean[] massiv = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            massiv[i] = array[i] % 2 == 0;
        }
        return massiv;
    }
}
