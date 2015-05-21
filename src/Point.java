/*
 * This class implements a simple point.
 */
import java.awt.*;

public class Point {
	private int x, y;
	
	public Point(int xNew, int yNew)
	{
	  if (xNew <= 0)
	    return;
		
	  x = xNew;
		y = yNew;
		
	}
	public Point(Point p)
	{
		this(p.getX(), p.getY());
	}
	
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public void setX(int xNew)
	{
		x = xNew;
	}
	public void setY(int yNew)
	{
		y = yNew;
	}
	
  public void draw(Graphics g)
  {
    g.drawOval(getX() - 5, getY() - 5, 10, 10);
  }
}
