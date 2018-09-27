package tests.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculateServiceTest {

    private CalculateService calculateService;

    private int a;
    private int b;
    private int expectedResult;

    public CalculateServiceTest(int a, int b, int expectedResult) {
        this.a = a;
        this.b = b;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> params() {
        return Arrays.asList(new Object[][] {
                {1,1,2},
                {3,4,7},
                {5,0,5},
                {5,1,7}
        });
    }

    @Before
    public void setUp() {
        calculateService = new CalculateService();
    }

    @Test
    public void testCalculateSumWithParametrs() {
        assertEquals(expectedResult, calculateService.calculate(a,b));
    }
}