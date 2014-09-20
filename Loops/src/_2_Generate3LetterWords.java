import java.util.Scanner;

public class _2_Generate3LetterWords {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		char[] chars = ("" + input.next()).toCharArray();
		char[] output = new char[3];

		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars.length; j++) {
				for (int k = 0; k < chars.length; k++) {
					output[0] = chars[i];
					output[1] = chars[j];
					output[2] = chars[k];
					System.out.printf("%s ", String.valueOf(output));
				}

			}

		}

	}
}
