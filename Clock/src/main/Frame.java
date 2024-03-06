package main;
import javax.swing.JFrame;

public class Frame {
    JFrame frame;

    public Frame(Panel panel,Timer timer){
        frame = new JFrame("Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(ButtonsUI.startButton(timer));
        frame.add(ButtonsUI.resetButton(panel,timer));
        frame.add(panel);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setFocusable(true);
    }
}
