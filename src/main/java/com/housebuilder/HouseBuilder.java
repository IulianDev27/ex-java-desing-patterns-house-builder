package com.housebuilder;

public interface HouseBuilder {

    HouseBuilder withWindows(int windows);

    HouseBuilder withDoors(int doors);

    HouseBuilder withRooms(int rooms);

    HouseBuilder withGarage(boolean hasGarage);

    HouseBuilder withSwimmingPool(boolean hasSwimmingPool);

    HouseBuilder withStatues(boolean hasStatues);

    HouseBuilder withGarden(boolean hasGarden);

    House build();
}
