package codeForces;

import java.util.*;

public class BracketColoring {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			//initialization
			int n = scan.nextInt();
			
			String s = scan.next();
			
			int arr[] = new int[n];
			
			if(s.charAt(0) == '(') arr[0] = 1;
			else arr[0] = -1; 
			
			for(int i = 1 ; i < n ; i++) {
				if(s.charAt(i) == '(') arr[i] = arr[i - 1] + 1;
				else arr[i] = arr[i - 1] - 1;
			}
			
			if(arr[n - 1] != 0) {
				System.out.println(-1);
				continue;
			}
			
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			
			for(int it : arr) {
				min = Math.min(min, it);
				max = Math.max(it, max);
			}
			
			
			if(max == 0 || min == 0) {
				System.out.println(1);
				for(int i = 0 ; i < n ; i++) System.out.print(1+" ");
				System.out.println();
				continue;
			}
			
			System.out.println(2);
			for(int i = 0 ; i < n ; i++) {
				if(arr[i] > 0) System.out.print(1+" ");
				else if(arr[i] < 0) System.out.print(2+" ");
				else {
					if(i > 0 && arr[i - 1] > 0) System.out.print(1+" ");
					else System.out.print(2+" ");
				}
			}
			System.out.println();
		}
	}
}
