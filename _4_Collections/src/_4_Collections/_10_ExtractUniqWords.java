package _4_Collections;

import java.util.Scanner;
import java.util.TreeSet;

public class _10_ExtractUniqWords {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		String[] input = scn.nextLine().toLowerCase().split("\\W+");
		TreeSet<String> uniqWords = new TreeSet<>();

		for (String string : input) {
			uniqWords.add(string);
		}

		System.out.println(String.join(" ", uniqWords));
	}

}
