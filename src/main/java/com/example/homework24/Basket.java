package com.example.homework24;

import java.awt.*;
import java.util.ArrayList;

public class Basket {
    private List<Product> items;

    public Basket() {
        items = new ArrayList<>();
    }

    public void addItem(int itemId) {
        items.add(new Product(itemId).toString());
    }

    public List<Product> getItems() {
        return items;
    }
}
