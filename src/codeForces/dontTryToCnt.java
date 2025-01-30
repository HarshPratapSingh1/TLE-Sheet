package codeForces;
import java.util.*;
public class dontTryToCnt {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-- >0) {
			int n=scan.nextInt();
			int m=scan.nextInt();
			
			String x=scan.next();
			String s=scan.next();
			
			int cnt=0;
			int flag=0;
			while(!x.contains(s)) {
			StringBuilder sub=new StringBuilder(x);
			sub.append(x);
			cnt++;
			x=sub.toString();
			if(cnt>25) {
				flag=1;
				break;
			}
		}
			if(flag==0)
			System.out.println(cnt);
			else System.out.println(-1);	
		}
		scan.close();
	}
}
