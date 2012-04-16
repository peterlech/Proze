package game;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import javax.imageio.ImageIO;
import javax.swing.JPanel; 
  
import javax.swing.JPanel;  
  
public class Pacman extends JPanel { 
    Actor pac = new Actor();
   // private Actor pac = new Actor();
    public Pacman() {  
        this.setBackground(Color.red);
        	
        
    }  
  
       
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g); 
        Graphics2D g2d = (Graphics2D) g; 
        pac.paintItem(g);
        
    }
  
   
        
  
         
        
        
 }  
  
   
