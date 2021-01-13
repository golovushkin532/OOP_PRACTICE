package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_4;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Exception4_2Test {

    @Test
    public void testExceptions() {
        assertEquals(Exception4_2.exceptions(new String[]{"Dollar", "Euro"}, 2), new char[]{'l', 'r'});
        assertEquals(Exception4_2.exceptions(new String[]{"яблоко", "лёд", "груша"}, 2), new char[]{'л', 'д', 'у'});

        assertThrows(NullPointerException.class, () -> Exception4_2.exceptions(new String[3], 1));
    }
}