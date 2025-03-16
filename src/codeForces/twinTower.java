package codeForces;
import java.util.*;
public class twinTower {
	public static void main(String[]args) {
		Scanner scan=new Scanner (System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			
			int max=-1;
			for(int i=0;i<n;i++)max=Math.max(max, arr[i]);
			
			max+=1;
			
			for(int i=0;i<n;i++) {
				System.out.print(max-arr[i]+" ");
			}
			System.out.println();
		}
	}
}
