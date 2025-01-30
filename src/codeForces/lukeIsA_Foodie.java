package codeForces;
import java.util.*;
public class lukeIsA_Foodie {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int n=scan.nextInt();
			long x=scan.nextLong();
			
			long arr[]=new long[n];
			
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			long meet[][]=new long[n][2];
			
			for(int i=0;i<n;i++) {
				meet[i][0]=arr[i]-x;
				meet[i][1]=arr[i]+x;
			}
			int cnt=0;
			long up=meet[0][1];
			long lb=meet[0][0];
			for(int i=1;i<n;i++) {
				if(up>=meet[i][0]&&lb<=meet[i][1]) {
					up=Math.min(up, meet[i][1]);
					lb=Math.max(lb, meet[i][0]);
				}else {
					cnt++;
					up=meet[i][1];
					lb=meet[i][0];
				}
			}
			System.out.println(cnt);
			
		}
	}
}
