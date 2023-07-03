package com.example.homework24;

import org.springframework.stereotype.Service;

@Service
public class CartService  implements StoreService{
    private Basket basket;

    public CartService(Basket basket) {
        this.basket = new Basket();
    }

    public void addItem(int itemId) {
        basket.addItem(itemId);
    }

    public Basket getBasket() {
        return basket;
    }

    @Override
    public void addArticle(int id) {

    }

    @Override
    public void showBasket() {

    }
}
