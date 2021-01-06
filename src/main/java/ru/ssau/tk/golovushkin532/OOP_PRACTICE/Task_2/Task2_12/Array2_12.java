package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_12;

public class Array2_12 {
    public static double[] array(int last) {
        if (last <= 1) {
            System.out.println("Error. Please enter a number greater than 1.");
            return new double[]{};
        } else {
            boolean simple;
            int size = 0;
            for (int j = 3; j <= last; j++) {
                simple = true;
                for (int i = 2; i < j; i++) {
                    if (j % i == 0) {
                        simple = false;
                        break;
                    }
                }
                if (simple) {
                    size++;
                }
            }
            double[] massiv = new double[size + 1];
            int firstTerm = 0;
            massiv[0] = 2.;
            for (int i = 1; i < size + 1; i++) {
                int secondTerm = 0;
                for (int j = 3 + firstTerm; j <= last; j++) {
                    simple = true;
                    for (int k = 2; k < j; k++) {
                        if (j % k == 0) {
                            simple = false;
                            break;
                        }
                    }
                    if (simple) {
                        massiv[i] = j;
                        break;
                    } else {
                        secondTerm++;
                    }
                }
                firstTerm++;
                firstTerm = firstTerm + secondTerm;
            }
            return massiv;
        }
    }
}

