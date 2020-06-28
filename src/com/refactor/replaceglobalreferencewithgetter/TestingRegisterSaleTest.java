package com.refactor.replaceglobalreferencewithgetter;

import org.junit.Assert;
import org.junit.Test;

public class TestingRegisterSaleTest {
    @Test
    public void testAddItem() {
        TestingRegisterSale testingRegisterSale = new TestingRegisterSale();
        testingRegisterSale.addItem("1");
        Assert.assertTrue("1".equals(testingRegisterSale.items.get(0)));
    }
}