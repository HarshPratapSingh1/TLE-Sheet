package codeForces;
import java.util.*;
public class treasureHunt {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			long x=scan.nextLong();
			long y=scan.nextLong();
			long a=scan.nextLong();
			
			long timex=(a)%(x+y);
			
			if(x<=timex)System.out.println("Yes");
			else System.out.println("No");
		}
	}
}
