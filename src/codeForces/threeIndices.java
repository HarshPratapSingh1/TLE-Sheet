package codeForces;
import java.util.*;
public class threeIndices {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			int flag=0;
			for(int i=1;i<n-1;i++) {
				if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]) {
					flag=1;
					System.out.println("YES");
					System.out.println((i)+" "+(i+1)+" "+(i+2));
					break;
				}
			}
			if(flag==0)System.out.println("NO");
		}
	}
}
