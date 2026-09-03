package com.housebuilder;

public class House {
    private final int windows;
    private final int doors;
    private final int rooms;
    private final boolean hasGarage;
    private final boolean hasSwimmingPool;
    private final boolean hasStatues;
    private final boolean hasGarden;

    House(int windows, int doors, int rooms, boolean hasGarage, boolean hasSwimmingPool, boolean hasStatues,
            boolean hasGarden) {
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
        this.hasStatues = hasStatues;
        this.hasGarden = hasGarden;
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public int getRooms() {
        return rooms;
    }

    public boolean hasGarage() {
        return hasGarage;
    }

    public boolean hasSwimmingPool() {
        return hasSwimmingPool;
    }

    public boolean hasStatues() {
        return hasStatues;
    }

    public boolean hasGarden() {
        return hasGarden;
    }

}
