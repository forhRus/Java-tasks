package level_1;

import java.util.Random;

/*
Дано целое число. Выведите в консоль последнюю цифру этого числа.
 */
public class ex8_последняя_цифра {
  static Random rand = new Random();

  public static void main(String[] args) {

    for (int i = 0; i < 5; i++) {
      int number = rand.nextInt(-1000, 1000);
      System.out.printf("%d последня цифра в числе %d\n", getLastDigit(number), number);
    }

  }

  public static int getLastDigit(int number) {
    number = checkNegative(number);
    return number % 10;
  }

  private static int checkNegative(int number) {
    return number < 0 ? -number : number;
  }

}
