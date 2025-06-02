package codeForces;

import java.util.*;

public class DifferentialSorting {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t =  scan.nextInt();
		
		while(t-- > 0) {
			int n = scan.nextInt();
			long arr[] = new long[n];
			
			for(int i = 0 ; i < n ; i++) arr[i] = scan.nextLong();

			if(arr[n - 2] > arr[n - 1]) System.out.println(-1);
			else {
				boolean flag = false;
				for(int i = 0 ; i < n - 1 ; i++) {
					if(arr[i] > arr[i+1]) {
						flag = true;
						break;
					}
				}
				if(!flag) {
					System.out.println(0);
					continue;
				}
				if(Math.abs(arr[n-1]-arr[n-2])>(int)1e18) {
					System.out.println(-1);
					continue;
				}
				
				arr[n - 3] = arr[n - 2] - arr[n - 1];
				if(arr[n - 3] <= arr[n - 2] && arr[n - 3] <= arr[n - 1] && arr[n - 2] <= arr[n - 1]) {
					System.out.println(n - 2);
					for(int i = 0 ; i < n - 2 ; i++) {
						System.out.println((i + 1) +" "+ (n - 1)+" "+(n));
					}
				}else System.out.println(-1);
				
			}
			
		}	
	}
}