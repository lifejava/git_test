package rali;

public class RefTask {

  public static void main(String[] args) {

    int value = 1;

    RefTask.change(value);

    System.out.println(value);

  }

  public static void change(int value) {

    value++;

  }
}