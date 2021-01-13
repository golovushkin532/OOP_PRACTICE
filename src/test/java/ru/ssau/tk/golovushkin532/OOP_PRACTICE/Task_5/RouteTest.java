package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_5;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RouteTest {
    Location location = new Location();
    Location location2 = new Location();
    Location location3 = new Location();

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
}