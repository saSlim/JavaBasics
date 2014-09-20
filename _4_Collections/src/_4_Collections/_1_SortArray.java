package _4_Collections;

import java.util.Arrays;
import java.util.Scanner;

public class _1_SortArray {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] intArr = new int[n];

		for (int i = 0; i < n; i++) {
			intArr[i] = scn.nextInt();

		}

		Arrays.sort(intArr);

		for (int i = 0; i < intArr.length; i++) {
			System.out.printf("%d ", intArr[i]);
		}

	}

}
