import java.util.ArrayList;
import java.util.Scanner;
/**
 * MiddleElement in LL
 */
public class MiddleEleLL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(i, scanner.nextInt());
        }
        scanner.close();
        int len = arrayList.size();
        int mid=len/2;
        System.out.println(arrayList.get(mid));
    }
}
