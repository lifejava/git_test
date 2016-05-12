package lesson5;

public class Square {
  public int[][] arr = new int[3][3];
  
  public void fillArray () {
    int num = 0;
    for ( int i = 0; i < arr.length; i++) {
      for ( int j = 0; j < arr.length; j++) {
	arr[i][j] = j;
      }
    }
  }
  
  public void expand () {
    int ver;
    int hor;
    
    for (int a = 0; a < arr.length; a++) {
      for (int z = arr.length - 1; z >= 0; z--) {
	ver = arr[z][a];  //строка 2-- ячейка 0
	hor = arr[a][z]; //строка 0 ячейка 2--
	
	arr[a][z] = ver;
	arr[z][a] = hor;
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