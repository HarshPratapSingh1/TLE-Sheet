package codeForces;
import java.util.*;
public class permutationSwap {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) arr[i]=scan.nextInt();
			
			
			int res=0;
			for(int i=1;i<=n;i++) {
				res=gcd(res,Math.abs(arr[i-1]-i));
			}
			System.out.println(res);
			
		}scan.close();
		
	}
	
	public static int gcd(int a,int b) {
		  while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	}
}
