package com.housebuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StandardHouseBuilderTest {

    @Test
    void buildsAHouseWithTheRequestedNumberOfWindows() {
        HouseBuilder builder = new StandardHouseBuilder();

        House house = builder.withWindows(4).build();

        assertEquals(4, house.getWindows());
    }

    @Test
    void buildsAFullyCustomisedHouse() {
        House house = new StandardHouseBuilder()
                .withWindows(8)
                .withDoors(4)
                .withRooms(6)
                .withGarage(true)
                .withSwimmingPool(true)
                .withStatues(true)
                .withGarden(true)
                .build();

        assertEquals(8, house.getWindows());
        assertEquals(4, house.getDoors());
        assertEquals(6, house.getRooms());
        assertTrue(house.hasGarage());
        assertTrue(house.hasSwimmingPool());
        assertTrue(house.hasStatues());
        assertTrue(house.hasGarden());
    }

    @Test
    void buildsAnEmptyHouseWhenNoOptionIsSelected() {
        House house = new StandardHouseBuilder().build();

        assertEquals(0, house.getWindows());
        assertFalse(house.hasGarage());
        assertFalse(house.hasGarden());
    }
}
