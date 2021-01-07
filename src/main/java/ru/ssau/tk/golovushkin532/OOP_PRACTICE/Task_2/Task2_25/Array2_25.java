package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_25;

public class Array2_25 {
    static int[] array(int[] massiv) {
        int[] newMassiv = new int[massiv.length];
        System.arraycopy(massiv, 0, newMassiv, 0, newMassiv.length);
        for (int i = 0; i < newMassiv.length; i++) {
            newMassiv[i] = ~newMassiv[i];
        }
        return newMassiv;
    }
}
