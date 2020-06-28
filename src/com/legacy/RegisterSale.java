package com.legacy;

import java.util.ArrayList;
import java.util.List;

public class RegisterSale {
    List<String> items = new ArrayList<>();

    public void addItem(String code) {
        String newItem = Inventory.getInventory().itemForBarcode(code);
        items.add(newItem);
    }
}

class Inventory {

    private Inventory() {
    }

    private static Inventory instance = new Inventory();

    public static Inventory getInventory() {
        return instance;
    }

    public String itemForBarcode(String code) {
        return code;
    }
}