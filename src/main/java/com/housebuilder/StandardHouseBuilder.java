package com.housebuilder;

public class StandardHouseBuilder implements HouseBuilder {

    private int windows;
    private int doors;
    private int rooms;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasStatues;
    private boolean hasGarden;

    @Override
    public HouseBuilder withWindows(int windows) {
        this.windows = windows;
        return this;
    }

    @Override
    public HouseBuilder withDoors(int doors) {
        this.doors = doors;
        return this;
    }

    @Override
    public HouseBuilder withRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    @Override
    public HouseBuilder withGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    @Override
    public HouseBuilder withSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
        return this;
    }

    @Override
    public HouseBuilder withStatues(boolean hasStatues) {
        this.hasStatues = hasStatues;
        return this;
    }

    @Override
    public HouseBuilder withGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    @Override
    public House build() {
        return new House(windows, doors, rooms, hasGarage, hasSwimmingPool, hasStatues, hasGarden);
    }

}
