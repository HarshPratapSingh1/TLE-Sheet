package codeForces;
import java.util.*;
public class Dolce_Vita {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			long x = scan.nextLong();
			
			long arr[] = new long[n];
			
			for(int i = 0; i < n ;i++) arr[i] = scan.nextLong();
			
			Arrays.sort(arr);
			long prefix[] = new long[n];
			prefix[0] = arr[0];
			
			for(int i = 1 ; i < n ; i++) prefix[i] = arr[i] + prefix[i - 1];
			
					
			long ans = 0;
			
			for(int i = n - 1 ; i >= 0 ; i--) {
				if(prefix[i] > x) continue;
				
				long max = (x - prefix[i])/(i + 1);
				ans += (max + 1);
			}
			System.out.println(ans>0 ? ans : 0);
		}
	}
	
}
