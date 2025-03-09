package codeForces;
import java.util.*;
public class addAndDivide {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			long a=scan.nextLong();
			long b=scan.nextLong();
			
			long ans=(long)1e9;
			
			for(int i=0;i<=30;i++) {
				long x=a;
				if(b+i>=2) {
					long cnt=i;
					while(x>0) {
						x=x/(b+i);
						cnt++;
					}
					ans=Math.min(ans, cnt);
				}
			}
			System.out.println(ans);
		}
	}
}
 