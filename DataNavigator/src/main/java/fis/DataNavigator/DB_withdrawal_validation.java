package fis.DataNavigator;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;



import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class DB_withdrawal_validation {

	ExtentReports extentreport;
	ExtentHtmlReporter htmlreporter;
	ExtentTest testcase;


	@Test
	public void compareDB() throws ParseException {


		try {
			DN_withdrawal_pojo dn_withdrawal_pojo=DN_web_withdrawal_inspection.login();

			Shclog_withdrawal_pojo shclog_withdrawal_pojo=ist_DB();

			// Date parsing between SHC & DN

			String shclog_localDate=shclog_withdrawal_pojo.LOCAL_DATE.split(" ")[0];// 2020-05-05
			System.out.println(shclog_localDate);
			String dn_localDate=dn_withdrawal_pojo.TSTAMP_LOCAL.split(" ")[0];// 04/10/2020
			System.out.println(dn_localDate);

			DateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");// 2020-04-10
			DateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");// 04/10/2020


			Date date=inputFormat.parse(dn_localDate);
			String Dn_Date=outputFormat.format(date);

			//Extend Report -test report generation 
			extentreport=new ExtentReports();
			htmlreporter=new ExtentHtmlReporter("DNWithdrawalValidation.html");
			extentreport.attachReporter(htmlreporter);

			testcase=extentreport.createTest("Verify Local Date between IST & DN for cash withdrawal transaction");
			testcase.log(Status.INFO, "IST Date is "+shclog_localDate+" "+" DN Date is "+Dn_Date);

			if((shclog_localDate).equals(Dn_Date)) 
			{
				testcase.log(Status.PASS, " IST & DN Date is matched for selected cash withdrawal Transaction");
			}
			else
			{
				testcase.log(Status.FAIL, " IST & DN Date is not matched for selected cash withdrawal Transaction");
			}

			testcase=extentreport.createTest("Verify Trace between IST & DN for cash withdrawal transaction");
			testcase.log(Status.INFO, "IST Trace is "+shclog_withdrawal_pojo.ORIGTRACE+" "+"DN Trace is "+dn_withdrawal_pojo.SYS_TRACE_AUDIT_NO);

			if(dn_withdrawal_pojo.SYS_TRACE_AUDIT_NO==shclog_withdrawal_pojo.ORIGTRACE)
			{
				testcase.log(Status.PASS, "IST & DN Trace is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcase.log(Status.FAIL, "IST & DN Trace is not matched for selected cash withdrawal Transaction");
			}

			testcase=extentreport.createTest("Verify Acquirer between IST & DN for cash withdrawal transaction");
			testcase.log(Status.INFO, " IST Acquirer is "+shclog_withdrawal_pojo.ACQUIRER+" "+"DN Acquirer is  "+dn_withdrawal_pojo.INST_ID_ACQ);

			if((dn_withdrawal_pojo.INST_ID_ACQ).equalsIgnoreCase(shclog_withdrawal_pojo.ACQUIRER))
			{
				testcase.log(Status.PASS, "IST & DN Acquirer is matched for selected cash withdrawal Transaction");
			}
			else {
				testcase.log(Status.FAIL, "IST & DN Acquirer is not matched for selected cash withdrawal Transaction");
			}

			testcase=extentreport.createTest("Verify Issuer between IST & DN for cash withdrawal transaction" );
			testcase.log(Status.INFO, " IST Issuer is "+shclog_withdrawal_pojo.ISSUER+" "+"DN Acquirer is  "+dn_withdrawal_pojo.INST_ID_ISS);

			if((dn_withdrawal_pojo.INST_ID_ISS).equalsIgnoreCase(shclog_withdrawal_pojo.ISSUER))
			{
				testcase.log(Status.PASS, "IST & DN Issuer is matched for selected cash withdrawal Transaction");
			}
			else {
				testcase.log(Status.FAIL, "IST & DN Issuer is not matched for selected cash withdrawal Transaction");
			}

			testcase=extentreport.createTest("Verify REF number between IST & DN for cash withdrawal transaction" );
			testcase.log(Status.INFO, " IST REF number is "+shclog_withdrawal_pojo.REFNUM+" "+"DN REF number is  "+dn_withdrawal_pojo.RETRIEVAL_REF_NO);


			if((dn_withdrawal_pojo.RETRIEVAL_REF_NO).equalsIgnoreCase(shclog_withdrawal_pojo.REFNUM)) 
			{
				testcase.log(Status.PASS,"IST & DN REF number is matched for selected cash withdrawal Transaction" );
			}
			else {
				testcase.log(Status.FAIL, "IST & DN REF number is not matched for selected cash withdrawal Transaction");
			}

			testcase=extentreport.createTest("Verify Approvalcode between IST & DN for cash withdrawal transaction" );
			testcase.log(Status.INFO, " IST Approvalcode is "+shclog_withdrawal_pojo.AUTHNUM+" "+"DN Approvalcode is  "+dn_withdrawal_pojo.APPROVAL_CODE);

			if((dn_withdrawal_pojo.APPROVAL_CODE).equalsIgnoreCase(shclog_withdrawal_pojo.AUTHNUM))

			{
				testcase.log(Status.PASS,"IST & DN Approvalcode is matched for selected cash withdrawal Transaction" );
			}
			else {
				testcase.log(Status.FAIL, "IST & DN Approvalcode is not matched for selected cash withdrawal Transaction");
			}



		} 

		catch (ClassNotFoundException | SQLException | IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Issue with Database or file import");
		}
		
		extentreport.flush();

	}
	
	

	public static Shclog_withdrawal_pojo ist_DB() throws SQLException, ClassNotFoundException, IOException {


		FileInputStream fileInputStream=new FileInputStream("configDN.properties");
		Properties properties=new Properties();
		properties.load(fileInputStream);

		String databasedriver=properties.getProperty("DatabaseDriver");
		String databaseurl=properties.getProperty("DatabaseUrl");
		String databasequery=properties.getProperty("DatabaseQuery");
		String databaseuserID=properties.getProperty("DatabaseID");
		String databasepassword=properties.getProperty("DatabasePassword");


		Class.forName(databasedriver);

		Connection connection = DriverManager.getConnection(databaseurl,databaseuserID,databasepassword);

		Statement statement = connection.createStatement();

		ResultSet rs = statement.executeQuery(databasequery);

		Shclog_withdrawal_pojo shclog_withdrawal = new Shclog_withdrawal_pojo();

		while (rs.next()) {

			shclog_withdrawal.setMSGTYPE(rs.getInt(1));
			shclog_withdrawal.setPAN(rs.getString(2));
			shclog_withdrawal.setPCODE(rs.getInt(3));
			shclog_withdrawal.setTXNTYPE(rs.getInt(4));
			shclog_withdrawal.setAMOUNT(rs.getDouble(5));
			shclog_withdrawal.setAVAL_BALANCE(rs.getDouble(6));
			shclog_withdrawal.setFEE(rs.getFloat(7));
			shclog_withdrawal.setTRANDATE(rs.getString(8));
			shclog_withdrawal.setTRANTIME(rs.getString(9));
			shclog_withdrawal.setLOCAL_DATE(rs.getString(10));
			shclog_withdrawal.setLOCAL_TIME(rs.getString(11));
			shclog_withdrawal.setACQUIRER(rs.getString(12));
			shclog_withdrawal.setISSUER(rs.getString(13));
			shclog_withdrawal.setMEMBER_ID(rs.getString(14));
			shclog_withdrawal.setORIGTRACE(rs.getInt(15));
			shclog_withdrawal.setREFNUM(rs.getString(16));
			shclog_withdrawal.setTERMID(rs.getString(17));
			shclog_withdrawal.setTERMINAL_TRACE(18);

		}

		return shclog_withdrawal;

	}

}
