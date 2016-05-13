package lesson5;

public class Square {
  
  public int m = 0;
  public int[][] arr;
  
  public void fillArray () {
    arr = new int[m][m];
    
    for ( int i = 0; i < arr.length; i++) {
      for ( int j = 0; j < arr.length; j++) {
	arr[i][j] = j;
      }
    }
  }
  
  public void output(int[][] arr) {
    for ( int i = 0; i < arr.length; i++) {
      for ( int j = 0; j < arr.length; j++) {
	System.out.print(arr[i][j]);
      }
      System.out.println();
    }
  }	
  
  public void expand () {
    int[][] pilot = new int[m][m];
    
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0, p = arr.length - 1; j < arr.length; j++, p--) {
	pilot[i][p] = arr[j][i];
      }
    }
    arr = pilot;
   }    
  public Square(int m) {
    this.m = m;
  }
  public static void main(String[] args) {
    Square square = new Square(Integer.parseInt(args[0]));
    
    square.fillArray(); 
   // System.out.println("---------------Не развернут---------------");
    square.output(square.arr); //вывод
    
   // System.out.println("---------------Разворачиваем---------------");
    square.expand();  
    square.output(square.arr);
  }
}