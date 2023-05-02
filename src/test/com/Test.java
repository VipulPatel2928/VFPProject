package test.com;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

public class Test {

	public static String todayDate(String format) {
		Date date = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat(format);

		return sdf.format(date);
	}

	public static String futuredatePlusDays(String format, int days) {

		LocalDate lDate = LocalDate.now();

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);

		return dtf.format(lDate.plusYears(days));
	}
	
	public static String futuredateminDays(String format, int days) {

		LocalDate lDate = LocalDate.now();

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);

		return dtf.format(lDate.minusYears(days));
	}

	public static void main(String[] args) {

		String d1 = Test.todayDate("MMM-dd-yy");

		System.out.println(d1);
		// -----------------------------------------------------------------
		
		d1 = Test.futuredatePlusDays("MM/dd/yyyy",35);

		System.out.println(d1);

		d1 = Test.futuredateminDays("MM/dd/yyyy",35);

		System.out.println(d1);

	}
}