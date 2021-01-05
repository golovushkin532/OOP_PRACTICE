package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_7;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_7Test {
        double DELTA = 0.00001;
        @Test
        public void Test2Root() throws Exception {
            double[] root2 = Array2_7.quadraticEquations(1, 4, -2);
            assertEquals(root2[0], 0.4494897427831779, DELTA);
            assertEquals(root2[1], -4.449489742783178, DELTA);
        }

        @Test
        public void Test1Root() throws Exception {
            double[] root1 = Array2_7.quadraticEquations(0, 2, -7);
            assertEquals(root1[0], 3.5, DELTA);
        }

        @Test
        public void testNuN() throws Exception {
            try {
                double[] DoesNotExist = Array2_7.quadraticEquations(0, 0, 8);
            } catch (Exception e) {
                assertEquals(e.getMessage(), "Решений нет");
            }

            try {
                double[] emptyEquation = Array2_7.quadraticEquations(0, 0, 0);
            } catch (Exception e) {
                assertEquals(e.getMessage(), "Комплексные корни");
            }

            try {
                double[] ComplexNumbers = Array2_7.quadraticEquations(1, 3, 7);
            } catch (Exception e) {
                assertEquals(e.getMessage(), "Не вещественные корни");
            }
        }
    }
