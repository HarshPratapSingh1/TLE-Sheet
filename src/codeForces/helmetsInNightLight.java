package codeForces;
import java.util.*;

public class helmetsInNightLight {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			long n=scan.nextLong();
			long p=scan.nextLong();
			ArrayList<light>l=new ArrayList<>();
			
			long a[]=new long[(int)n];
			long b[]=new long[(int)n];
			for(int i=0;i<n;i++)a[i]=scan.nextLong();
			for(int i=0;i<n;i++) {
				b[i]=scan.nextLong();
				l.add(new light(b[i], a[i]));
			}
			
			Collections.sort(l);
			
			Map<Long, Long> mp = new HashMap<>();
            mp.put(p, n + 100);

            long ans = 0;

            for (light i : l) {
                long mn = Collections.min(mp.keySet());  // Get the smallest key
                ans += mn;
                mp.put(mn, mp.get(mn) - 1);

                if (mp.get(mn) == 0) {
                    mp.remove(mn);
                }
               
                mp.put(i.a, mp.getOrDefault(i.a, 0L) + i.b);
               
            }

            System.out.println(ans);
        }
		}
	}
class light implements Comparable<light>{
	long a,b;
	light(long a,long b){
		this.a=a;
		this.b=b;
	}
	 @Override
     public int compareTo(light other) {
         return Long.compare(this.a, other.a);
     }
}
