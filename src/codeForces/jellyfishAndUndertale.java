package codeForces;
import java.util.*;
public class jellyfishAndUndertale {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-- >0) {
			int a=scan.nextInt();
			int b=scan.nextInt();	
			int n=scan.nextInt();
			
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			
			long sum=0;
			for(int i=0;i<n;i++) {
				sum+=Math.min(a-1, arr[i]);
			}
			System.out.println(sum+b);
		}scan.close();
	}
}
