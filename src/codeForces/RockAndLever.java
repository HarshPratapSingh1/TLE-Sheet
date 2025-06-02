package codeForces;
import java.util.*;
public class RockAndLever {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			long arr[]=new long[n];
			
			for(int i = 0 ; i < n ; i++) arr[i] = scan.nextLong();
			
//			System.out.println(Integer.highestOneBit(7));
			
			HashMap<Long,Integer> map = new HashMap<>();
			for(int i = 0 ; i < n ; i++) map.put(Long.highestOneBit(arr[i]),map.getOrDefault(Long.highestOneBit(arr[i]), 0)+1);
			
			long ans = 0;
			
			for(Map.Entry<Long, Integer> m : map.entrySet()) {
				long cnt = m.getValue();
				
				if(cnt < 2)continue;
				ans += (cnt*(cnt-1)/2);
			}
			System.out.println(ans);
		}
	}
}
