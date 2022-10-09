package com.aceprogamming.kata.grasshopper.grades.average;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GrasshopperTest {

    @Test
    void testAllZerosIsFailing() {
        Assertions.assertEquals('F', Grasshopper.getGrades(0,0,0));
    }

    @Test
    void testAllOneHundredIsA() {
        Assertions.assertEquals('A', Grasshopper.getGrades(100,100, 100));
    }

    @Test
    void testAverageOf60IsD() {
        Assertions.assertEquals('D', Grasshopper.getGrades(60, 60, 60));
    }
}
