package codeForces;
import java.util.*;
public class BlackAndWhiteStripe {
	public static void main(String[]args) {
		Scanner scan=new Scanner (System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			int k=scan.nextInt();
			String s=scan.next();
			
			 int currentW = 0;
	            for (int i = 0; i < k; i++) {
	                if (s.charAt(i) == 'W') {
	                    currentW++;
	                }
	            }

	            int minW = currentW;

	            for (int i = k; i < n; i++) {
	                if (s.charAt(i - k) == 'W') currentW--;
	                if (s.charAt(i) == 'W') currentW++;
	                minW = Math.min(minW, currentW);
	            }

	            System.out.println(minW);
	        
		}
	}
}
