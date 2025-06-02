package codeForces;
import java.util.*;
public class Matryoshkas {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
            TreeMap<Long, Integer> map = new TreeMap<>();

            for (int i = 0; i < n; i++) {
                long val = scan.nextLong();
                map.put(val, map.getOrDefault(val, 0) + 1);
            }

            int cnt = 0;

            while(!map.isEmpty()) {
            	long cur = map.firstKey();
            	
            	while(true) {
            		int val = map.get(cur);
            		if(val == 1)map.remove(cur);
            		else map.put(cur, val - 1);
            		
            		if(!map.containsKey(cur+1))break;
            		cur++;
            	}
            	cnt++;
            }

            System.out.println(cnt);
        }

        scan.close();
		
	}
}
