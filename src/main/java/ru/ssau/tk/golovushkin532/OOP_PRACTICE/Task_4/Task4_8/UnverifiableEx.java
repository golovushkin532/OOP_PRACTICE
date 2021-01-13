package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_4.Task4_8;

public class UnverifiableEx extends RuntimeException {
    UnverifiableEx(VerifiableEx a) {
        super(a);
    }
}
