package _4_Collections;

import java.util.Collections;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class _11_MostFreqWord {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		String[] input = scn.nextLine().toLowerCase().split("\\W+");
		TreeMap<String, Integer> wordsCount = new TreeMap<String, Integer>();

		for (String string : input) {
			Integer count = wordsCount.get(string);
			if (count == null) {
				count = 0;
			}
			wordsCount.put(string, count + 1);
		}

		int maxValueInMap = Collections.max(wordsCount.values());

		for (Entry<String, Integer> entry : wordsCount.entrySet()) { // Iterate
																		// through
																		// hashmap
			if (entry.getValue() == maxValueInMap) {
				System.out.printf("%s -> %d times\n", entry.getKey(),
						entry.getValue()); // Print the key with max
				// value
			}
		}

	}

}
