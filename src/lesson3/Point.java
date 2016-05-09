package lesson3;
import static java.lang.Math.*;

public class Point {
  public double x;
  public double y;
  
  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }
  
  public double distanceTo(Point point) {
  //calculate distance between two points
   
    //формула : d = √(x2 - x1)^2 + (y2 - y1)^2
    
    double countX = point.x - this.x;
    countX = Math.pow(countX, 2.0);
    
    double countY = point.y - this.y;
    countY = Math.pow(countY, 2.0);
    
    double v = Math.sqrt(countX + countY);
    
    return v;
  }
}