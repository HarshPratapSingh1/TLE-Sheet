package codeForces;
import java.util.*;
public class makeAP {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			long a=scan.nextLong();
			long b=scan.nextLong();
			long c=scan.nextLong();
			
			long newA=b-(c-b);
			if(newA>=a&&newA%a==0&&newA!=0) {
				System.out.println("YES");
				continue;
			}
			long newB=c-(c-a)/2;
			if(newB>=b&&(c-a)%2 == 0 &&newB%b==0&&newB!=0) {
				System.out.println("YES");
				continue;
			}
			long newC=a+2*(b-a);
			if(newC>=c&&newC%c==0&&newC!=0) {
				System.out.println("YES");
				continue;
			}
			else System.out.println("NO");
		}
	}
}
