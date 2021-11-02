package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    @Test
    void maximumRollWithD10(){
        double rollDouble = (0.99*(10))+1;
        assertEquals(10.0, Math.floor(rollDouble));
    }

    @Test
    void minimumRollWithD10(){
        double rollDouble = (0.99*(1))+1;
        assertEquals(1.0, Math.floor(rollDouble));
    }
}