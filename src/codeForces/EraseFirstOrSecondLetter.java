package codeForces;
import java.util.*;
public class EraseFirstOrSecondLetter {

    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
    	 int t=scanner.nextInt();
    	 
    	 while(t-->0) {
         int n = scanner.nextInt();
         String s = scanner.next();
         
         Map<Character, Integer> mp = new HashMap<>();
         for (int i = 0; i < n; i++) {
             char ch = s.charAt(i);
             mp.putIfAbsent(ch, i);
         }

         long total = 0;
         for (int idx : mp.values()) {
             total += (n - idx);
         }

         System.out.println(total);
             
        }
    }
}
