package com.refactor.extractparameter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCaseTest {

    @Test
    public void run() {
        TestCase testCase = new TestCase();
        TestResult mockTestResult = new TestResult();
        testCase.run(mockTestResult);
        Assert.assertTrue(mockTestResult.flag);
    }
}