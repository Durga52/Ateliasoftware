import java.util.Scanner;
/**
 * Reverse Words in a given sentence
 */
public class ReverseWords {
    static String reversedWord(String word) {
    String revWord = "";

    for (int i = word.length() - 1; i >= 0; i--) {
      revWord += word.charAt(i);
    } 

    return revWord;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    scanner.close();
    String words[] = str.split("\\s");
    for (int i = 0; i < words.length; i++) {
      words[i] = reversedWord(words[i]);
    }
    System.out.print(String.join(" ", words));
  }
}
