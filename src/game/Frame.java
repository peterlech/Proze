package game;
import javax.swing.JFrame;  
import javax.swing.JPanel;  
import java.awt.BorderLayout;
import java.awt.Dimension;
 
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;


public class Frame extends JFrame {  
    JPanel panel;
    public Frame() {  
        super("::PACMAN::");  
        panel = new Pacman();              
  
        initComponents();
 
        int szer = Toolkit.getDefaultToolkit().getScreenSize().width;
        System.out.println(szer);
        int wys = Toolkit.getDefaultToolkit().getScreenSize().height;
 
        this.setSize(szer,wys);
        int szerRamki = this.getSize().width;
        int wysRamki = this.getSize().height;
 
        this.setLocation((szer - szerRamki)/2,(wys-wysRamki)/2);
 
        panel.setSize(this.getSize().width,this.getSize().height);
 
        this.getContentPane().add(BorderLayout.CENTER,panel);
  
  
        pack();  
          
        setVisible(true); 
 
    }
 
    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        this.addComponentListener(new ComponentAdapter() {
            @Override
        public void componentResized(ComponentEvent e) {
                int x = e.getComponent().getSize().width;
                int y = e.getComponent().getSize().height;
                   panel.setSize(x, y);
    }
        });
 
 
    }
    
}
  