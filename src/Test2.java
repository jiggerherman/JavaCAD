/*
 *  This program tests the Line and Point class.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test2 extends JPanel implements MouseListener
{
  // TODO: Fields go here
  
  public void paintComponent(Graphics g)
  {
    // Call base class first.
    super.paintComponent(g);
    
    // TODO: Paint our stuff
  }

  // Mouse handling messages that we don't use (yet).
  public void mouseEntered(MouseEvent e) {}
  public void mouseExited(MouseEvent e)  {}
  public void mousePressed(MouseEvent e) {}
  public void mouseReleased(MouseEvent e) {} 
  
  // Mouse was clicked.
  public void mouseClicked(MouseEvent e)
  {
    int x = e.getX(); 
    int y = e.getY();
    int btn = e.getButton();
    System.out.println("Click at (" + x + "," + y + ") Button=" + btn);

    // TODO: add your code here to change the fields
    
    // Redraw the panel.
    repaint();
  }
  
  public static void main(String[] args)
  {
    // Construct the main program window / panel.
    JFrame window = new JFrame("JavaCAD");
    window.setBounds(100, 100, 300, 300);

    Test2 panel = new Test2();
    panel.setBackground(Color.WHITE);
    window.getContentPane().add(panel);
    window.setVisible(true);
    panel.addMouseListener(panel);
  }
}
