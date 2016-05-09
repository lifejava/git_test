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
    double s = (a + b + c) / 2;   			//s = (a + b + c) / 2
    double i = Math.sqrt( s*( (s-a)*(s-b)*(s-c) ) ); 	//√{s (s - a)(s - b)(s - c)}
    return i;
  }
  
  public boolean isExists() {
    if ( (this.a != null) && (this.b != null) && (this.c != null) ) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Triangle triangle = new Triangle(new Point(2.0, 2.0), new Point(3.0, 6.0), new Point(7.0, 2.0));
    
    if(triangle.isExists()) {
      double ab = triangle.a.distanceTo(triangle.b);
      double bc = triangle.b.distanceTo(triangle.c);
      double ca = triangle.c.distanceTo(triangle.a);
      
      double figure = triangle.area(ab, bc, ca);    
      System.out.println(figure);
    } else {
      System.out.println("Треугольник не создан");
    }        
  }
}