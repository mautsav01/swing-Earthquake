package swingjdbc;


public class Splash {
    SplashScreen screen = new SplashScreen();   
    
    
    
    


    

    public static void main(String args[]) {
        new Splash();
    }
 public Splash() {
        Thread thread = new Thread(this.screen);
        
       thread.start(); 
        try {
          
           new one1().setVisible(true);
            Thread.sleep(5000);
             
           // screen.dispose(); //Destroy your frame
        } catch (InterruptedException ex) {
            System.out.println(ex);
        
     
    }
        
 }

}
