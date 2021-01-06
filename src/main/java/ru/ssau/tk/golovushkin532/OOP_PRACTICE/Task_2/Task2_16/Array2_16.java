package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_16;

public class Array2_16 {
    static boolean array(Integer[] massiv) {
        for (int i : massiv)
            if (massiv[i] == null) {
                return true;
            }
        return false;
    }
}
