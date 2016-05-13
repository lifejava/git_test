package lesson5;

public class Square {
  
  public void output(int[][] arr) {
    for ( int i = 0; i < arr.length; i++) {
      for ( int j = 0; j < arr.length; j++) {
	System.out.print(arr[i][j]);
      }
      System.out.println();
    }
  }	
  
  public int[][] expand (int[][] a) {
    int[][] pilot = new int[a.length][a.length];
    
    for (int i = 0; i < a.length; i++) {
      for (int j = 0, p = a.length - 1; j < a.length; j++, p--) {
	pilot[i][p] = a[j][i];
      }
    }
    a = pilot;
    return a;
   }    
  
  public static void main(String[] args) {
    int m = 9;
    int[][] arr = new int[m][m];
    
    for ( int i = 0; i < arr.length; i++) {
      for ( int j = 0; j < arr.length; j++) {
	arr[i][j] = j;
      }
    }
    
    Square square = new Square();
    
   // System.out.println("---------------Не развернут---------------");
    square.output(arr); 
    
   // System.out.println("---------------Разворачиваем---------------");
    arr = square.expand(arr);  
    square.output(arr);
  }
}