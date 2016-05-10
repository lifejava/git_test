package lesson4;

public class Factorial {
  public static void main(String[] args) {
    int count = 1;
    
    for (int i = 1; i < 7; i++) {
      count = count * i;
    }
    System.out.println(count);
  }
}