package codeForces;
import java.util.*;
public class trafficLight {
	public static void main(String[]args) {
		Scanner scan=new Scanner (System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			char c=scan.next().charAt(0);
			String s=scan.next();
			
			HashMap<Character,ArrayList<Integer>>map=new HashMap<>();
			
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==c||s.charAt(i)=='g') {
					if(map.containsKey(s.charAt(i)))map.get(s.charAt(i)).add(i);
					else map.put(s.charAt(i),new ArrayList<Integer>(Arrays.asList(i)));
				}
			}
			ArrayList<Integer>ch=map.get(c);
			ArrayList<Integer>Green=map.get('g');

			int max=-1;
			for(int it:ch) {
				int val=binarySeach(Green, it);
				if(val==-1) {
					val=(n-it)+Green.get(0);
				}
				else {
					val=val-it;
				}
				max=Math.max(max, val);
			}
			System.out.println(max);
		
		}
	}
	public static int binarySeach(ArrayList<Integer>Green,int x) {
		int n=Green.size();
		int l=0;
		int r=n-1;
		int mid;
		int ans=-1;
		while(l<=r) {
			mid=l+(r-l)/2;
			if(Green.get(mid)>=x) {
				ans=Green.get(mid);
				r=mid-1;
			}else l=mid+1;
		}
		return ans;
	}
}
