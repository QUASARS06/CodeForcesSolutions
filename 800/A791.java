import java.util.*;
import java.text.*;

public class A791{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();	//Limak
		int b = sc.nextInt();	//Bob

		// a < b
		// a x 3^x > b x 2^x
		// ans > log(b/a) to the base 3/2=1.5
		int ans = (int)Math.floor(Math.log(b/(a*1.0))/Math.log(1.5)) + 1;

		System.out.println(ans);
	}
}