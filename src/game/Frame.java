package game;
import javax.swing.JFrame;  
import javax.swing.JPanel;  
  
public class Frame extends JFrame {  
    public Frame() {  
        super("::PACMAN::");  
        JPanel panel = new Pacman();  
  
        add(panel);  
  
        pack();  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setVisible(true);  
    }  
}  