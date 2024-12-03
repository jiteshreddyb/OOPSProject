
package ui;

import controller.PlaylistController;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JLabel statusLabel;

    public MainFrame(PlaylistController playlistController) {
        setTitle("Music Player");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());

        // Status label for displaying song status
        statusLabel = new JLabel("Welcome to Music Player", SwingConstants.CENTER);
        add(statusLabel, BorderLayout.NORTH);

        // Playlist Panel (center)
        PlaylistPanel playlistPanel = new PlaylistPanel(playlistController.getPlaylist());
        add(playlistPanel, BorderLayout.CENTER);

        // Control Panel (south)
        ControlPanel controlPanel = new ControlPanel(
            e -> updateStatus(playlistController.play()),     // Play
            e -> updateStatus("Paused"),                      // Pause
            e -> updateStatus("Repeating"),                   // Repeat
            e -> updateStatus(playlistController.nextSong()), // Next
            e -> updateStatus(playlistController.previousSong()) // Previous
        );
        add(controlPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void updateStatus(String message) {
        statusLabel.setText(message);
    }
}
