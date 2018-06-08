package chap1;

import java.util.Scanner;

public class Chap1_2_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean check;
		int[] str1 = new int[128];
		int[] str2 = new int[128];
		String txt1;
		String txt2;
		
		while(scan.hasNextLine()) {
			check = true;
			txt1 = scan.nextLine();
			txt2 = scan.nextLine();
			
			if(txt1.length() == txt2.length()) {
				str1 = countChar(txt1);
				str2 = countChar(txt2);
				
				for(int i=0; i < 128; i++) {
						if (str1[i] != str2[i]) {
							check = false;
						}
				}
				
				if(check)
					System.out.println("permutation O");
				else
					System.out.println("permutation X");
			}else {
				System.out.println("permutation X");
			}
			
		}
	}
	
	static int[] countChar(String str) {
		int[] char_set = new int[128];
		
//		if(str.length() > 128)
//			return ;
//		
		for(int i=0; i < str.length(); i++) {
			int val = str.charAt(i);
			char_set[val]++;
		}
		return char_set;
	}

}
