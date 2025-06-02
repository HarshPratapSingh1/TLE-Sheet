package codeForces;
import java.util.*;
public class M_arrays {
	public static void main(String[]args) {
		Scanner scan = new Scanner (System.in);
		
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			
			long arr[] = new long[n];
			
			for(int i = 0 ; i < n ; i++) {
				arr[i] = scan.nextLong();
				arr[i] %= m;
			}
			
			int freq[] = new int[m];
			long ans = 0 ;
			
			for(int i = 0 ; i < n ; i++) freq[(int)arr[i]]++;
			
			if(freq[0]>=1) ans++;
			
			for(int i = 1 ; i < m ; i++) {
				if(freq[i] >= 1) {
					if(Math.abs(freq[i]-freq[m-i]) <= 1) ans++;
					
					else ans += Math.abs(freq[i]-freq[m-i]); 
					
					freq[m - i]=0;
				}
			}
			System.out.println(ans);
		}
	}
}
