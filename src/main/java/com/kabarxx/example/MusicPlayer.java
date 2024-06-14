package com.kabarxx.example;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    protected List<Music> musicList;
    protected Random random;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
        this.random = new Random();
    }

    public void playAll() {
        for(Music music : musicList) {
            System.out.println(music.getSong());
        }
    }

    public void playRandomMusic() {
        if (!musicList.isEmpty()) {
            int index = random.nextInt(musicList.size());
            System.out.println(musicList.get(index).getSong());
        } else {
            System.out.println("Music player is empty");
        }
    }
}
