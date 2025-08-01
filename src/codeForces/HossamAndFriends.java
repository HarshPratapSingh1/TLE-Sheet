package codeForces;
import java.util.*;

public class HossamAndFriends {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		
		while(t-->0) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			
			long arr[][] = new long[m][2];
			for(int i = 0 ; i < m ; i++) {
				arr[i][0] = scan.nextInt();
				arr[i][1] = scan.nextInt();
			}
			
			HashMap<Long,PriorityQueue<Long>> map = new HashMap<>();
			
			for(long i = 1 ; i <= n ; i++) map.put(i, new PriorityQueue<Long>(Collections.reverseOrder()));
			
			for(int i = 0; i < m ; i++) {
				long val = Math.max(arr[i][0], arr[i][1]);
				map.get(val).add(Math.min(arr[i][0], arr[i][1]));
			}
			
			
			long ans = 0;
			long max = 0;
			for(long i = 1 ; i <= n ; i++) {
				PriorityQueue<Long> pq = map.get(i);
				long val = pq.size() > 0 ? pq.poll() : 0;
				max = Math.max(max, val);
				
				ans += i - max;
			}
			System.out.println(ans);
		}
	}
}
