package lesson2;

public class Calculator{
  private double result;
  
  public void add(double first, double second) {
    this.result = first + second;
  }
  
  public void substruct(double first, double second) {
    this.result = first - second;
  }
  
  public void div(double first, double second) {
    this.result = first / second;
  }
  
  public void multiple(double first, double second) {
    this.result = first * second;
  }
  
  public void getResult(){
    System.out.println(result);
  }
  
}