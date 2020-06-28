package com.refactor.pushdowndependency;

import org.junit.Assert;
import org.junit.Test;

public class TestingoffMarketTradeValidatorTest {

    @Test
    public void testIsValid() {
        TestingoffMarketTradeValidator testingoffMarketTradeValidator = new TestingoffMarketTradeValidator();
        Assert.assertTrue(testingoffMarketTradeValidator.isValid());
    }

}