package codeForces;
import java.util.*;
public class GardenerAndTheArray {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-- > 0) {
			int n = scan.nextInt();
			
			HashMap<Integer,Integer>map = new HashMap<>();
			ArrayList<ArrayList<Integer>> l = new ArrayList<>();
			int idx = 0;
			while(n -- > 0) {
				int k = scan.nextInt();
				l.add(new ArrayList<>());
				for(int i = 0 ; i < k ; i++) {
					int val = scan.nextInt();
					l.get(idx).add(val);
					map.put(val, map.getOrDefault(val, 0)+1);
				}
				idx++;
			}
			boolean f = false;
			for(int i = 0 ; i < l.size() ; i++) {
				boolean flag = false;
				for(int  j = 0 ; j < l.get(i).size() ; j++) {
					if(map.get(l.get(i).get(j))>1)continue;
					else {
						flag = true;
						break;
					}
				}
				if(!flag) {
					f = true;
					break;
				}
			}
			System.out.println(f?"YES":"NO");
		}
	}
}
