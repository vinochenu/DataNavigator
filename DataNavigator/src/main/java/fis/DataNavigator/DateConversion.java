package fis.DataNavigator;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.testng.annotations.Test;

public class DateConversion {
	
	
	
	public static DateConversion dateConversion=null;
	private DateConversion() {
		
	}
	
	public static DateConversion getInstance() {
		if(dateConversion==null)
			dateConversion=new DateConversion();
		return dateConversion;
	}
	
	
	static HashMap<String, String> dates=new HashMap<String,String>();
	
	
	
	public static HashMap<String, String> dateConversion() throws IOException, ClassNotFoundException, SQLException, ParseException {
		
		try {
			
			DnPojo dnpojo=DnInspection.searchTransaction();
			ShclogPojo istpojo=ShclogData.getShclogData();
			
			DateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
			DateFormat inputFormat = new SimpleDateFormat("MM/dd/yyyy");
			
			String istDate=istpojo.LOCAL_DATE.split(" ")[0];
			String dndate=dnpojo.TSTAMP_LOCAL.split(" ")[0];
			
			Date date=inputFormat.parse(dndate);
			String DnDate=outputFormat.format(date);
			
			
			dates.put("ist_localDate", istDate);
			dates.put("dn_localDate", DnDate);
			
			
			
			
		} catch(IOException io)
		{

			io.printStackTrace();
			System.err.println("IOException is"+io.getMessage());

		}
		catch(ClassNotFoundException ce)
		{

			ce.printStackTrace();
			System.err.println("ClassNotFoundException is"+ce.getMessage());

		}
		catch(SQLException se)
		{

			se.printStackTrace();
			System.err.println("ClassNotFoundException is"+se.getMessage());

		}
		catch(ParseException pe)
		{

			pe.printStackTrace();
			System.err.println("ClassNotFoundException is"+pe.getMessage());

		}
		
		System.out.println(dates);
		return dates;
	}
	
	
	
	
	 
}
