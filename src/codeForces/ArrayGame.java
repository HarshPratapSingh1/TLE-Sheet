package codeForces;
import java.util.*;
public class ArrayGame {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			long k = scan.nextLong();
			
			long arr[] = new long[n];
			for(int i = 0 ; i < n ; i++) arr[i] = scan.nextLong();
			
			if (k >= 3) {
				System.out.println(0);
				continue;
			}
			Arrays.sort(arr);
			long min = arr[0];
			for(int i = 1 ; i < n ; i++) min = Math.min(min,arr[i] - arr[i-1]);
				
			if(k == 1) {
				System.out.println(min);
				continue;
			}
			
			
			for (int i = 0; i < n; i++) {
	            for (int j = 0; j < i; j++) {
	                long v = arr[i] - arr[j];            
	                int p = LowerBound(arr, v);       

	                if (p < n) min = Math.min(min, arr[p] - v);   
	                if (p > 0) min = Math.min(min, v - arr[p - 1]); 
	            }
	        }
			System.out.println(min);
		}
	}
	private static int LowerBound(long[] arr, long key) {
        int l = 0, r = arr.length - 1;          
        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] < key) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;                        
    }
}
