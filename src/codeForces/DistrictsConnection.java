package codeForces;

import java.util.*;

public class DistrictsConnection {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			long arr[]=new long[n];
			
			for(int i = 0 ; i < n ; i++) arr[i] = scan.nextLong();
			
			ArrayList<ArrayList<Integer>> l = new ArrayList<>();
			
			int idx = -1;
			for(int i = 1 ; i < n ; i++) {
				if(arr[i]!=arr[0]) {
					idx = i;
					l.add(new ArrayList<>(Arrays.asList(0,i)));
				}
			}
			if(idx == -1)System.out.println("No");
			else {
				for(int i = 1 ; i < n ; i++) {
					if(arr[i] == arr[0])l.add(new ArrayList<>(Arrays.asList(idx,i)));
				}
				System.out.println("YES");
				for(ArrayList<Integer>it:l)System.out.println((it.get(0)+1)+" "+(it.get(1)+1));
			}
		}
	}
}
