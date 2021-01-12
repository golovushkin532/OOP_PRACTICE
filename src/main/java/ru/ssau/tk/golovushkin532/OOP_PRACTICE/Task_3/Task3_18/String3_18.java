package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_18;

import ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1.Point;
import ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1.Person;
import ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1.NamedPoint;
import ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1.Gender;

public class String3_18 {
    public static void strings(Object o) {
        System.out.println("Описание объекта: " + o);
    }

    public static void main(String[] args) {
        String3_18.strings(new Point(12, 12, 12));
        String3_18.strings(new Person("Вася", "Пупкин", 7777, Gender.MALE));
        String3_18.strings(new NamedPoint(1, 2, 3, "Точка"));
    }
}
