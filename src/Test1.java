/*
 *  This program tests the Line and Point class.
 */
import java.awt.*;
import javax.swing.*;

public class Test1 extends JPanel
{
  public void paintComponent(Graphics g)
  {
    // Call base class first.
    super.paintComponent(g);
    
    // Draw some stuff.
    Point p1 = new Point(100, 100);
    p1.draw(g);

    Point p2 = new Point(p1);
    p2.setX(p2.getX() + 100);
    p2.setY(p2.getY() + 100);
    p2.draw(g);

    Line l1 = new Line(p1, p2);
    l1.draw(g);
  }

  public static void main(String[] args)
  {
    // Construct the main program window / panel.
    JFrame window = new JFrame("Red Cross");
    window.setBounds(100, 100, 300, 300);

    Test1 panel = new Test1();
    panel.setBackground(Color.WHITE);
    window.getContentPane().add(panel);
    window.setVisible(true);
  }
}
