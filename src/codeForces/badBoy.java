package codeForces;
import java.util.*;
public class badBoy {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int n=scan.nextInt();
			int m=scan.nextInt();
			int i=scan.nextInt();
			int j=scan.nextInt();
			
			int longestVert1=(m/2)-j;  
			int longestHor1=(n/2)-i;
			
			int x1=1,y1=1,x2=n,y2=m;
			if(longestVert1>0)y1=m;
			if(longestHor1<0)x1=n;
			
			if(x1==1&&y1==1) {
				x2=n;
				y2=m;
			}
			else if(x1==n&&y1==m) {
				x2=1;
				y2=1;
			}
			else if(x1==1&&y1==m) {
				x2=n;
				y2=1;
			}
			else if(x1==n&&y1==1) {
				x2=1;
				y2=m;
			}
			
			System.out.println(x1+" "+y1+" "+x2+" "+y2);
		}
	}
}
