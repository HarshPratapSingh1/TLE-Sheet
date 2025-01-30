package codeForces;
import java.util.*;
public class oddQueries {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			int q=scan.nextInt();
			
			int arr[]=new int[n];
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			
			while(q-->0) {
				int l=scan.nextInt();
				int r=scan.nextInt();
				int k=scan.nextInt();
				
				int sum=0;
				for(int i=0;i<n;i++) {
					if(i>=l-1&&r>i) {
						sum+=k;
					}else {
						sum+=arr[i];
					}
				}
				if(sum%2==0)System.out.println("No");
				else System.out.println("Yes"); 
				
			}
		}
	}
}
