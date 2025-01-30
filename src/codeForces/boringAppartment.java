package codeForces;
import java.util.*;


public class boringAppartment {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
		while(t>0) {
				
				int x = scan.nextInt(); // Read the target number for this test case
	            int sum = 0;
	            int len=String.valueOf(x).length();
	            int digit=x % 10;
	        
	            for(int i=1;i<digit;i++) {
	            	sum+=10;
	            }
	            
	            for(int i=1;i<=len;i++) {
	            	sum+=i;
	            }
	         
	            
	            
	            System.out.println(sum);
	            t--;
	        
		}
//		scan.close();
	}
}
