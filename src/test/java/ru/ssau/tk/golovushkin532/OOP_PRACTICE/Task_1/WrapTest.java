package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WrapTest {
    int i = 1;
    private static final double DELTA = 0.00001;
    Integer I = Wrap.boxing(i);
    Boolean conditionTrue = Wrap.boxing();
    Boolean conditionFalse = Wrap.autoBoxing();
    Boolean conditionNull = null;

    @Test
    public void testIf() {
        if (conditionTrue) {
            System.out.println("Всё норм");
        }
        if (Boolean.TRUE.equals(conditionFalse)) {
            System.out.println("Всё не норм");
        }
        if (Boolean.TRUE.equals(conditionNull)) {
            System.out.println("Все плохо");
        }
    }


    @Test
    public void testBox() {
        if (conditionTrue) {
            assertEquals(Wrap.autoBoxing(i), i, DELTA);
            assertEquals(Wrap.autoUnboxing(i), i, DELTA);
            assertEquals((Wrap.autoBoxing(++I)), ++i, DELTA);
            assertEquals(Wrap.autoUnboxing(++I), ++i, DELTA);
        }
    }
}
