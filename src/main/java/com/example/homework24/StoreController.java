package com.example.homework24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.SessionScope;

@RestController
@RequestMapping("/order")
@SessionScope
public class StoreController {
    private Basket basket;

    @Autowired
    public StoreController(Basket basket) {
        this.basket = basket;
    }

    @PostMapping("/add")
    public void addItem(@RequestParam("id") int itemId) {
        basket.addItem(itemId);
    }

    @GetMapping("/get")
    public Basket getItems() {
        return basket;
    }
}
