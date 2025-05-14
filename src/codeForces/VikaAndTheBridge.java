package codeForces;
import java.util.*;
public class VikaAndTheBridge {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-- > 0) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			
			int arr[] = new int[n];
			ArrayList<ArrayList<Integer>> kCounter = new ArrayList<>();
			
			for(int i = 0 ; i < k + 1 ; i++) kCounter.add(new ArrayList<Integer>());
			
			for(int i = 1 ; i < k + 1 ; i++) kCounter.get(i).add(0);

			for(int i = 0 ; i < n ; i++) {
				arr[i] = scan.nextInt();
				kCounter.get(arr[i]).add(i+1);
			} 
			
			for(int i = 1 ; i < k + 1 ; i++) kCounter.get(i).add(n+1);
			
			int overAll = Integer.MAX_VALUE;
			
			for(int i = 1 ; i < k + 1 ;i++) {
				int max1 = 0;
				int max2 = 0;
				for(int j = 0 ; j < kCounter.get(i).size() - 1 ; j++) {
					int val = Math.abs(kCounter.get(i).get(j)- kCounter.get(i).get(j+1) + 1);
					
					if(val > max1) max1 = val ;
				}
				int maxCnt = 0;
				for(int j = 0 ; j < kCounter.get(i).size() - 1 ; j++) {
					int val = Math.abs(kCounter.get(i).get(j)- kCounter.get(i).get(j+1) + 1);
					
					if(val > max2 ) {
						
						if(max1 > val) max2 = val ;
						if(max1 == val) maxCnt++;
					}
				}
				if(maxCnt > 1) max2 = max1;
				
				overAll = Math.min(Math.max(max1/2, max2), overAll);
			}
			System.out.println(overAll);
		}
	}
}
