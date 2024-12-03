
package app;

import controller.PlaylistController;
import model.Album;
import model.Songs;
import ui.MainFrame;

public class Main {
    public static void main(String[] args) {
        // Initialize PlaylistController
        PlaylistController playlistController = new PlaylistController();

        // Create Album
        Album popularHits = new Album("Popular Hits", "Various Artists");

        // Add 10 popular songs to the album
        popularHits.addSong("Blinding Lights", 3.20, "The Weeknd", "Pop");
        popularHits.addSong("Shape of You", 3.53, "Ed Sheeran", "Pop");
        popularHits.addSong("Uptown Funk", 4.30, "Mark Ronson ft. Bruno Mars", "Funk");
        popularHits.addSong("Rolling in the Deep", 3.48, "Adele", "Soul");
        popularHits.addSong("Happier", 3.28, "Marshmello & Bastille", "Electronic");
        popularHits.addSong("Someone Like You", 4.45, "Adele", "Pop");
        popularHits.addSong("Believer", 3.24, "Imagine Dragons", "Rock");
        popularHits.addSong("Closer", 4.04, "The Chainsmokers ft. Halsey", "Electronic");
        popularHits.addSong("Old Town Road", 2.37, "Lil Nas X ft. Billy Ray Cyrus", "Country");
        popularHits.addSong("Bad Guy", 3.14, "Billie Eilish", "Alternative");

        // Add songs to the playlist
        for (Songs song : popularHits.getSongs()) {
            playlistController.addSong(song);
        }

        // Launch the MainFrame with the playlistController
        new MainFrame(playlistController);
    }
}
