package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_5;

import org.testng.annotations.Test;
import ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1.Point;

import static org.testng.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RouteTest {
    Location location = new Location();
    Location location2 = new Location();
    Location location3 = new Location();
    Location location4 = new Location();
    Location location5 = new Location();

    @Test
    public void testAddLocation() {
        List<Location> locations1 = new ArrayList<>();
        Route route = new Route();

        assertEquals(route.getLocation(), Collections.EMPTY_LIST);

        route.addLocation(location);
        locations1.add(location);
        assertEquals(route.getLocation(), locations1);

        route.addLocation(location2);
        locations1.add(location2);
        assertEquals(route.getLocation(), locations1);

        route.addLocation(location3);
        locations1.add(location3);
        assertEquals(route.getLocation(), locations1);
    }

    @Test
    public void testAddIndexLocation() {
        List<Location> locations2 = new ArrayList<>();
        Route route = new Route();

        route.addIndexLocation(0, location3);
        locations2.add(location3);
        assertEquals(route.getLocation(), locations2);

        route.addIndexLocation(1, location2);
        locations2.add(location2);
        assertEquals(route.getLocation(), locations2);

        route.addIndexLocation(2, location);
        locations2.add(location);
        assertEquals(route.getLocation(), locations2);
    }

    @Test
    public void testRemoveLocation() {
        List<Location> locations3 = new ArrayList<>();
        Route route = new Route();

        route.addIndexLocation(0, location2);
        route.addIndexLocation(1, location3);
        route.addIndexLocation(2, location);

        locations3.add(location2);
        locations3.add(location);

        route.removeLocation(1);
        assertEquals(route.getLocation(), locations3);
    }

    @Test
    public void testIterator() {
        Route route = new Route();
        int count = 0;

        route.addLocation(location);
        route.addLocation(location2);
        route.addLocation(location3);

        location.setId(0);
        location2.setId(1);
        location3.setId(2);

        for (Location locations : route) {
            assertEquals(locations.getId(), count++);
        }
        assertEquals(count, 3);
    }

    @Test
    public void testRemove() {
        List<Location> locations4 = new ArrayList<>();
        Route route1 = new Route();

        route1.addIndexLocation(0, location2);
        route1.addIndexLocation(1, location3);
        route1.addIndexLocation(2, location);

        locations4.add(location2);
        locations4.add(location);

        route1.remove(location3);
        assertEquals(route1.getLocation(), locations4);

        Route route2 = new Route();

        route2.addIndexLocation(0, location);
        route2.addIndexLocation(1, location2);
        route2.addIndexLocation(2, location3);
        route2.addIndexLocation(3, location4);
        route2.addIndexLocation(4, location5);

        location.setId(1);
        location2.setId(2);
        location3.setId(3);
        location4.setId(2);
        location5.setId(2);

        location2.setName("One");
        location4.setName("Two");
        location5.setName("One");

        route2.remove(location5);
        assertEquals(route2.getLocation(), new ArrayList<>(Arrays.asList(location, location3, location4, location5)));

        route2.remove(location5);
        assertEquals(route2.getLocation(), new ArrayList<>(Arrays.asList(location, location3, location4)));

        route2.remove(location5);
        assertEquals(route2.getLocation(), new ArrayList<>(Arrays.asList(location, location3)));

        route2.remove(location2);
        assertEquals(route2.getLocation(), new ArrayList<>(Arrays.asList(location, location3)));
    }

    @Test
    public void testTestEquals() {
        Route route = new Route();
        Route route2 = new Route();
        Route route3 = new Route();
        Route route4 = new Route();

        Location warehouse = new Waypoint();
        Location warehouse2 = new Waypoint();
        Location warehouse3 = new Waypoint();
        Location warehouse4 = new Waypoint();

        Location city = new Settlement();
        Location city2 = new Settlement();
        Location village = new Settlement();
        Location village2 = new Settlement();
        Location village3 = new Settlement();

        Point point = new Point(1, 2, 3);

        city.setId(1);
        city2.setId(2);
        village.setId(3);
        village2.setId(1);
        village3.setId(2);
        warehouse.setId(4);
        warehouse2.setId(2);
        warehouse3.setId(3);
        warehouse4.setId(3);

        route.addLocation(village2);
        route.addLocation(city2);
        route.addLocation(warehouse3);
        route.addLocation(warehouse);

        route2.addLocation(city);
        route2.addLocation(village3);
        route2.addLocation(warehouse4);
        route2.addLocation(warehouse);

        route3.addLocation(village2);
        route3.addLocation(warehouse);
        route3.addLocation(warehouse2);
        route3.addLocation(warehouse3);

        route4.addLocation(village2);
        route4.addLocation(warehouse2);
        route4.addLocation(village2);

        assertEquals(route2, route);
        assertNotEquals(route3, route);
        assertNotEquals(route4, route);
        assertNotEquals(point, route);

        route3.addIndexLocation(1, village3);
        route3.remove(warehouse2);
        route3.remove(warehouse3);
        route3.addIndexLocation(2, warehouse4);
        assertEquals(route3, route);
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