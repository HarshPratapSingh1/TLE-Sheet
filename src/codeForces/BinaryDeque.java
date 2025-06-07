package codeForces;
import java.util.*;
public class BinaryDeque {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-- > 0) {
			int n = scan.nextInt();
			int s = scan.nextInt();
			
			int arr[] = new int[n];
			
			int sum = 0;
			for(int i = 0 ; i < n ; i++) {
				arr[i] = scan.nextInt();
				sum += arr[i];
			}
//			System.out.println(sum);
			if(sum < s) System.out.println(-1);
			else if(sum == s) System.out.println(0);
			else {
				int i = 0 , j = 0;
				int total = 0;
				int cnt = 0;
				
				while(j < n) {
					total += arr[j];
					while(i < j && total > s) total -= arr[i++];
					
					if(total == s) cnt = Math.max(cnt, j - i + 1);
					
					j++;
				}
				System.out.println(n - cnt);
			}
		}
	}
}
