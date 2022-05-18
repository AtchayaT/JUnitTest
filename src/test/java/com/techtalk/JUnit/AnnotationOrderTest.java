package com.techtalk.JUnit;

import org.junit.Ignore;
import org.junit.jupiter.api.*;
import java.util.ArrayList;


public class AnnotationOrderTest {

    ArrayList<String> list;
    @BeforeAll
    public static void runOnceBeforeAllTests() {
        //WebDriver driver = new FirefoxDriver();
        System.out.println("Using @BeforeAll , executed before all test cases ");
    }
    @BeforeEach
    public void runBeforeEveryTest() {
        list = new ArrayList<>();
        System.out.println("Using @BeforeEach annotations ,executed before each test cases ");
    }

    @Test
    public void isListEmpty() {
        Assertions.assertTrue(list.isEmpty());

        System.out.println("List is empty ");
    }

    @Test
    public void add() {
        list.add("test1");
        list.add("test2");
        Assertions.assertEquals(2, list.size());
        System.out.println("Added elements ");
    }

    @Ignore
    public void ignoreTest() {
        System.out.println("Using @Ignore , this execution is ignored");
    }


    @AfterEach
    public void runAfterEveryTest() {
        list.clear();
        System.out.println("Using @AfterEach ,executed after each test cases");
    }
    @AfterAll
    public static void runOnceAfterAllTests() {
        System.out.println("Using @AfterAll ,executed after all test cases");
    }


}
