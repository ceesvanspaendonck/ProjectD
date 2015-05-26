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
    //yo
    public JPanel panel = new JPanel();
    public static void main(String[] args)
    {
        int width = 500;
        int heigth = 750;
        
        JFrame frame = new JFrame();
        frame.setSize(width,heigth);
        frame.setTitle("Doolhof");
        frame.setPreferredSize(new Dimension(width, heigth));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //JPanel panel = new JPanel();
        //panel.setSize(1000, 1000);
        
        //frame.add(panel);
        
        Speler speler = new Speler(0, 0); 
        
        //panel.add(speler);
        
        frame.add(speler);
        
        //JComponent doolhof = new Doolhof();
        
        KeyListener listener = new Input(speler);
        
        frame.addKeyListener(listener);
        
        frame.setVisible (true);
    }
}