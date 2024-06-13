package com.kabarxx.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "ApplicationContext.xml"
        );

        RapMusic rapMusic = context.getBean("rapMusic", RapMusic.class);
        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(rapMusic.getSong());
        System.out.println(rockMusic.getSong());
        System.out.println(classicalMusic.getSong());

        context.close();
    }
}
