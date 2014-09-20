package _4_Collections;

import java.util.Scanner;

public class _8_ExtractEmails {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);

		String[] input = scn.nextLine().split(" |\\. ");

		String regEx = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";

		for (String string : input) {

			if (string.matches(regEx)) {
				System.out.println(string);
			}
		}

	}

}
