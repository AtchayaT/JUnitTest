package com.techtalk.JUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class AssertMethodsTest {

    @Test
    public void assertMethods() {
        Assertions.assertEquals(4, calculator.summation(2, 2), "com.techtalk.JUnit.calculator.add(2,2) is equal to 4");
        Assertions.assertNotEquals(6, calculator.summation(2, 2), "com.techtalk.JUnit.calculator.add(2,2) is not equal to 6");

        Assertions.assertTrue(calculator.compare(5, 10), "number1 is less than number2");
        Assertions.assertFalse(calculator.compare(20, 10), "number1 is not less than number2");

        int[] expectedArray = new int[]{2, 4, 6, 8};
        int[] actualArray = new int[]{2, 4, 6, 8};
        assertArrayEquals(expectedArray, actualArray, "Array equal test");


        String str = "Junit is not working fine";
        assertNull(null);
        assertNotNull(str);
    }

    @Test
    public void assertAllMethod() {
        //AssertAll-To run multiple assert methods
        List<Integer> numbers = new ArrayList<Integer>() {{
            add(2);
            add(3);
            add(5);
            add(7);
        }};

        assertAll(() -> Assertions.assertEquals(calculator.summation(numbers.get(0), numbers.get(3)), numbers.get(2), "summation test fail"),
                () -> Assertions.assertTrue(calculator.compare(numbers.get(2), numbers.get(3)), "Comparison test pass"));
    }

    @Test
    public void assertIterableEquals() {
        List<Integer> listOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> listTwo = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> listThree = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> listFour = new ArrayList<>(Arrays.asList(1, 2, 4, 3));

        Assertions.assertIterableEquals(listOne, listTwo, "Test1 will Pass");
        Assertions.assertIterableEquals(listOne, listThree, "Test2 will fail");
        Assertions.assertIterableEquals(listOne, listFour, "Test3 will Pass");

    }

    @Test
    public void timeOutTest() {
        Assertions.assertTimeout(Duration.ofMillis(500), () -> TimeUnit.SECONDS.sleep(5));

    }

    @Test
    public void differenceBetweenAssertSameAndAssertEquals() {
        //assertSame -> "=="
        //assertEquals -> "equals()"
        String msg1 = "Hello";
        String msg2 = msg1;
        String msg3 = new String("Hello");

        assertAll(() -> assertSame(msg1, msg2, "Test1 pass"),
                () -> assertEquals(msg1, msg2, "Test2 pass"),

                () -> assertSame(msg1, msg3, "Test3 Fail"),
                () -> assertEquals(msg1, msg3, "Test4 Pass"));
    }


}


