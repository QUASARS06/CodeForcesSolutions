import java.util.*;
import java.text.*;

public class A_Dubstep {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String[] words = s.split("WUB");
    String res = "";

    for (String word : words) {
      if (!word.trim().equals("")) {
        res = res + word + " ";
      }
    }

    System.out.print(res.substring(0, res.length() - 1));

    sc.close();
  }
}