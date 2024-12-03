
package ui;

import javax.swing.*;
import java.awt.event.ActionListener;

public class RepeatButton extends JButton {
    public RepeatButton(ActionListener actionListener) {
        super("Repeat");
        addActionListener(actionListener);
    }
}
