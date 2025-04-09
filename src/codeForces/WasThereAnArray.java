package codeForces;
import java.util.*;
public class WasThereAnArray {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] b = new int[n - 2];
            for (int i = 0; i < n - 2; i++) {
                b[i] = sc.nextInt();
            }

            boolean valid = true;
            for (int i = 1; i < b.length - 1; i++) {
                if (b[i - 1] == 1 && b[i] == 0 && b[i + 1] == 1) {
                    valid = false;
                    break;
                }
            }

            System.out.println(valid ? "YES" : "NO");
        }
    }
}