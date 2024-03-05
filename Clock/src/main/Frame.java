package main;
import java.awt.Button;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame {
    JFrame frame;
    JPanel panel;

    public Frame(JPanel panel,Button button){
        frame = new JFrame("Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.add(panel);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setFocusable(true);
    }
}
