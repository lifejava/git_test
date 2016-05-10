package lesson3;
import static java.lang.Math.*;

public class MaxLength{
  public double max(double a, double b, double c) {
    double maxlength = Math.max(a, b);
    maxlength = Math.max(maxlength, c);
    return maxlength;
  }
}