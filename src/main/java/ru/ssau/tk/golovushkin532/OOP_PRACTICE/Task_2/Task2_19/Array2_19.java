package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_19;

public class Array2_19 {
    static int array(int[] massiv) {
        int sum = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (i % 2 == 0) {
                sum += massiv[i];
            }
        }
        return sum;
    }
}
