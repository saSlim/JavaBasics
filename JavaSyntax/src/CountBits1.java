import java.util.Scanner;

public class CountBits1 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int n= input.nextInt();
		
		int count= Integer.bitCount(n);
		
		System.out.println(count);
			
	}

}
