package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_31;

import org.testng.annotations.Test;
import ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_4.IncompatibleDimensionsException;

import static org.testng.Assert.*;

public class MatricesTest {

    @Test
    public void testMultiplyNumber() {
        Matrix matrix = new Matrix(2, 2);
        matrix.setAt(0, 0, 1);
        matrix.setAt(0, 1, 1);
        matrix.setAt(1, 1, 1);
        matrix.setAt(1, 0, 1);
        Matrices.multiplyNumber(matrix, 2);
        assertEquals(matrix.getAt(0, 0), 1);
        assertEquals(Matrices.multiplyNumber(matrix, 2).getAt(0, 0), matrix.getAt(0, 0) * 2);
    }

    @Test
    public void testMatrixPlus() {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setAt(0, 0, 1);
        matrix1.setAt(0, 1, 1);
        matrix1.setAt(1, 1, 1);
        matrix1.setAt(1, 0, 1);
        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setAt(0, 0, 1);
        matrix2.setAt(0, 1, 1);
        matrix2.setAt(1, 1, 1);
        matrix2.setAt(1, 0, 1);
        Matrix matrix3 = new Matrix(2, 1);
        matrix3.setAt(0, 0, 1);
        matrix3.setAt(1, 0, 1);
        try {
            Matrices.matrixPlus(matrix1, matrix3);
            Matrices.matrixPlus(matrix3, matrix1);
        } catch (IncompatibleDimensionsException e) {
            System.out.println("Словил маслину\n" + matrix1.getN() + ", " + matrix1.getM() + "\n" + "2)" + matrix2.getN() + ", " + matrix2.getM());
        }
        assertEquals(Matrices.matrixPlus(matrix1, matrix2).getAt(0, 0), matrix1.getAt(0, 0) + matrix2.getAt(0, 0));
    }

    @Test
    public void testChekDifferentMatrixSize() {
        Matrix matrix1 = new Matrix(2, 2);
        Matrix matrix2 = new Matrix(3, 3);
        assertTrue(Matrices.chekDifferentMatrixSize(matrix1, matrix2));
    }

    @Test
    public void testMatrixMultiply() {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setAt(0, 0, 1);
        matrix1.setAt(0, 1, 1);
        matrix1.setAt(1, 1, 1);
        matrix1.setAt(1, 0, 1);
        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setAt(0, 0, 2);
        matrix2.setAt(0, 1, 2);
        matrix2.setAt(1, 1, 2);
        matrix2.setAt(1, 0, 2);
        Matrix matrix3 = new Matrix(1, 2);
        matrix3.setAt(0, 0, 1);
        matrix3.setAt(0, 1, 1);
        try {
            Matrices.matrixMultiply(matrix1, matrix3);
            Matrices.matrixMultiply(matrix3, matrix1);
        } catch (IncompatibleDimensionsException e) {
            System.out.println("Словил маслину");
        }
        Matrix result = Matrices.matrixMultiply(matrix1, matrix2);
        assertEquals(result.getAt(0, 0), 2);
        assertEquals(result.getAt(0, 1), 2);
        assertEquals(result.getAt(1, 0), 2);
        assertEquals(result.getAt(1, 1), 2);
    }
}