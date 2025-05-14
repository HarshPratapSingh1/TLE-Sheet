package codeForces;

import java.util.Arrays;
import java.util.Scanner;

public class NegativesAndPositives {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			
			long arr[]=new long[n];
			
			for(int i=0;i<n;i++)arr[i]=scan.nextLong();
			
			Arrays.sort(arr);
			
			int cnt=0;
			int z=0;
			for(int i=0;i<n;i++) {
				if(arr[i]<0)cnt++;
				else if(arr[i]==0)z++;
			}
			
			if(cnt%2==0) {
				long sum=0;
				for(long it:arr) {
					if(it<0)it*=-1;
					sum+=it;
				}
				System.out.println(sum);
			}else {
				long sum=0;
				for(int i=0;i<n;i++) {
					if(arr[i]<0) {
						arr[i]*=-1;
					}
				}
				Arrays.sort(arr);
				
				arr[0]*=-1;
				
				for(long it:arr)sum+=it;
				
				System.out.println(sum);
			}
		}
	}
}
