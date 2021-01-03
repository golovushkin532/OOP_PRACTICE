package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1;

public abstract class Operation {
    public abstract double apply(double number);

    public double applyTriple(double number) {
        return apply(apply(apply(number)));
    }
}
