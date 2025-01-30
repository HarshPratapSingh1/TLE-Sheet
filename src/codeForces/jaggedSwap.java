package codeForces;
import java.util.*;
public class jaggedSwap {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-- >0) {
			int n=scan.nextInt();
			
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=scan.nextInt();
			}
			if(isSorted(arr,n))System.out.println("Yes");
			else System.out.println("No");
			
		}
		scan.close();
	}
	public static boolean isSorted(int arr[],int n) {
		boolean sorted=true;
		
		for(int i=1;i<n;i++) {
			if(arr[i-1]>arr[i]) {
				sorted=false;
				break;
			}
		}
		
		if(sorted)return true;
		
		 for (int i = 1; i < n - 1; i++) {
	            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1] &&arr[0]==1) {
	                return true;
	            }
	        }
	        return false;
	}
}
