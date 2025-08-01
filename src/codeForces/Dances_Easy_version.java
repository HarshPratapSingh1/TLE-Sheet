package codeForces;

import java.util.*;

public class Dances_Easy_version {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			//initialization
			int n = scan.nextInt();
			int m = scan.nextInt();
			
			long arr[] = new long[n];
			long brr[] = new long[n];
			
			//input
			arr[0] = m;
			for(int i = 1 ; i < n ; i++) arr[i] = scan.nextLong();
			for(int i = 0 ; i < n ; i++) brr[i] = scan.nextLong();
			
			
			//Actual code
			
			//sort Array arr:
			Arrays.sort(arr);
			ArrayList<Integer> spaceLeft = new ArrayList<>();
			
			for(int i = 0 ; i < n ; i++) spaceLeft.add(i);
			for(int i = 0 ; i < n ; i++) {
				int idx = binarySearch(arr, brr[i]);
//				System.out.println(idx);
				if(idx != -1) {
					int getIdx = GetIdx(spaceLeft,idx);
//					System.out.println(getIdx);
					if(getIdx != -1) spaceLeft.remove(getIdx);
				}
//				System.out.println("---------------------------");
			}
			System.out.println(spaceLeft.size());
		}
	}
	public static int GetIdx(ArrayList<Integer> spaceLeft , int val) {
		int l = 0 ;
		int r = spaceLeft.size() - 1;
		int ans = -1;
		while(l <= r) {
			int mid = l + (r - l) / 2;
			if(spaceLeft.get(mid) <= val) {
				ans = mid;
				l = mid + 1;
			}else r = mid - 1;
		}
		
		return ans;
	}
	public static int binarySearch(long arr[],long val) {
		int l = 0 ;
		int r = arr.length - 1;
		int ans = -1;
		while(l <= r) {
			int mid = l + (r - l) / 2;
			if(arr[mid] < val) {
				ans = mid;
				l = mid + 1;
			}else r = mid - 1;
		}
		
		return ans;
	}
}
