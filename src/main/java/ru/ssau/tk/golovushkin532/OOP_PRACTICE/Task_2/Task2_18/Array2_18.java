package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_18;

public class Array2_18 {
    static Integer array(int[] massiv) {
        if (massiv.length == 0) {
            return null;
        }
        int count = 0;
        for (int i : massiv) {
            if (massiv[i + 1] > massiv[i]) {
                count = massiv[i + 1];
            }
        }
        return count;
    }
}
