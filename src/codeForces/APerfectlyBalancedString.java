package codeForces;
import java.util.*;	
public class APerfectlyBalancedString {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			String s=scan.next();
			int n=s.length();
			Set<Character>map=new LinkedHashSet<>();
			
			for(char c:s.toCharArray())map.add(c);
			boolean flag=false;
			for(int i=0;i<n;i++) {
				if(s.charAt(i)!=s.charAt(i%map.size())) {
					flag=true;
					break;
				}
			}
			
			System.out.println(flag?"NO":"YES");
		}
	}
}
