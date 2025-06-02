package codeForces;
import java.util.*;
public class AND_0_Sum_Big {
	static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();

            long ans = n % MOD;
            
            for(int i = 0 ; i < k - 1 ; i++) ans = (ans * n) % MOD;
            
            
            System.out.println(ans);
        }
    }
}
