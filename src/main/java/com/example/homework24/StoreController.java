package com.example.homework24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final CartService cartService;

    @Autowired
    public StoreController(CartService cartService) {

        this.cartService = cartService;
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> items){
        return cartService.addItems(items);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return cartService.getItems();
    }
}
