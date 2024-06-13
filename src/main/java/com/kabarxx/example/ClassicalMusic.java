package com.kabarxx.example;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    public ClassicalMusic() {}

    @Override
    public String getSong() {
        return "Classical music";
    }

    @Override
    public void beanInitLifeCycle() {
        System.out.println("Classical music is initialized");
    }

    @Override
    public void beanDestroyLifeCycle() {
        System.out.println("Classical music is destructed");
    }
}
