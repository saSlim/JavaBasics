import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class SmallestOf3Nums {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		Double[] nums = new Double[3];

		for (int i = 0; i < 3; i++) {
			nums[i] = input.nextDouble();
		}

		Arrays.sort(nums);

		DecimalFormat formatter = new DecimalFormat("#0.##");

		System.out.printf(formatter.format(nums[0]));

	}

}
