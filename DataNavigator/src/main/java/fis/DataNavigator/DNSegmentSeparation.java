package fis.DataNavigator;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.util.SystemOutLogger;

public class DNSegmentSeparation {

	//static object declaration for this class (Singleton)
	public static DNSegmentSeparation dnSeparation=null;

	//private constructor for Singleton class 
	private DNSegmentSeparation(){

	}
	//creation of getinstance() method for Singleton class
	public static DNSegmentSeparation getinstance() {

		if(dnSeparation==null)
			dnSeparation=new DNSegmentSeparation();

		return dnSeparation;
	}



	ArrayList<String> shcloglist;
	ArrayList<String> shcgenericloglist;
	String columnvalue_shclog;
	String columnvalue_shcgenericlog;
	String segmentData="";
	String EMV_Segment;
	String DN_SEGMENT_Segment;
	String ATM_DN_DATA_REQ_Segment;
	String NETWORK_SETTLEMENT_DATA_Segment;
	String BBL_DN_SEGMENT_Segment;
	String BBL_ADMIN_USG_SEGMENT_Segment;
	String EMV_DE55_REQ_Segment;

	ShcgenericlogPojo shcgenericlogPojo;


	static Logger logger=Logger.getLogger(DNSegmentSeparation.class);





	//This method helps to return the shclog Table values (id & length of segments)
	public  ArrayList<String>  shclogQuery() throws IOException, ClassNotFoundException, SQLException {

		PropertyConfigurator.configure("DNlogs.properties");


		try {



			FileInputStream fileInputStream=new FileInputStream("configDN.properties");
			Properties properties=new Properties();
			properties.load(fileInputStream);
			String databasedriver=properties.getProperty("DatabaseDriver");
			String databaseurl=properties.getProperty("DatabaseUrl");
			String shclogquery=properties.getProperty("ShclogSegmentQuery");
			String databaseuserID=properties.getProperty("DatabaseID");
			String databasepassword=properties.getProperty("DatabasePassword");
			Class.forName(databasedriver);
			Connection connection = DriverManager.getConnection(databaseurl,databaseuserID,databasepassword);
			Statement statement = connection.createStatement();
			ResultSet rs_shclog = statement.executeQuery(shclogquery);
			ResultSetMetaData md_shclog=rs_shclog.getMetaData();
			
			
			int columncount=md_shclog.getColumnCount();
			shcloglist=new ArrayList<>();

			while(rs_shclog.next()) {


				for(int i=1;i<=columncount;i=i+1)

				{
					columnvalue_shclog=rs_shclog.getString(i);
					shcloglist.add(columnvalue_shclog);

				}

				//System.out.println(shcloglist);
			}
		}
		catch (IOException | SQLException | ClassNotFoundException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("Shclog Table- Segment ID : Issue with Database or file import or Date Parsing", e);
			System.out.println("Issue with Database or file import or Date Parsing");
		}


		return shcloglist;


	}

	//This method  helps to get the raw data from shcgenericlog Table
	public StringBuilder shcgenericlogQuery() throws IOException, ClassNotFoundException, SQLException {

		StringBuilder segmentRawData=new StringBuilder();

		try {

			FileInputStream fileInputStream=new FileInputStream("configDN.properties");
			Properties properties=new Properties();
			properties.load(fileInputStream);

			String databasedriver=properties.getProperty("DatabaseDriver");
			String databaseurl=properties.getProperty("DatabaseUrl");

			String shcgenericlogquery=properties.getProperty("ShcgenericlogQuery");
			String databaseuserID=properties.getProperty("DatabaseID");
			String databasepassword=properties.getProperty("DatabasePassword");


			Class.forName(databasedriver);

			Connection connection = DriverManager.getConnection(databaseurl,databaseuserID,databasepassword);

			Statement statement = connection.createStatement();

			ResultSet rs_shcgenericlog = statement.executeQuery(shcgenericlogquery);

			ResultSetMetaData md_shcgenericlog=rs_shcgenericlog.getMetaData();

			int columncount=md_shcgenericlog.getColumnCount();

			shcgenericloglist=new ArrayList<>();

			//StringBuilder segmentRawData=new StringBuilder();

			while(rs_shcgenericlog.next()) {


				for(int i=1;i<=columncount;i++)

				{
					columnvalue_shcgenericlog=rs_shcgenericlog.getString(i);
					shcgenericloglist.add(columnvalue_shcgenericlog);

				}

				//System.out.println(shcgenericloglist);



				for(int i=0;i<shcgenericloglist.size();i++)
				{
					segmentRawData.append(shcgenericloglist.get(i));
				}


			}
		}

		catch (IOException | SQLException | ClassNotFoundException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("Shcgenericlog Table- TotalRawData : Issue with Database or file import or Date Parsing", e);
			System.out.println("Issue with Database or file import or Date Parsing");
		}

		//System.out.println("Transaction Total raw data is "+segmentRawData);

		return segmentRawData;

	}

	//This function helps to split the raw data into segment group based on shclog table value
	public void splitSegement() throws ClassNotFoundException, IOException, SQLException {

		PropertyConfigurator.configure("DNlogs.properties");

		try {

			int offset = 0;
			for(int i=1;i<shclogQuery().size();i=i+2) {
				//System.out.println(shclogQuery().get(i)+1);

				switch(shclogQuery().get(i)) {

				case "20299":

					System.out.println(shclogQuery().get((i)));

					int emvlength=Integer.valueOf(shclogQuery().get((i)+1));
					int EMVlength=emvlength*2;
					System.out.println("EMV length is "+EMVlength);

					EMV_Segment=shcgenericlogQuery().substring(offset, offset+EMVlength);//offset+880
					logger.info("EMV_Segment is "+EMV_Segment);
					System.out.println("EMV_Segment is "+EMV_Segment);
					offset=offset+EMV_Segment.length();
					System.out.println("offset value emv :"+offset);

					break;

				case "23003":

					System.out.println(shclogQuery().get((i)));
					int DE55length=Integer.valueOf(shclogQuery().get((i)+1));
					int EMVDE55length=DE55length*2;
					System.out.println(" EMVDE55length is "+EMVDE55length);


					EMV_DE55_REQ_Segment=shcgenericlogQuery().substring(offset, offset+EMVDE55length);//offset+278
					logger.info("EMV_DE55_REQ_Segment is "+EMV_DE55_REQ_Segment);
					System.out.println("EMV_DE55_REQ_Segment is "+EMV_DE55_REQ_Segment);
					offset=offset+EMV_DE55_REQ_Segment.length();


					break;



				case "23014":
					
					System.out.println(shclogQuery().get((i)));

					int DNsegmentlength=Integer.valueOf(shclogQuery().get((i)+1));
					int DNSegmentlength=DNsegmentlength*2;
					System.out.println("DNSegmentlength is "+DNSegmentlength);

					DN_SEGMENT_Segment=shcgenericlogQuery().substring(offset, offset+DNSegmentlength);//offset+232
					logger.info("DN_SEGMENT_Segment is "+DN_SEGMENT_Segment);
					System.out.println("DN_SEGMENT_Segment is "+DN_SEGMENT_Segment);
					offset=offset+DN_SEGMENT_Segment.length();

					break;

				case "23022":

					int DNDATAREQsegment=Integer.valueOf(shclogQuery().get((i)+1));
					int DNDATAREQSegment=DNDATAREQsegment*2;
					System.out.println("DNDATAREQSegment is "+DNDATAREQSegment);

					ATM_DN_DATA_REQ_Segment=shcgenericlogQuery().substring(offset, offset+DNDATAREQSegment);//offset+314
					logger.info("ATM_DN_DATA_REQ_Segment is "+ATM_DN_DATA_REQ_Segment);
					System.out.println("ATM_DN_DATA_REQ_Segment is "+ATM_DN_DATA_REQ_Segment);
					offset=offset+ATM_DN_DATA_REQ_Segment.length();


					break;

				case "29804":

					int NETWORKSETTLEMENTsegment=Integer.valueOf(shclogQuery().get((i)+1));
					int NETWORKSETTLEMENTSegment=NETWORKSETTLEMENTsegment*2;
					System.out.println("NETWORKSETTLEMENTSegment is "+NETWORKSETTLEMENTSegment);

					NETWORK_SETTLEMENT_DATA_Segment=shcgenericlogQuery().substring(offset, offset+NETWORKSETTLEMENTSegment);//offset+286
					logger.info("NETWORK_SETTLEMENT_DATA_Segment is "+NETWORK_SETTLEMENT_DATA_Segment);
					System.out.println("NETWORK_SETTLEMENT_DATA_Segment is "+NETWORK_SETTLEMENT_DATA_Segment);
					offset=offset+NETWORK_SETTLEMENT_DATA_Segment.length();




					break;

				case "50001":

					int BBLDNsegment=Integer.valueOf(shclogQuery().get((i)+1));
					int BBLDNSegment=BBLDNsegment*2;
					System.out.println("BBLDNSegment is "+BBLDNSegment);


					BBL_DN_SEGMENT_Segment=shcgenericlogQuery().substring(offset, offset+BBLDNSegment);//offset+5414
					logger.info("BBL_DN_SEGMENT_Segment is "+BBL_DN_SEGMENT_Segment);
					System.out.println("BBL_DN_SEGMENT_Segment is "+BBL_DN_SEGMENT_Segment);
					offset=offset+BBL_DN_SEGMENT_Segment.length();



					break;

				case "50004":

					int BBLADMINUSGsegment=Integer.valueOf(shclogQuery().get((i)+1));
					int BBLADMINUSGSegment=BBLADMINUSGsegment*2;
					System.out.println("BBLADMINUSGSegment is "+BBLADMINUSGSegment);

					BBL_ADMIN_USG_SEGMENT_Segment=shcgenericlogQuery().substring(offset, offset+BBLADMINUSGSegment);//offset+920
					logger.info("BBL_ADMIN_USG_SEGMENT_Segment is "+BBL_ADMIN_USG_SEGMENT_Segment);
					System.out.println("BBL_ADMIN_USG_SEGMENT_Segment is "+BBL_ADMIN_USG_SEGMENT_Segment);
					offset=offset+BBL_ADMIN_USG_SEGMENT_Segment.length();



					break;		



				default:
					System.out.println("Segment id "+shclogQuery().get(i)+ "  "+"is not sent for this transaction");
					logger.info("Segment id "+shclogQuery().get(i)+ "  "+"is not sent for this transaction");

				}
			}

			offset=0;


		}

		catch (ClassNotFoundException | SQLException | IOException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("Segment Separation: Issue with Database or file import or Date Parsing",e);
			System.out.println("Issue with Database or file import or Date Parsing");
		}
	}


	
	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub



		DNSegmentSeparation a1=DNSegmentSeparation.getinstance();
		a1.splitSegement();


	}
}


