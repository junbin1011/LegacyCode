package com.refactor.replaceglobalreferencewithgetter;

public class TestingRegisterSale extends RegisterSale {
    Inventory inventory = new FakeInventory();

    protected Inventory getInventory() {
        return inventory;
    }
}
