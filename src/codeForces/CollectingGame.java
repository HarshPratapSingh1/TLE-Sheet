package codeForces;
import java.util.*;
public class CollectingGame {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while (t-- > 0) {
	        long n = sc.nextLong();
	        ArrayList<Pair> a = new ArrayList<>();
	        long[] p = new long[(int)n];
	        for (long i = 0; i < n; i++) {
	            long val = sc.nextLong();
	            a.add(new Pair(val, i));
	        }
	        
	        Collections.sort(a, Comparator.comparingLong(pair -> pair.first));
	        
	        for (long i = 0; i < n; i++) {
	            if (i > 0) p[(int)i] = a.get((int)i).first + p[(int)(i - 1)];
	            else p[(int)i] = a.get((int)i).first;
	        }
	        
	        long[] ans = new long[(int)n];
	        
	        for (long i = 0; i < n - 1; i++) {
	            if (p[(int)i] >= a.get((int)i + 1).first) {
	                ans[(int)i] = 1;
	            }
	        }
	        
	        for (long i = n - 1; i >= 0; i--) {
	            if (ans[(int)i] == 1 && i < n - 1) {
	                ans[(int)i] += ans[(int)(i + 1)];
	            }
	            a.get((int)i).first = 0;
	        }
	        
	        for (long i = 0; i < n; i++) {
	            a.get((int)i).first = i - 1;
	            a.get((int)i).first += ans[(int)i] + 1;
	        }
	        
	        Collections.sort(a, (pair1, pair2) -> Long.compare(pair1.second, pair2.second));
	        
	        for (Pair pair : a) {
	            System.out.print(pair.first + " ");
	        }
	        System.out.println();
	    }
		
	}
	}

class Pair {
	long first, second;

	Pair(long first, long second) {
	    this.first = first;
	    this.second = second;
	}
}