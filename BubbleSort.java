import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of an Array:");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements which you want to sort:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        bubbleSort(a);
        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    static void bubbleSort(int[] a) {
        int n = a.length,temp=0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }

            }
        }

    }
}