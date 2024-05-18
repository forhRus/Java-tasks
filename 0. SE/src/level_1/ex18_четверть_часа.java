package level_1;

import java.util.Random;

/*
Дано целое число, содержащее номер минуты от 0 до 60.
Определите, в какую четверть часа попадает это значение.
 */
public class ex18_четверть_часа {
  static Random rand = new Random();

  public static void main(String[] args) {


    for (int i = 0; i < 10; i++) {

      byte minut = (byte)rand.nextInt(0, 60);

      if(0 <= minut && minut < 15){
        System.out.printf("%d - первая четверть.", minut);
      }else if (15 <= minut && minut < 30){
        System.out.printf("%d - вторая четверть.", minut);
      }else if (30 <= minut && minut < 45){
        System.out.printf("%d - третья четверть.", minut);
      }else {
        System.out.printf("%d - четвёртая четверть.", minut);
      }

      System.out.println();
    }

    
  }
}
