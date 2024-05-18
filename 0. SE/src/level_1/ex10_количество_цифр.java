package level_1;

import java.util.Random;

/*
Дано целое число. Выведите количество цифр в этом числе.
 */
public class ex10_количество_цифр {
  static Random rand = new Random();

  public static void main(String[] args) {

    System.out.println("Количество цифр в числе.");

    for (int i = 0; i < 10; i++) {
      int number = rand.nextInt(1_000_000);
      int count = getCount(number);

      System.out.printf("Число: %d, Количество цифр: %d.\n", number, count);
    }
  }

  private static int getCount(int number) {
    int count = 0;
    number = checkNegative(number);

    while (number / 10 > 0){
      count++;
      number /= 10;
    }
    return count;
  }

  private static int checkNegative(int number) {
    return number < 0 ? -number : number;
  }

}
