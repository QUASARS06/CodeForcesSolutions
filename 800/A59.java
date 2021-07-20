import java.util.*;
import java.text.*;

public class A59{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int lowercount = 0;
		int slen = s.length();

		for(int i=0;i<slen;i++){
			if(Character.isLowerCase(s.charAt(i))) lowercount++;
		}
		int uppercount = slen - lowercount;
		if(uppercount > lowercount)
			System.out.println(s.toUpperCase());
		else
			System.out.println(s.toLowerCase());
	}
}