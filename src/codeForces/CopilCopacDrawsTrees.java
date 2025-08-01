package codeForces;

import java.util.*;

public class CopilCopacDrawsTrees {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			
			ArrayList<int[]> l = new ArrayList<>();
			
			for(int i = 0 ; i < n - 1 ; i++) {
				int u = scan.nextInt() - 1, v = scan.nextInt() - 1;
				l.add(new int[] {u,v});
			}
			boolean drawn [] = new boolean [n];
			
			ArrayList<Set<Integer>> pending = new ArrayList<>();
			
			for(int i = 0 ; i < n ; i++) pending.add(new HashSet<>());
			
			Queue<Pair> q = new LinkedList<>();
			for(int i = 0 ; i < l.size() ; i++) {
				int x = l.get(i)[0];
				int y = l.get(i)[1];
				
				pending.get(x).add(i);
				pending.get(y).add(i);
				
				if(x == 0 || y == 0) {
					q.add(new Pair(i,1));
				}
			}			
			
			int max = 0;
			
			drawn[0] = true;
			
			while(!q.isEmpty()) {
				Pair p = q.poll();
				
				int idx = (int)p.first;
				int dist = (int)p.second;
				
				int u = l.get(idx)[0];
				int v = l.get(idx)[1];
				
				int val = drawn[u] ? v : u;
				
				if(drawn[val]) continue;
				
				max = Math.max(max, dist);
				drawn[val] = true;
				
				for(int it : pending.get(val)) {
					
					if(it < idx) q.add(new Pair(it,dist+1));
					
					else q.add(new Pair(it,dist));
				}
				
			}
			
			System.out.println(max);
		}
	}
}
