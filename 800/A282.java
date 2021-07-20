import java.util.*;
import java.text.*;

public class A282{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int ans = 0;
		while(n-->0){
			String s = sc.next();
			if(s.indexOf("++") > -1){
				ans++;
			} else if(s.indexOf("--") > -1){
				ans--;
			}
		}

		System.out.println(ans);
		
	}
}