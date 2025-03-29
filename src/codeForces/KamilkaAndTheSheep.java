package codeForces;
import java.util.*;
public class KamilkaAndTheSheep {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			long arr[]=new long [n];
			
			for(int i=0;i<n;i++)arr[i]=scan.nextLong();
			
			
			Arrays.sort(arr);
			
			System.out.println(Math.abs(arr[0]-arr[n-1]));
		}
	}
}	
