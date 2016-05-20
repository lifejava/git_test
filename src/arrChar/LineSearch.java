package arrChar;

public class LineSearch {

  public boolean find(String arrStr, String search) {

    char[] arrString = arrStr.toCharArray();
    char[] arrSearch = search.toCharArray();

    boolean result = false;

    for (int i = 0; i < arrString.length; i++) {
      if (arrString[i] == arrSearch[0]) {
        for (int a=i, b=0; b < arrSearch.length && a < arrString.length; a++, b++) {
        
          if(arrString[a] == arrSearch[b]) {
            if (b  == (arrSearch.length - 1)) return true;
          } else {
            if (result != false) result = false;
          }
          
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    String str1 = "автомотовелофото";
    String str2 = "тов";

    LineSearch lineSearch = new LineSearch();
    boolean b = lineSearch.find(str1, str2);

    System.out.println(b);
  }
}