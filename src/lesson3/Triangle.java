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
  
  public boolean isExists(double ab, double bc, double ca) {
    MaxLength maxLength = new MaxLength();
    
    double max = maxLength.max(ab, bc, ca);
    
    if ((max < (ab + bc)) && (max < (ab + ca)) && (max < (bc + ca))) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Triangle triangle = new Triangle(new Point(2.0, 2.0), new Point(3.0, 6.0), new Point(7.0, 2.0));
    
    double ab = triangle.a.distanceTo(triangle.b);
    double bc = triangle.b.distanceTo(triangle.c);
    double ca = triangle.c.distanceTo(triangle.a);
    
    if(triangle.isExists(ab, bc, ca)) {
      double figure = triangle.area(ab, bc, ca);    
      System.out.println(figure);
    } else {
      System.out.println("Треугольник не создан");
    }        
			  
    //-------------------------------------------------------------------------------------------
    //     *******Тест*******
    //MaxLength maxLength = new MaxLength();
    //double t = maxLength.max(ab, bc, ca);   
    //System.out.println("Треугольник ab = " + ab);
    //System.out.println("Треугольник bc = " + bc);
    //System.out.println("Треугольник ca = " + ca);   
    //System.out.println("Саммая длиная сторона: " + t);
    
  }
}