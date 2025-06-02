package codeForces;
import java.util.*;
public class Same_Differences {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			int arr[] = new int[n];
			
			for(int i = 0 ; i < n ; i++) arr[i] = scan.nextInt();
			
			HashMap<Integer,Integer> map = new HashMap<>();
			
			for(int i = 0 ; i < n ; i++) map.put(arr[i]-i, map.getOrDefault(arr[i]-i, 0)+1);
			
			long ans = 0;
			for(Map.Entry<Integer, Integer> m : map.entrySet()) {
				int val = m.getValue();
				if(val > 1) {
					int max = Math.max(val-2, 2);
					int min = Math.min(val-2, 2);
					if (min <= 0) min = 1;
					if(max <= 0) max = 1;
					
					long cnt = 1;
					for(int i = val ; i > max ; i--) cnt *= i;
					
					cnt /= min;
					ans += cnt;
				}
			}
			System.out.println(ans);
		}
	}
}
