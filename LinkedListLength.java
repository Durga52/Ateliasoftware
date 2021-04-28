import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
/**
 * Length of LL
 */
public class LinkedListLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(i, scanner.nextInt());
        }
        scanner.close();
        LinkedList<Integer> linkedList= new LinkedList<>();
        linkedList.addAll(arrayList);
        System.out.println(linkedList.size());
    }

}
