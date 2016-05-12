package lesson5;

public class Square {
  private int marix = 6;
  private int[][] arr = new int[marix][marix];
  
  public void fillArray () {
     for (int k=0; k<m/2; k++) // border -> center
        {
            for (int j=k; j<m-1-k; j++) // left -> right
            {
                // меняем местами 4 угла
                int tmp         arr A[k][j];
                arr[k][j]         arr A[j][m-1-k];
                arr[j][m-1-k]     arr A[m-1-k][m-1-j];
                arr[m-1-k][m-1-j] arr A[m-1-j][k];
                arr[m-1-j][k]     arr tmp;
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