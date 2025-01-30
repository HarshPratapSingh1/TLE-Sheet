package codeForces;
import java.util.*;
public class borze {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		
		StringBuilder str=new StringBuilder();
		
		
		for(int i = 0 ; i < s.length() ; i++) {
		
			if(s.charAt(i) == '.') {
				str.append(0);
			}
			else if(s.charAt(i) == '-' && s.length() > i+1 && s.charAt(i+1) == '.' ) {
				str.append(1);
				i++;
			}
			else if(s.charAt(i) == '-' && s.length() > i+1 && s.charAt(i+1) == '-' ) {
				str.append(2);
				i++;
			}
		}
		
		System.out.println(str.toString());
		scan.close();
	}

}
