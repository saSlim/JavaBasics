import java.util.Scanner;


public class _1_SymmetricNumsInRange {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int start = input.nextInt();
		int stop = input.nextInt();
		
		for (int i = start; i <= stop; i++) {
			char[] chars = ("" + i).toCharArray();
			
			if(chars[0]==chars[chars.length-1]){
				System.out.printf("%d ",i);
			}			
		}
	}

}

