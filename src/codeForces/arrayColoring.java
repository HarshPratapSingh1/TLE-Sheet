package codeForces;
import java.util.*;
public class arrayColoring {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			
			int cnt=0;
			for(int i=0;i<n;i++)if(arr[i]%2!=0)cnt++;
			
			if(cnt%2!=0) {	
				System.out.println("No");
			}else System.out.println("Yes");
		}
	}
}
