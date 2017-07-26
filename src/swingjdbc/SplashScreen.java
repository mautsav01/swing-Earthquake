package swingjdbc;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;

public class SplashScreen extends JWindow implements Runnable {

    JLabel label;
    JProgressBar bar; 
      
    ImageIcon icon = new ImageIcon(getClass().getResource("/folder/dhading.jpg"));
  
   
       
    Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();

    public SplashScreen() {
    
    }
    @Override
    public void run() {
        label = new JLabel();
        add(label);
        label.setIcon(icon);
        setSize(529, 591);
        setVisible(true);
       // setLocation((dm.width-500)/2, (dm.height-334)/2);
 setLocation((dm.width-529), 50);
    }

  

}
