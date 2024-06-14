package com.kabarxx.example;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {
    public RapMusic() {}

    @Override
    public String getSong() {
        return "Rap music";
    }

}
