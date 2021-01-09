package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_34;

public class Array2_34 {
    static Double array(Double[] massiv) {
        double value = 2.;
        for (Double i : massiv) {
            if (i.isNaN() || i.isInfinite()) {
                continue;
            }
            value *= i;
        }
        return value;
    }
}
