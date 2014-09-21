import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class PossibleTriangles {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		boolean noTriangle = true;
		boolean shouldRead = true;

		do {
			TreeSet<Double> possibleTriangle = new TreeSet<>();
			String[] input = scn.nextLine().split(" ");
			
			if (input[0].equals("End")) {
				shouldRead = false;
				break;
			}
			
			for (int i = 0; i < 3; i++) {
				double side = Double.parseDouble(input[i]);
				possibleTriangle.add(side);
			}
			ArrayList<Double> triangleList = new ArrayList<Double>(
					possibleTriangle);
			double a = triangleList.get(0);
			double b = triangleList.get(1);
			double c = triangleList.get(2);
			if ((a + b) > c) {
				System.out.printf("\n%.2f+%.2f>%.2f", a, b, c);
				noTriangle = false;
			}

		} while (shouldRead);

		if (noTriangle) {
			System.out.println("No");
		}

	}
}
