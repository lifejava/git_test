package lesson2;

public class CalcInit{
  public static void main(String[] args) {
  
    Calculator calculator = new Calculator();
    
    calculator.add(20, 10);  
    System.out.println(calculator.getResult());
    
    calculator.substruct(20, 10);
    System.out.println(calculator.getResult());
    
    calculator.div(20, 10);
    System.out.println(calculator.getResult());
    
    calculator.multiple(20, 10);
    System.out.println(calculator.getResult());
  }
}