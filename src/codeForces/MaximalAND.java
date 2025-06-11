package codeForces;
import java.util.*;
public class MaximalAND {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			long k = scan.nextLong();
			
			long arr[] = new long[n];
			HashMap<Integer,Integer>map = new HashMap<>();
			for(int i = 0; i < n ; i++) {
				arr[i] = scan.nextLong();
				StringBuilder s = new StringBuilder(Integer.toBinaryString((int)arr[i]));
				s.reverse();
				for(int j = 0 ; j < s.length() ; j++) if(s.charAt(j) == '1')map.put(j + 1, map.getOrDefault(j + 1, 0)+1);
			}

			int ans[] = new int[31];
			long to = k / n;
			long left = k % n;
			for(int i = 0 ; i < to && i < 31; i++) ans[i] = 1;
			
			ArrayList<Integer> l = new ArrayList<>();
			
			for(Map.Entry<Integer, Integer> m : map.entrySet()) {
				if(n - m.getValue() > 0&& n - m.getValue() <= left) l.add(m.getKey());
			}
			
			Collections.sort(l);
			
			ArrayList<Integer> l2 = new ArrayList<>();
			for(int i = l.size() - 1 ; i>= 0 ; i--) {
				if(left <= 0) break;
				if((n - map.get(l.get(i)))<=left) {
					l2.add(l.get(i));
					left -= (n - map.get(l.get(i)));
				}
			}
			
			for(int i = 0 ; i < l2.size() ; i++) {	
				ans[(int)(ans.length - l2.get(i))] = 1;
			}	
			
			long val = arr[0];
			for(int i = 1 ; i < n ; i++) val &= arr[i];
			
			String s ="";
			for(int i = 0 ; i < 31 ; i++) s += String.valueOf(ans[i]);

			System.out.println(Long.parseLong(s,2)+" "+val);
			val |= Integer.parseInt(s,2);
			
			System.out.println(val);
		}
		scan.close();
	}
}
