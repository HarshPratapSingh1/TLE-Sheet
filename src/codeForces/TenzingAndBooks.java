package codeForces;
import java.util.*;
public class TenzingAndBooks {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			long x=scan.nextLong();
			
			Queue<Long>s1=new LinkedList<Long>();			
			Queue<Long>s2=new LinkedList<Long>();		
			Queue<Long>s3=new LinkedList<Long>();		
			

			for(int i=0;i<n;i++)s1.add(scan.nextLong());
			
			for(int i=0;i<n;i++)s2.add(scan.nextLong());
			
			for(int i=0;i<n;i++)s3.add(scan.nextLong());

			long ans=0;
			
			boolean flag=false;
			while(true) {
				int cnt=0;
				
				if(s1.size()!=0) {
					if((x|(s1.peek()))==x) {
						ans=(ans|s1.peek());
						s1.poll();
						if(ans==x) {
							flag=true;
							break;
						}
						cnt++;
					}
				}
				if(s2.size()!=0) {
					if((x|(s2.peek()))==x) {
						ans=(ans|s2.peek());
						s2.poll();
						if(ans==x) {
							flag=true;
							break;
						}
						cnt++;
					}
				}
				if(s3.size()!=0) {
					if((x|(s3.peek()))==x) {
						ans=(ans|s3.peek());
						s3.poll();
						if(ans==x) {
							flag=true;
							break;
						}
						cnt++;
					}
				}
				if(cnt==0)break;
			}
			if(x==0)flag=true;
			if(flag)System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
