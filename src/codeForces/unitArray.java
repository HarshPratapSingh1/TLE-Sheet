package codeForces;
import java.util.*;
public class unitArray {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int n=scan.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			
			int cnt=0;
			for(int i=0;i<n;i++)if(arr[i]==-1)cnt++;
			
			if(cnt==n)System.out.println(n);
			else if(cnt==0)System.out.println(0);
			else {
//				System.out.println(111);
				System.out.println(Math.abs((n/2)-cnt));
			}
		}
	}
}
