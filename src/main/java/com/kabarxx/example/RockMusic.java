package com.kabarxx.example;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    private final List<String> rockMusic =
            Arrays.asList(
                    "Rock music 1",
                    "Rock music 2",
                    "Rock music 3"
            );

    public RockMusic() {}

    @Override
    public String getSong() {
        return rockMusic.get(new Random().nextInt(rockMusic.size()));
    }
}
