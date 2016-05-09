package lesson3;

public class Triangle {
  public Point a;
  public Point b;
  public Point c;
  
  public Triangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  
  public double area(double a, double b, double c) {
  //calculate the triangle area
  //s = (a + b + c) / 2
    double s = (a + b + c) / 2;
    
    //√{s (s - a)(s - b)(s - c)}
    double i = Math.sqrt( s*( (s-a)*(s-b)*(s-c) ) );
    
    return i;
  }
  
  public static void main(String[] args) {
    Triangle triangle = new Triangle(new Point(2.0, 2.0), new Point(3.0, 6.0), new Point(7.0, 2.0));
    
    double ab = triangle.a.distanceTo(triangle.b);
    double bc = triangle.b.distanceTo(triangle.c);
    double ca = triangle.c.distanceTo(triangle.a);
    
    //triangle.area(ab, bc, cb);
    System.out.println(triangle.area(ab, bc, ca));    
  }
}