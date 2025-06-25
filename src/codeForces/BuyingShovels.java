package codeForces;
import java.util.*;
public class BuyingShovels {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		while(t-->0) {
			long n = scan.nextLong();
			long k = scan.nextLong();
			long safe = n ;
			if(k >= n) {
				System.out.println(1);
				continue;
			}
			TreeMap<Long,Integer> map = new TreeMap<>(Collections.reverseOrder());
			for(long i = 2; i * i <= n; i++) {
		         while(n%i == 0) {
		            map.put(i, map.getOrDefault(i, 0)+1);
		            n = n/i;
		         }
		      }
		    if(n > 2) map.put(n, map.getOrDefault(n, 0)+1);
		    
//		    System.out.println(map);
		    if(map.size() == 1 && map.get(map.firstKey()) == 1) {
		    	System.out.println(n);
		    	continue;
		    }
		    
		    ArrayList<Long> l = new ArrayList<>();
		    for(Map.Entry<Long, Integer> m : map.entrySet()) {
		    	long val = m.getKey();
		    	int mul = m.getValue();
		    	
		    	while( mul > 0) {
		    		l.add(val);
		    		mul --;		
		    	}
		    }
		    HashMap<String,Long> dp = new HashMap<>(); 
		    
		    long val = findMax(l , 0 , k , 1 ,dp);
		    System.out.println(safe/val);
		}
	}
	public static long findMax(ArrayList<Long>l , int idx , long k , long pro , HashMap<String,Long> dp) {
		if(idx == l.size()) return pro;
	
		String key = idx+"|"+pro;
		if(dp.containsKey(key)) return dp.get(key);
//		if(dp[idx][(int)pro] != -1) return dp[idx][(int)pro];
		long pick = pro;
		if(l.get(idx) * pro <= k) pick = findMax(l, idx+1 , k , pro * l.get(idx) , dp);
		long not = findMax(l, idx + 1,k , pro , dp);
		
		long res = Math.max(pick, not);
		dp.put(key, res);
		return  res;
	}
}
