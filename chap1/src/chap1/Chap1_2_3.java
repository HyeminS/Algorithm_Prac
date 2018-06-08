package chap1;

import java.util.Scanner;

public class Chap1_2_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Chap1_2_3 c123 = new Chap1_2_3();
		String txt1;
		String txt2;
		boolean check;
		
		while(scan.hasNextLine()) {
			check = false;
			txt1 = scan.nextLine();
			txt2 = scan.nextLine();
			
			check = c123.permutation(txt1, txt2);
			
			if(check)
				System.out.println("permutation O");
			else
				System.out.println("permutation X");
		}
	}
	
	String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	
	boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}

}
