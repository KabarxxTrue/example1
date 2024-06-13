package com.kabarxx.example;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    public RockMusic() {}

    @Override
    public String getSong() {
        return "Rock music";
    }

    @Override
    public void beanInitLifeCycle() {
        System.out.println("Rock music is initialized");
    }

    @Override
    public void beanDestroyLifeCycle() {
        System.out.println("Rock music is destructed");
    }
}
