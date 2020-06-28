package com.refactor.extractinterface;


import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class PaydayTransactionTest {

    @Test
    public void testPayday() {
        FakeTransactionLog fakeTransactionLog = new FakeTransactionLog();
        PaydayTransaction paydayTransaction = new PaydayTransaction(fakeTransactionLog);
        paydayTransaction.run();
        Assert.assertThat(fakeTransactionLog.isSave, is(true));
    }
}

class FakeTransactionLog implements TransactionRecorder {
    public boolean isSave = false;

    @Override
    public void saveTransaction() {
        isSave = true;
    }
}

