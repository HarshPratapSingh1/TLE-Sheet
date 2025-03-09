package codeForces;
import java.util.*;
public class servalAndMochaArray {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-- >0) {
			
			int n=scan.nextInt();
			
			int a[]=new int[n];
			
			for(int i=0;i<n;i++)a[i]=scan.nextInt();
//			Arrays.sort(a);
			boolean possible = false;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (gcd(a[i], a[j]) <= 2) {
//                    	System.out.println(i+" "+j);
                        possible = true;
                        break;
                    }
                }
                if (possible) break;
            }

            System.out.println(possible ? "YES" : "NO");
		}
	}
	
	 private static int gcd(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }
}
