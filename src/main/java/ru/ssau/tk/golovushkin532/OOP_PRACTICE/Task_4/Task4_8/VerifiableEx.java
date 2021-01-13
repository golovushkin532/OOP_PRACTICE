package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_4.Task4_8;

public class VerifiableEx extends Exception {
    public static void throwCheckedException() throws VerifiableEx {
        throw new VerifiableEx();
    }

    public static VerifiableEx throwUncheckedException() {
        try {
            throwCheckedException();
        } catch (VerifiableEx e) {
            throw new UnverifiableEx(e);
        }
        return null;
    }
}
