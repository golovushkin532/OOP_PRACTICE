package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_5;

import org.testng.annotations.Test;
import ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1.Gender;
import ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1.Person;

import java.util.Date;
import java.util.Calendar;

import static org.testng.Assert.*;

public class DriverTest {

    Driver DriverOne = new Driver();
    Driver DriverTwo = new Driver();
    Driver DriverThree = new Driver();

    public void setDrivers() {
        DriverOne.setId(1);
        DriverOne.setName("Ilya");
        DriverOne.setGender(Gender.MALE);
        DriverOne.setLicenseExpirationDate(new Date(124, Calendar.JANUARY, 1));

        DriverTwo.setId(2);
        DriverTwo.setName("Anna");
        DriverTwo.setGender(Gender.FEMALE);
        DriverTwo.setLicenseExpirationDate(new Date(120, Calendar.AUGUST, 12));

        DriverThree.setId(2);
        DriverThree.setName("Anton");
        DriverThree.setGender(Gender.MALE);
        DriverThree.setLicenseExpirationDate(new Date(136, Calendar.MARCH, 8));
    }

    @Test
    public void testTestEquals() {
        setDrivers();
        assertNotEquals(DriverThree, DriverOne);
        assertNotEquals(DriverOne, DriverThree);
        assertEquals(DriverTwo, DriverTwo);
        assertNotEquals(DriverTwo, DriverOne);
        assertNotEquals(new Person(), DriverThree);
        assertNotEquals(DriverTwo, null);
    }

    @Test
    public void testTestToString() {
        setDrivers();
        assertEquals(DriverOne.toString(), "Driver: ID: 1; Name: Ilya; Gender: MALE; LicenseExpirationDate: Mon Jan 01 00:00:00 SAMT 2024.");
        assertEquals(DriverTwo.toString(), "Driver: ID: 2; Name: Anna; Gender: FEMALE; LicenseExpirationDate: Wed Aug 12 00:00:00 SAMT 2020.");
    }
}