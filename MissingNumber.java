import java.util.ArrayList;
import java.util.Scanner;

/**
 * MissingNumber
 */
public class MissingNumber {
    static final int RANGE = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            arrayList.add(i, scanner.nextInt());
        }
        scanner.close();
        int sum = (RANGE * (RANGE + 1)) / 2;
        int sumOfArray = 0;
        for (Integer num : arrayList) {
            sumOfArray += num;
        }

        System.out.println("Missing number is " + (sumOfArray - sum));
    }
}