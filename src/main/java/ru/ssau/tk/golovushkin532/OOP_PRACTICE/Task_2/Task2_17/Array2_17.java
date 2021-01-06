package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_17;

public class Array2_17 {
    static int array(int[] massiv) {
        int j = 0;
        for (int i : massiv) {
            if (massiv[i] % 2 == 0) {
                j++;
            }
        }
        return j;
    }
}
