package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {
    NamedPoint jesusPoint = new NamedPoint(3., 3., 3., "Jesus");
    NamedPoint point = new NamedPoint(1, 2, 3);
    NamedPoint devilPoint = new NamedPoint(666., 666., 666., "Devil");

    @Test
    public void testGetName() {
        assertEquals(jesusPoint.getName(), "Jesus");
        assertNull(point.getName());
        assertEquals(devilPoint.getName(), "Devil");
    }

    @Test
    public void testSetName() {
        jesusPoint.setName("Son of God");
        point.setName("RIPDOOM");
        devilPoint.setName("Snake");
        assertEquals(point.getName(), "RIPDOOM");
        assertEquals(devilPoint.getName(), "Snake");
        assertEquals(jesusPoint.getName(), "Son of God");
    }

    @Test
    public void testReset() {
        point.reset();
        assertEquals(point.getName(), "Absent");
    }
}