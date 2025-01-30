package codeForces;
import java.util.*;
public class lineTtip {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-- > 0) {
			int n=scan.nextInt();
			int x=scan.nextInt();
			
			int arr[]=new int [n+1];
			arr[0]=0;
			for(int i=1;i<n+1;i++) {
				arr[i]=scan.nextInt();
			}
			
			int max=Integer.MIN_VALUE;
			for(int i=0;i<n;i++) {
				int a=Math.abs(arr[i]-arr[i+1]);
				max=Math.max(max, a);
			}
			
			int a=(x-arr[n])*2;
			max=Math.max(max, a);
			
			System.out.println(max);
		}
		scan.close();
	}
}
