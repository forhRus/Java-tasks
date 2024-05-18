package level_1;

import java.util.Scanner;

/*
Дана строка. Выведите в консоль длину этой строки.
 */
public class ex2_длина_строки {
    static final String EXIT = "exit";

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true){

      System.out.print("Введите текст (выход - %s): ".formatted(EXIT));
      String input = scanner.nextLine();;

      if(!isExit(input)){
        System.out.printf("Длина строки = %d.\n", input.length());
        System.out.println();
      } else{
        break;
      }
    }
    System.out.println("Завершение программы.");
  }

  public static boolean isExit(String input){
    return input.toLowerCase().equals(EXIT);
  }
}
