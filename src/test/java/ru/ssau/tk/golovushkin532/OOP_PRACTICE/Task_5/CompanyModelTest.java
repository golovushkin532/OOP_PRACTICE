package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_5;

import org.testng.annotations.Test;
import ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1.Gender;

import static org.testng.Assert.*;

import java.util.*;

public class CompanyModelTest {
    Settlement village = new Settlement();
    Settlement village2 = new Settlement();
    Settlement city = new Settlement();
    Settlement city2 = new Settlement();
    Settlement southCity = new Settlement();
    Settlement southVillage = new Settlement();

    Waypoint waypoint1 = new Waypoint();
    Waypoint waypoint2 = new Waypoint();
    Waypoint waypoint3 = new Waypoint();
    Waypoint waypoint4 = new Waypoint();
    Waypoint waypoint5 = new Waypoint();
    Waypoint waypoint6 = new Waypoint();
    Waypoint waypoint7 = new Waypoint();
    Waypoint waypoint8 = new Waypoint();
    Waypoint waypoint9 = new Waypoint();
    Waypoint waypoint10 = new Waypoint();

    Driver driver1 = new Driver();
    Driver driver2 = new Driver();
    Driver driver3 = new Driver();
    Driver driver4 = new Driver();
    Driver driver5 = new Driver();
    Driver driver6 = new Driver();
    Driver driver7 = new Driver();

    Route route1 = new Route();
    Route route2 = new Route();
    Route route3 = new Route();
    Route route4 = new Route();
    Route route5 = new Route();
    Route route6 = new Route();

    private void fillModels(CompanyModel companyModelOne, CompanyModel companyModelTwo) {
        village = companyModelOne.addSettlement("village", 20.36, 45.12,
                Location.SettlementType.VILLAGE, 1200);
        village2 = companyModelOne.addSettlement("village2", 20.45, 45.81,
                Location.SettlementType.VILLAGE, 540);
        city = companyModelOne.addSettlement("city", 20.47, 46.01, Location.SettlementType.CITY,
                1250000);
        city2 = companyModelOne.addSettlement("city2", 21.87, 45.84, Location.SettlementType.CITY,
                384000);
        waypoint1 = companyModelOne.addWaypoint("village.Warehouse", 20.36, 45.12,
                Location.WaypointType.WAREHOUSE, village);
        waypoint2 = companyModelOne.addWaypoint("village2.Waypoint", 20.36, 45.12,
                Location.WaypointType.EMPTY, village2);
        waypoint3 = companyModelOne.addWaypoint("city.Depot", 20.47, 46.01,
                Location.WaypointType.DEPOT, city);
        waypoint5 = companyModelOne.addWaypoint("lone Depot", 20.54, 45.85,
                Location.WaypointType.DEPOT, null);
        waypoint4 = companyModelOne.addWaypoint("city2.Warehouse", 21.87, 45.84,
                Location.WaypointType.WAREHOUSE, city2);
        driver1 = companyModelOne.addDriver("Tom", Gender.MALE, new Date(121, Calendar.MARCH, 11));
        driver2 = companyModelOne.addDriver("Rose", Gender.FEMALE, new Date(127, Calendar.DECEMBER, 21));
        driver3 = companyModelOne.addDriver("Kate", Gender.FEMALE, new Date(135, Calendar.JULY, 16));
        driver4 = companyModelOne.addDriver("Hugo", Gender.MALE, new Date(140, Calendar.JANUARY, 1));
        driver7 = companyModelOne.addDriver("Jack", Gender.MALE, new Date(129, Calendar.OCTOBER, 12));
        route1 = companyModelOne.addRoute(new ArrayList<>(Arrays.asList(waypoint3, city, waypoint2,
                waypoint1, waypoint4, waypoint5)));
        route2 = companyModelOne.addRoute(new ArrayList<>(Arrays.asList(waypoint3, city, city2, waypoint4,
                waypoint5)));
        route3 = companyModelOne.addRoute(new ArrayList<>(Arrays.asList(waypoint5, village2, waypoint2,
                waypoint1, city, waypoint3)));
        route6 = companyModelOne.addRoute(new ArrayList<>(Arrays.asList(waypoint5, village, waypoint1,
                city2, waypoint4, city, waypoint3)));
        companyModelOne.assignRoute(driver1, route1);
        companyModelOne.assignRoute(driver2, route2);
        companyModelOne.assignRoute(driver4, route3);
        companyModelOne.assignRoute(driver7, route4);

        companyModelTwo.addSettlement("village", 20.36, 45.12, Location.SettlementType.VILLAGE,
                1200);
        companyModelTwo.addSettlement("village2", 20.45, 45.81, Location.SettlementType.VILLAGE,
                540);
        companyModelTwo.addSettlement("city", 20.47, 46.01, Location.SettlementType.CITY,
                1250000);
        companyModelTwo.addSettlement("city2", 21.87, 45.84, Location.SettlementType.CITY,
                384000);
        waypoint6 = companyModelTwo.addWaypoint("city.Depot", 20.47, 46.01,
                Location.WaypointType.DEPOT, city);
        waypoint7 = companyModelTwo.addWaypoint("lone Depot", 20.54, 45.85,
                Location.WaypointType.DEPOT, null);
        southCity = companyModelTwo.addSettlement("south city", -13.14, 42.98,
                Location.SettlementType.CITY, 562000);
        southVillage = companyModelTwo.addSettlement("south village", -13.10, 43.04,
                Location.SettlementType.VILLAGE, 212);
        waypoint8 = companyModelTwo.addWaypoint("south Depot", -13.18, 43.56,
                Location.WaypointType.DEPOT, null);
        waypoint9 = companyModelTwo.addWaypoint("south city.Warehouse", -13.14, 42.98,
                Location.WaypointType.WAREHOUSE, southCity);
        waypoint10 = companyModelTwo.addWaypoint("south village.Waypoint", -13.1,
                43.04, Location.WaypointType.EMPTY, southVillage);
        driver5 = companyModelTwo.addDriver("Chuck", Gender.MALE, new Date(123, Calendar.MAY, 6));
        driver6 = companyModelTwo.addDriver("Carol", Gender.FEMALE, new Date(129, Calendar.OCTOBER, 28));
        route4 = companyModelTwo.addRoute(new ArrayList<>(Arrays.asList(waypoint3, city, village, village2,
                city2, waypoint5)));
        route5 = companyModelTwo.addRoute(new ArrayList<>(Arrays.asList(waypoint5, village, city2, city, waypoint3)));
        companyModelTwo.assignRoute(driver5, route4);
        companyModelTwo.assignRoute(driver6, route5);
    }


    @Test
    public void testGetAllLocations() {
        CompanyModel companyModelOne = new CompanyModel();
        CompanyModel companyModelTwo = new CompanyModel();

        fillModels(companyModelOne, companyModelTwo);

        Collection<Location> locationsOne = companyModelOne.getAllLocations();
        Collection<Location> locationsTwo = companyModelTwo.getAllLocations();

        int i = 1;

        for (Location location : locationsOne) {
            if (i == 1) {
                assertEquals(location.toString(), village.toString());
            }

            if (i == 2) {
                assertEquals(location.toString(), village2.toString());
            }

            if (i == 3) {
                assertEquals(location.toString(), city.toString());
            }

            if (i == 4) {
                assertEquals(location.toString(), city2.toString());
            }

            if (i == 5) {
                assertEquals(location.toString(), waypoint1.toString());
            }

            if (i == 6) {
                assertEquals(location.toString(), waypoint2.toString());
            }

            if (i == 7) {
                assertEquals(location.toString(), waypoint3.toString());
            }

            if (i == 8) {
                assertEquals(location.toString(), waypoint5.toString());
            }

            if (i == 9) {
                assertEquals(location.toString(), waypoint4.toString());
            }

            i++;
        }
        i = 1;
        for (Location location : locationsTwo) {
            if (i == 1) {
                assertEquals(location.toString(), village.toString());
            }

            if (i == 2) {
                assertEquals(location.toString(), village2.toString());
            }

            if (i == 3) {
                assertEquals(location.toString(), city.toString());
            }

            if (i == 4) {
                assertEquals(location.toString(), city2.toString());
            }

            if (i == 5) {
                assertEquals(location.toString(), waypoint3.toString());
            }

            if (i == 6) {
                assertEquals(location.toString(), waypoint5.toString());
            }

            if (i == 7) {
                assertEquals(location, southCity);
            }

            if (i == 8) {
                assertEquals(location, southVillage);
            }

            if (i == 9) {
                assertEquals(location, waypoint8);
            }

            if (i == 10) {
                assertEquals(location, waypoint9);
            }

            if (i == 11) {
                assertEquals(location, waypoint10);
            }

            i++;
        }
    }

    @Test
    public void testGetAllRoutes() {
        CompanyModel companyModelOne = new CompanyModel();
        CompanyModel companyModelTwo = new CompanyModel();
        fillModels(companyModelOne, companyModelTwo);
        Collection<Route> routesOne = companyModelOne.getAllRoutes();
        Collection<Route> routesTwo = companyModelTwo.getAllRoutes();
        int i = 1;
        for (Route route : routesOne) {
            if (i == 1) {
                assertEquals(route.toString(), route1.toString());
            }
            if (i == 2) {
                assertEquals(route.toString(), route2.toString());
            }
            if (i == 3) {
                assertEquals(route.toString(), route3.toString());
            }
            if (i == 4) {
                assertEquals(route.toString(), route6.toString());
            }
            i++;
        }
        for (Route route : routesTwo) {
            if (i == 5) {
                assertEquals(route.toString(), route4.toString());
            }
            if (i == 6) {
                assertEquals(route.toString(), route5.toString());
            }
            i++;
        }
    }

    @Test
    public void testGetAllDrivers() {
        CompanyModel companyModelOne = new CompanyModel();
        CompanyModel companyModelTwo = new CompanyModel();
        fillModels(companyModelOne, companyModelTwo);
        Collection<Driver> driversOne = companyModelOne.getAllDrivers();
        Collection<Driver> driversTwo = companyModelTwo.getAllDrivers();
        int i = 1;
        for (Driver driver : driversOne) {
            if (i == 1) {
                assertEquals(driver.toString(), driver1.toString());
            }
            if (i == 2) {
                assertEquals(driver.toString(), driver2.toString());
            }
            if (i == 3) {
                assertEquals(driver.toString(), driver3.toString());
            }
            if (i == 4) {
                assertEquals(driver.toString(), driver4.toString());
            }
            if (i == 5) {
                assertEquals(driver.toString(), driver7.toString());
            }
            i++;
        }
        for (Driver driver : driversTwo) {
            if (i == 6) {
                assertEquals(driver.toString(), driver5.toString());
            }
            if (i == 7) {
                assertEquals(driver.toString(), driver6.toString());
            }
            i++;
        }
    }

    @Test
    public void testAssignRoute() {
        CompanyModel companyModelOne = new CompanyModel();
        CompanyModel companyModelTwo = new CompanyModel();

        fillModels(companyModelOne, companyModelTwo);

        Map<Driver, Route> mapOne = companyModelOne.getDriverRouteMap();
        Map<Driver, Route> mapTwo = companyModelTwo.getDriverRouteMap();

        assertEquals(mapOne.size(), 4);
        assertEquals(mapTwo.size(), 2);

        assertEquals(mapOne.get(driver1), route1);
        assertEquals(mapOne.get(driver2), route2);
        assertEquals(mapOne.get(driver4), route3);
        assertEquals(mapTwo.get(driver5), route4);
        assertEquals(mapTwo.get(driver6), route5);
        assertNotEquals(mapOne.get(driver7), route6);
    }
}