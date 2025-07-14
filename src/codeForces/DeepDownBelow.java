package codeForces;
import java.util.*;
public class DeepDownBelow {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			ArrayList<Pair> li = new ArrayList<>();
			
			for(int i = 0 ; i < n ; i++) {
				int val = scan.nextInt();
				long max = 0;
				for(int j = 0 ; j < val ; j++) max = Math.max(max, scan.nextLong() - j);
				max += 1;
				li.add(new Pair(max,val));
			}
			
			Collections.sort(li,(x,y)->Long.compare(x.first, y.first));
			
			
			long l = 1 , r = li.get(li.size()-1).first;
			long ans = 0;
			
			while(l <= r) {
				long mid = l + (r - l) /2;
				if(isPosi(mid,li)) {
					r = mid - 1;
				}else {
					ans = mid;
					l = mid + 1;
				}
			}
			System.out.println(ans);
			
		}
	}
	public static boolean isPosi(long mid,ArrayList<Pair> l) {
		
		for(Pair p : l) {
			if(p.first >= mid) return false;
			mid += p.second;
		}
		
		return true;
	}
}
