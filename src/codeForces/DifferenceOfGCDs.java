package codeForces;
import java.util.*;
public class DifferenceOfGCDs {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t-- > 0) {
            long n = scan.nextLong();
            long l = scan.nextLong();
            long r = scan.nextLong();

            List<Long> result = new ArrayList<>();
            boolean possible = true;

            for (long i = 1; i <= n; i++) {
                long x = ((l + i - 1) / i) * i;
                if (x > r) {
                    possible = false;
                    break;
                }
                result.add(x);
            }

            if (!possible)System.out.println("NO");
            
            else {
                System.out.println("YES");
                
                for (long num : result) System.out.print(num + " ");
                
                System.out.println();
                
            }
        }
    }
}
