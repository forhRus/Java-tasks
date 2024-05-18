package level_1;

import java.util.Random;

/*
Дано целое число. Выведите в консоль первую цифру этого числа.
 */
public class ex7_первая_цифра {
  static Random rand = new Random();

  public static void main(String[] args) {

//    for (int i = 0; i < 5; i++) {
//      int number = rand.nextInt(-1000, 1000);
//      System.out.printf("%d первая цифра в числе %d\n", getFirstDigitInt(number), number);
//    }

    testTime();
  }

  public static void testTime() {
    int count = 100;
    int d = 1000;

    Long start = System.nanoTime();
    for (int i = 0; i < count; i++) {
      int number = rand.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
      getFirstDigitInt(number);
    }
    Long end = System.nanoTime();
    System.out.printf("getFirstDigitInt: %d.\n", (end - start) / d);

    start = System.nanoTime();
    for (int i = 0; i < count; i++) {
      int number = rand.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
      getFirstDigitToString(number);
    }
    end = System.nanoTime();
    System.out.printf("getFirstDigitToString: %d.\n", (end - start) / d);

    start = System.nanoTime();
    for (int i = 0; i < count; i++) {
      int number = rand.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
      getFirstDigitValueOf(number);
    }
    end = System.nanoTime();
    System.out.printf("getFirstDigitValueOf: %d.ex7\n", (end - start) / d);
  }

  public static int getFirstDigitInt(int number) {
    number = checkNegative(number);

    while (number / 10 > 0) {
      number /= 10;
    }
    return number;
  }


  public static int getFirstDigitToString(int number) {
    number = checkNegative(number);
    String str = Integer.toString(number);

    return Integer.parseInt(str.substring(0, 1));
  }

  public static int getFirstDigitValueOf(int number) {
    number = checkNegative(number);
    String str = String.valueOf(number);

    return Integer.parseInt(str.substring(0, 1));
  }

  private static int checkNegative(int number) {
    return number < 0 ? -number : number;
  }

}
