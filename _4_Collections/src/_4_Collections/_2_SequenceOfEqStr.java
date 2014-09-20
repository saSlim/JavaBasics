package _4_Collections;

import java.util.Scanner;

public class _2_SequenceOfEqStr {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);

		String[] input = scn.nextLine().split(" ");

		for (int i = 0; i < input.length; i++) {
			if (i > 0 && input[i].equals(input[i - 1])) {
				System.out.printf(" %s", input[i]);
			}else {
				System.out.printf("\n%s",input[i]);
				
			}
		}

	}

}
