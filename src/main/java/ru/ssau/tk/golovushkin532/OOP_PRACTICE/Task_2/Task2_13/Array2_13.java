package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_13;

public class Array2_13 {
    public static int[] array(int size) {
        if (size == 0){
            return null;
        }
        int[] massiv = new int[size];
        for (int i = 0; i < Math.ceil((double)size/2); i++){
            massiv[i] = i+1;
            massiv[size-i-1] = i+1;
        }
        return massiv;
    }
}
