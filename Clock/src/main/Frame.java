package main;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame {
    JFrame frame;
    
    public Frame(JPanel panel){
        frame = new JFrame("Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setFocusable(true);
    }
}
