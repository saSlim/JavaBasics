package SumTwoNumbers;
import java.util.Scanner;

public class SumTwoNumbers {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 0, b = 0;

		System.out.println("Enter a:");
		a = scanner.nextInt();

		System.out.println("Enter b:");
		b = (scanner.nextInt());

		System.out.printf("Sum: %d", a + b);
	}
}
