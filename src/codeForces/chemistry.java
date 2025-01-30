package codeForces;
import java.util.*;
import java.util.Map.Entry;
public class chemistry {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-- >0) {
			int n=scan.nextInt();
			int k=scan.nextInt();
			String s=scan.next();
			
			if(n-k==1)System.out.println("YES");
			
			else {
				HashMap<Character,Integer>map=new HashMap<>();
				for(int i=0;i<n;i++) {
					if(map.containsKey(s.charAt(i))) {
						map.replace(s.charAt(i), map.get(s.charAt(i))+1);
					}
					else map.put(s.charAt(i), 1);
				}
				int cnt=0;
				for(Entry<Character, Integer>entry:map.entrySet()) {
					int a=entry.getValue();
					
					if(a%2!=0)cnt++;
					
				}
				if(cnt-1<=k)System.out.println("YES");
				else System.out.println("NO");
			}
		}scan.close();
	}
}
