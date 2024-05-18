package level_1;

import java.util.Random;

/*
Даны два целых числа. Проверьте, что первое число без остатка делится на второе.
 */
public class ex20_деление_без_остатка {

  static Random random = new Random();

  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      int number1 = random.nextInt(50);
      int number2 = random.nextInt(1,25);
      if(checkRemainder(number1,number2)){
        System.out.printf("%d делится на %d БЕЗ ОСТАТКА", number1, number2);
      } else {
        System.out.printf("%d делится на %d С ОСТАТКОМ", number1, number2);
      }
      System.out.println();
    }
  }

  private static boolean checkRemainder(int number1, int number2) {
    return number1 % number2 == 0;
  }
  
}
