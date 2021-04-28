import java.util.LinkedList;
import java.util.Scanner;

/**
 * Length of LL
 */
public class LinkedListLength {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    LinkedList<Integer> linkedList = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      linkedList.add(i, scanner.nextInt());
    }
    scanner.close();
    System.out.println(linkedList.size());
  }

}
