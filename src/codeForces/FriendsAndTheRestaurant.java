package codeForces;
import java.util.*;
public class FriendsAndTheRestaurant {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-- >0 ) {
			int n = scan.nextInt();
			long arr[] = new long[n];
			long brr[] = new long[n];
			
			for(int i = 0 ; i < n ; i++) arr[i] = scan.nextLong();
			for(int i = 0 ; i < n ; i++) brr[i] = scan.nextLong();
			
			long diff[] = new long[n];
			
			for(int i = 0 ; i < n ; i++) diff[i] = brr[i] - arr[i];
			
			Arrays.sort(diff);
//			System.out.println(Arrays.toString(diff));
			int cnt = 0;
			int i = 0 , j = n - 1;
			
//			int sum = 0;
			while(i < j) {
				long sum = diff[i] + diff[j];
				if(sum >= 0) {
//					System.out.println(arr[]);
					i++; j--;
					cnt++;
				}else i++;
			}
			System.out.println(cnt);
		}
	}
}
