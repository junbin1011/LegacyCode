package com.refactor.extractparameter;

public class TestCase {
    public void run(TestResult result) {
        result.runTest();
    }
}

class TestResult {
    boolean flag = false;

    void runTest() {
        flag = true;
    }
}