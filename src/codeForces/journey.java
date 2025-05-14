package codeForces;

import java.util.Scanner;

public class journey {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			long n=scan.nextLong();
			long a=scan.nextLong();
			long b=scan.nextLong();
			long c=scan.nextLong();
			
			long l = 1;
			long r = n;
			long mid;
			long ans = n;
			while(l<=r) {
				mid=l+(r-l)/2;
				
				if(isPosi(mid,a,b,c,n)) {
					ans=mid;
					r=mid-1;
				}else l=mid+1;
			}
			System.out.println(ans);
		}
	}
	public static boolean isPosi(long mid,long a,long b,long c,long n) {
		long x=mid/3;
		long y=mid%3;
		
		long total=(a+b+c)*x;
		
		if(y>=1)total+=a;
		if(y==2)total+=b;
		
		
		return total>=n;
	}
}
