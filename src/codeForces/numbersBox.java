package codeForces;
import java.util.*;
public class numbersBox {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			int m=scan.nextInt();
			int arr[][]=new int[n][m];
			
			int Ncnt=0;
			int PosiCnt=0;
			int zcnt=0;
			int Nmax=Integer.MIN_VALUE;
			int Pmin=Integer.MAX_VALUE;
			int sum=0;
			for(int i=0;i<n;i++)
				for(int j=0;j<m;j++) {
					arr[i][j]=scan.nextInt();
					if(arr[i][j]<0)Ncnt++;
					else if(arr[i][j]>0)PosiCnt++;
					else zcnt++;
					
					if(arr[i][j]<0) {
						sum+=(arr[i][j]*-1);
						Nmax=Math.max(Nmax, arr[i][j]);
					}else {
						sum+=arr[i][j];
						Pmin=Math.min(Pmin, arr[i][j]);
					}
				}
//			System.out.println(sum+" "+Nmax+" "+Pmin);
			int max=(Nmax*(-1))>Pmin?Pmin:(Nmax*(-1));
//			System.out.println(PosiCnt+" "+Ncnt+" "+zcnt);
			if(zcnt>0)System.out.println(sum);
			else if(Ncnt%2==0)System.out.println(sum);
			else System.out.println(sum-(2*max));
			
		}
	}
}
