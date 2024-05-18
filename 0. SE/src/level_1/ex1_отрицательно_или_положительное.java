package level_1;

import java.util.Scanner;

/*
Дано число. Проверьте, отрицательное оно или нет. Выведите об этом информацию в консоль.
 */
public class ex1_отрицательно_или_положительное {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {

      System.out.print("Введите целое число: ");

      if (scanner.hasNextInt()){
        System.out.println(checkNumber(scanner.nextInt()));
      } else {
        break;
      }
    }

    System.out.println("Выход из программы.");
  }

  public static String checkNumber(int number) {
    StringBuilder res = new StringBuilder("Число %d - ".formatted(number));

    if (isPositive(number)) {
      res.append("положительное");
    } else if (isNegative(number)) {
      res.append("отрицательное");
    } else {
      res.append("ноль");
    }

    return res.toString();
  }

  public static boolean isNegative(int number) {
    return number < 0;
  }

  public static boolean isPositive(int number) {
    return number > 0;
  }

}


