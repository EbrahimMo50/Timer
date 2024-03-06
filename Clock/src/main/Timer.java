package main;

public class Timer implements Runnable{
    
    private Panel panel;
    private Frame frame;
    public boolean updates=false;

    Timer(){
        panel = new Panel();
        frame = new Frame(panel,this);
        run();
    }

    @Override
    public void run() {
        while(true){
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
                e.printStackTrace();
        }
        //an update will be made to the thread every second
        
            if(updates)
            panel.updateClock();
            }
    }
}
