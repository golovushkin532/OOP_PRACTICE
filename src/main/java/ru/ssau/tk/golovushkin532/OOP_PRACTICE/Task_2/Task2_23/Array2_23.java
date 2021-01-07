package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_23;

public class Array2_23 {
    static void array(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int j : array) {
            min = Math.min(j, min);
            max = Math.max(j, max);
        }
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                indexMin = i;
            }
            if (array[i] == max) {
                indexMax = i;
            }
        }
        array[indexMin] = max;
        array[indexMax] = min;
    }
}
