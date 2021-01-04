package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1;

public class ResettableIntGenerator implements Resettable, IntGenerator {
    private int count = 0;

    @Override
    public int nextInt() {
        return count++;
    }

    @Override
    public void reset() {
        count = 0;
    }
}
