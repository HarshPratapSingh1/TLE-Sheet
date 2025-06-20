package codeForces;
import java.util.*;
public class BalancedTunnel {
	public static void main (String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		int brr[] = new int[n];
		
		
		for(int i = 0 ; i < n ; i++) arr[i] = scan.nextInt();
		
		
		for(int i = 0 ; i < n ; i++) brr[i] = scan.nextInt();
		
		long ans = 0 , cnt = 0;
		HashSet<Integer> set = new HashSet<>();
		
		for(int i = 0 ; i < n ; i++) {
			if(set.contains(brr[i])) continue;
			
			while(arr[(int)cnt] != brr[i]) {
				set.add(arr[(int)cnt]);
				ans++;
				cnt++;
			}
			cnt++;
		}
		System.out.println(ans);
	}
}
