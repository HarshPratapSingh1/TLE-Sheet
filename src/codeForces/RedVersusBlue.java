package codeForces;
import java.util.*;
public class RedVersusBlue {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			int r=scan.nextInt();
			int b=scan.nextInt();
			
			int gs=r/(b+1);
			int extra=r%(b+1);
			
			String s="";
			for(int i=0;i<b+1;i++) {
				for(int j=0;j<gs+(extra>0?1:0);j++) {
					s+="R";
				}
				if(extra>0)extra--;
				if(i<b)s+="B";
			}
			System.out.println(s);
		}
	}
}
