package _4_Collections;

import java.util.Scanner;

public class _5_CountWords {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);

		String[] input = scn.nextLine().split("\\W+");

		int count = input.length;

		System.out.println(count);

	}
}
