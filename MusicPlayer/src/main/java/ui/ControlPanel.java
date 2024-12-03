
package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel {
    public ControlPanel(ActionListener playListener, ActionListener pauseListener,
                        ActionListener repeatListener, ActionListener nextListener,
                        ActionListener previousListener) {
        setLayout(new FlowLayout());

        add(new JButton("Previous") {{
            addActionListener(previousListener);
        }});

        add(new JButton("Play") {{
            addActionListener(playListener);
        }});

        add(new JButton("Pause") {{
            addActionListener(pauseListener);
        }});

        add(new JButton("Next") {{
            addActionListener(nextListener);
        }});

        add(new JButton("Repeat") {{
            addActionListener(repeatListener);
        }});
    }
}
