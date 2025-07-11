package codeForces;

import java.io.*;
import java.util.*;

public class StrangeBirthdayParty {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] nm = br.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);

            int[] k = new int[n];
            String[] kStr = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                k[i] = Integer.parseInt(kStr[i]);
            }

            long[] c = new long[m];
            String[] cStr = br.readLine().split(" ");
            for (int i = 0; i < m; i++) {
                c[i] = Long.parseLong(cStr[i]);
            }

            Arrays.sort(k);

            long total = 0;
            int gift = 0;

            for (int i = n - 1; i >= 0; i--) {
                int pref = k[i] - 1;

                if (gift < pref) {
                    total += c[gift];
                    gift++;
                } else {
                    total += c[pref];
                }
            }

            output.append(total).append('\n');
        }

        System.out.print(output);
    }
}
