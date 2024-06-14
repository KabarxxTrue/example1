package com.kabarxx.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private final Music classicalMusic;
    private final Music rockMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
                       @Qualifier("rockMusic") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(SongsEnum enumSongs) {
        switch (enumSongs) {
            case CLASSICAL:
                return "Playing " + classicalMusic.getSong();
            case ROCK:
                return "Playing " + rockMusic.getSong();
            default:
                return "Enum not recognized";
        }
    }
}
