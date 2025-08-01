package codeForces;

import java.util.*;

public class Jumping_Through_Segments {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			long arr[][] = new long[n][2];
			
			long l = 0 , r = 0;
			for(int i = 0 ; i < n ; i++) {
				arr[i][0] = scan.nextLong();
				arr[i][1] = scan.nextLong();
				r = Math.max(r, arr[i][1]);
			}
			r += 1;
			
			long ans = -1;
			
			while(l <= r) {
				long mid = l + (r - l) / 2;
				if(isPosi(mid,arr,n)) {
					ans = mid;
					r = mid - 1;
				}else l = mid + 1 ;
			}
			System.out.println(ans);
		}
	}
	public static boolean isPosi(long mid , long arr[][] , int n) {
		long l = 0 , r = 0;
		for(int i = 0; i < n ; i++) {
			l = Math.max(l - mid, arr[i][0]);
			r = Math.min(r + mid, arr[i][1]);
			if(l > r) return false;
		}
		return true;
	}
}
