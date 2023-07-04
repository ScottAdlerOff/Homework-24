package com.example.homework24;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService implements StoreService{

    private final Basket basket;

    public CartService(Basket basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> addItems(List<Integer> items){
        return basket.add(items);
    }

    @Override
    public List<Integer> getItems() {
        return basket.get();
    }
}
