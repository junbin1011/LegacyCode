package com.legacy;

public class TestCase {
    public void run() {
        TestResult result = new TestResult();
        result.runTest();
    }
}

class TestResult {
    boolean flag = false;

    void runTest() {
        flag = true;
    }
}