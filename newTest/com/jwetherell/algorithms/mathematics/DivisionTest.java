package com.jwetherell.algorithms.mathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void testDivision() {
        int a = 5;
        int b = 2;
        long expect = 2;
        assertEquals(expect, Division.division(a, b));

        expect = 0;
        assertEquals(expect, Division.division(b, a));

        int c = 0;
        expect = Long.MAX_VALUE;
        assertEquals(expect, Division.division(a, c));
    }

    @Test
    void testDivisionUsingLoop() {
        int a = 5;
        int b = 2;
        long expect = 5/2;
        assertEquals(expect, Division.divisionUsingLoop(a, b));

        expect = 2/5;
        assertEquals(expect, Division.divisionUsingLoop(b, a));

        int c = 0;
        expect = Long.MAX_VALUE;
        assertEquals(expect, Division.divisionUsingLoop(a, c));
    }

    @Test
    void testDivisionUsingRecursion() {
        int a = 5;
        int b = 2;
        long expect = 5/2;
        assertEquals(expect, Division.divisionUsingRecursion(a, b));

        expect = 2/5;
        assertEquals(expect, Division.divisionUsingRecursion(b, a));

        int c = 0;
        expect = Long.MAX_VALUE;
        assertEquals(expect, Division.divisionUsingRecursion(a, c));
    }

    @Test
    void testDivisionUsingMultiplication() {
        int a = 5;
        int b = 2;
        long expect = 5/2;
        assertEquals(expect, Division.divisionUsingMultiplication(a, b));

        expect = 2/5;
        assertEquals(expect, Division.divisionUsingMultiplication(b, a));

        int c = 0;
        expect = Long.MAX_VALUE;
        assertEquals(expect, Division.divisionUsingMultiplication(a, c));
    }

    @Test
    void testDivisionUsingShift() {
        int a = 5;
        int b = 2;
        long expect = 5/2;
        assertEquals(expect, Division.divisionUsingShift(a, b));

        expect = 2/5;
        assertEquals(expect, Division.divisionUsingShift(b, a));

        int c = 0;
        expect = Long.MAX_VALUE;
        assertEquals(expect, Division.divisionUsingShift(a, c));
    }

    @Test
    void testDivisionUsingLogs() {
        int a = 5;
        int b = 2;
        long expect = 5/2;
        assertEquals(expect, Division.divisionUsingLogs(a, b));

        expect = 2/5;
        assertEquals(expect, Division.divisionUsingLogs(b, a));

        int c = 0;
        expect = Long.MAX_VALUE;
        assertEquals(expect, Division.divisionUsingLogs(a, c));
    }
}