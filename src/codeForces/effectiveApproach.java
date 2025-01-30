package codeForces;
import java.util.*;
public class effectiveApproach {
	public static void main(String[]args) {
		 Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        int[] a = new int[n];
	        Map<Integer, Integer> positionMap = new HashMap<>();

	        for (int i = 0; i < n; i++) {
	            a[i] = sc.nextInt();
	            positionMap.put(a[i], i + 1);
	        }

	        int m = sc.nextInt();
	        int[] b = new int[m];

	        for (int i = 0; i < m; i++) {
	            b[i] = sc.nextInt();
	        }

	        long vasyaComparisons = 0;
	        long petyaComparisons = 0;

	        for (int i = 0; i < m; i++) {
	            int position = positionMap.get(b[i]);
	            vasyaComparisons += position;
	            petyaComparisons += (n - position + 1);
	        }

	        System.out.println(vasyaComparisons + " " + petyaComparisons);
	    }
	}
