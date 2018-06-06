package chap1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chap1_1_1 {
	public static void main(String[] args) {
		int dcnt = 0;
		String txt;
		List<Character> arr_word = new ArrayList<Character>();
		Scanner scan = new Scanner(System.in);

		while (true) {
			arr_word.clear();
			dcnt = 0;
			txt = scan.nextLine();

			for (int i = 0; i < txt.length(); i++) {
				arr_word.add(txt.charAt(i));
			}

			for (int i = 0; i < arr_word.size(); i++) {
				for (int j = 0; j < arr_word.size(); j++) {
					if (arr_word.get(i).equals(arr_word.get(j)) && i != j) {
						dcnt++;
					}
				}

				if (dcnt > 0) {
					System.out.println("중복");
					break;
				}
			}
			if (dcnt == 0)
				System.out.println("중복X");
		}
	}
}
