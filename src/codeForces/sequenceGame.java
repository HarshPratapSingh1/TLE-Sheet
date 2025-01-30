package codeForces;
import java.util.*;
public class sequenceGame {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-- >0) {
			int n=scan.nextInt();
			List<Long> arr = new ArrayList<>(n);
	        for (int i = 0; i < n; i++) {
	            arr.add(scan.nextLong());
	        }

	        Collections.sort(arr);

	        if (arr.get(n - 1).equals(arr.get(0))) {
	            System.out.println(-1);
	            return;
	        } else {
	            int itr = 0;
	            while (arr.get(itr).equals(arr.get(0))) {
	                itr++;
	            }

	            System.out.println(itr + " " + (n - itr));
	            for (int i = 0; i < itr; i++) {
	                System.out.print(arr.get(i) + " ");
	            }
	            System.out.println();
	            for (int i = itr; i < n; i++) {
	                System.out.print(arr.get(i) + " ");
	            }
	            System.out.println();
	        }
	}}
}
