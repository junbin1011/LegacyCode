package com.refactor.replaceglobalreferencewithgetter;

public class FakeInventory extends Inventory {
    @Override
    public String itemForBarcode(String code) {
        return code;
    }
}
