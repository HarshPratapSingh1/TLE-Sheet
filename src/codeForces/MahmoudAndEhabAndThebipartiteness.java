package codeForces;
import java.util.*;
public class MahmoudAndEhabAndThebipartiteness {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i <= n; i++) adj.add(new ArrayList<>());

		for (int i = 0; i < n - 1; i++) {
			int u = scan.nextInt();
			int v = scan.nextInt();
			adj.get(u).add(v);
			adj.get(v).add(u);
		}

		int[] color = new int[n + 1];
		Arrays.fill(color, 0);
		int[] count = new int[2];

		dfs(1, 1, color, count, adj);

		long black = count[0], white = count[1];
		long totalPairs = black * white;
		long ans = totalPairs - (n - 1);
		System.out.println(ans);
	}

	static void dfs(int node, int c, int[] color, int[] count, ArrayList<ArrayList<Integer>> adj) {
		color[node] = c;
		if (c == 1) count[0]++;
		else count[1]++;

		for (int nei : adj.get(node)) {
			if (color[nei] == 0) {
				dfs(nei, 3 - c, color, count, adj);
			}
		}
	}
}