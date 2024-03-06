package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonsUI {
    
    public static Button startButton(Timer timer){
        Button button;
        button = new Button("start");
        button.setBounds(170, 50, 60, 20);
        button.setBackground(new Color(70,70,70));
        button.setForeground(new Color(0,0,0));
        
        button.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) 
            { 
                timer.updates = true;
            } 
        });

        return button;
    }

    public static Button resetButton(Panel panel,Timer timer){
        Button reset;
        reset = new Button("reset");
        reset.setBounds(170, 80, 60, 20);
        reset.setBackground(new Color(70,70,70));
        reset.setForeground(new Color(0,0,0));
        reset.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) 
            { 
                panel.reset();
                timer.updates = false;
                //the reset also makes the updates pause
            } 
        });

        return reset;
    }
}
