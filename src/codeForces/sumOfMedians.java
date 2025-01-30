package codeForces;
import java.util.*;
public class sumOfMedians {
	static int N=200100;
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			long k=scan.nextLong();
			long n=scan.nextLong();
			
			long arr[]=new long[N];
			
			for (int i = 1; i <= n * k; i++) {
                arr[i] = scan.nextLong();
            }

            long x = (k + 1) / 2 - 1;
            x = k - x;
//            System.out.println(x);
            long z = n * k + 1;
//            System.out.println(z);
            long ans = 0;

            while (n-- > 0) {
                z -= x;
               
                if (z <= 0) break;
//                System.out.println(z+" "+ arr[(int) z]);
                ans += arr[(int) z];  // Sum up the values at position z
            }

			System.out.println(ans);
		}
	}
}
