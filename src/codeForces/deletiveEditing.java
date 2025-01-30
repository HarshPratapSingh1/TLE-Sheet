package codeForces;
import java.util.*;
public class deletiveEditing {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			String s1=scan.next();
			String s2=scan.next();
			
			if(s1.equals(s2)) {
				System.out.println("YES");
				continue;
			}
			
			TreeMap<Character,Integer>map=new TreeMap<>();
			
			for(int i=0;i<s1.length();i++) {
				map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0)+1);
			}
			TreeMap<Character,Integer>map2=new TreeMap<>();
			
			for(int i=0;i<s2.length();i++) {
				map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0)+1);
			}
			int i=0;
			int j=0;
			while(i<s1.length()&&j<s2.length()) {
				if(s1.charAt(i)==s2.charAt(j)) {
					if(map.get(s1.charAt(i))==map2.get(s2.charAt(j))) {
							map2.replace(s2.charAt(j), map2.get(s2.charAt(j))-1);
							j++;
						}
						
					}
				map.replace(s1.charAt(i), map.get(s1.charAt(i))-1);	 													
				i++;
			}
			if(s2.length()==j)System.out.println("yes");
			else System.out.println("No");
		}
	}
}
