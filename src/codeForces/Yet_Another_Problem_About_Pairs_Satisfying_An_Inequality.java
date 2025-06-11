package codeForces;
import java.util.*;
public class Yet_Another_Problem_About_Pairs_Satisfying_An_Inequality {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			long arr[] = new long[n];
			
			for(int i = 0 ; i < n ; i++) arr[i] = scan.nextLong();
			
			ArrayList<Pair> l = new ArrayList<>();
			ArrayList<Long> search = new ArrayList<>();
			for(int i = 0 ; i < n ; i ++) {
				if(arr[i] < (i + 1)) {
					l.add(new Pair(arr[i],i+1));
					search.add(arr[i]);
				}
			}
			Collections.sort(l,(x,y)->Long.compare(x.first, y.first));
			
			Collections.sort(search);
			long ans = 0;
//			System.out.println(search);
//			print(l);
			for(int i = 0 ; i < l.size() ; i++) {
				long val = l.get(i).second;
				int idx = binarySearch(search, val);
				if(idx != -1)ans += search.size() - idx;
			}
			System.out.println(ans);
			
		}
	}

	public static int binarySearch(ArrayList<Long> li , long val) {
		int l = 0 , r = li.size() - 1;
		int ans = -1;
		while(l <= r) {
			int mid = l +(r - l) / 2;
			if(li.get(mid) <= val) {
				l = mid + 1;
			}else {
				ans = mid;
				r = mid - 1;
			}
		}
		return ans;
	}
}
