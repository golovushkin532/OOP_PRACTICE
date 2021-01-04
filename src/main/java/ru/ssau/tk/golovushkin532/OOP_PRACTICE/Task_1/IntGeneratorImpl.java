package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1;

public class IntGeneratorImpl implements IntGenerator {
    public int count = 0;

    @Override
    public int nextInt() {
        return count++;
    }
}
