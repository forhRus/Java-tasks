package level_1;

import java.util.Random;

/*
Даны два целых числа. Найдите остаток от деления первого числа на второе.
 */
public class ex14_остаток_от_деления {

  static Random rand = new Random();

  public static void main(String[] args) {

    System.out.println("Остаток от деления");
    for (int i = 0; i < 5; i++) {
      int number1 = rand.nextInt(20);
      int number2 = rand.nextInt(20);
      System.out.printf("%d %% %d = %d\n", number1, number2, number1%number2);
    }
  }
}
