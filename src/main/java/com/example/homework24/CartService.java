package com.example.homework24;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class CartService {
    private Basket basket;

    public CartService() {
        this.basket = new Basket();
    }

    public void addItem(int itemId) {
        basket.addItem(itemId);
    }

    public Basket getBasket() {
        return basket;
    }
}
