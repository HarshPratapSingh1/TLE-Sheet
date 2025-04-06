package codeForces;
import java.util.*;
public class JoJos_Incredible_Adventures {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		
		int t=scan.nextInt();
		
		while(t-->0) {
			String s=scan.next();
			long n=s.length();

			long max=0,cnt=0;
						
			String s1=s+s;
			
			for(char c:s1.toCharArray()) {
				if(c=='1') {
					cnt++;
					if (cnt <= n) {
						max=Math.max(max, cnt);
	                }
				}else cnt=0;	
			}

			if(max==n)System.out.println(n*n);
			
			else {
				long ans=(max-1)/2;
				System.out.println((max-ans)*(ans+1));
			}
		}
	}
}
