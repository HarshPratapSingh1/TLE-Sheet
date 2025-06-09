package codeForces;
import java.util.*;
public class MakeItAlternating {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int MOD = 998244353;
		while(t-->0) {
			String s = scan.next();
			
			long ans = 0;
			long cnt = 0;
			boolean flag = false;
			long fac = 1;
			for(int i = 1 ; i < s.length() ; i++){
				if(s.charAt(i) == s.charAt(i - 1)) {
//					System.out.println(i);
					cnt++;
					flag = true;
				}else {
					ans = (ans + cnt) % MOD;
					fac = (fac * (cnt > 0 ? (cnt + 1) :1)) % MOD;
//					System.out.println(cnt);
					cnt = 0;
					flag = false;
				}
			}
//			System.out.println(ans +" "+fac);
			if(flag) {
				ans = (ans + cnt) % MOD;
				fac = (fac * (cnt > 0 ? (cnt + 1) :1)) % MOD;
			}
			
			fac = (fac *solve(ans,MOD)) % MOD;
			System.out.println(ans +" "+fac);
		}
	}
	public static long solve(long n , int MOD) {
		long ans = 1;
		
		for(long i = n ; i > 1 ; i--) ans = (ans *i)%MOD;
		return ans;
	}
}
