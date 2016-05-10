package lesson4;
import static java.lang.Math.*;

public class CubeFunction {
  public float a;
  public float b;
  public float c;
  
  public CubeFunction(float a, float b, float c) {
      this.a = a;
      this.b = b;
      this.c = c;
  }
  
  public float calculate (int x) {
    //y = a*x^2 + b * x + c; 
    float y = (float)Math.pow((double)(this.a * x), 2) + this.b * x + c;
    return y;
  }
  
  public static void main(String[] args) {
    
    CubeFunction cubeFunction = new CubeFunction(Float.parseFloat(args[0]), Float.parseFloat(args[1]), Float.parseFloat(args[2]));
    float count = cubeFunction.calculate(5);
    for (float i = 0.0f; i <= count; i++) {
       System.out.println(i);
    }
  }
}