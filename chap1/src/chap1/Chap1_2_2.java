package chap1;

import java.util.Scanner;

public class Chap1_2_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean check;
		String txt1;
		String txt2;
		
		while(scan.hasNextLine()) {
			check = true;
			txt1 = scan.nextLine();
			txt2 = scan.nextLine();
			
			if(check = permutation(txt1, txt2)) {
				System.out.println("permutation O");
			} else {
				System.out.println("permutation X");
			}
		}
	}
	
	static boolean permutation(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		int[] letters = new int[128]; //assumption
		
		char[] s_array = s.toCharArray();
		for (char c : s_array) {
			letters[c]++;
		}
		
		for (int i=0; i < t.length(); i++) {
			int c = (int) t.charAt(i);
			letters[c]--;
			
			if (letters[c] < 0) {
				return false;
			}
		}
		return true;
	}

}
