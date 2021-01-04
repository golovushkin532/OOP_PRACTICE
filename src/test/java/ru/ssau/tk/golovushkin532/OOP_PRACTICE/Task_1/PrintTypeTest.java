package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1;

import org.testng.annotations.Test;

public class PrintTypeTest {
    @Test
    public void testPrintType() {
        PrintType.printType("SUS");
        PrintType.printType('Z');
        PrintType.printType((byte) 7);
        PrintType.printType((short) 7);
        PrintType.printType(7);
        PrintType.printType(7L);
        PrintType.printType(7.7f);
        PrintType.printType(7.7d);
        PrintType.printType(true);
        PrintType.printType(new Person());
        PrintType.printType(new Point(0, 0, 0));
        PrintType.printType(null);
    }
}
