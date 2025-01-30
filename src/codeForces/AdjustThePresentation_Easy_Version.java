package codeForces;
import java.util.*;
public class AdjustThePresentation_Easy_Version {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			int m=scan.nextInt();
			int q=scan.nextInt();
			
		
			int a[]=new int[n];
			int b[]=new int[m];
			for(int i=0;i<n;i++)a[i]=scan.nextInt();
			for(int j=0;j<m;j++) b[j]=scan.nextInt();
				
//			System.out.println(s);
			int vis[]=new int[n];
			
			for(int i=0;i<n;i++) vis[i]=-1;
			
//			System.out.println(Arrays.toString(vis));
			int i=0,j=0;
			boolean flag=true;
			
			
			for(;j<b.length;j++) {
				if(i==n) {
					flag=false;
					System.out.println("YA");
					break;
				}
				if(a[i]==b[j]) {
					
					vis[a[i]-1]=1;
					continue;
				}else {
					if(vis[b[j]-1]==1)continue;
					if(vis[a[i]-1]==1) {						
						i++;
						j--;
					}
					else {
						flag=false;
						System.out.println("TIDAK");
						break;
					}
				}
			}
			if(flag)System.out.println("YA");
		}
	}
}
