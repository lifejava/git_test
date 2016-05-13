package lesson5;

public class Square {
  private int m = 6;
  public int[][] arr = new int[m][m];
  
  public void fillArray () {
    int num = 0;
    for ( int i = 0; i < arr.length; i++) {
      for ( int j = 0; j < arr.length; j++) {
	arr[i][j] = j;
      }
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

  public static void main(String[] args) {
    Square square = new Square();
    square.fillArray();
    //System.out.println("---------------Не развернут---------------");
    //for ( int i = 0; i < square.arr.length; i++) {
      //for ( int j = 0; j < square.arr.length; j++) {
	//System.out.print(square.arr[i][j]);
      //}
      //System.out.println();
    //}  
    
    square.expand();
    //System.out.println("---------------Разворачиваем---------------");
    for ( int i = 0; i < square.arr.length; i++) {
      for ( int j = 0; j < square.arr.length; j++) {
	System.out.print(square.arr[i][j]);
      }
      System.out.println();
    } 
  }
}