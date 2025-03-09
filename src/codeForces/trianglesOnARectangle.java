package codeForces;
import java.util.*;
public class trianglesOnARectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long t = scan.nextLong();
        
        while (t-- > 0) {
            long w = scan.nextLong();
            long h = scan.nextLong();
            long min1 = Long.MAX_VALUE;
            long max1 = Long.MIN_VALUE;
            long min2 = Long.MAX_VALUE;
            long max2 = Long.MIN_VALUE;
            
            long k = scan.nextLong();
            for (long i = 0; i < k; i++) {
                long val = scan.nextLong();
                min1 = Math.min(min1, val);
                max1 = Math.max(max1, val);
            }
            long dif1 = Math.abs(max1 - min1);
            min1 = Long.MAX_VALUE;
            max1 = Long.MIN_VALUE;
            
            k = scan.nextLong();
            for (long i = 0; i < k; i++) {
                long val = scan.nextLong();
                min1 = Math.min(min1, val);
                max1 = Math.max(max1, val);
            }
            dif1 = Math.max(Math.abs(max1 - min1), dif1);
            
            k = scan.nextLong();
            for (long i = 0; i < k; i++) {
                long val = scan.nextLong();
                min2 = Math.min(min2, val);
                max2 = Math.max(max2, val);
            }
            long dif2 = Math.abs(max2 - min2);
            min2 = Long.MAX_VALUE;
            max2 = Long.MIN_VALUE;
            
            k = scan.nextLong();
            for (long i = 0; i < k; i++) {
                long val = scan.nextLong();
                min2 = Math.min(min2, val);
                max2 = Math.max(max2, val);
            }
            dif2 = Math.max(Math.abs(max2 - min2), dif2);
            
            long ans = Math.max(dif2 * w, dif1 * h);
            System.out.println(ans);
        }
    }
}
