package codeForces;
import java.util.*;
public class virus {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			long n = scan.nextLong();
			int m = scan.nextInt();
			
			long arr[] = new long[m];
			
			for(int i = 0 ; i < m ; i++) arr[i] = scan.nextLong();
			
			Arrays.sort(arr);
			ArrayList<Long> diff = new ArrayList<>();
			
			for(int i = 1 ; i < m ; i++)diff.add(arr[i]-arr[i-1] - 1);
			
			long cnt = 0;
			if(arr[0] - 1 > 0) cnt += arr[0] - 1;
			if(n - arr[m - 1] > 0) cnt += n - arr[m - 1];
			
			if(cnt > 0) diff.add(cnt);
			
			Collections.sort(diff);
			Collections.reverse(diff);
			
			cnt = 0;
			long ans = 0;
			for(int i = 0 ; i < diff.size() ; i++) {
				if(cnt * 2 >= diff.get(i)) break;
				else {
					ans += ((diff.get(i) - (cnt * 2 + 1)) == 0 ? 1 :diff.get(i) - (cnt * 2 + 1));
					cnt += 2;
				}
//				System.out.println(ans+" "+cnt);
			}
//			System.out.println(diff);
			System.out.println(n - ans);
		}
	}
}
