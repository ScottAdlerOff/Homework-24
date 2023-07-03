package com.example.homework24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.SessionScope;

@RestController
@RequestMapping("/order")
public class StoreController {
    private CartService cartService;

    @Autowired
    public StoreController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/add")
    public void addItem(@RequestParam("id") int itemId) {
        cartService.addItem(itemId);
    }

    @GetMapping("/get")
    public Basket getItems() {
        return cartService.getBasket();
    }
}
