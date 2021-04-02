package org.htw.prog2.aufgabe0;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MyProjectTest {

    /**
     * Tested requirements:
     * <ol>
     *     <li>Last value is result array should be less than maxerror away from true square root</li>
     *     <li>Square root of negative values should be 0</li>
     *     <li>Negative values for maxerror should be treated the same as positive values
     *     (=> running with negative maxerror should not be an infinite loop, this
     *     is tested as "should not need more than 1 second to return a result")</li>
     * <ol/>
     */
    @Test
    void calculateBabylonianRoot() {
        Random r = new Random();
        // Tests for point 1
        for(int numtest = 0; numtest < 10; numtest++) {
            double value = r.nextInt(100000);
            // Ensure that maxerror is at least minmaxerror.
            double maxerror = r.nextDouble();
            double[] result = MyProject.calculateBabylonianRoot(value, 5, maxerror);
            double expected = Math.sqrt(value);
            assertTrue(Math.abs(result[result.length - 1] - expected) <= maxerror,
                    "Wrong root with value = " + value + " and maxerror = " + maxerror +
                    ": Expected: " + expected + " but got: " + result[result.length-1]);
        }
        // Tests for point 2
        double[] res = MyProject.calculateBabylonianRoot(0, 5, 0.0001);
        assertTrue(res[res.length-1] == 0, "Root of 0 should be 0, got: "
                + res[res.length-1]);
        // Tests for point 3
        for(int numtest = 0; numtest < 10; numtest++) {
            double value = -1*r.nextInt(100000);
            double maxerror = r.nextDouble();
            double[] result = MyProject.calculateBabylonianRoot(value, 5, maxerror);
            double expected = Math.sqrt(value);
            assertTrue(Math.abs(result[result.length - 1]) == 0,
                    "Root of negative value = " + value + " should be 0, got: "
                            + result[result.length-1]);
        }
        // Tests for point 4
        for(int numtest = 0; numtest < 10; numtest++) {
            double value = r.nextInt(100000);
            double maxerror = -1 * r.nextDouble();
            // First, check if calculation completes within 1 second
            assertTimeoutPreemptively(Duration.ofSeconds(1),
                    () -> {
                        MyProject.calculateBabylonianRoot(value, 5, maxerror);
                    },
                    "Running with value = " + value + ", maxerror = "
                            + maxerror + " took more than 1 second");
            double[] result = MyProject.calculateBabylonianRoot(value, 5, maxerror);;
            double expected = Math.sqrt(value);
            assertTrue(Math.abs(result[result.length - 1] - expected) <= Math.abs(maxerror),
                    "Wrong root with value = " + value + " and maxerror = " + maxerror +
                            ": Expected: " + expected + " but got: " + result[result.length-1]);
        }
    }
}