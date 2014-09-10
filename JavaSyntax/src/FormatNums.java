import java.util.Scanner;

public class FormatNums {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int aBinary = Integer.parseInt(Integer.toBinaryString(a));
		Double b = input.nextDouble();
		Double c = input.nextDouble();

		System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|", a, aBinary, b, c);

	}

}
