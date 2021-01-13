package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_4;

import org.testng.annotations.Test;
import ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_4.Task4_8.*;
import static ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_4.Task4_8.VerifiableEx.throwCheckedException;

public class VerifiableTest {
    @Test
    public void testEx() {
        try {
            throwCheckedException();
        } catch (VerifiableEx e) {
            e.getCause();
        }
    }
}
