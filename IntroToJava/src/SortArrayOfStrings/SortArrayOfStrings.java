package SortArrayOfStrings;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfStrings {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] cities = new String[n];

		for (int i = 0; i < n; i++) {
			cities[i] = scanner.next();
		}

		Arrays.sort(cities);

		for (String city : cities) {
			System.out.println(city);
		}
	}
}
