package codeForces;
import java.util.*;
public class longest_Divisors_Interval {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			solve(scan);    
	          
		}
	}
	public static void solve(Scanner scan) {
		 long n = scan.nextLong();
		long cnt=1;
		for(long p=2;n%p==0&&p<=n;p++)cnt++;
		
		 System.out.println(cnt);
	}
}
