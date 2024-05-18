package level_1;

import java.util.Arrays;

/*
Дана некоторая строка. Переберите и выведите в консоль по очереди все символы с конца строки.
 */
public class ex17_символы_строки_с_конца {

  public static void main(String[] args) {

    String str = "abcdefg";

    for (int i = str.length() - 1; i >= 0; i--) {
      System.out.print(str.charAt(i));
    }
    
  }
}
