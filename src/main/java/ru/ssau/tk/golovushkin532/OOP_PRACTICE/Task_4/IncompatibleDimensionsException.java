package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_4;

public class IncompatibleDimensionsException extends RuntimeException {
    public IncompatibleDimensionsException() {
        this("Матрицы несовместимы");
    }

    public IncompatibleDimensionsException(String str) {
        System.out.println(str);
    }
}
