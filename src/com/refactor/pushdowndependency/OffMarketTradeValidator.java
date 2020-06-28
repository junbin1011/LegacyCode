package com.refactor.pushdowndependency;

public abstract class OffMarketTradeValidator {
    boolean flag = false;

    public abstract void showMessage();

    public boolean isValid() {
        showMessage();
        return flag;
    }
}

class WindowOffMarketTradeValidator extends OffMarketTradeValidator {

    @Override
    public void showMessage() {
        // show ui message
        flag = true;
    }

}

