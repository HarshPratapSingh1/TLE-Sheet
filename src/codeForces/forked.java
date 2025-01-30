package codeForces;
import java.util.*;


public class forked {
	
	static class Pair {
        int x, y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return x == pair.x && y == pair.y;
        }
        @Override
        public int hashCode() {
            return 31 * x + y;
        }
    }
	static int[] dx = {-1, 1, -1, 1};
    static int[] dy = {-1, -1, 1, 1};
	
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-- >0) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			int x1=scan.nextInt();
			int y1=scan.nextInt();
			int x2=scan.nextInt();
			int y2=scan.nextInt();
			
			
			Set<Pair> st1 = new HashSet<>();
            Set<Pair> st2 = new HashSet<>();
            for(int i=0;i<4;i++) {
            	st1.add(new Pair(x1 + dx[i] * a, y1 + dy[i] * b));
                st2.add(new Pair(x2 + dx[i] * a, y2 + dy[i] * b));
                st1.add(new Pair(x1 + dx[i] * b, y1 + dy[i] * a));
                st2.add(new Pair(x2 + dx[i] * b, y2 + dy[i] * a));        
            	}
            int ans = 0;
            for (Pair x : st1) {
                if (st2.contains(x)) {
                    ans++;
                }
            }
            
            System.out.println(ans);
		}
		
	}
	
	
}
