package codeForces;
import java.util.*;
public class raspberries {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		long t = scanner.nextLong();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int md = 0, even = 0;
            boolean div = false;

            for (int p = 0; p < n; p++) {
                int x = scanner.nextInt();
                x %= k;

                if (x != 0) {
                    md = Math.max(md, x);
                } else {
                    div = true;
                }

                if (x == 2) {
                    even++;
                }
            }

            if (div) {
                System.out.println("0");
            } else if (k == 4) {
                if (even >= 2) {
                    System.out.println("0");
                } else if (even >= 1 || md == 3) {
                    System.out.println("1");
                } else {
                    System.out.println("2");
                }
            } else {
                System.out.println(k - md);
            }
        }
        scanner.close();
	}
}
