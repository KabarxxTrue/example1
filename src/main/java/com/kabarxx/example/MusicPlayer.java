package com.kabarxx.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    List<Music> musicList = new ArrayList<>();

    public MusicPlayer() {}

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusicList() {
        for(Music music : musicList)
            System.out.println("Playing " + music.getSong());
    }
}
