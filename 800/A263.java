import java.util.*;
import java.text.*;

public class Temp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		boolean flag=false;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(sc.nextInt() == 1){
					int res = Math.abs(3-i) + Math.abs(3-j);
					System.out.print(res);
					flag = true;
					break;
				}
			}
			if(flag) break;
		}
	}
}