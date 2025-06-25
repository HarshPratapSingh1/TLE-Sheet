package codeForces;
import java.util.*;
public class just_Eat_it {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			long arr[] = new long[n];
			
			for(int i=0 ; i<n ; i++) arr[i] = scan.nextLong();
			
			
			long maxKad = Math.max(kadane(arr,n , 0 , n - 1), kadane(arr,n , 1 , n));
			long sum = 0;
			for(int i = 0 ; i < n ; i++) sum += arr[i];
			
			System.out.println(sum > maxKad ? "YES" : "NO");
		}
	}
	public static long kadane(long arr[],int n , int start , int end) {
		long ans = arr[start];
		long max = arr[start];
		
		for(int i = start + 1 ; i < end ;i++) {	
			ans = Math.max(ans + arr[i] , arr[i]);
			
			max = Math.max(max, ans);
		}
		return max;
	}
}
