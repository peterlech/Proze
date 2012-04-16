package game;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Lechnio
 */
public class Actor {
    private BufferedImage image;
    int width, height;
    
    
    public Actor(){
    File imageFile = new File("/pacman.jpg");
		try {
			image = ImageIO.read(imageFile);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
     width=image.getWidth();
     height=image.getHeight();
    }
    
 public void paintItem(Graphics g) {
     
        
BufferedImage imageScaled = image.getScaledInstance(this.getSize().width+1,this.getSize().height+1 , Image.SCALE_FAST);
	g.drawImage(image, width, height, null);
                  
    }
}
