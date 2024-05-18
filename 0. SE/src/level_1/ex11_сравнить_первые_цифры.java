package level_1;

import java.util.Random;

/*
Дано целое число. Выведите в консоль сумму первой и последней цифры этого числа.
 */
public class ex11_сравнить_первые_цифры {
  static Random rand = new Random();

  public static void main(String[] args) {

    System.out.println("Сумма первой и последней цифры.");

    for (int i = 0; i < 5; i++) {
      int number = rand.nextInt(-1000, 1000);
      int first = getFirstDigitInt(number);
      int last = getLastDigit(number);
      int sum = first + last;

      System.out.printf("Число %d: %d + %d = %d.\n", number, first, last, sum);
    }
  }

  public static int getFirstDigitInt(int number) {
    number = checkNegative(number);
    while (number / 10 > 0) {
      number /= 10;
    }
    return number;
  }

  public static int getLastDigit(int number) {
    number = checkNegative(number);
    return number % 10;
  }


  private static int checkNegative(int number) {
    return number < 0 ? -number : number;
  }

}
