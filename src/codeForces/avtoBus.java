package codeForces;
import java.util.*;
public class avtoBus {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			long n=scan.nextLong();
			
			if(n%2!=0||n<4) {
				System.out.println(-1);
				continue;
			}
			
			else {
				long max=n/6;
				if(n%6!=0)max++;
				
				long min=n/4;
				System.out.println(max+" "+min);
			}
		}
	}
}
