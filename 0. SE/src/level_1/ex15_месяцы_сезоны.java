package level_1;

import java.util.Random;

/*
Дано целое число, содержащее номер месяца от 1 до 12.
Определите, в какую пору года попадает этот месяц.
 */
public class ex15_месяцы_сезоны {

  static Random rand = new Random();

  public static void main(String[] args) {

    System.out.println("Время года.");
    for (int i = 0; i < 5; i++) {
      byte month = (byte)rand.nextInt(1, 15);

      switch (month){
        case 12, 1, 2:
          System.out.printf("%d - Сейчас зима", month);
          break;
        case 3, 4, 5:
          System.out.printf("%d - Сейчас весна", month);
          break;
        case 6, 7, 8:
          System.out.printf("%d - Сейчас лето", month);
          break;
        case 9, 10, 11:
          System.out.printf("%d - Сейчас осень", month);
          break;
        default:
          System.out.printf("%d - Месяца с таким номером не существует", month);
          break;
      }
      System.out.println();

    }
  }
}
