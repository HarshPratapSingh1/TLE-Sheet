package codeForces;
import java.util.*;
public class make_It_Increasing {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=scan.nextInt();
			}
			boolean flag=false;
			int cnt=0;
			for(int i=n-1;i>0;i--) {
				while(arr[i-1]>=arr[i]&&arr[i-1]>0) {
					arr[i-1]/=2;
					cnt++;
				}
				if(arr[i]==arr[i-1]) {
					System.out.println(-1);
					flag=true;
					break;
				}
				
			}
			if(!flag) System.out.println(cnt);
		}
	}
}
