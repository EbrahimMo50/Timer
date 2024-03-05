package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass {

    public static boolean updatesStarted=false;

    public static Button startButton(){
        Button button;
        button = new Button("start");
        button.setBounds(170, 50, 60, 20);
        button.setBackground(new Color(70,70,70));
        button.setForeground(new Color(0,0,0));

        button.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) 
            { 
                updatesStarted=true;
            } 
        });


        return button;
    }

    public static void main(String[] args){

        Panel panel = new Panel();
        Frame frame = new Frame(panel,startButton());
        
        while(true){
            
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                    e.printStackTrace();
            }
            //an update will be made every second
            if(updatesStarted)
                panel.updateClock();
        }
    }
}
