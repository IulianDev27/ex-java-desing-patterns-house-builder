package com.housebuilder;

public class HouseDirector {

    private final HouseBuilder builder;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public House buildBasicHouse() {

        return builder.withWindows(4)
                .withDoors(2)
                .withRooms(3)
                .withGarage(false)
                .withSwimmingPool(false)
                .withStatues(false)
                .withGarden(false)
                .build();
    }

    public House buildHouseWithGarden() {
        return builder.withWindows(6)
                .withDoors(3)
                .withRooms(4)
                .withGarage(true)
                .withSwimmingPool(false)
                .withStatues(false)
                .withGarden(true)
                .build();

    }

    public House buildLuxuryMansion() {
        return builder.withWindows(10)
                .withDoors(5)
                .withRooms(8)
                .withGarage(true)
                .withSwimmingPool(true)
                .withStatues(true)
                .withGarden(true)
                .build();
    }
}
