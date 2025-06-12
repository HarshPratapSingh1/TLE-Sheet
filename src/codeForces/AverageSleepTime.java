package codeForces;

import java.util.Arrays;
import java.util.Scanner;

public class AverageSleepTime {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0 ; i < n ; i++) arr[i] = scan.nextInt();
		
		int prefix[] = new int[n];
		prefix[0] = arr[0];
		
		for(int i = 1 ; i < n ; i++) prefix[i] = arr[i] + prefix[i - 1];
		
		int i = k - 1;
		System.out.println(Arrays.toString(prefix));
		long ans = 0;
		while(i < n) {
			ans += (prefix[i] -  ((i - k >= 0) ? prefix[i - k] : 0)); 
			i++;
//			System.out.println(ans);
		}
//		System.out.println(ans);
		System.out.println((double)ans/(n - k + 1));
	}
}
