package codeForces;
import java.util.*;
public class bogoSort {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			
			Arrays.sort(arr);
			for(int i=0;i<n/2;i++)arr[i]=arr[n-i-1]+arr[i]-(arr[n-i-1]=arr[i]);
			
			for(int it:arr)System.out.print(it+" ");
			System.out.println();
		}
	}
}
