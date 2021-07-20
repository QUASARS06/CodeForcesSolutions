import java.util.*;
import java.text.*;

public class A_Puzzles {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] pieces = new int[m];
    for (int i = 0; i < m; i++) {
      pieces[i] = sc.nextInt();
    }

    Arrays.sort(pieces);
    int min = pieces[m - 1] - pieces[0];
    for (int i = 0; i <= m - n; i++) {
      int low = pieces[i];
      int high = pieces[i + n - 1];
      min = Math.min(min, high - low);
    }

    System.out.println(min);

    sc.close();
  }
}