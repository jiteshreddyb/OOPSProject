
package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Optional;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Songs> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public Optional<Songs> findSong(String title) {
        return songs.stream().filter(song -> song.getTitle().equals(title)).findFirst();
    }

    public boolean addSong(String title, double duration, String artist, String genre) {
        if (findSong(title).isEmpty()) {
            songs.add(new Songs(title, duration, artist, genre));
            return true;
        }
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Songs> playlist) {
        Optional<Songs> song = findSong(title);
        if (song.isPresent()) {
            playlist.add(song.get());
            return true;
        }
        return false;
    }

    public ArrayList<Songs> getSongs() {
        return songs;
    }
}
