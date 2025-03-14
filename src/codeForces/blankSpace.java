package codeForces;
import java.util.*;
public class blankSpace {
	public static void main(String[]args) {
		Scanner scan=new Scanner (System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int n=scan.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			
			int cnt=0;
			int max=0;
			for(int i=0;i<n;i++) {
				if(arr[i]==0) {
					cnt++;
					max=Math.max(max, cnt);
				}
				else cnt=0;
			}
//			max=Math.max(max, cnt);
			System.out.println(max);
		}
	}
}	
