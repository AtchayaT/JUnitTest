package com.techtalk.JUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        AnnotationTest.class,
        AssertMethodsTest.class,
})
public class JunitTestSuite {
}
