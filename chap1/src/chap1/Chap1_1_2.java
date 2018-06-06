package chap1;

import java.util.Scanner;

public class Chap1_1_2 {
	public static void main(String[] args) {
		String txt;
		boolean check = false;
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNextLine()) {
			txt = scan.nextLine();
			check = isUniqueChars(txt);

			if (check)
				System.out.println("중복X");
			else
				System.out.println("중복");
		}
	}

	static boolean isUniqueChars(String str) {
		if (str.length() > 128)
			return false;

		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}

}
