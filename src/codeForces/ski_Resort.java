package codeForces;
import java.util.*;
public class ski_Resort {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			int k=scan.nextInt();
			long q=scan.nextLong();
			
			long arr[]=new long[n];
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			
			long cnt=0;
			long max=0;
			for(int i=0;i<n;i++) {
				if(arr[i]<=q) {
					cnt++;
					
				}else {
					if(cnt>=k) {
						max+=(long)((cnt-k+1)*(cnt-k+2))/2;
					}	
					cnt=0;
				}				
			}
			if(cnt>=k) {
				max+=(long)((cnt-k+1)*(cnt-k+2))/2;
			}
			System.out.println(max);
		}
	}
}
