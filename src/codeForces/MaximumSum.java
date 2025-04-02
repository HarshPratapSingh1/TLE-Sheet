package codeForces;
import java.util.*;
public class MaximumSum {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			long k=scan.nextLong();
			
			long arr[]=new long[n+1];
			
			long sum=0;
			
			for(int i=0;i<n;i++)arr[i]=scan.nextLong();
			
			
			Arrays.sort(arr);
						
			long prefix[]=prefixSum(arr);
//			System.out.println(Arrays.toString(arr));
			for(int o=0;o<=k;o++) {
				long val=prefix[(int)n-o]-prefix[2*(int)(k-o)];
//				System.out.println(val+" "+sum);
				sum=Math.max(val, sum);
			}
			
			System.out.println(sum);
		}
	}
	
	public static long[] prefixSum(long[] arr) {
        long[] prefixSumArray = new long[arr.length];
        prefixSumArray[0] = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            prefixSumArray[i] = prefixSumArray[i - 1] + arr[i];
        }
        
        return prefixSumArray;
    }

}
