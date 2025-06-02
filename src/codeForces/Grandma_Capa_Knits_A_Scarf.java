package codeForces;
import java.util.*;
public class Grandma_Capa_Knits_A_Scarf {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-- > 0) {
			int n = scan.nextInt();
			String s = scan.next();
			char front[] = s.toCharArray();
			char rev[] = s.toCharArray();

			ArrayList<Integer> l = new ArrayList<>(); 
			
			int mid = n / 2;
			boolean isPal = false;

			for(char i = 'a' ; i <= 'z' ; i++) {
				int idx1 = 0 , idx2 = n - 1;
				int freq = 0;
				boolean notPal = false;
				
				while(idx1 < idx2) {	
					if(front[idx1] == rev[idx2]) {
						idx1++;
						idx2--;
						continue;
					}
					else {
						if(front[idx1] == i) {
							freq++;
							idx1++;
							continue;
						}
						if(rev[idx2] == i) {
							freq++;
							idx2--;
							continue;
						}
						else{
							notPal = true;
							break;
						}
					}
					
				}
				isPal |= notPal;
				if(notPal) continue;
				else if(freq > 0)l.add(freq);
				
			}
			if(!isPal) System.out.println(0);
			else {
				Collections.sort(l);
				System.out.println(l.size() > 0 ? l.get(0) : -1);
			}
		}
	}
}
