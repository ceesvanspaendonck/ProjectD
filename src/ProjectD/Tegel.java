package ProjectD;

import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;

public class Tegel extends JPanel
{
    int x, y;
    
    public Tegel(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g; 
        Rectangle box = new Rectangle(x, y, 10, 10);
        g2.draw(box);
        
    }
    
    public void drawComponent(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
