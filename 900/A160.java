import java.util.*;
import java.text.*;

public class A160{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];

		int sum = 0;
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
			sum+=arr[i];
		} 

		Arrays.sort(arr);

		int mytotal = 0;
		int numofcoins = 0;
		for(int i=n-1;i>=0;i--){
			mytotal+=arr[i];
			numofcoins++;
			sum-=arr[i];

			if(mytotal > sum) break;
		}

		System.out.println(numofcoins);
	}
}