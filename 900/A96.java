import java.util.*;
import java.text.*;

public class A96{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		if(s.length() < 7){
			System.out.println("NO");
			System.exit(0);
		}

		int onesctr = 0;
		for(int i=0;i<7;i++){
			if(s.charAt(i) == '1') onesctr++;
		}
			

		if(onesctr == 7 || onesctr == 0){
			System.out.println("YES");
			System.exit(0);
		}

		for(int i=1;i<=s.length()-7;i++){
			if(s.charAt(i-1) == '1') onesctr--;
			if(s.charAt(i+6) == '1') onesctr++;

			if(onesctr == 7 || onesctr == 0){
				System.out.println("YES");
				System.exit(0);
				break;
			}
		}

		System.out.println("NO");	
		
	}
}