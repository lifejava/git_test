package arrChar;

public class LineSearch {

  public boolean find(String arrStr, String search) {

    char[] arrString = arrStr.toCharArray();
    char[] arrSearch = search.toCharArray();

    boolean result = false;
    int counter = 0;

    for (int i = 0; i < arrString.length; i++) {
      if (arrString[i] == arrSearch[0]) {
        for (int a=i, b=0; b < arrSearch.length; a++, b++) {
          if(arrString[a] == arrSearch[b]) {
            result = true;
            counter++;
            if(counter == arrSearch.length) return result;
          } else {
            result = false;
            counter = 0;
          }
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    String str1 = "Продолжение";
    String str2 = "дол";

    LineSearch lineSearch = new LineSearch();
    boolean b = lineSearch.find(str1, str2);

    System.out.println(b);
  }
}