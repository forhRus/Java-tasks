package level_1;

/*
Выведите в консоль все четные числа из промежутка от 1 до 100.
 */
public class ex16_вывод_чётных_чисел {

  public static void main(String[] args) {

    int count = 100;
    printEvenNumbers(count);
  }

  public static void printEvenNumbers(int count) {
    for (int i = 0; i <= count; i++) {
      if (isEven(i))
        System.out.print(i + " ");
    }
    System.out.println();
  }

  public static boolean isEven(int number) {
    return number % 2 == 0;
  }
}
