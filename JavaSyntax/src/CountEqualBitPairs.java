import java.util.Scanner;

public class CountEqualBitPairs {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		int counter = 0;
	
		int firstBit = num & 1;
		num >>= 1;

		while (num > 0) {
			int bit = num & 1;
			if (firstBit == bit) {
				counter++;
			}
			firstBit = bit;
			num >>= 1;
		}

		System.out.println(counter);

	}

}
