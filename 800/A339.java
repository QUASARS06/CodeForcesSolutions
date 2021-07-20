import java.util.*;
import java.text.*;

public class A339{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String[] nums = s.split("\\+");
		Arrays.sort(nums);

		String res = String.join("+", nums);
		System.out.println(res);
	}
}