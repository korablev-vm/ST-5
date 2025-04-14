package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {
    
    @Test
    public void testAverageWithDifferentNumbers() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.average(1.0, 3.0), 0.000001);
    }

    @Test
    public void testAverageWithPositiveAndNegative() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(0.0, sqrt.average(-1.0, 1.0), 0.000001);
    }

    @Test
    public void testAverageWithEqualNumbers() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(5.0, sqrt.average(5.0, 5.0), 0.000001);
    }

    @Test
    public void testGoodWithExactValue() {
        Sqrt sqrt = new Sqrt(4.0);
        assertTrue(sqrt.good(2.0, 4.0));
    }

    @Test
    public void testGoodWithValueWithinDelta() {
        Sqrt sqrt = new Sqrt(4.0);
        assertTrue(sqrt.good(2.0000000000000001, 4.0));
    }

    @Test
    public void testGoodWithValueAboveDelta() {
        Sqrt sqrt = new Sqrt(4.0);
        assertFalse(sqrt.good(2.1, 4.0));
    }

    @Test
    public void testGoodWithValueBelowDelta() {
        Sqrt sqrt = new Sqrt(4.0);
        assertFalse(sqrt.good(1.9, 4.0));
    }

    @Test
    public void testImproveFirstIteration() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.improve(2.0, 4.0), 0.000001);
    }

    @Test
    public void testImproveSecondIteration() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.05, sqrt.improve(2.5, 4.0), 0.000001);
    }

    @Test
    public void testIterWithExactGuess() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.iter(2.0, 4.0), 0.000001);
    }

    @Test
    public void testIterWithLowerGuess() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.iter(1.0, 4.0), 0.000001);
    }

    @Test
    public void testIterWithHigherGuess() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.iter(3.0, 4.0), 0.000001);
    }

    @Test
    public void testCalcWithPerfectSquare() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.calc(), 0.000001);
    }

    @Test
    public void testCalcWithAnotherPerfectSquare() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.calc(), 0.000001);
    }

    @Test
    public void testCalcWithIrrationalNumber() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), sqrt.calc(), 0.000001);
    }

    @Test
    public void testCalcWithZero() {
        Sqrt sqrt = new Sqrt(0.0);
        assertEquals(0.0, sqrt.calc(), 0.000001);
    }

    @Test
    public void testCalcWithNegativeNumber() {
        Sqrt sqrt = new Sqrt(-4.0);
        assertThrows(StackOverflowError.class, () -> sqrt.calc());
    }
}
