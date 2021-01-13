package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_5;

public class Location {
    private int id;
    private String name;
    private double latitude;
    private double longitude;

    public enum SettlementType {
        CITY,
        VILLAGE
    }

    public enum WaypointType {
        DEPOT,
        WAREHOUSE,
        EMPTY
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setName(String name) {
        this.name = name;
    }
}
