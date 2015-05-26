package ProjectD;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComponent;

public class Input implements KeyListener
{
    //yo

    private Speler speler;

    public Input(Speler speler)
    {
        this.speler = speler;
    }
    
    @Override
    public void keyTyped(KeyEvent ke)
    {
        
    }

    @Override
    public void keyReleased(KeyEvent ke)
    {
        
    }
    
    @Override
    public void keyPressed(KeyEvent ke)
    {
        int key = ke.getKeyCode();
        if (key == KeyEvent.VK_UP)
        {
            speler.move("north");
        }
        if (key == KeyEvent.VK_DOWN)
        {
            speler.move("south");
        }
        if (key == KeyEvent.VK_LEFT)
        {
            speler.move("west");
        }
        if (key == KeyEvent.VK_RIGHT)
        {
            speler.move("east");
        } 
    }
}