package codeForces;
import java.util.*;
public class excitingBets {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			long a=scan.nextLong();
			long b=scan.nextLong();
			
			if(a==b) {
				System.out.println(0+" "+0);
				continue;
			}
			else {
				if(a<b) {
					long tem=a;
					a=b;
					b=tem;
				}
				long max=a-b;
				long min=Math.min(b%max, max-b%max);
				System.out.println(max+" "+min);
			}
		}
	}
}
