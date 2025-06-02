package codeForces;
import java.util.*;
public class Stable_Groups {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long k = scan.nextLong();
		long x = scan.nextLong();
		
		long arr[] = new long[n];
		
		for(int i = 0 ; i < n ; i++) arr[i] = scan.nextLong();
		
		Arrays.sort(arr);
		long diff[] = new long[n-1];
		for(int i = 0 ; i < n - 1 ; i++) diff[i] = arr[i + 1] - arr[i];
		
		Arrays.sort(diff);
		
		long cnt = 1 ;
		
		for(int i = 0 ; i < n - 1 ; i++) {
			if(diff[i] <= x) continue;
			else {
				long req = (diff[i] - 1 )/ x;

				if(k >= req) k -= req;
				else cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
