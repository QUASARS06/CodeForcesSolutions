import java.util.*;
import java.text.*;

public class A133 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		if (s.contains("H") || s.contains("Q") || s.contains("9") || s.contains("+")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}