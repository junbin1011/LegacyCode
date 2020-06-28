package com.refactor.instancedelegate;

public class BankingServices {
    public static void updateAccountBalance(int id, String amount) {

    }

    public void updateAccount(int id, String amount) {
        updateAccountBalance(id, amount);
    }
}

class SomeClass {
    public void someMethod(BankingServices services) {
        services.updateAccount(0, "");
    }
}