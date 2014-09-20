package _4_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class _9_CombineLists {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		ArrayList<Character> l1 = new ArrayList<>();
		ArrayList<Character> l2 = new ArrayList<>();

		l1 = convertStringToChars(scn.nextLine());
		l2 = convertStringToChars(scn.nextLine());

		ArrayList<Character> merged = mergeLists(l1, l2);

		for (Character c : merged) {
			System.out.printf("%s ", c);
		}

	}

	private static ArrayList<Character> convertStringToChars(String strArr) {
		ArrayList<Character> chArr = new ArrayList<>();
		char[] strCh = strArr.toCharArray();
		for (int i = 0; i < strCh.length; i++) {
			if (strCh[i] != ' ') {
				chArr.add(strCh[i]);
			}

		}

		return chArr;
	}

	private static ArrayList<Character> mergeLists(ArrayList<Character> l1,
			ArrayList<Character> l2) {
		ArrayList<Character> mergedList = new ArrayList<>();
		
		for (Character character : l1) {
			mergedList.add(character);
		}
		
		for (Character c : l2) {
			if (!l1.contains(c)) {
				mergedList.add(c);
			}
		}
		return mergedList;
	}
}

