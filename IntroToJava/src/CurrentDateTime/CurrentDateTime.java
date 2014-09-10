package CurrentDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

	public static void main(String[] args) {

		// get time and date
		LocalDateTime ldt = LocalDateTime.now();
		
		// display formatted date using printf()
		System.out.printf("%s: \n%tR, %<tB %<te, %<tY","Using \"printf()\"", ldt);
		
		//Second variant
		System.out.println("\nUsing DateTimeFormatter: ");
		
		//or format the ldt using DateTimeFormatter	
		DateTimeFormatter formatter = DateTimeFormatter
				.ofPattern("yyyy-MM-dd HH:mm");

		// formatting dateTime
		String formattedDateTime = ldt.format(formatter);

		// display formatted date
		System.out.println(formattedDateTime);

	}

}
