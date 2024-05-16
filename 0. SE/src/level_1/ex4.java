package level_1;

/*
Дано число. Проверьте, четное оно или нет.
 */
public class ex4 {
  public static void main(String[] args) {

    int[] numbers = new int[]{1, -7, 0, 3, 4};

    for (int number : numbers) {

      if(isEven(number)){
        System.out.printf("Число %d - чётное", number);
      } else {
        System.out.printf("Число %d - нечётное", number);
      }
      System.out.println();
    }

  }

  public static boolean isEven(int number){
    return  number % 2 == 0;
  }
}
