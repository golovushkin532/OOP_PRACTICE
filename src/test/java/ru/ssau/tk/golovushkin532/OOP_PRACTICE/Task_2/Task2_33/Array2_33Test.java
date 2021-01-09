package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_33;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_33Test {

    @Test
    public void testArray() {
        String[] array = new String[]{"Малинки", "Малинки", "Такие вечеренки", "Зелёные тропинки", "Где тихо и свежо"};
        Array2_33.array(array);
    }
}