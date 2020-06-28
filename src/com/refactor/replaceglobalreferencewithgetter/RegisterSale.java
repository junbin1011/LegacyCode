package com.refactor.replaceglobalreferencewithgetter;

import java.util.ArrayList;
import java.util.List;

public class RegisterSale {
    List<String> items = new ArrayList<>();

    public void addItem(String code) {
        String newItem = getInventory().itemForBarcode(code);
        items.add(newItem);
    }

    private Inventory getInventory() {
        return Inventory.getInventory();
    }
}

class Inventory {

    protected Inventory() {
    }

    private static Inventory instance = new Inventory();

    public static Inventory getInventory() {
        return instance;
    }

    public String itemForBarcode(String code) {
        return code;
    }
}