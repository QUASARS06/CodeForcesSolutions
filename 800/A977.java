import java.util.*;
import java.text.*;

public class A977{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		while(k>0){
			int lastdigit = n%10;
			n = lastdigit == 0 ? (int)n/10 : n-1;
			k--;
		}

		System.out.println(n);
	}
}