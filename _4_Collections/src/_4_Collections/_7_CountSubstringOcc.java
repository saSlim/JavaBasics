package _4_Collections;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _7_CountSubstringOcc {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);

		String input = scn.nextLine();
		String word = scn.nextLine().toLowerCase();

		Pattern pattern = Pattern.compile(word);
		Matcher matcher = pattern.matcher(input.toLowerCase());

		int count = 0;

		while (matcher.find()) {
			count++;
			int firstIndex = matcher.start();
			matcher.region(firstIndex + 1, input.length());
		}

		System.out.println(count);

	}

}
