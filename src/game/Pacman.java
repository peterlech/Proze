package game;
import java.awt.*;  
import java.awt.geom.*;  
  
import javax.swing.JPanel;  
  
public class Pacman extends JPanel {  
    public Pacman() {  
        this.setBackground(Color.red);
    }  
  
    @Override  
    protected void paintComponent(Graphics g) {  
        super.paintComponent(g);  
        
        Graphics2D g2d = (Graphics2D) g;  
  
        // prostokat  
        Rectangle2D rectangle = new Rectangle2D.Double(10, 10, this.getSize().width, this.getSize().height);  
        // kolo  
        Ellipse2D circle = new Ellipse2D.Double(10, 10, this.getSize().width, this.getSize().height);  
  
        g2d.draw(rectangle);  
        g2d.draw(circle);  
        
        
    }  
} 