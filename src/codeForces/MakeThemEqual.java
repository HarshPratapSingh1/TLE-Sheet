package codeForces;
import java.util.*;
public class MakeThemEqual {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t =  scan.nextInt();
		
		
		while(t-- > 0) {
			int n = scan.nextInt();
			char c = scan.next().charAt(0);
			
			String s = scan.next();
			
			int occurrence = 0;
			
			for(char ch : s.toCharArray()) if(ch == c) occurrence++;
			
			if(occurrence == n) System.out.println(0);
			else {				
				int idx = -1;
				for(int i = 1 ; i <=n ; i++) {
					boolean flag = false;
					for(int j = i ; j <= n ; j += i) {
						if(s.charAt(j - 1) != c) {
							flag = true;
							break;
						}
					}
					if(!flag) {
						idx = i ;
						break;
					}
				}

				if(idx == -1) {
					System.out.println(2);
					System.out.println((n - 1)+" " +n);
				}
				else {
					System.out.println(1);
					System.out.println(idx);
				}
			}
		}
	}
}
