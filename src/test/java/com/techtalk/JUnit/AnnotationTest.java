package com.techtalk.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class AnnotationTest {

    @Order(2)
    @Test
    public void helloJUnit5() {
        System.out.println("Runs Second");
        assertEquals(10, 5 + 5);
    }

    @Order(1)
    @ParameterizedTest
    @ValueSource(strings = {"cali", "bali", "dani"})
    public void endsWithI(String str) {
        System.out.println("Runs First");
        assertTrue(str.endsWith("i"));
    }

    @Order(3)
    @RepeatedTest(value = 2, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    @DisplayName("RepeatingTest")
    public void repeatedTestExample() {
        System.out.println("Runs Third");
        System.out.println("RepeatedTest");
    }

    @Order(4)
    @Test
    @DisplayName("Display name test")
    public void printDisplayName() {
        System.out.println("Runs Fourth");
        assertTrue(true);
    }


}
