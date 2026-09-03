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

}
