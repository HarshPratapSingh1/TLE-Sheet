package codeForces;
import java.util.*;
public class arrayMerging {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
 
        while (q-- > 0) {
            int n = scan.nextInt();
 
            int[] a = new int[n + 1];
            int[] b = new int[n + 1];
 
            for (int i = 1; i <= n; i++) {
                a[i] = scan.nextInt();
            }
 
            for (int i = 1; i <= n; i++) {
                b[i] = scan.nextInt();
            }
 
            int[] fa = new int[2 * n + 1];
            int[] fb = new int[2 * n + 1];
 
            int p = 1;
            for (int i = 2; i <= n; i++) {
                if (a[i] != a[i - 1]) {
                    fa[a[i - 1]] = Math.max(fa[a[i - 1]], i - p);
                    p = i;
                }
            }
            fa[a[n]] = Math.max(fa[a[n]], n - p + 1);
 
            p = 1;
            for (int i = 2; i <= n; i++) {
                if (b[i] != b[i - 1]) {
                    fb[b[i - 1]] = Math.max(fb[b[i - 1]], i - p);
                    p = i;
                }
            }
            fb[b[n]] = Math.max(fb[b[n]], n - p + 1);
 
            int ans = 0;
            for (int i = 1; i <= 2 * n; i++) {
                ans = Math.max(ans, fa[i] + fb[i]);
            }
 
            System.out.println(ans);
        }
 
        scan.close();
    }
}