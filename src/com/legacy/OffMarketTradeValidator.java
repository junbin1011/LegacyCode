package com.legacy;

public class OffMarketTradeValidator {
    boolean flag = false;

    public void showMessage() {
        // show ui message
        flag = true;
    }

    public boolean isValid(){
        showMessage();
        return flag;
    }
}

