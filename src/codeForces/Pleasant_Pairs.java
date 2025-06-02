package codeForces;
import java.util.*;
public class Pleasant_Pairs {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-- > 0) {
			int n = scan.nextInt();
			long arr[] = new long[n + 1];
			
			for(int i = 1 ; i <= n ; i++) arr[i] = scan.nextInt();
			
			long ans = 0;
			
			for(int i = 1 ; i <= n ; i++) {
				for(long j = arr[i] - i ;  j <= n ; j += arr[i]) {
					if(j >= 0) if(arr[i]*arr[(int)j] == i + j && i < j) ans++;
				}
			}
			System.out.println(ans);
		}
	}
}
