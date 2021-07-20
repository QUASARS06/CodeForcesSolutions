import java.util.*;
import java.text.*;

public class A_Even_Odds {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();
    long k = sc.nextLong();

    long num_of_odds = (long) Math.ceil(n / 2.0);
    long num_of_evens = n - num_of_odds;

    if (k <= num_of_odds) {
      // odd number to be printed
      System.out.println((2 * k - 1));
    } else {
      // even number to be printed
      k -= num_of_odds;
      System.out.println((2 * k));
    }

  }
}