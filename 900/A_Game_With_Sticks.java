import java.util.*;
import java.text.*;

public class A_Game_With_Sticks {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int min = Math.min(n, m);

    System.out.println(min%2 == 0 ? "Malvika" : "Akshat");

    sc.close();
  }
}