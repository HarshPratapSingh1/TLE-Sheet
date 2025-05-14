package codeForces;

import java.util.Arrays;
import java.util.Scanner;

public class _250ThousandTonsOfTNT {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int n = scan.nextInt();
	        long[] v = new long[n];
	        for (int i = 0; i < n; i++) {
	            v[i] = scan.nextLong();
	        }

	        long[] pre = new long[n];
	        pre[0] = v[0];
	        for (int i = 1; i < n; i++) {
	            pre[i] = v[i] + pre[i - 1];
	        }

	        long ans = 0;
	        for (int k = 1; k <= n; k++) {
	            if (n % k != 0) continue;

	            int start = k - 1;
	            long res = 0;
	            long maxi = pre[start];
	            long mini = pre[start];

	            for (int idx = start + k; idx < n; idx += k) {
	                long curr = pre[idx] - pre[idx - k];
	                maxi = Math.max(maxi, curr);
	                mini = Math.min(mini, curr);
	            }

	            ans = Math.max(ans, maxi - mini);
	        }

	        System.out.println(ans);
		}
	}
}
