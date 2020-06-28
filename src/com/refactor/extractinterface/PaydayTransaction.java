package com.refactor.extractinterface;

public class PaydayTransaction {
    TransactionRecorder transactionRecorder;

    public PaydayTransaction(TransactionRecorder transactionRecorder) {
        this.transactionRecorder = transactionRecorder;
    }

    public void run() {
        transactionRecorder.saveTransaction();
    }
}

class TransactionLog implements TransactionRecorder {
    @Override
    public void saveTransaction() {

    }

    public void recordError(int code) {

    }
}