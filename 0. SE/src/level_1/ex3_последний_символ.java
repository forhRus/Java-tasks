package level_1;

/*
Дана строка. Выведите в консоль последний символ строки.
 */
public class ex3_последний_символ {

  public static void main(String[] args) {

    String[] strings = new String[]{"Тёмная ночь", "Java++", "Поток", "", "Вкусняшка"};

    for (String string : strings) {

      if(!isVoid(string)){
        System.out.printf("%s - \"%s\"\n", string, string.charAt(string.length()-1));
      } else{
        System.out.println("Пустая строка");
      }
    }
    System.out.println("---------------------");
    System.out.println("Завершение программы.");
  }

  private static boolean isVoid(String string) {
    return string.length() == 0;
  }


}
