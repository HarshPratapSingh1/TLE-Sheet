package codeForces;
import java.util.*;
public class GroupingIncreases {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0) {
			int n = scan.nextInt();
			int ans = 0;
			int S = Integer.MAX_VALUE;
			int T = Integer.MAX_VALUE;
			for(int i = 0 ; i < n ; i++) {
				int val = scan.nextInt();
				
				if(S > T) {
					int temp = S;
					S = T;
					T = temp;
				}
				
				if(val <= S) S = val;
				else if(val <= T) T = val;
				else {
					S = val;
					ans++;
				}
			}
	        
	        System.out.println(ans);
		}
	}
}
