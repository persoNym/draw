/*
 @name                   Victoria C
 @description            picture drawing swing simulator
 @last revised           2/22/13
 */
package draw;

import java.awt.*;
import javax.swing.*;


public class Draw extends JFrame{
    static final String name = "~VICTORIA~";
    private Font font1 = new Font("Monospaced", Font.BOLD + Font.ITALIC, 20);

    public static void main(String[] args) {
        Draw er = new Draw();
        er.setVisible(true);
    }
    
     public Draw() {
        super.setTitle("Thinking with Portals");
        setSize(500, 300);
        setLocationRelativeTo(null); //centers Frame
        setResizable(false);
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
     
     public void paint (Graphics g) {      
         Dimension d = getSize();
         int w= d.width;
         int h= d.height;
         int[] x = {25, 75, 125, 85, 125, 75, 25, 65};
         int[] y = {50, 90, 50, 100, 150, 110, 150, 100};
         int[] xx = {100, 150, 250, 170};
         int[] yy = {100, 180, 100, 200 };
    
        super.paint(g);
         
        g.setFont(font1);
        g.setColor(new Color(127,253,181));    
        g.drawString(name, 135, 65); //name
        
        g.setColor(Color.cyan);
        g.drawLine(20, 80, 480, 80); //one line
        
        g.drawRect(5, 100, 25, 110);
        g.setColor(new Color(0,0,0));
        g.fillRect(5, 100, 25, 110);
        
        g.drawOval(255,100, 180,22); 
        g.setColor(new Color(0,0,255));
        g.fillOval(255,100, 180,22); 
        
        g.drawOval(300,250, 300,40); 
        g.setColor(new Color(255,80,0));
        g.fillOval(300,250, 300,40); 
        
        g.drawRect(20,200,260,25);
        g.setColor(Color.red);
        
        g.setColor(new Color(164,242,75));
        g.drawOval(150, 180, 80, 80);
        g.fillOval(150, 180, 80, 80);
        
        g.setColor(new Color(210,28,156));
        g.drawRect(200, 250, 120, 130);
        
        g.setColor(new Color(250,241,160));
        g.drawPolyline(x, y, 8);
        
        g.setColor(new Color(247,255,0));
        g.drawPolyline(xx, yy, 4);
        
        
        g.setColor(new Color(229,74,193));
        g.fillPolygon(x, y, 8);
              
     }
}
