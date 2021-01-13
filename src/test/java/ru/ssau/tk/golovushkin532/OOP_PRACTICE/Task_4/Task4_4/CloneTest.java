package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_4.Task4_4;

import org.testng.annotations.Test;
import ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_4.Task4_5.CloneOne;
import ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_4.Task4_5.CloneTwo;

import static org.testng.Assert.*;

public class CloneTest {
    @Test
    public void test() {
        CloneOne clone1 = new CloneOne();
        CloneTwo clone2 = new CloneTwo();
        try {
            clone1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        assertThrows(CloneNotSupportedException.class, clone2::clone);
    }
}
