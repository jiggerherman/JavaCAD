/*
 * This class implements a simple line.
 */
import java.awt.*;

public class Line {

	private Point start, end;

	public Line(Point startNew, Point endNew)
	{
		start = new Point(startNew);
		end = new Point(endNew);
	}
	public Line(Line l)
	{
		this(l.getStart(), l.getEnd());
	}
	
	Point getStart()
	{
		return start;
	}
  void setStart(Point startNew)
  {
    start.setX(startNew.getX());
    start.setY(startNew.getY());
  }

  Point getEnd()
	{
		return end;
	}
  void setEnd(Point endNew)
  {
    end.setX(endNew.getX());
    end.setY(endNew.getY());
  }

  public void draw(Graphics g)
  {
    g.drawLine(start.getX(), start.getY(), end.getX(), end.getY());
  }
}
