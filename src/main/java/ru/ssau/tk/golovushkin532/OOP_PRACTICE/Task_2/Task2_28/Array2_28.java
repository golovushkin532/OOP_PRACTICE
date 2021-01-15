package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_28;

public class Array2_28 {
    public static int[] arrayOne(long number) {
        return new int[]{(int) (number >>> 32), (int) (number)};
    }

    public static long arrayTwo(int[] numbers) {
        return ((long) numbers[0] << 32) | ((long) numbers[1] & 4294967295L);
    }
}
