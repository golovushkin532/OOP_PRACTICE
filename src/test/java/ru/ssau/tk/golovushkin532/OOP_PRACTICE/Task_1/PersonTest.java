package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    Person secondPerson = new Person();
    Person firstPerson = new Person();
    Person thirdPerson = new Person();
    Person anonymousPerson = new Person();

    @Test
    public void TestFirstName() {
        secondPerson.setFirstName("Фаст");
        firstPerson.setFirstName("Тузик");
        thirdPerson.setFirstName(null);
        assertEquals(secondPerson.getFirstName(), "Фаст");
        assertEquals(firstPerson.getFirstName(), "Тузик");
        assertNotEquals(secondPerson.getFirstName(), "Pastor");
        assertNull(thirdPerson.getFirstName());
        assertNull(anonymousPerson.getFirstName());
    }

    @Test
    public void TeatLastName() {
        secondPerson.setLastName("Альберто");
        firstPerson.setLastName("Собачий");
        thirdPerson.setLastName(null);
        assertEquals(secondPerson.getLastName(), "Альберто");
        assertEquals(firstPerson.getLastName(), "Собачий");
        assertNotEquals(secondPerson.getLastName(), "Napas");
        assertNull(thirdPerson.getLastName());
        assertNull(anonymousPerson.getLastName());
    }

    @Test
    public void TestPassportId() {
        secondPerson.setPassportId(74);
        firstPerson.setPassportId(322);
        assertEquals(secondPerson.getPassportId(), 74);
        assertEquals(firstPerson.getPassportId(), 322);
        assertNotEquals(secondPerson.getPassportId(), 911);
    }
    @Test
    public void testGender(){
        firstPerson.setGender(Gender.FEMALE);
        secondPerson.setGender(Gender.MALE);
        thirdPerson.setGender(Gender.MALE);
        assertEquals(firstPerson.getGender(), Gender.FEMALE);
        assertEquals(secondPerson.getGender(), Gender.MALE);
        assertEquals(thirdPerson.getGender(), Gender.MALE);
        assertNull(anonymousPerson.getFirstName());
    }

}