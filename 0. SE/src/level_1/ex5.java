package level_1;

/*
Даны два слова. Проверьте, что первые буквы этих слов совпадают.
 */
public class ex5 {
  public static void main(String[] args) {

    String[] words = new String[]{"Кот", "Вес", "Осень", "", "Лохань", "Астра"};
    String word = "лото";

    if (!isVoid(word)){

      for (String w : words) {
        if(!isVoid(w)){
          if (isEqualChars(w, word)){
            System.out.printf("\"%s\" и \"%s\" - первые буквы совпадают\n", w, word);
          } else {
            System.out.printf("\"%s\" и \"%s\" - первые буквы не совпадают\n", w, word);
          }
        }
      }
    } else {
      System.out.println("Слова нет");
    }
  }

  public static boolean isEqualChars(String word1, String word2){
    return word1.toLowerCase().charAt(0) == word2.toLowerCase().charAt(0);
  }

  private static boolean isVoid(String string) {
    return string.length() == 0;
  }
}
