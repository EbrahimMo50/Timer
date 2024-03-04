package main;

public class MainClass {
    public static void main(String[] args){
        Panel panel = new Panel();
        Frame frame = new Frame(panel);

        while(true){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                    e.printStackTrace();
            }
            //an update will be made every second
            
            panel.updateClock();
        }
    }
}
