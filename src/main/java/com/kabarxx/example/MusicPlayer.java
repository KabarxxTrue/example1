package com.kabarxx.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    List<Music> musicList = new ArrayList<>();

    public MusicPlayer() {}

    public MusicPlayer(RockMusic rockMusic,
                       ClassicalMusic classicalMusic,
                       RapMusic rapMusic) {
        musicList.add(rockMusic);
        musicList.add(classicalMusic);
        musicList.add(rapMusic);
    }

    public List<Music> getMusicList() {
        return musicList;
    }
}
