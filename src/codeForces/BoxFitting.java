package codeForces;
import java.util.*;
public class BoxFitting {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			long w = scan.nextLong();
			
			ArrayList<Long> l = new ArrayList<>();
			
			for(int i = 0 ; i < n ; i++) l.add(scan.nextLong());
			
			Collections.sort(l);
			int cnt = 0;
			
			while(l.size() > 0) {
				int j = l.size() - 1;
				long sum = l.get(j);
				long dif = w - sum;
				l.remove(j);
				while(l.size() > 0 && dif > 0) {
					int val = binary(l, dif);
					if(val < 0)break;
					dif -= l.get(val);
					l.remove(val);
				}
				cnt++;
			}
			System.out.println(cnt);
			
		}
		scan.close();
	}
	public static int binary(ArrayList<Long> li , long val) {
		int l = 0 , r = li.size() - 1;
		int mid = 0;
		int ans = -1;
		
		while(l <= r) {
			mid = l + (r - l) / 2;
			if(li.get(mid) <= val) {
				ans = mid;
				l = mid + 1;
			}else r = mid - 1;
		}
		return ans;
	}
}
