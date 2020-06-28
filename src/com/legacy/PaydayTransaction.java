package com.legacy;

public class PaydayTransaction {
    TransactionLog transactionLog;

    public PaydayTransaction(TransactionLog transactionLog) {
        this.transactionLog = transactionLog;
    }

    public void run() {
        transactionLog.saveTransaction();
    }
}

class TransactionLog {
    public void saveTransaction() {

    }

    public void recordError(int code) {

    }
}