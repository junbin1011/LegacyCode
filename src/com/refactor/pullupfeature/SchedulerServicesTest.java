package com.refactor.pullupfeature;

import org.junit.Test;

import static org.junit.Assert.*;

public class SchedulerServicesTest {

    @Test
    public void testGetDeadtime() {
        TestingSchedulingServices services=new TestingSchedulingServices();
        services.addItem(1);
        assertEquals(1,services.getDeadtime());
    }
}