import java.util.ArrayList;
import java.util.Scanner;

public class ValidUserNames {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		String[] usernames = scn.nextLine().split("[/\\\\ ( )]");
		ArrayList<String> validUsernames = new ArrayList<>();
		
		for (int i = 0; i < usernames.length; i++) {
			if (usernames[i].matches("^[A-Za-z].*$")
					&& usernames[i].length() > 3 && usernames[i].length() < 25) {
				validUsernames.add(usernames[i]);
			}
		}

		int max = 0;
		String usr1 = "";
		String usr2 = "";

		for (int i = 0; i < validUsernames.size() - 1; i++) {
			int a = validUsernames.get(i).length();
			int b = validUsernames.get(i + 1).length();
			int currentSum = a + b;

			if (currentSum > max) {
				max = currentSum;
				usr1 = validUsernames.get(i);
				usr2 = validUsernames.get(i + 1);
			}
		}
		System.out.printf("%s\n%s", usr1, usr2);
	}

}
