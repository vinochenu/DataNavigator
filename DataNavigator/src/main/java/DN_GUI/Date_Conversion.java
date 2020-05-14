package DN_GUI;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.testng.annotations.Test;

public class Date_Conversion {
	
	
	
	public static void main(String [] args) throws ParseException {
		
		DateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat inputFormat = new SimpleDateFormat("MM/dd/yyyy");
	
		String dateformat = "04/10/2020 23:19:36";
		String dateformat1 = "2020-04-10 23:19:36";
		
		/*String newDate = dateformat.split(" ")[0];
		String newDate1 = dateformat1.split(" ")[0];*/
		
		
		Date date = inputFormat.parse(dateformat);
		System.out.println(date);
		Date date1 = outputFormat.parse(dateformat1);
		System.out.println(date1);
		//String outputText = outputFormat.format(date);
		if(date.compareTo(date1)==0) {
			System.out.println("Date is matching");
			
		}
	}
	
	 
}
