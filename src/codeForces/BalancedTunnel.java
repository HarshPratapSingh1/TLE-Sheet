package codeForces;
import java.util.*;
public class BalancedTunnel {
	public static void main (String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		int brr[] = new int[n];
		int c[] = new int[n];
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < n ; i++) arr[i] = scan.nextInt();
		
		for(int i = 0 ; i < n ; i++) brr[i] = scan.nextInt();
		
		for(int i = 0 ; i < n ; i++) map.put(brr[i], i);
		
		for(int i = 0 ; i < n ; i++) c[i] = map.get(arr[i]) + 1;
		
				
		int max = c[0] ;
		int cnt = 0;
		for(int i = 1 ; i < n ; i++) {
			if(max > c[i])cnt++;
			max = Math.max(max, c[i]);
		}
		
		System.out.println(cnt);
	}
}
