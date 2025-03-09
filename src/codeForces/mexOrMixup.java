package codeForces;
import java.util.*;
public class mexOrMixup {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			
			int cnt=a;
//			System.out.println(cnt);
			cnt--;
			int x1=0;
			int val=cnt%4;
			if(val==0)x1=cnt;
			else if(val==1)x1=1;
			else if(val==2)x1=cnt+1;
			else if(val==3)x1=0;
			
//			if(x1<0)x1=0;
//			System.out.println(x1);
			cnt++;
			if(x1==b)System.out.println(cnt);
			else {
				if(x1==(a^b))System.out.println(cnt+2);
				else System.out.println(cnt+1);
			}
		}
	}
}
