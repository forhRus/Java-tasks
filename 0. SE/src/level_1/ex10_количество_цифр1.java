package level_1;

import java.util.Random;

/*
Даны два целых числа. Проверьте, что первые цифры этих чисел совпадают.
 */
public class ex10_количество_цифр1 {
  static Random rand = new Random();

  public static void main(String[] args) {

    System.out.println("Сравнение первых цифр в двух числах.");

    for (int i = 0; i < 20; i++) {
      int number1 = rand.nextInt(-1000, 1000);
      int number2 = rand.nextInt(-1000, 1000);

      System.out.printf("Число1: %d, Число2: %d. Первые цифры ", number1, number2);
      System.out.println(getFirstDigitInt(number1) == getFirstDigitInt(number2) ?
              "совпадают." : "не совпадают.");
    }
  }

  public static int getFirstDigitInt(int number) {
    number = checkNegative(number);
    while (number / 10 > 0) {
      number /= 10;
    }
    return number;
  }

  private static int checkNegative(int number) {
    return number < 0 ? -number : number;
  }

}
