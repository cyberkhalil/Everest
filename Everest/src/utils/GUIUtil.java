package utils;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIUtil {

    public static void link_frame_to_button(JFrame frame, JButton button) {
        button.setEnabled(false);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                button.setEnabled(true);
            }
        });
    }
}
