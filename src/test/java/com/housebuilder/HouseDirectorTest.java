package com.housebuilder;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HouseDirectorTest {

    @Test
    void buuildsIndependentHousesWhenTheDirectorIsReused() {

        HouseDirector director = new HouseDirector(new StandardHouseBuilder());

        House mansion = director.buildLuxuryMansion();
        House basicHouse = director.buildBasicHouse();

        assertTrue(mansion.hasSwimmingPool());
        assertFalse(basicHouse.hasSwimmingPool());
    }
}
