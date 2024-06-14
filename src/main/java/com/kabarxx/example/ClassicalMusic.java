package com.kabarxx.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {
    private final List<String> classicalMusic =
            Arrays.asList(
                    "Classical music 1",
                    "Classical music 2",
                    "Classical music 3"
            );

    @Override
    public String getSong() {
        return classicalMusic.get(new Random().nextInt(classicalMusic.size()));
    }
}