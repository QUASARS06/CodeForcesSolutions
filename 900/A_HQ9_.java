import java.util.*;
import java.text.*;

public class A_HQ9_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		if (s.contains("H") || s.contains("Q") || s.contains("9")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}