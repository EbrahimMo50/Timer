package main;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class Panel extends JPanel{

    private Color BGcolor=new Color(20,20,20);
    private Dimension frameSize = new Dimension(400,400);
    private BufferedImage img;
    private BufferedImage[] digits;
    //digit is 135 pixel in height 110 in width
    //distance between digits 20 pixels

    private int seconds1,seconds2;
    private int minutes1,minutes2;
    String str = "TIMER";

    public Panel(){
        setBackground(BGcolor);
        setPreferredSize(frameSize);
        loadImg(); 
    }

    public void updateClock() {
        
        seconds1++;
        
        if(seconds1==10){
            seconds1=0;
            seconds2++;
        }

        if(seconds2==6){
            seconds2=0;
            minutes1++;
        }

        if(minutes1==10){
            minutes1=0;
            minutes2++;
        }

        if(minutes2==6){
            str="AN HOUR HAS PASSED WHAT ARE YOU DOING HERE?";
        }
        repaint();
    }

    private void loadImg() {
        InputStream is = getClass().getResourceAsStream("../res/Digits.png");
        try {
            img = ImageIO.read(is);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        digits=new BufferedImage[10];
        int counter=1;

        digits[0]=img.getSubimage(109*4,145*1,110,135);

        for(int i=0;2>i;i++){
            for(int j=0;5>j;++j){
                digits[counter]=img.getSubimage(109*j,145*i,110,135);
                counter++;
                if(counter>=10)break;
            }
        }
    }

    public void reset(){
        seconds1=-1;
        seconds2=0;
        minutes1=0;
        minutes2=0;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.drawString(str,185,30);
        g.drawImage(digits[minutes2], 10, 125,95,150, null);
        g.drawImage(digits[minutes1], 105, 125,95,150, null);
        g.drawImage(digits[seconds2], 205, 125,95,150, null);
        g.drawImage(digits[seconds1], 300, 125,95,150, null);
    }
}
