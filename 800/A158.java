import java.util.*;
import java.text.*;

public class A158{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];

		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();

		int target = arr[k-1];
		int ctr = 0;
		for(int x : arr){
			if(x <= 0) break;
			if(x<target) break;

			ctr++;
		}

		System.out.println(ctr);
	}
}