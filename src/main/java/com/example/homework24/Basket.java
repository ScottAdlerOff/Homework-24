package com.example.homework24;

import org.springframework.web.context.annotation.SessionScope;

import java.awt.*;
import java.util.ArrayList;
@Component
@SessionScope
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
