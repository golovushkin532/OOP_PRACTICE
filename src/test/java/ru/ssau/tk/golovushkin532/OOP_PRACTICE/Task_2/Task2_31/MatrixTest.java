package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_31;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MatrixTest {

    @Test
    public void testTestToString() {
        Matrix matrix = new Matrix(2, 2);
        matrix.setAt(0, 0, 1);
        matrix.setAt(0, 1, 2);
        matrix.setAt(1, 0, 1);
        matrix.setAt(1, 1, 4);
        System.out.println(matrix);
    }
}