package codeForces;
import java.util.*;
public class moveBrackets {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			String s=scan.next();
			
			Stack <Character>st=new Stack<>();
			
			for(int i=0;i<n;i++) {
				if(s.charAt(i)=='(')st.add('(');
				
				if(!st.isEmpty()&&s.charAt(i)==')'&&st.peek()=='(')st.pop();
			}
			
			System.out.println(st.size());
		}
	}
}
