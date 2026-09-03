package com.housebuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StandardHouseBuilderTest {

    @Test
    void buildsAHouseWithTheResquestedNumberOfWindows() {
        HouseBuilder builder = new StandardHouseBuilder();

        House house = builder.withWindows(4).build();

        assertEquals(4, house.getWindows());
    }
}
