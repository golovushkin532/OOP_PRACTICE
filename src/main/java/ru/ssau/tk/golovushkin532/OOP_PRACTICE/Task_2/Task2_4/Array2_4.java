package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_4;

public class Array2_4 {
    public static int[] array(int size) {
        int fullSize = 2 * size;
        int[] massiv = new int[fullSize];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = fullSize;
            fullSize -= 2;
        }
        return massiv;
    }
}
