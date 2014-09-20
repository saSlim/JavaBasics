package _4_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class _3_LargestSequence {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		String[] input = scn.nextLine().split(" ");

		ArrayList<ArrayList<String>> sequences = new ArrayList<ArrayList<String>>();
		ArrayList<String> sequence = new ArrayList<>();

		for (int i = 0; i < input.length; i++) {
			if (i > 0 && input[i].equals(input[i - 1])) {
				sequence.add(input[i]);
				continue;
			} else {
				sequence = new ArrayList<String>();
				sequence.add(input[i]);
			}
			sequences.add(sequence);
		}

		ArrayList<String> output = sequences.get(0);

		for (int i = 1; i < sequences.size(); i++) {
			if (sequences.get(i).size() > output.size()) {
				output = sequences.get(i);
			}
		}
		
		for (String string : output) {
			System.out.printf("%s ", string);
		}
	}

}
