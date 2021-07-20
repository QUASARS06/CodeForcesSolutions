import java.util.*;
import java.text.*;

// https://codeforces.com/problemset/problem/580/A
public class A_Kefa_and_First_Steps {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();

    int maxlen = 1;
    for (int i = 0; i < n;) {
      int k = i + 1;
      while (k < n && arr[k] >= arr[k - 1]) {
        k++;
      }

      maxlen = Math.max(maxlen, k - i);
      i = k;
    }

    System.out.println(maxlen);
  }
}