package codeForces;
import java.util.*;
public class walkingMaster {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			long a=scan.nextLong();
			long b=scan.nextLong();
			long c=scan.nextLong();
			long d=scan.nextLong();
			
			long dif=d-b;
			if(d<b) {
				System.out.println(-1);
				continue;
			}
			b+=dif;
			long x=(a+dif);
			
			if(x<c) {
				System.out.println(-1);
				continue;
			}else {
				System.out.println(dif+(x-c));
			}
		}
	}
}
