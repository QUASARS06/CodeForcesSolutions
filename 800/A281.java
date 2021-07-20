import java.util.*;
import java.text.*;

public class A281{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String res = s.substring(0,1).toUpperCase()+s.substring(1);

		System.out.println(res);
	}
}