package _4_Collections;

import java.util.Scanner;

public class _6_CountSpecificWord {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);

		String[] input = scn.nextLine().split("\\W+");
		String word = scn.nextLine().toLowerCase();
		int count = 0;

		for (int i = 0; i < input.length; i++) {
			if (input[i].toLowerCase().equals(word)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
