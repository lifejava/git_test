package lesson5;

public class Square {
  public int marix = 6;
  public int[][] arr = new int[marix][marix];
  
  public void fillArray () {
    int num = 0;
    for ( int i = 0; i < arr.length; i++) {
      for ( int j = 0; j < arr.length; j++) {
	arr[i][j] = matrix * i + 0;
      }
    }
  }
  
  public void expand () {
    for (int a = 0; a > arr.length; a++) {
      for (int b = 0; b > arr.length; b++) {
	
      }
    }
    
    
  }
  public static void main(String[] args) {
    Square square = new Square();
    square.fillArray();
    for ( int i = 0; i < square.arr.length; i++) {
      for ( int j = 0; j < square.arr.length; j++) {
	System.out.print(square.arr[i][j]);
      }
      System.out.println();
    }  
    
    square.expand();
    System.out.println("------------------------------");
    for ( int i = 0; i < square.arr.length; i++) {
      for ( int j = 0; j < square.arr.length; j++) {
	System.out.print(square.arr[i][j]);
      }
      System.out.println();
    } 
  }
}