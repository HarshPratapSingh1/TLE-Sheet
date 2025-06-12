package codeForces;
import java.util.*;
public class ChatBan {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			long k = scan.nextLong();
			long x = scan.nextLong();
						
			long l = 1;
			long r = k;
			long ans = 0;
			while(l <= r) {
				long mid = l + (r - l) / 2;
				long sum = (mid * ( mid + 1 ) ) / 2;
				if(sum >= x) {
					ans = mid;
					r = mid - 1;
				}else l = mid + 1;
			}
//			System.out.println(ans);
			if(ans == 0) ans += k;
//			System.out.println(ans);
			 l = 1;
			 r = k - 1;
			 x = x - ((ans * (ans + 1))/2);
			 
			 
//			 System.out.println(x);
			 if(x <= 0) {
				 System.out.println(ans);
				 continue;
			 }
//			 System.out.println("n");
			long ans1 = 0;
			
			while(l <= r) {
				long mid = l + (r - l) / 2;
				long sum = mid * (2 * (k-1) - mid + 1) / 2;
				if(sum >= x) {
//					System.out.println();
					ans1 = mid;
					r = mid - 1;
				}else l = mid + 1;
			}
			if(ans1 == 0) ans += (k - 1);
			
			System.out.println((ans+ans1));
		}
	}
	public static boolean isPosi(long n , long x) {
		return ( n * (n + 1) / 2 ) <= x;
	}
}
