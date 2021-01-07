package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_21;

public class Array2_21 {
    public static int array(int[] massiv) {
        int x = 0;
        int value = 0;
        for (int i = 0; i < massiv.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < massiv.length; j++) {
                if (massiv[i] == massiv[j]) {
                    count++;
                }
            }
            if (x < count) {
                x = count;
                value = massiv[i];
            }
        }
        return value;
    }
}
