package level_1;

/*
Выведите в консоль все числа кратные трем в промежутке от 1 до 100.
 */
public class ex19_вывод_чисел_кратным_трём {

  public static void main(String[] args) {

    int count = 100;
    int d = 3;

    for (int i = d; i <= count; i+=d) {
      System.out.print(i + " ");
    }
  }
}
