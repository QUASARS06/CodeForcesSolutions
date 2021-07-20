import java.util.*;
import java.text.*;

public class A112{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s1 = sc.next().toLowerCase();
		String s2 = sc.next().toLowerCase();

		int res = s1.compareTo(s2);
		if(res == 0)
			System.out.println("0");
		else
			System.out.println(res>0 ? "1" : "-1");
	}
}