package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    Person secondPerson = new Person();
    Person firstPerson = new Person();


    @Test
    public void TestFirstName() {
        secondPerson.setFirstName("Фаст");
        firstPerson.setFirstName("Тузик");
        assertEquals(secondPerson.getFirstName(), "Фаст");
        assertEquals(firstPerson.getFirstName(), "Тузик");
        assertNotEquals(secondPerson.getFirstName(), "Pastor");

    }

    @Test
    public void TeatLastName() {
        secondPerson.setLastName("Альберто");
        firstPerson.setLastName("Собачий");
        assertEquals(secondPerson.getLastName(), "Альберто");
        assertEquals(firstPerson.getLastName(), "Собачий");
        assertNotEquals(secondPerson.getLastName(), "Napas");
    }

    @Test
    public void TestPassportId() {
        secondPerson.setPassportId(74);
        firstPerson.setPassportId(322);
        assertEquals(secondPerson.getPassportId(), 74);
        assertEquals(firstPerson.getPassportId(), 322);
        assertNotEquals(secondPerson.getPassportId(), 911);
    }


}