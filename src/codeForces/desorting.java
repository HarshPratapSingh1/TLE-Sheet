package codeForces;
import java.util.*;
public class desorting {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int n=scan.nextInt();
			long arr[]=new long[n];
			for(int i=0;i<n;i++)arr[i]=scan.nextLong();
			
			long min=Long.MAX_VALUE;
			for(int i=0;i<n-1;i++) {
				min=Math.min(min, arr[i+1]-arr[i]);
			}
			if(min>=0)System.out.println((min/2)+1);
			else System.out.println(0);
		}
	}
}
