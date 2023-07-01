package com.example.homework24;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;
    public StoreController(StoreService storeService){
        this.storeService = storeService;
    }
    @GetMapping("/add")
    public String addProduct(@RequestParam int id){
        storeService.addArticle(id);
        return "Товар добавлен в корзину";
    }
    @GetMapping("/get")
    public void print() {
        storeService.showBasket();
    }
    @GetMapping("/test")
    public void doSmth(){
        storeService.doSmth();
    }
}
