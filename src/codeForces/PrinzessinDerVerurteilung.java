package codeForces;
import java.util.*;
public class PrinzessinDerVerurteilung {
	public static void main(String[]args) {
		Scanner scan  = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			String s = scan.next();			
			
			System.out.println(findMissingSubstring(s,n));
		}
	}
	public static String findMissingSubstring(String s, int maxLen) {
        Queue<String> q = new LinkedList<>();

        for (char c = 'a'; c <= 'z'; c++) {
            q.add(Character.toString(c));
        }

        while (!q.isEmpty()) {
            String curr = q.poll();
            if (!s.contains(curr)) {
                return curr;
            }

            if (curr.length() < maxLen) {
                for (char c = 'a'; c <= 'z'; c++) {
                    q.add(curr + c);
                }
            }
        }
        return "";
    }
}
