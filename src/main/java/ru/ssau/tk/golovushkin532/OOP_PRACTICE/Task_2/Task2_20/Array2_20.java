package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_20;

public class Array2_20 {
    static boolean array(int[] massiv) {
        int firstCount = 0;
        int secondCount = 0;
        for (int j : massiv) {
            if (j % massiv[0] == 0)
                firstCount++;
        }
        for (int i : massiv) {
            if (i % massiv[massiv.length - 1] == 0)
                secondCount++;
        }
        return firstCount > secondCount;
    }
}
