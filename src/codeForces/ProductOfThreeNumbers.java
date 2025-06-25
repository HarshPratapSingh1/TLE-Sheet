package codeForces;
import java.util.*;
public class ProductOfThreeNumbers {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t =  scan.nextInt();
		
		while(t-->0) {
			long n = scan.nextLong();
			long safe = n;
			ArrayList<Long> l = new ArrayList<>();
			
			for (int i = 2; i * i <= n && l.size() < 3; i++) {
			    while (n % i == 0 && l.size() < 3) {
			        l.add((long) i);
			        n /= i;
			    }
			}
			if (n > 1 && l.size() < 3) {
			    l.add((long) n);
			}
			
			if(l.size() < 3) {
				System.out.println("NO");
				continue;
			}
			long pro = 1;
			for(int i = 0 ; i < l.size() ; i++) pro *= l.get(i);
			
			if(pro == safe) {
				HashSet<Long> set = new HashSet<>(l);
				if(set.size() != 3) System.out.println("NO");
				else {
					System.out.println("YES");
					for(long it:set) System.out.print(it+" ");
					System.out.println();
				}

			}else {
				long val1 = l.get(0);
				long pro1 = 1;
				int i = 1;
				while(i < l.size() && pro1 <= val1) pro1 *= l.get(i++);
				long finala = (safe / (pro1*val1));
				HashSet<Long> set = new HashSet<>(Arrays.asList(val1,pro1,finala));
			
				if(set.size()!=3) System.out.println("NO");
				else {
					System.out.println("YES");
					for(long it : set) System.out.print(it+" ");
					System.out.println();
				}
			}
		}
	}
}
