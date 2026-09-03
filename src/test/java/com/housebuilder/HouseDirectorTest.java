package com.housebuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HouseDirectorTest {

    @Test
    void buildsIndependentHousesWhenTheDirectorIsReused() {

        HouseDirector director = new HouseDirector(new StandardHouseBuilder());

        House mansion = director.buildLuxuryMansion();
        House basicHouse = director.buildBasicHouse();

        assertTrue(mansion.hasSwimmingPool());
        assertFalse(basicHouse.hasSwimmingPool());
    }

    @Test
    void buildsABasicHouseWithoutExtras() {
        HouseDirector director = new HouseDirector(new StandardHouseBuilder());

        House house = director.buildBasicHouse();

        assertEquals(4, house.getWindows());
        assertEquals(2, house.getDoors());
        assertEquals(3, house.getRooms());
        assertFalse(house.hasGarage());
        assertFalse(house.hasStatues());
        assertFalse(house.hasGarden());
    }

    @Test
    void buildsAHouseWithGarden() {
        HouseDirector director = new HouseDirector(new StandardHouseBuilder());

        House house = director.buildHouseWithGarden();

        assertTrue(house.hasGarden());
        assertFalse(house.hasSwimmingPool());
    }

    @Test
    void buildsALuxuryMansionWithEveryExtra() {
        HouseDirector director = new HouseDirector(new StandardHouseBuilder());

        House house = director.buildLuxuryMansion();

        assertEquals(10, house.getWindows());
        assertTrue(house.hasGarage());
        assertTrue(house.hasSwimmingPool());
        assertTrue(house.hasStatues());
        assertTrue(house.hasGarden());
    }
}
