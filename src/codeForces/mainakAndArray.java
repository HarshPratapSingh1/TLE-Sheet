package codeForces;
import java.util.*;
public class mainakAndArray {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int n=scan.nextInt();
			int a[]=new int[n];
			
			for(int i=0;i<n;i++)a[i]=scan.nextInt();
			
			 int maxDifference = a[n - 1] - a[0];
	            
	            
			 
	            for (int i = 0; i < n - 1; i++) {
	          
	                maxDifference = Math.max(maxDifference, a[i] - a[0]);
	                
	                maxDifference = Math.max(maxDifference, a[n - 1] - a[i + 1]);
	            }
	            
	           
	            for (int i = 0; i < n - 1; i++) {
	                maxDifference = Math.max(maxDifference, a[i] - a[i + 1]);
	            }
	            
	          
	            System.out.println(maxDifference);
		}
	}
}
