package codeForces;
import java.util.*;
public class twoPermutations {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        while (t-- > 0) {
            int n = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            
            int f=0;
			if(n==a && a==b) {
				f=1;
			
			}
			int dif=n-(a+b);
			
            if ((a + b <= n && dif>1)||(f==1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scan.close();
	}
}
