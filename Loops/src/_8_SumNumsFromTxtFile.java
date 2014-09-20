import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _8_SumNumsFromTxtFile {

	public static void main(String[] args) throws IOException {
			
			try{
			@SuppressWarnings("resource")
			BufferedReader reader = new BufferedReader(new FileReader(
					"numbers.txt"));
			String line = null;
			int result = 0;
			while ((line = reader.readLine()) != null) {
			    result += Integer.parseInt(line);
			}
			
			if (result != 0) {
				System.out.println(result);
			}
			else {
				System.out.println("Error");
			}
			}
			catch(Exception ex){
				System.out.println("Error");
				
			}
		}
}