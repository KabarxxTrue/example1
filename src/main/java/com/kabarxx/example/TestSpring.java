package com.kabarxx.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("Playing all music");
        musicPlayer.playAll();
        System.out.println("Playing random music");
        musicPlayer.playRandomMusic();

        context.close();
    }
}