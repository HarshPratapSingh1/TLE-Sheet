package codeForces;
import java.util.*;
public class servalAndMochaArray {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-- >0) {
			
			int n=scan.nextInt();
			
			int a[]=new int[n];
			
			for(int i=0;i<n;i++)a[i]=scan.nextInt();
			
			int cnt=0;
			for(int i=1;i<n;i++) {
				if(check(a,i,n)) {
				cnt++;
				}
			}
//			System.out.println(cnt);
			if(cnt==n-1)System.out.println("YES");
			else System.out.println("No");
		}
	}
	public static boolean check(int a[],int end,int len) {
		
		 int result = a[0];
	        for (int num : a) {
	        	end--;
	            result = gcd(result, num);
	            System.out.println(result);
	            if(end==0)break;
	        }
	        
	     if(result<=len)return true;   
		
	     else	return false;
	}
	 private static int gcd(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }
}
