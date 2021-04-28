import java.util.Scanner;
/**
 * check the string contains all the digits or not
 */
public class StringDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int len = str.length();
        System.out.println(digits(str, len));
    }
    public static boolean digits(String str, int n) {
        for (int i = 0; i < n; i++) {
          if (!Character.isDigit(str.charAt(i)))
            return false;
        }
        return true;
      }    
}
