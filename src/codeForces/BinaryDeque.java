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
			
			if(sum < s) System.out.println(-1);
			else if(sum == s) System.out.println(0);
			else {
				int i = 0 , j = n - 1 ;
				int totalSum = 0 , cnt = 0;
				while(i < j) {
					if(sum == totalSum) {
						cnt = i + (n - j);
						break;
					}
					if(arr[i] == 1) {
						totalSum += arr[i];
						i++;
					}
					if(arr[j] == 1) {
						totalSum += arr[j];
						j--;
					}else {i++ ; j--;}
				}
				System.out.println(cnt);
			}
		}
	}
}
