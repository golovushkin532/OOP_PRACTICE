package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_22;

public class Array2_22 {
    static int array(int[] massiv, int number) {
        int j = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == number) {
                j = i;
            }
        }
        return j;
    }
}
