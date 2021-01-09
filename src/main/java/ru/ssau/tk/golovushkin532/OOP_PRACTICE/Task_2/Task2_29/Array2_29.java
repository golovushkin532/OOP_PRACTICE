package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_29;

public class Array2_29 {
    static int[] array(int size, int index) {
        if (index >= size) {
            return null;
        } else {
            int[] count = new int[5];
            for (int i = 0; i < 5; i++) {
                count[i + index - (i + index >= 5 ? 5 : 0)] = i + 1;
            }
            return count;
        }
    }
}
