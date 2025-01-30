package codeForces;
import java.util.*;
public class unitedWeStand {
	public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        List<Integer> inp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            inp.add(scanner.nextInt());
        }
        Collections.sort(inp);
        if (inp.get(inp.size() - 1) == inp.get(0)) {
            System.out.println("-1");
            return;
        }
        else {
            int it = 0;
            while (inp.get(it) == inp.get(0)) it++;
            System.out.println(it + " " + (n - it));
            for (int j = 0; j < it; j++) {
                System.out.print(inp.get(j) + " ");
            }
            for (int j = it; j < n; j++) {
                System.out.print(inp.get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve();
        }
    }
	    }