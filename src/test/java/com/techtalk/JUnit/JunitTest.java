package com.techtalk.JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JunitTest {


    @Test
    public void shouldShowSimpleAssertion() {
        String str = "Junit is working fine";
        assertEquals("Junit is working fine",str);
    }
}
