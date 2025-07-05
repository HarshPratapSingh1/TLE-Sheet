package codeForces;
import java.util.*;
public class MostSocially_distancedSubsequence {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			int arr[] = new int[n];
			
			for(int i = 0 ; i < n ; i++) arr[i] = scan.nextInt();
			
			int start = arr[0];
			
			boolean isAss = arr[1] > arr[0]; //false means the sequence in decreasing
			ArrayList<Integer> l = new ArrayList<>();
			l.add(0);
			for(int i = 1 ; i < n ;i++) {
				if(i != 1 &&!isAss && arr[i] > arr[i - 1] ) {
					l.add(i-1);
//					System.out.println(i);
					isAss = true;
				}
				if(i != 1 && isAss && arr[i] < arr[i - 1] ) {
					l.add(i-1);
//					System.out.println(i);
					isAss = false;
				}
			}
			if(l.get(l.size() - 1) != n - 1)l.add(n - 1);
			
			System.out.println(l.size());
			for(int it: l )System.out.print(arr[it]+" ");
			System.out.println();
		}
	}
}
