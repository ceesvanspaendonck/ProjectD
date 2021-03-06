package ProjectD;

import java.awt.Dimension;
import java.awt.event.KeyListener;
import javax.swing.*;

import javax.swing.JPanel;

/**
 *
 * @author Max & Cees
 */
public class Spel
{
    //yooo
    public JPanel panel = new JPanel();
    public static void main(String[] args)
    {
        //set grootte van het doolhof
        int width = 500;
        int heigth = 500;
        
        //maak het frame
        JFrame frame = new JFrame();
        frame.setSize(width,heigth);
        frame.setTitle("Doolhof");
        frame.setPreferredSize(new Dimension(width, heigth));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //maak het doolhof
        Doolhof doolhof = new Doolhof(width, heigth);
        
        
        //maak de grid, array[][] van tegels
        for (int x = 0; x < width; x = x + 50)
        {
            for (int y = 0; y < heigth; y = y + 50)
            {
                System.out.print(x + ", " + y);
                Tegel tegel = new Tegel(x, y);
                doolhof.tegels[x][y] = tegel;
                tegel.drawComponent(x, y);  
                frame.add(tegel); //hierdoor komt er geen window meer, maar als deze tegel nou spawnd op coordinaten uit de for loop hebben we een grid?
                System.out.println(" - getekend");
            }
        }
        
        //maak de speler en voeg toe aan frame
        Speler speler = new Speler(0, 0);
        frame.add(speler);
        
        //maak keylistener en voeg toe aan frame
        KeyListener listener = new Input(speler);        
        frame.addKeyListener(listener);
        
        //open frame
        frame.setVisible (true);
    }
}