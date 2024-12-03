
package ui;

import javax.swing.*;
import java.awt.*;

public class HeaderPanel extends JPanel {
    public HeaderPanel() {
        setLayout(new FlowLayout());
        JLabel titleLabel = new JLabel("Music Player");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel);
    }
}
