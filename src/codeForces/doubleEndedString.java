package codeForces;
import java.util.*;
public class doubleEndedString {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			String a=scan.next();
			String b=scan.next();
			
			ArrayList<String>l1 =new ArrayList<>();
			ArrayList<String>l2 =new ArrayList<>();
			
			for(int i=0;i<a.length();i++) {
				for(int j=i;j<a.length();j++) {
					l1.add(a.substring(i, j+1));
				}
			}
			for(int i=0;i<b.length();i++) {
				for(int j=i;j<b.length();j++) {
					l2.add(b.substring(i, j+1));
				}
			}
			int max=0;
			
			for(int i=0;i<l1.size();i++) {
				if(l2.contains(l1.get(i)))max=Math.max(max, l1.get(i).length());
			}
			
			int ans=a.length()-max;
			ans+=b.length()-max;
			System.out.println(ans);
		}
	}
}
