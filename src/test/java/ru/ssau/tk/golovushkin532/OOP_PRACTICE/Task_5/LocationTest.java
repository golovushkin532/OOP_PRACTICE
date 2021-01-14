package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_5;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class LocationTest {
    Settlement city = new Settlement();
    Waypoint warehouse = new Waypoint();
    Settlement village = new Settlement();
    Settlement village2 = new Settlement();
    Settlement village3 = new Settlement();
    Settlement village4 = new Settlement();

    @Test
    public void testTestEquals() {
        city.setId(37);

        village.setId(52);
        village2.setId(38);
        village3.setId(37);
        village4.setId(52);

        warehouse.setId(38);

        city.setType(Location.SettlementType.CITY);

        village.setType(Location.SettlementType.VILLAGE);
        village2.setType(Location.SettlementType.VILLAGE);
        village3.setType(Location.SettlementType.VILLAGE);

        warehouse.setType(Location.WaypointType.WAREHOUSE);

        assertEquals(village4, village);
        assertEquals(village, village4);
        assertEquals(village2, village2);
        assertEquals(village3, city);

        assertNotEquals(village2, warehouse);
        assertNotEquals(village, warehouse);
        assertNotEquals(village3, village);
        assertNotEquals(city, null);

        city.setId(36);
        assertNotEquals(city, village3);
    }
}