package codeForces;
import java.util.*;
public class minimumLcm {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			long n=scan.nextLong();
			
			if(n%2==0) {
				System.out.println(n/2+" "+n/2);
				continue;
			}
			long x=1;
			
			for(int i=2;i*i<=n;i++) {
				if(n%i==0) {
					x=n/i;
					break;
				}
			}
			System.out.println(x+" "+(n-x));
		}
	}
}
