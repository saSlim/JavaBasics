package _4_Collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _12_CardFreq {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);

		String[] input = scn.nextLine().split("\\W+");
		double numOfCards = input.length;

		LinkedHashMap<String, Integer> cardsCount = new LinkedHashMap<String, Integer>();

		for (String string : input) {
			Integer count = cardsCount.get(string);
			if (count == null) {
				count = 0;
			}
			cardsCount.put(string, count + 1);
		}

		for (Map.Entry<String, Integer> entry : cardsCount.entrySet()) {
	
			double freq = (entry.getValue() / numOfCards) * 100;

			System.out.printf("%s -> %.2f%%\n", entry.getKey(), freq);

		}

	}

}
