package codeForces;
import java.util.*;
public class distinctSplit {
	public static void main(String[]args) {
		Scanner scan=new Scanner (System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			String s=scan.next();
			HashMap<Character,Integer>set1=new HashMap<>();		
			HashMap<Character,Integer>set2=new HashMap<>();		

//			set1.put(s.charAt(0),1);
			for(int i=0;i<n;i++)set2.put(s.charAt(i),set2.getOrDefault(s.charAt(i), 0)+1);
			
			int size=2;
			
			for(int i=0;i<n-1;i++) {
				set1.put(s.charAt(i),set1.getOrDefault(s.charAt(i), 0)+1);
				set2.put(s.charAt(i),set2.getOrDefault(s.charAt(i), 0)-1);
				
				if(set2.get(s.charAt(i))<=0) {
					set2.remove(s.charAt(i));
				}
				size=Math.max(size, set1.size()+set2.size());
			}
			System.out.println(size);
			
		}
	}
}
