package codeForces;
import java.util.*;
public class goodArray {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		long arr[] = new long[n];
		HashMap<Long,ArrayList<Integer>>map = new HashMap<>();
		
		long sum = 0;
		for(int i = 0 ; i < n ; i++) {
			arr[i] = scan.nextLong();
			sum += arr[i];
			if(!map.containsKey(arr[i]))map.put(arr[i],new ArrayList<Integer>());
			map.get(arr[i]).add(i);
		}
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		for(int i = 0 ; i < n ; i++) {
			long val = sum - arr[i];
			if(val % 2 == 1) continue;
			else val /= 2;
			if(map.containsKey(val)) {
				if(val == arr[i] && map.get(val).size() == 1) continue;
				else ans.add(i + 1);
			}
		}
		System.out.println(ans.size());
		for(int it:ans) System.out.print((it)+" ");
		System.out.println();
		
	}
}
