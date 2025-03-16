package codeForces;
import java.util.*;
public class buyingTorches {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			long x=scan.nextLong();
			long y=scan.nextLong();
			long k=scan.nextLong();
			
			long m=(k+(k*y)-1+(x-1)-1)/(x-1);
			System.out.println(m+k);
			
		}
		
	}
}
