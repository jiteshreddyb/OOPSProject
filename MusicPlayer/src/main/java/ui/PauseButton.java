
package ui;

import javax.swing.*;
import java.awt.event.ActionListener;

public class PauseButton extends JButton {
    public PauseButton(ActionListener actionListener) {
        super("Pause");
        addActionListener(actionListener);
    }
}
