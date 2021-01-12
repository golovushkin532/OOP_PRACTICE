package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_31;

public class Matrices {
    static Matrix multiplyNumber(Matrix matrix, int number) {
        Matrix resultMatrix = new Matrix(matrix.getN(), matrix.getM());
        for (int i = 0; i < matrix.getN(); i++) {
            for (int j = 0; j < matrix.getM(); j++) {
                resultMatrix.setAt(i, j, matrix.getAt(i, j) * number);
            }
        }
        return resultMatrix;
    }

    static Matrix matrixPlus(Matrix matrix1, Matrix matrix2) {
        Matrix resultMatrix = new Matrix(matrix1.getN(), matrix1.getM());
        for (int i = 0; i < matrix1.getN(); i++) {
            for (int j = 0; j < matrix1.getM(); j++)
                resultMatrix.setAt(i, j, matrix1.getAt(i, j) + matrix2.getAt(i, j));
        }

        return resultMatrix;
    }


    static boolean chekDifferentMatrixSize(Matrix matrix1, Matrix matrix2) {
        return !(matrix1.getM() == matrix2.getM() && matrix1.getN() == matrix2.getN());
    }

    static Matrix matrixMultiply(Matrix matrix1, Matrix matrix2) {
        Matrix resultMatrix = new Matrix(matrix1.getN(), matrix1.getM());

        for (int i = 0; i < matrix1.getN(); i++) {
            for (int j = 0; j < matrix1.getN(); j++) {
                for (int k = 0; k < matrix1.getN(); k++) {
                    resultMatrix.setAt(i, j, matrix1.getAt(i, k) * matrix2.getAt(k, j));
                }
            }
        }

        return resultMatrix;
    }
}
