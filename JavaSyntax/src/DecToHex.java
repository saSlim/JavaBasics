import java.util.Scanner;

public class DecToHex {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
	
		//Without converting
		//System.out.printf("%X",num);

		//Converting 
		String hex = Integer.toHexString(num).toUpperCase();
		System.out.println(hex);

	}

}
