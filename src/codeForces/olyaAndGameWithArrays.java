package codeForces;
import java.util.*;
public class olyaAndGameWithArrays {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			long minVal[][]=new long[2][n];
			int idx=-1;
			long GlobMin=Long.MAX_VALUE;
			long GlobSMin=Long.MAX_VALUE;
			
			for(int i=0;i<n;i++) {
				long m=scan.nextLong();
				long min=Long.MAX_VALUE;
				long sMin=Long.MAX_VALUE;
				
				for(int j=0;j<m;j++) {
					long x=scan.nextLong();
					if(x<min) {
						sMin=min;
						min=x;
					}else if(x<sMin)sMin=x;
					
				}
				
				minVal[0][i]=min;
				minVal[1][i]=sMin;
				
				if(min<GlobMin){
					GlobMin=min;
				}
				if(sMin<GlobSMin) {
					GlobSMin=sMin;
					idx=i;
				}
			}
			long sum=0;
			
			for(int i=0;i<n;i++) {
				if(i!=idx) {
					sum+=minVal[1][i];
				}else {
					sum+=GlobMin;
				}
			}
			System.out.println(sum);
		}
	}
}
