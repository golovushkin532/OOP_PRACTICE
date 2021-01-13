package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Route implements Iterable<Location> {
    private final ArrayList<Location> locations = new ArrayList<>();

    public ArrayList<Location> getLocation() {
        return locations;
    }

    public void addLocation(Location location) {
        this.locations.add(location);
    }

    public void addIndexLocation(int index, Location location) {
        this.locations.add(index, location);
    }

    public void removeLocation(int index) {
        this.locations.remove(index);
    }

    public Location getFirstLocation() {
        return locations.get(0);
    }

    public Location getLastLocation() {
        return locations.get(locations.size() - 1);
    }

    @Override
    public Iterator<Location> iterator() {
        return locations.iterator();
    }
}
