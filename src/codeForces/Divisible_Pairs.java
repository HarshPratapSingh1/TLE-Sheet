package codeForces;
import java.util.*;
public class Divisible_Pairs {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t =  scan.nextInt();
		while(t-- >0 ) {
			long n = scan.nextLong();
	        long x = scan.nextLong();
	        long y = scan.nextLong();

	        long[] v = new long[(int) n];
	        for (int i = 0; i < n; i++) {
	            v[i] = scan.nextLong();
	        }

	        Map<Long, Map<Long, Long>> mp = new HashMap<>();
	        long ans = 0;

	        for (int i = 0; i < n; i++) {
	            long a = (x - v[i] % x) % x;
	            long b = v[i] % y;

	            if (mp.containsKey(a) && mp.get(a).containsKey(b)) {
	                ans += mp.get(a).get(b);
	            }

	            long modX = v[i] % x;
	            long modY = v[i] % y;

	            mp.putIfAbsent(modX, new HashMap<>());
	            Map<Long, Long> innerMap = mp.get(modX);
	            innerMap.put(modY, innerMap.getOrDefault(modY, 0L) + 1);
	        }

	        System.out.println(ans);
	    }
	}
}
