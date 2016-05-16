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
  
  public int[][] turn(int[][] a) {
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
    
    int[][] arr = {{1, 2},
		   {1, 2}, 
		  };
    
    Square square = new Square();
    
   // System.out.println("---------------Не развернут---------------");
    square.output(arr); 
    
   // System.out.println("---------------Разворачиваем---------------");
    arr = square.turn(arr);  
    square.output(arr);
  }
}