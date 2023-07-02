package com.example.homework24;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope(scopeName = "request")
public class StoreServiceImpl implements StoreService{
    List<Product> basket = new ArrayList<>();

    @Override
    public void addArticle(int id){
        Product product = new Product(id);
        basket.add(product);
    }

    @Override
    public void showBasket(){
        for (Product product : basket){
            System.out.println(product);
        }
    }

}
