package codeForces;
import java.util.*;
public class White_BlackBalancedSubtrees {
	static int ans;
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		while (t-- > 0) {
			int n = scan.nextInt();
			int[] arr = new int[n - 1];

			for (int i = 0; i < n - 1; i++) arr[i] = scan.nextInt();
			String s = scan.next();

			Map<Integer, List<Integer>> adj = new HashMap<>();
			for (int i = 0; i < n - 1; i++) {
				adj.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i + 2);
			}

			ans = 0;
			dfs(1, adj, s);
			System.out.println(ans);
		}
	}

	static int[] dfs(int node, Map<Integer, List<Integer>> tree, String s) {
		int white = 0, black = 0;

		for (int child : tree.getOrDefault(node, new ArrayList<>())) {
			int[] res = dfs(child, tree, s);
			white += res[0];
			black += res[1];
		}

		if (s.charAt(node - 1) == 'W') white++;
		else black++;

		if (white == black) ans++;

		return new int[]{white, black};
	}
}