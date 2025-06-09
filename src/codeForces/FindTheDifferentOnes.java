package codeForces;
import java.util.*;
public class FindTheDifferentOnes {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t -- > 0) {
			int n = scan.nextInt();
			int arr[] = new int[n];
			
			for(int i = 0 ; i < n ; i++) arr[i] = scan.nextInt();
						
			int closestEle[] = new int[n];
			
			int last = arr[n-1];
			int idx = n;
			for(int i = n - 1 ; i > 0 ; i--) {
				if(arr[i] == last) {
					closestEle[i] = -1;
					idx = i + 1;
				}else {
					if(arr[i] == arr[i-1]) closestEle[i] = idx;
					else {
						closestEle[i]=idx;
						idx = i + 1;
						last = arr[i];
					}
				}
			}
			if(last != arr[0])closestEle[0] = idx;
			else closestEle[0] = -1;
//			System.out.println(Arrays.toString(closestEle));
			int q = scan.nextInt();
			
			while(q-- > 0) {
				int l = scan.nextInt();
				int r = scan.nextInt();
				
				int val = closestEle[l - 1];
				if(val > r || val == -1) System.out.println("-1 -1");
				else System.out.println((l) +" "+val);
				
			}
			System.out.println();
		}
	}
}
