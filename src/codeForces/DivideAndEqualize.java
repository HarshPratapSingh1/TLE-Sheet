package codeForces;
import java.util.*;
public class DivideAndEqualize {
	static HashMap<Integer,Integer> map ;
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			int arr[] = new int[n];
			
			for(int i = 0 ; i < n ; i++) arr[i] = scan.nextInt();
			
			map = new HashMap<>();
			for(int it : arr) {
				primeFactors(it);
			}
//			System.out.println(map);
			
			boolean flag = false;
			for(Map.Entry<Integer, Integer> m : map.entrySet()) {
				if(m.getValue() % n != 0) {
					flag = true;
					break;
				}
			}
			
			System.out.println(!flag?"YES":"NO");
		}
	}
	 static void primeFactors(int n) {

	        while (n % 2 == 0) {

	            map.put(2, map.getOrDefault(2, 0)+1);
	            n /= 2;
	        }

	
	        for (int i = 3; i * i <= n; i += 2) {
	            while (n % i == 0) {

	            	map.put(i, map.getOrDefault(i, 0)+1);
	                n /= i;
	            }
	        }

	        if (n > 2)
	        	map.put(n, map.getOrDefault(n, 0)+1);
	    }
}
