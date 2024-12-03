
package ui;

import javax.swing.*;
import java.awt.event.ActionListener;

public class PlayButton extends JButton {
    public PlayButton(ActionListener actionListener) {
        super("Play");
        addActionListener(actionListener);
    }
}
