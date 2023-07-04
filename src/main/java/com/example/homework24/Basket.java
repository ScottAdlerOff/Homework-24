package com.example.homework24;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
@SessionScope
public class Basket {
    private final List<Integer> items;

    public Basket(){
        this.items = new ArrayList<>();
    }

    public List<Integer> add(List<Integer> items){
        this.items.addAll(items);
        return items;
    }

    public List<Integer> get() {
        return items;
    }
}

