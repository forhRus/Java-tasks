package level_1;

/*
Дано слово. Получите его последнюю букву. Если слово заканчивается на мягкий знак, то получите предпоследнюю букву.
 */
public class ex6 {
  public static void main(String[] args) {

    String[] words = new String[]{"Кот", "Dog", "ОсенЬ", "Ночь", "Астра",
            "",  "ять", "шь", "ь"};

    String str = "ь";

    for (String w : words) {

      // если слово меньше чем конечная строка, то пропускаем слово.
      if(w.length() <= str.length())
        continue;

      // если слово оканчивается на заданную строку, то выводим предшествующую букву.
      if(checkStr(w, str)){
        System.out.printf("%s - %s\n", w, w.charAt(w.length() - str.length() - 1));
      }
    }
  }

  /*
  Метод определяет, заканчивается ли слово на заданную строку.
   */
  public static boolean checkStr(String word, String str){

    // приводим слово к нижнему регистру
    // получаем подстроку с концовкой длинной как у сравниваемой строки
    word = word.toLowerCase()
            .substring(word.length() - str.length());

    // сравниваем подстроку с переданной строкой в (нижнем регистре)
    return  word.equals(str.toLowerCase());
  }

}
