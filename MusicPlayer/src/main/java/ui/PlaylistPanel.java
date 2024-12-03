
package ui;

import model.Songs;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class PlaylistPanel extends JPanel {
    private JList<String> playlistList;
    private DefaultListModel<String> playlistModel;

    public PlaylistPanel(LinkedList<Songs> playlist) {
        setLayout(new BorderLayout());
        playlistModel = new DefaultListModel<>();
        playlistList = new JList<>(playlistModel);

        JScrollPane scrollPane = new JScrollPane(playlistList);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Playlist"));
        add(scrollPane, BorderLayout.CENTER);

        loadPlaylist(playlist);
    }

    public void loadPlaylist(LinkedList<Songs> playlist) {
        playlistModel.clear();
        for (Songs song : playlist) {
            playlistModel.addElement(song.toString());
        }
    }

    public String getSelectedSong() {
        return playlistList.getSelectedValue() != null ? playlistList.getSelectedValue() : "No song selected";
    }
}
