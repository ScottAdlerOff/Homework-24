package com.example.homework24;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
import java.awt.*;
import java.util.ArrayList;
import org.springframework.stereotype.Component;

@Component
@SessionScope
public class Basket {
    private List<Product> items;

    public Basket() {
        items = new ArrayList<>();
    }

    public void addItem(int itemId) {
        items.add(new Product(itemId));
    }

    public List<Product> getItems() {
        return items;
    }
}

