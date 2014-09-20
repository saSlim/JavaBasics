import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Biggest3Primes {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);

		TreeSet<Integer> posiblePrimes = new TreeSet<>(
				Collections.reverseOrder());

		String[] input = scn.nextLine().split("[( )]+");

		for (int i = 0; i < input.length; i++) {
			if (!input[i].equals("")) {
				int n = Integer.parseInt(input[i]);
				posiblePrimes.add(n);
			}
		}

		int primesSum = 0;
		int counter = 0;
		for (Integer prime : posiblePrimes) {
			if (isPrime(prime) && counter < 3) {
				primesSum += prime;
				counter++;
			}
		}

		if (counter == 3) {
			System.out.println(primesSum);
		} else {
			System.out.println("No");
		}
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if ((num % i) == 0)
				return false;
		}
		return true;
	}

}
