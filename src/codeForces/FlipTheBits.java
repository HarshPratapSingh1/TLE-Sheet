package codeForces;
import java.util.*;
public class FlipTheBits {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			String a = scan.next();
			String b = scan.next();
			
			int one = 0, zero = 0;
	        List<int[]> segments = new ArrayList<>();
	        int j = 0;

	        for (int i = 0; i < n; i++) {
	            if (a.charAt(i) == '1') one++;
	            else zero++;

	            if (one == zero) {
	                segments.add(new int[]{j, i});
	                j = i + 1;
	            }
	        }

	        StringBuilder aBuilder = new StringBuilder(a);

	        for (int[] seg : segments) {
	            int start = seg[0];
	            int end = seg[1];

	            if (a.charAt(start) == b.charAt(start)) {
	                continue;
	            } else {
	                for (int k = start; k <= end; k++) {
	                    char ch = aBuilder.charAt(k);
	                    aBuilder.setCharAt(k, ch == '0' ? '1' : '0');
	                }
	            }
	        }

	        if (aBuilder.toString().equals(b)) {
	            System.out.println("YES");
	        } else {
	            System.out.println("NO");
	        }
	    
		}
	}
}
