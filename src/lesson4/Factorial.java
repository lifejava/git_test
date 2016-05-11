package lesson4;

public class Factorial {

  public int fac(int n) {
    int count = 1;
    
    for (int i = 1; i <= n; i++) {
      count *= i;
    }
    
    return count;
  }
  
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    
    Factorial factorial = new Factorial();
    
    int count = factorial.fac(6);
    System.out.println(count);
    
  }
}