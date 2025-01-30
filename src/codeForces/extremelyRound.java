package codeForces;
import java.util.*;
public class extremelyRound {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-- >0) {
			 long n = scan.nextLong();
	            int count = String.valueOf(n).charAt(0)-'0';
	            
	            for(int i=1;i<String.valueOf(n).length();i++) {
	            	count+=9;
	            }
	            
	            System.out.println(count);
	        }
	        scan.close();
		
	}
}
