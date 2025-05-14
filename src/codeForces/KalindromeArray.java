package codeForces;
import java.util.*;

public class KalindromeArray {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			
			int arr[] = new int[n];
			for(int i = 0; i < n ;i++)arr[i] = scan.nextInt();
			
			boolean flag=true;
			for(int i=0;i<n/2;i++) {
				if(arr[i]!=arr[n-i-1]) {
					flag=check(arr,arr[i])||check(arr,arr[n-i-1]);
					break;
				}
			}
			
			if(flag)System.out.println("YES");
			else System.out.println("NO");
		}
	}
	public static boolean check(int arr[],int val) {
		int n=arr.length;
		int i=0;
		int j=n-1;
		
		while(i<j) {
			if(arr[i]==val)i++;
			else if(arr[j]==val)j--;
			else if(arr[i]!=arr[j])return false;
			else {
				i++;
				j--;
			}
		}
		return true;
	}
}
