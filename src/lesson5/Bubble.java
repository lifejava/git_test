package lesson5;

public class Bubble {
  int values[] = new int[] {7, 5, 2, 0, 4, 3, 1, 9, 6, 8};
  
  public void sortBubble (int[] v) {
    for (int i = v.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (v[j] > v[j + 1]) {
          int swap = v[j];
          v[j] = v[j + 1];
          v[j+1] = swap;
        }
      }
    }
  }
  
  
  public static void main(String[] args) {
    Bubble bb = new Bubble();
    //System.out.println("Нетсортированый массив");
    //for (int i : bb.values) {
    //  System.out.println(i);
    //}

    bb.sortBubble(bb.values);
    //System.out.println("Сортируем");

    for (int i : bb.values) {
      System.out.println(i);
    }
  }
}