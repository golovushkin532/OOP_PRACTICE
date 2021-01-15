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

    @Test
    public void testToString() {
        Settlement villageSyzran = new Settlement();
        Settlement citySamara = new Settlement();
        Waypoint depot = new Waypoint();
        Waypoint warehouse = new Waypoint();

        villageSyzran.setType(Location.SettlementType.VILLAGE);
        citySamara.setType(Location.SettlementType.CITY);
        depot.setType(Location.WaypointType.DEPOT);
        warehouse.setType(Location.WaypointType.WAREHOUSE);
        villageSyzran.setName("Syzran");
        citySamara.setName("Samara");
        depot.setName("depot");
        warehouse.setName("Vegetable warehouse");
        villageSyzran.setLatitude(48.2);
        citySamara.setLatitude(53.12);
        depot.setLatitude(43.6);
        warehouse.setLatitude(51.2);
        villageSyzran.setLongitude(44.4);
        citySamara.setLongitude(50.06);
        depot.setLongitude(11.6);
        warehouse.setLongitude(23.6);
        assertEquals(villageSyzran.toString(), "Settlement. Type: VILLAGE; name: Syzran; latitude: 48.2; longitude: 44.4");
        assertEquals(citySamara.toString(), "Settlement. Type: CITY; name: Samara; latitude: 53.12; longitude: 50.06");
        assertEquals(depot.toString(), "Waypoint. Type: DEPOT; name: depot; latitude: 43.6; longitude: 11.6");
        assertEquals(warehouse.toString(), "Waypoint. Type: WAREHOUSE; name: Vegetable warehouse; latitude: 51.2; longitude: 23.6");
    }
}