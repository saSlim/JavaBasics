package _4_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class _4_LongestIncreasingSequence {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);

		String[] input = scn.nextLine().split(" ");
		ArrayList<Integer> seq = new ArrayList<>();
		ArrayList<ArrayList<Integer>> incrSequence = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < input.length; i++) {
			int n = Integer.parseInt(input[i]);

			if ((i == 0) || n > seq.get(seq.size() - 1)) {
				seq.add(n);
			} else {
				incrSequence.add(seq);
				seq = new ArrayList<>();
				seq.add(n);
			}
			if (i == input.length - 1) {
				incrSequence.add(seq);
			}
		}

		ArrayList<Integer> output = incrSequence.get(0);

		for (int i = 1; i < incrSequence.size(); i++) {
			if (incrSequence.get(i).size() > output.size()) {
				output = incrSequence.get(i);
			}
		}

		for (ArrayList<Integer> arrayList : incrSequence) {
			printArray("", arrayList);
		}

		printArray("Longest: ", output);

	}

	private static void printArray(String msg, ArrayList<Integer> output) {
		String outString = new String();
		for (Integer num : output) {
			outString += String.format("%d ", num);
		}
		System.out.printf(msg + outString + "\n");
	}

}
