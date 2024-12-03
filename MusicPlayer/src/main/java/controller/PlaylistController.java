package controller;

import model.Songs;

import java.util.Collections;
import java.util.LinkedList;

public class PlaylistController {
    private LinkedList<Songs> playlist;
    private int currentIndex = -1;
    private boolean isPaused = false;

    public PlaylistController() {
        this.playlist = new LinkedList<>();
    }

    public LinkedList<Songs> getPlaylist() {
        return playlist;
    }

    public void addSong(Songs song) {
        if (song != null) {
            playlist.add(song);
        }
    }

    public void shuffle() {
        Collections.shuffle(playlist);
    }

    public String play() {
        if (currentIndex == -1 && !playlist.isEmpty()) {
            currentIndex = 0;
        }
        if (!isPaused && currentIndex >= 0 && currentIndex < playlist.size()) {
            isPaused = false;
            return "Playing: " + playlist.get(currentIndex).toString();
        }
        return "No song to play.";
    }

    public String pause() {
        isPaused = true;
        return currentIndex >= 0 && currentIndex < playlist.size()
                ? "Paused: " + playlist.get(currentIndex).toString()
                : "No song to pause.";
    }

   public String repeat() {
    if (!playlist.isEmpty()) {
        currentIndex = 0; // Reset to the beginning
        return "Repeating: " + playlist.get(currentIndex).toString();
    }
    return "No song to repeat.";
}
    

    public void removeCurrentSong() {
        if (currentIndex >= 0 && currentIndex < playlist.size()) {
            playlist.remove(currentIndex);
            currentIndex = Math.min(currentIndex, playlist.size() - 1);
        }
    }

    public String nextSong() {
        if (currentIndex + 1 < playlist.size()) {
            currentIndex++;
            return "Next Song: " + playlist.get(currentIndex).toString();
        }
        return "No more songs in the playlist.";
    }

    public String previousSong() {
        if (currentIndex - 1 >= 0) {
            currentIndex--;
            return "Previous Song: " + playlist.get(currentIndex).toString();
        }
        return "Already at the beginning of the playlist.";
    }
}