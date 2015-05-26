package ProjectD;

import java.awt.*;
import javax.swing.*;

public class Speler extends JPanel
{
    //yo
    int x, y;
    final int heigth = 25;
    final int width = 25;

    public Speler(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX()
    {
        return this.x;
    }
    @Override
    public int getY()
    {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
      
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g; 
        Rectangle box = new Rectangle(x, y, heigth, width);
        g2.draw(box);
        
    }
    
    public void drawComponent(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void move(String direction)
    {
        if(direction.equals("north"))
        {
            this.y = this.y - 10;
        }
        else if(direction.equals("east"))
        {
            this.x = this.x + 10;
        }
        else if(direction.equals("south"))
        {
            this.y = this.y + 10;
        }
        else if(direction.equals("west"))
        {
            this.x = this.x - 10;
        }
        this.repaint();
    }
}