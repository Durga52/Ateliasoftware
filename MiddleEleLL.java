import java.util.LinkedList;
import java.util.Scanner;

/**
 * MiddleElement in LL
 */
public class MiddleEleLL {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    LinkedList<Integer> linkedList = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      linkedList.add(i, scanner.nextInt());
    }
    scanner.close();
    int len = linkedList.size();
    int mid = len / 2;
    int count = 0;
    for (Integer num : linkedList) {
      if (count == mid) {
        System.out.println("Middle element is " + num);
        break;
      }
      count++;
    }
  }
}
