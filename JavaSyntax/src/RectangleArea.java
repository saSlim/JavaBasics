import java.util.Scanner;

public class RectangleArea {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int a = 0, b = 0;

		a = scanner.nextInt();

		b = scanner.nextInt();

		int result = calcRectangleArea(a, b);

		System.out.println(result);
	}

	static int calcRectangleArea(int a, int b) {
		return a * b;
	}
}
