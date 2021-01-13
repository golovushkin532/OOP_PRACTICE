package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_4;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Exception4_3Test {

    @Test
    public void testExceptions() {
        assertEquals(Exception4_3.exceptions(new String[]{"Капуста", "Морковь"}, 1, 2), 'р');

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Exception4_3.exceptions(new String[]{"jes", "jas"}, 2, 1));
        assertThrows(StringIndexOutOfBoundsException.class, () -> Exception4_3.exceptions(new String[]{"jes", "jas"}, 1, 3));
    }
}