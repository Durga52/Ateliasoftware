import java.util.Scanner;

public class MergeSort {
  
  static void merge(int a[], int beg, int mid, int end) {
    int[] temp = new int[10];
    int i = beg;
    int j = mid + 1;
    int index = beg;
    while (i <= mid && j <= end) {
      if (a[i] < a[j]) {
        temp[index] = a[i];
        i++;
      } else {
        temp[index] = a[j];
        j++;
      }
      index++;
    }
    if (i > mid) {
      while (j <= end) {
        temp[index] = a[j];
        index++;
        j++;
      }
    } else {
      while (i <= mid) {
        temp[index] = a[i];
        index++;
        i++;
      }
    }
    int k = beg;
    while (k < index) {
      a[k] = temp[k];
      k++;
    }
  }

  static void mergeSort(int a[], int beg, int end) {
    int mid;
    if (beg < end) {
      mid = (beg + end) / 2;
      mergeSort(a, beg, mid);
      mergeSort(a, mid + 1, end);
      merge(a, beg, mid, end);
    }
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of an Array: ");
    int n = scanner.nextInt();
    int[] a = new int[n];
    System.out.println("Enter the elements which you want to sort:");
    for (int i = 0; i < a.length; i++) {
      a[i] = scanner.nextInt();
    }
    mergeSort(a, 0, n - 1);
    System.out.println("Array After MergeSort:");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] +" ");
    }
  }
}
