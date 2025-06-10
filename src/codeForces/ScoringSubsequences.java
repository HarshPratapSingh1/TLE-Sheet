package codeForces;
import java.util.*;
public class ScoringSubsequences {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-- > 0) {
			int n = scan.nextInt();
			int arr[] = new int[n];
			
			for(int i = 0 ; i < n ; i++) arr[i] = scan.nextInt();
			
			System.out.print(1+" ");
			int Goodidx = 0;
			int cnt = 2;
			for(int i = 1 ; i < n ; i++) {
				if(cnt <= arr[Goodidx]) {
					System.out.print(((i)-Goodidx + 1)+" ");
				} else {
//					System.out.println((i)+" "+Goodidx+" "+cnt);
					while(Goodidx < n && cnt > arr[Goodidx]) {
							cnt--;
						Goodidx++;
					}
					System.out.print(((i)-Goodidx + 1)+" ");
//					if(Goodidx == 0) {
//						System.out.println(1+" ");
//					}
				}
				cnt++ ;
			}
			System.out.println();
		}
	}
}
