package codeForces;

import java.util.*;

public class Iva_ans_Pav {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			//initialization
			int n = scan.nextInt();
			
			long arr[] = new long[n];
			
			//input
			for(int i = 0 ; i < n ; i++) arr[i] = scan.nextLong();
			
			int pre[][] = new int[30][n + 1];
			
			for(int i = 0 ; i < 30 ; i++) {
				pre[i][0] = 0;
				for(int j = 0 ; j < n ; j++) {
					if(((1 << i) & arr[j]) != 0) pre[i][j+1] = pre[i][j];
					else pre[i][j+1] = pre[i][j]+1;
				}
			}
			
			int q = scan.nextInt();
			
			
			for(int i = 0;  i < q ; i++) {
				long l = scan.nextLong() - 1;
				long k = scan.nextLong();
				
				if(arr[(int)l] < k) {
					System.out.print(-1+" ");
					continue;
				}
				
				long idx = binarySearch(pre,l,k,n);
				
				System.out.print((idx)+" ");
			}
			System.out.println();
		}
	}
	public static long binarySearch(int pre[][],long ini,long k,int n) {
		long r = n - 1;
		long l = ini;
		while(l < r) {
			long mid = (l + r + 1) / 2;
			if(isPosi(pre,ini,mid) >= k) {
				l = mid;
			}else r = mid - 1;
		}
		return l+1;
	}
	public static long isPosi(int pre[][],long l , long r) {
		long val = 0;
		
		
		for(int i = 0 ; i < 30 ; i++) if((pre[i][(int)r+1] - pre[i][(int)l]) == 0) val += (1<<i);
		
		return val;
	}
}
