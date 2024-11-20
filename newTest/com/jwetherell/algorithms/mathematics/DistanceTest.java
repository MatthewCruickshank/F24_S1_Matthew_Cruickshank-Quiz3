package com.jwetherell.algorithms.mathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceTest {

    @Test
    void testChebyshevDistance() {
        long[] p1 = {1, 2};
        long[] p2 = {2, 5};
        assertEquals(3, Distance.chebyshevDistance(p1, p2));
        assertEquals(3, Distance.chebyshevDistance(p2, p1));

        long[] p3 = {1, 2};
        assertEquals(0, Distance.chebyshevDistance(p3, p1));
    }

    @Test
    void testSquaredDistance() {
        double x1 = 2;
        double y1 = 2;
        double x2 = 5;
        double y2 = 2;
        double expect = 9;
        double out = Distance.squaredDistance(x1, y1, x2, y2);
        assertEquals(expect, out, 0.001);

        double x3 = 10;
        double y3 = 3;
        double expect2 = 26;
        double out2 = Distance.squaredDistance(x3, y3, x2, y2);
        assertEquals(expect2, out2, 0.001);
    }

    @Test
    void euclideanDistance() {
        double x1 = 2;
        double y1 = 2;
        double x2 = 5;
        double y2 = 2;
        double expect = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        double out = Distance.euclideanDistance(x1, y1, x2, y2);
        assertEquals(expect, out, 0.001);

        double x3 = 10;
        double y3 = 3;
        double expect2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double out2 = Distance.euclideanDistance(x3, y3, x2, y2);
        assertEquals(expect2, out2, 0.001);
    }
}