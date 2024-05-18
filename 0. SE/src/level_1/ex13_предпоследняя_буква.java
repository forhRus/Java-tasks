package level_1;

/*
Дана строка. Если в этой строке более одного символа,
выведите в консоль предпоследний символ этой строки.
 */
public class ex13_предпоследняя_буква {
  public static void main(String[] args) {

    String[] words = new String[]{"Кот", "Dog", "Осень", "Ночь", "Астра",
            "",  "ять", "шь", "ь"};

    for (String w : words) {

      if(w.length()  < 2)
        continue;

        System.out.println(w + " - " + w.substring(w.length()-2, w.length()-1));
    }
  }
}
