package codeForces;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleStrings {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
//		int t = scan.
		
		String s = scan.next();
		int n = s.length();
		int i = 0;
		char c[] = s.toCharArray();
		int idx = 0;
		while(i < n) {
			idx = i + 1;
			
			while(idx < n && s.charAt(i) == s.charAt(idx)) idx++;
//			System.out.println(i+" "+idx);
			int dif = idx - i - 1;
			if(dif == 0) {
				i = idx;
				continue;
			}else {
				if(idx<n) {
					char c1 = s.charAt(idx);
					char c2 = s.charAt(i);
					char c3 = i > 0 ? s.charAt(i - 1):' ';
					
					char toSet = ' ';
					for(char cx = 'a' ; cx <= 'z' ; cx++) {
						if(c1 != cx && c2 != cx && c3 != cx) {
							toSet = cx;
							break;
						}
					}
					

					for(int j = i + 1 ; j < idx ; j+=2) c[j] = toSet;
					i = idx;
				}else break;
			}
		}
		
		int dif = idx - i - 1;
		if(dif > 0) {
			char c1 = s.charAt(idx - 1);
			char c2 = s.charAt(i);
			char c3 = i > 0 ? s.charAt(i - 1):' ';
			
			char toSet = ' ';
			for(char cx = 'a' ; cx <= 'z' ; cx++) {
				if(c1 != cx && c2 != cx && c3 != cx) {
					toSet = cx;
					break;
				}
			}
			

			for(int j = i + 1 ; j < idx ; j+=2) c[j] = toSet;
		}
		for(char ch:c) System.out.print(ch);
		System.out.println();
	}
}
