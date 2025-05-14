package codeForces;
import java.util.*;
public class SubtractOperation {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			long k=scan.nextLong();
			
			long arr[]=new long[n];
			
			for(int i=0;i<n;i++)arr[i]=scan.nextLong();
			
			Arrays.sort(arr);
			
			
//			System.out.println(Arrays.toString(arr));
			boolean flag=false;
			for(int i=0;i<n;i++) {
				long  val=arr[i]+k;
				if (Arrays.binarySearch(arr, i + 1, n, val) >= 0) {
                    System.out.println("YES");
                    flag = true;
                    break;
                }
			}
			if(!flag)System.out.println("NO");
		}
	}
}
