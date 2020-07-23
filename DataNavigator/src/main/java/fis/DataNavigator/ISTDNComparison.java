package fis.DataNavigator;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeoutException;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class ISTDNComparison {

	public static ISTDNComparison comparison=null;

	private ISTDNComparison() {

	}

	public static ISTDNComparison getInstance() {
		if(comparison==null)
			comparison=new ISTDNComparison();
		return comparison;
	}

	//Extend Report 
	ExtentReports extentreport;
	ExtentHtmlReporter htmlreporter;
	ExtentTest testcase;
	ExtentTest testcaseBBLSEGMENT;


	static Logger logger=Logger.getLogger(ISTDNComparison.class);

	@Test
	public void bblTab() throws IOException, ClassNotFoundException, SQLException, AWTException, TimeoutException, RuntimeException, InterruptedException {

		PropertyConfigurator.configure("DNlogs.properties");

		try {


			DnPojo dnvalues=DnInspection.searchTransaction();

			ShcgenericlogPojo istvalues=DNFieldSeparation.fieldBBLDnSegment();

			extentreport=new ExtentReports();
			htmlreporter=new ExtentHtmlReporter("DNWithdrawalValidation.html");
			extentreport.attachReporter(htmlreporter);

			//acct_info1
			testcaseBBLSEGMENT=extentreport.createTest("Verify acct_info1 under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment acct_info1 is "+istvalues.acct_info1+"  &  "+"DN Segment acct_info1 is "+dnvalues.ACCT_INFO_1);

			if((dnvalues.ACCT_INFO_1.trim()).equals(istvalues.acct_info1.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN acct_info1 under BBL Tab is matched for selected cash withdrawal Transaction");

				/*TakesScreenshot screenshot=(TakesScreenshot) driver;
				File Source=screenshot.getScreenshotAs(OutputType.FILE);
				File destination=new File("DNsegment_BBLREFNO.png");
				FileHandler.copy(Source, destination);
				testcaseBBLSEGMENT.addScreenCaptureFromPath("DNsegment_BBLREFNO.png");*/

				Robot robot=new Robot();
				Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
				Rectangle rectangle=new Rectangle(screensize);
				BufferedImage sourcefile=robot.createScreenCapture(rectangle);
				File destinationfile=new File("DNsegment_ACCT_INFO_1.png");
				ImageIO.write(sourcefile, "png", destinationfile);
				testcaseBBLSEGMENT.addScreenCaptureFromPath("DNsegment_ACCT_INFO_1.png");

			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN acct_info1 under BBL Tab is not matched for selected cash withdrawal Transaction");

				Robot robot=new Robot();
				Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
				Rectangle rectangle=new Rectangle(screensize);
				BufferedImage sourcefile=robot.createScreenCapture(rectangle);
				File destinationfile=new File("DNsegment_ACCT_INFO_1.png");
				ImageIO.write(sourcefile, "png", destinationfile);
				testcaseBBLSEGMENT.addScreenCaptureFromPath("DNsegment_ACCT_INFO_1.png");

			}

			//acct_info2

			testcaseBBLSEGMENT=extentreport.createTest("Verify acct_info2 under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment acct_info2 is "+istvalues.acct_info2+"  &  "+"DN Segment acct_info2 is "+dnvalues.ACCT_INFO_2);

			if((dnvalues.ACCT_INFO_2.trim()).equals(istvalues.acct_info2.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN acct_info2 under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN acct_info2 under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//BBL_FILLER_3

			testcaseBBLSEGMENT=extentreport.createTest("Verify bblFiller3 under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment bblFiller3 is "+istvalues.bblFiller3+"  &  "+"DN Segment bblFiller3 is "+dnvalues.BBL_FILLER_3);

			if((dnvalues.BBL_FILLER_3.trim()).equals(istvalues.bblFiller3.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN BBL_FILLER_3 under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN BBL_FILLER_3 under BBL Tab is not matched for selected cash withdrawal Transaction");
			}


			//BBL_FILLER_4

			testcaseBBLSEGMENT=extentreport.createTest("Verify bblFiller4 under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment bblFiller4 is "+istvalues.bblFiller4+"  &  "+"DN Segment bblFiller4 is "+dnvalues.BBL_FILLER_4);

			if((dnvalues.BBL_FILLER_4.trim()).equals(istvalues.bblFiller4.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN BBL_FILLER_4 under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN BBL_FILLER_4 under BBL Tab is not matched for selected cash withdrawal Transaction");
			}


			//BBL_FILLER_5

			testcaseBBLSEGMENT=extentreport.createTest("Verify bblFiller5 under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment bblFiller5 is "+istvalues.bblFiller5+"  &  "+"DN Segment bblFiller5 is "+dnvalues.BBL_FILLER_5);

			if((dnvalues.BBL_FILLER_5.trim()).equals(istvalues.bblFiller5.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN BBL_FILLER_5 under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN BBL_FILLER_5 under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//BBL_FILLER_2

			testcaseBBLSEGMENT=extentreport.createTest("Verify bblFiller2 under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment bblFiller2 is "+istvalues.bblFiller2+"  &  "+"DN Segment bblFiller2 is "+dnvalues.BBL_FILLER_2);

			if((dnvalues.BBL_FILLER_2.trim()).equals(istvalues.bblFiller2.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN BBL_FILLER_2 under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN BBL_FILLER_2 under BBL Tab is not matched for selected cash withdrawal Transaction");
			}


			//bbl_private

			testcaseBBLSEGMENT=extentreport.createTest("Verify bbl_private under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment bbl_private is "+istvalues.bbl_private+"  &  "+"DN Segment bbl_private is "+dnvalues.bbl_private);

			if((dnvalues.bbl_private.trim()).equals(istvalues.bbl_private.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN bbl_private under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN bbl_private under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//BILL_REFERENCE2

			testcaseBBLSEGMENT=extentreport.createTest("Verify BILL_REFERENCE2 under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment BILL_REFERENCE2 is "+istvalues.BillReference2+"  &  "+"DN Segment BILL_REFERENCE2 is "+dnvalues.BILL_REFERENCE2);

			if((dnvalues.BILL_REFERENCE2.trim()).equals(istvalues.BillReference2.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN BILL_REFERENCE2 under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN BILL_REFERENCE2 under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//ACQ_ROUTING_NO

			testcaseBBLSEGMENT=extentreport.createTest("Verify ACQ_ROUTING_NO under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment ACQ_ROUTING_NO is "+istvalues.AcqRoutingNo+"  &  "+"DN Segment ACQ_ROUTING_NO is "+dnvalues.ACQ_ROUTING_NO);

			if((dnvalues.ACQ_ROUTING_NO.trim()).equals(istvalues.AcqRoutingNo.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN ACQ_ROUTING_NO under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN ACQ_ROUTING_NO under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//ATCResult

			testcaseBBLSEGMENT=extentreport.createTest("Verify ATCResult under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment ATCResult is "+istvalues.ATCResult+"  &  "+"DN Segment ATCResult is "+dnvalues.ATCResult);

			if((dnvalues.ATCResult.trim()).equals(istvalues.ATCResult.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN ATCResult under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN ATCResult under BBL Tab is not matched for selected cash withdrawal Transaction");
			}


			//ATM_Terminal_ID

			testcaseBBLSEGMENT=extentreport.createTest("Verify ATM_Terminal_ID under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment ATM_Terminal_ID is "+istvalues.ATM_Terminal_ID+"  &  "+"DN Segment ATM_Terminal_ID is "+dnvalues.ATM_Terminal_ID);

			if((dnvalues.ATM_Terminal_ID.trim()).equals(istvalues.ATM_Terminal_ID.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN ATM_Terminal_ID under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN ATM_Terminal_ID under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//bblATM_Terminal_ID

			testcaseBBLSEGMENT=extentreport.createTest("Verify bblATM_Terminal_ID under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment bblATM_Terminal_ID is "+istvalues.bblATM_Terminal_ID+"  &  "+"DN Segment bblATM_Terminal_ID is "+dnvalues.bblATM_Terminal_ID);

			if((dnvalues.bblATM_Terminal_ID.trim()).equals(istvalues.bblATM_Terminal_ID.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN bblATM_Terminal_ID under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN bblATM_Terminal_ID under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//BBL CARD_OWNER

			testcaseBBLSEGMENT=extentreport.createTest("Verify CARD_OWNER under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment CARD_OWNER is "+istvalues.Card_Owner+"  &  "+"DN Segment CARD_OWNER is "+dnvalues.CARD_OWNER);

			if((dnvalues.CARD_OWNER.trim()).equals(istvalues.Card_Owner.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN CARD_OWNER under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN CARD_OWNER under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//BBL_FILLER_1

			testcaseBBLSEGMENT=extentreport.createTest("Verify BBL_FILLER_1 under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment BBL_FILLER_1 is "+istvalues.bblFiller+"  &  "+"DN Segment BBL_FILLER_1 is "+dnvalues.BBL_FILLER_1);

			if((dnvalues.BBL_FILLER_1.trim()).equals(istvalues.bblFiller.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN BBL_FILLER_1 under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN BBL_FILLER_1 under BBL Tab is not matched for selected cash withdrawal Transaction");
			}


			//BBL_REF_NO
			testcaseBBLSEGMENT=extentreport.createTest("Verify BBLRefNo under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment BBLRefNo is "+istvalues.BBLRefNo+" &   "+"DN Segment BBLRefNo  is "+dnvalues.BBL_REF_NO);

			if((dnvalues.BBL_REF_NO.trim()).equals((istvalues.BBLRefNo.trim())))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN BBLRefNo under BBL Tab is matched for selected cash withdrawal Transaction");

				Robot robot=new Robot();
				Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
				Rectangle rectangle=new Rectangle(screensize);
				BufferedImage sourcefile=robot.createScreenCapture(rectangle);
				File destinationfile=new File("DNsegment_BBL_REF_NO.png");
				ImageIO.write(sourcefile, "png", destinationfile);
				testcaseBBLSEGMENT.addScreenCaptureFromPath("DNsegment_BBL_REF_NO.png");




			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN BBLRefNo under BBL Tab is not matched for selected cash withdrawal Transaction");

				Robot robot=new Robot();
				Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
				Rectangle rectangle=new Rectangle(screensize);
				BufferedImage sourcefile=robot.createScreenCapture(rectangle);
				File destinationfile=new File("DNsegment_BBL_REF_NO.png");
				ImageIO.write(sourcefile, "png", destinationfile);
				testcaseBBLSEGMENT.addScreenCaptureFromPath("DNsegment_BBL_REF_NO.png");
			}

			//BILL_REFERENCE
			testcaseBBLSEGMENT=extentreport.createTest("Verify BILL_REFERENCE under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment BILL_REFERENCE is "+istvalues.billReference+" &   "+"DN Segment BILL_REFERENCE  is "+dnvalues.BILL_REFERENCE);

			if((dnvalues.BILL_REFERENCE.trim()).equals((istvalues.billReference.trim())))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN BILL_REFERENCE under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN BILL_REFERENCE under BBL Tab is not matched for selected cash withdrawal Transaction");
			}


			//BOND_YIELD

			testcaseBBLSEGMENT=extentreport.createTest("Verify BOND_YIELD under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment BOND_YIELD is "+istvalues.BondYield+"  &  "+"DN Segment BOND_YIELD is "+dnvalues.BOND_YIELD);

			if((dnvalues.BOND_YIELD.trim()).equals(istvalues.BondYield.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN BOND_YIELD under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN BOND_YIELD under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//BPDUE_RTPEXP_DATE

			testcaseBBLSEGMENT=extentreport.createTest("Verify BPDUE_RTPEXP_DATE under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment BPDUE_RTPEXP_DATE is "+istvalues.bp_due_rtp_expDate+"  &  "+"DN Segment BPDUE_RTPEXP_DATE is "+dnvalues.BPDUE_RTPEXP_DATE);

			if((dnvalues.BPDUE_RTPEXP_DATE.trim()).equals(istvalues.bp_due_rtp_expDate.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN BPDUE_RTPEXP_DATE under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN BPDUE_RTPEXP_DATE under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//BP_URL

			testcaseBBLSEGMENT=extentreport.createTest("Verify BP_URL under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment BP_URL is "+istvalues.bpURL+"  &  "+"DN Segment BP_URL is "+dnvalues.BP_URL);

			if((dnvalues.BP_URL.trim()).equals(istvalues.bpURL.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN BP_URL under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN BP_URL under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//cardBrand

			testcaseBBLSEGMENT=extentreport.createTest("Verify cardBrand under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment cardBrand is "+istvalues.cardBrand+"  &  "+"DN Segment cardBrand is "+dnvalues.cardBrand);

			if((dnvalues.cardBrand.trim()).equals(istvalues.cardBrand.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN cardBrand under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN cardBrand under BBL Tab is not matched for selected cash withdrawal Transaction");
			}


			//card_location

			testcaseBBLSEGMENT=extentreport.createTest("Verify card_location under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment card_location is "+istvalues.card_location+"  &  "+"DN Segment card_location is "+dnvalues.card_location);

			if((dnvalues.card_location.trim()).equals(istvalues.card_location.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN card_location under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN card_location under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//Card_Owner_BranchCode

			testcaseBBLSEGMENT=extentreport.createTest("Verify Card_Owner_BranchCode under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment Card_Owner_BranchCode is "+istvalues.Card_Owner_BranchCode+"  &  "+"DN Segment Card_Owner_BranchCode is "+dnvalues.Card_Owner_BranchCode);

			if((dnvalues.Card_Owner_BranchCode.trim()).equals(istvalues.Card_Owner_BranchCode.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN Card_Owner_BranchCode under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN Card_Owner_BranchCode under BBL Tab is not matched for selected cash withdrawal Transaction");
			}


			//card_scheme

			testcaseBBLSEGMENT=extentreport.createTest("Verify card_scheme under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment card_scheme is "+istvalues.Card_Owner_BranchCode+"  &  "+"DN Segment card_scheme is "+dnvalues.Card_Owner_BranchCode);

			if((dnvalues.card_scheme.trim()).equals(istvalues.card_scheme.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN card_scheme under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN card_scheme under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//CDM_DATA

			testcaseBBLSEGMENT=extentreport.createTest("Verify CDM_DATA under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment CDM_DATA is "+istvalues.CDM_data+"  &  "+"DN Segment CDM_DATA is "+dnvalues.CDM_DATA);

			if((dnvalues.CDM_DATA.trim()).equals(istvalues.CDM_data.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN CDM_DATA under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN CDM_DATA under BBL Tab is not matched for selected cash withdrawal Transaction");
			}


			//COMPANY_CODE

			testcaseBBLSEGMENT=extentreport.createTest("Verify COMPANY_CODE under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment COMPANY_CODE is "+istvalues.CompCode+"  &  "+"DN Segment COMPANY_CODE is "+dnvalues.COMPANY_CODE);

			if((dnvalues.COMPANY_CODE.trim()).equals(istvalues.CompCode.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN COMPANY_CODE under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN COMPANY_CODE under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//CREDIT_NOTIF_REF

			testcaseBBLSEGMENT=extentreport.createTest("Verify CREDIT_NOTIF_REF under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment CREDIT_NOTIF_REF is "+istvalues.credit_notif_ref+"  &  "+"DN Segment CREDIT_NOTIF_REF is "+dnvalues.CREDIT_NOTIF_REF);

			if((dnvalues.CREDIT_NOTIF_REF.trim()).equals(istvalues.credit_notif_ref.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN CREDIT_NOTIF_REF under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN CREDIT_NOTIF_REF under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//CrossBorderFlag

			testcaseBBLSEGMENT=extentreport.createTest("Verify CrossBorderFlag under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment CrossBorderFlag is "+istvalues.CrossBorderFlag+"  &  "+"DN Segment CrossBorderFlag is "+dnvalues.CrossBorderFlag);

			if((dnvalues.CrossBorderFlag.trim()).equals(istvalues.CrossBorderFlag.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN CrossBorderFlag under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN CrossBorderFlag under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			/*//CVV_CVC_RESULT -> doubht

			testcaseBBLSEGMENT=extentreport.createTest("Verify CVV_CVC_RESULT under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment CVV_CVC_RESULT is "+istvalues.CVV1_CVC1_Result+"  &  "+"DN Segment CVV_CVC_RESULT is "+dnvalues.CVV_CVC_RESULT);

			if((dnvalues.CVV_CVC_RESULT.trim()).equals(istvalues.CVV1_CVC1_Result.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN CVV_CVC_RESULT under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN CVV_CVC_RESULT under BBL Tab is not matched for selected cash withdrawal Transaction");
			}*/

			//CVV2AcquirerResult

			testcaseBBLSEGMENT=extentreport.createTest("Verify CVV2AcquirerResult under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment CVV2AcquirerResult is "+istvalues.CVV2AcquirerResult+"  &  "+"DN Segment CVV2AcquirerResult is "+dnvalues.CVV2AcquirerResult);

			if((dnvalues.CVV2AcquirerResult.trim()).equals(istvalues.CVV2AcquirerResult.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN CVV2AcquirerResult under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN CVV2AcquirerResult under BBL Tab is not matched for selected cash withdrawal Transaction");
			}


			//CVV2IssuerResult

			testcaseBBLSEGMENT=extentreport.createTest("Verify CVV2IssuerResult under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment CVV2IssuerResult is "+istvalues.CVV2AcquirerResult+"  &  "+"DN Segment CVV2IssuerResult is "+dnvalues.CVV2AcquirerResult);

			if((dnvalues.CVV2IssuerResult.trim()).equals(istvalues.CVV2IssuerResult.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN CVV2IssuerResult under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN CVV2IssuerResult under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//CVV2PresenceIndicator

			testcaseBBLSEGMENT=extentreport.createTest("Verify CVV2PresenceIndicator under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment CVV2PresenceIndicator is "+istvalues.CVV2PresenceIndicator+"  &  "+"DN Segment CVV2PresenceIndicator is "+dnvalues.CVV2PresenceIndicator);

			if((dnvalues.CVV2PresenceIndicator.trim()).equals(istvalues.CVV2PresenceIndicator.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN CVV2PresenceIndicator under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN CVV2PresenceIndicator under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//CVV2ResponseIndicator

			testcaseBBLSEGMENT=extentreport.createTest("Verify CVV2ResponseIndicator under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment CVV2ResponseIndicator is "+istvalues.CVV2PresenceIndicator+"  &  "+"DN Segment CVV2ResponseIndicator is "+dnvalues.CVV2PresenceIndicator);

			if((dnvalues.CVV2ResponseIndicator.trim()).equals(istvalues.CVV2ResponseIndicator.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN CVV2ResponseIndicator under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN CVV2ResponseIndicator under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//DCC_Home_CCY_Name

			testcaseBBLSEGMENT=extentreport.createTest("Verify DCC_Home_CCY_Name under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment DCC_Home_CCY_Name is "+istvalues.DCC_Home_CCY_Name+"  &  "+"DN Segment DCC_Home_CCY_Name is "+dnvalues.DCC_Home_CCY_Name);

			if((dnvalues.DCC_Home_CCY_Name.trim()).equals(istvalues.DCC_Home_CCY_Name.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN DCC_Home_CCY_Name under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN DCC_Home_CCY_Name under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//DEST_ROUTING_NO

			testcaseBBLSEGMENT=extentreport.createTest("Verify DEST_ROUTING_NO under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment DEST_ROUTING_NO is "+istvalues.DestRoutingNo+"  &  "+"DN Segment DEST_ROUTING_NO is "+dnvalues.DEST_ROUTING_NO);

			if((dnvalues.DEST_ROUTING_NO.trim()).equals(istvalues.DestRoutingNo.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN DEST_ROUTING_NO under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN DEST_ROUTING_NO under BBL Tab is not matched for selected cash withdrawal Transaction");
			}


			//deviceTypeChannel

			testcaseBBLSEGMENT=extentreport.createTest("Verify deviceTypeChannel under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment deviceTypeChannel is "+istvalues.deviceTypeChannel+"  &  "+"DN Segment deviceTypeChannel is "+dnvalues.deviceTypeChannel);

			if((dnvalues.deviceTypeChannel.trim()).equals(istvalues.deviceTypeChannel.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN deviceTypeChannel under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN deviceTypeChannel under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//EXT_FROM_ACCT_TYPE

			testcaseBBLSEGMENT=extentreport.createTest("Verify EXT_FROM_ACCT_TYPE under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment EXT_FROM_ACCT_TYPE is "+istvalues.ExtFromAcctType+"  &  "+"DN Segment EXT_FROM_ACCT_TYPE is "+dnvalues.EXT_FROM_ACCT_TYPE);

			if((dnvalues.EXT_FROM_ACCT_TYPE.trim()).equals(istvalues.ExtFromAcctType.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN EXT_FROM_ACCT_TYPE under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN EXT_FROM_ACCT_TYPE under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//EXT_TO_ACCT_TYPE

			testcaseBBLSEGMENT=extentreport.createTest("Verify EXT_TO_ACCT_TYPE under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment EXT_TO_ACCT_TYPE is "+istvalues.ExtToAcctType+"  &  "+"DN Segment EXT_TO_ACCT_TYPE is "+dnvalues.EXT_TO_ACCT_TYPE);

			if((dnvalues.EXT_TO_ACCT_TYPE.trim()).equals(istvalues.ExtToAcctType.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN EXT_TO_ACCT_TYPE under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN EXT_TO_ACCT_TYPE under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//FLAGS

			testcaseBBLSEGMENT=extentreport.createTest("Verify FLAGS under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment FLAGS is "+istvalues.Flags+"  &  "+"DN Segment FLAGS is "+dnvalues.FLAGS);

			if((dnvalues.FLAGS.trim()).equals(istvalues.Flags.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN FLAGS under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN FLAGS under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//FromAcctDispName

			testcaseBBLSEGMENT=extentreport.createTest("Verify FromAcctDispName under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment FromAcctDispName is "+istvalues.FromAcctDispName+"  &  "+"DN Segment FromAcctDispName is "+dnvalues.FROM_ACCT_DISP_NAME);

			if((dnvalues.FROM_ACCT_DISP_NAME.trim()).equals(istvalues.FromAcctDispName.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN FromAcctDispName under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN FromAcctDispName under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//FROM_ACCT_NAME

			testcaseBBLSEGMENT=extentreport.createTest("Verify FROM_ACCT_NAME under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment FROM_ACCT_NAME is "+istvalues.FromAcctName+"  &  "+"DN Segment FromAcctDispName is "+dnvalues.FROM_ACCT_NAME);

			if((dnvalues.FROM_ACCT_NAME.trim()).equals(istvalues.FromAcctName.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN FROM_ACCT_NAME under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN FROM_ACCT_NAME under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//FrAcct_Owner_Branch

			testcaseBBLSEGMENT=extentreport.createTest("Verify FrAcct_Owner_Branch under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment FrAcct_Owner_Branch is "+istvalues.FrAcct_Owner_Branch+"  &  "+"DN Segment FrAcct_Owner_Branch is "+dnvalues.FrAcct_Owner_Branch);

			if((dnvalues.FrAcct_Owner_Branch.trim()).equals(istvalues.FrAcct_Owner_Branch.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN FrAcct_Owner_Branch under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN FrAcct_Owner_Branch under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//FRM_FUND_CODE

			testcaseBBLSEGMENT=extentreport.createTest("Verify FRM_FUND_CODE under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment FRM_FUND_CODE is "+istvalues.Frm_FundCode+"  &  "+"DN Segment FRM_FUND_CODE is "+dnvalues.FRM_FUND_CODE);

			if((dnvalues.FRM_FUND_CODE.trim()).equals(istvalues.Frm_FundCode.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN FRM_FUND_CODE under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN FRM_FUND_CODE under BBL Tab is not matched for selected cash withdrawal Transaction");
			}


			//IR_Counter

			testcaseBBLSEGMENT=extentreport.createTest("Verify IR_Counter under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment IR_Counter is "+istvalues.IR_Counter+"  &  "+"DN Segment IR_Counter is "+dnvalues.IR_Counter);

			if((dnvalues.IR_Counter.trim()).equals(istvalues.IR_Counter.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN IR_Counter under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN IR_Counter under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//IR_Flag

			testcaseBBLSEGMENT=extentreport.createTest("Verify IR_Flag under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment IR_Flag is "+istvalues.IR_Flag+"  &  "+"DN Segment IR_Flag is "+dnvalues.IR_Flag);

			if((dnvalues.IR_Flag.trim()).equals(istvalues.IR_Flag.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN IR_Flag under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN IR_Flag under BBL Tab is not matched for selected cash withdrawal Transaction");
			}


			//IssRoutingNo

			testcaseBBLSEGMENT=extentreport.createTest("Verify IssRoutingNo under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment IssRoutingNo is "+istvalues.IssRoutingNo+"  &  "+"DN Segment IssRoutingNo is "+dnvalues.IssRoutingNo);

			if((dnvalues.IssRoutingNo.trim()).equals(istvalues.IssRoutingNo.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN IssRoutingNo under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN IssRoutingNo under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//Original_Card_Owner

			testcaseBBLSEGMENT=extentreport.createTest("Verify Original_Card_Owner under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment Original_Card_Owner is "+istvalues.Original_Card_Owner+"  &  "+"DN Segment Original_Card_Owner is "+dnvalues.Original_Card_Owner);

			if((dnvalues.Original_Card_Owner.trim()).equals(istvalues.Original_Card_Owner.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN Original_Card_Owner under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN Original_Card_Owner under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//Original_Terminal_Owner

			testcaseBBLSEGMENT=extentreport.createTest("Verify Original_Terminal_Owner under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment Original_Terminal_Owner is "+istvalues.Original_Terminal_Owner+"  &  "+"DN Segment Original_Terminal_Owner is "+dnvalues.Original_Terminal_Owner);

			if((dnvalues.Original_Terminal_Owner.trim()).equals(istvalues.Original_Terminal_Owner.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN Original_Terminal_Owner under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN Original_Terminal_Owner under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//Oth_Bank_Use_Counter

			testcaseBBLSEGMENT=extentreport.createTest("Verify Oth_Bank_Use_Counter under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment Oth_Bank_Use_Counter is "+istvalues.Oth_Bank_Use_Counter+"  &  "+"DN Segment Oth_Bank_Use_Counter is "+dnvalues.Oth_Bank_Use_Counter);

			if((dnvalues.Oth_Bank_Use_Counter.trim()).equals(istvalues.Oth_Bank_Use_Counter.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN Oth_Bank_Use_Counter under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN Oth_Bank_Use_Counter under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//OTP

			testcaseBBLSEGMENT=extentreport.createTest("Verify OTP under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment OTP is "+istvalues.Oth_Bank_Use_Counter+"  &  "+"DN Segment OTP is "+dnvalues.OTP);

			if((dnvalues.OTP.trim()).equals(istvalues.OTP.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN OTP under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN OTP under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//Partial_Reverse_Amount

			testcaseBBLSEGMENT=extentreport.createTest("Verify Partial_Reverse_Amount under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment Partial_Reverse_Amount is "+istvalues.Partial_Reverse_Amount+"  &  "+"DN Segment OTP is "+dnvalues.Partial_Reverse_Amount);

			if((dnvalues.Partial_Reverse_Amount.trim()).equals(istvalues.Partial_Reverse_Amount.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN Partial_Reverse_Amount under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN Partial_Reverse_Amount under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//PAYEE

			testcaseBBLSEGMENT=extentreport.createTest("Verify PAYEE under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment PAYEE is "+istvalues.PayeeName+"  &  "+"DN Segment PAYEE is "+dnvalues.PAYEE);

			if((dnvalues.PAYEE.trim()).equals(istvalues.PayeeName.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN PAYEE under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN PAYEE under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//PAYMENT_1

			testcaseBBLSEGMENT=extentreport.createTest("Verify PAYMENT_1 under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment PAYMENT_1 is "+istvalues.Payment1+"  &  "+"DN Segment PAYMENT_1 is "+dnvalues.PAYMENT_1);

			if((dnvalues.PAYMENT_1.trim()).equals(istvalues.Payment1.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN PAYMENT_1 under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN PAYMENT_1 under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//PAYMENT_2

			testcaseBBLSEGMENT=extentreport.createTest("Verify PAYMENT_2 under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment PAYMENT_2 is "+istvalues.Payment2+"  &  "+"DN Segment PAYMENT_2 is "+dnvalues.PAYMENT_2);

			if((dnvalues.PAYMENT_2.trim()).equals(istvalues.Payment2.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN PAYMENT_2 under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN PAYMENT_2 under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//PAYMENT_3

			testcaseBBLSEGMENT=extentreport.createTest("Verify PAYMENT_3 under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment PAYMENT_3 is "+istvalues.Payment3+"  &  "+"DN Segment PAYMENT_3 is "+dnvalues.PAYMENT_3);

			if((dnvalues.PAYMENT_3.trim()).equals(istvalues.Payment3.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN PAYMENT_3 under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN PAYMENT_3 under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//QRC_VOUCHER

			testcaseBBLSEGMENT=extentreport.createTest("Verify QRC_VOUCHER under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment QRC_VOUCHER is "+istvalues.QRCVoucher+"  &  "+"DN Segment QRC_VOUCHER is "+dnvalues.QRC_VOUCHER);

			if((dnvalues.QRC_VOUCHER.trim()).equals(istvalues.QRCVoucher.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN QRC_VOUCHER under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN QRC_VOUCHER under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//RECV_COMP_ACCT_NO

			testcaseBBLSEGMENT=extentreport.createTest("Verify RECV_COMP_ACCT_NO under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment RECV_COMP_ACCT_NO is "+istvalues.ReceiverCompAcctNo+"  &  "+"DN Segment RECV_COMP_ACCT_NO is "+dnvalues.RECV_COMP_ACCT_NO);

			if((dnvalues.RECV_COMP_ACCT_NO.trim()).equals(istvalues.ReceiverCompAcctNo.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN RECV_COMP_ACCT_NO under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN RECV_COMP_ACCT_NO under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//RECV_COMP_TAX_ID

			testcaseBBLSEGMENT=extentreport.createTest("Verify RECV_COMP_TAX_ID under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment RECV_COMP_TAX_ID is "+istvalues.ReceiverCompTaxID+"  &  "+"DN Segment RECV_COMP_TAX_ID is "+dnvalues.RECV_COMP_TAX_ID);

			if((dnvalues.RECV_COMP_TAX_ID.trim()).equals(istvalues.ReceiverCompTaxID.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN RECV_COMP_TAX_ID under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN RECV_COMP_TAX_ID under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//RECV_PROXY_ID

			testcaseBBLSEGMENT=extentreport.createTest("Verify RECV_PROXY_ID under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment RECV_PROXY_ID is "+istvalues.RecvProxyID+"  &  "+"DN Segment RECV_PROXY_ID is "+dnvalues.RECV_PROXY_ID);

			if((dnvalues.RECV_PROXY_ID.trim()).equals(istvalues.RecvProxyID.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN RECV_PROXY_ID under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN RECV_PROXY_ID under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//RECV_PROXY_TYPE

			testcaseBBLSEGMENT=extentreport.createTest("Verify RECV_PROXY_TYPE under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment RECV_PROXY_TYPE is "+istvalues.RecvProxyType+"  &  "+"DN Segment RECV_PROXY_TYPE is "+dnvalues.RECV_PROXY_TYPE);

			if((dnvalues.RECV_PROXY_TYPE.trim()).equals(istvalues.RecvProxyType.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN RECV_PROXY_TYPE under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN RECV_PROXY_TYPE under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//RECV_TAX_ID

			testcaseBBLSEGMENT=extentreport.createTest("Verify RECV_TAX_ID under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment RECV_TAX_ID is "+istvalues.ReceiverTaxID+"  &  "+"DN Segment RECV_TAX_ID is "+dnvalues.RECV_TAX_ID);

			if((dnvalues.RECV_TAX_ID.trim()).equals(istvalues.ReceiverTaxID.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN RECV_TAX_ID under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN RECV_TAX_ID under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//REF_NO

			testcaseBBLSEGMENT=extentreport.createTest("Verify REF_NO under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment REF_NO is "+istvalues.RefNo+"  &  "+"DN Segment REF_NO is "+dnvalues.REF_NO);

			if((dnvalues.REF_NO.trim()).equals(istvalues.RefNo.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN REF_NO under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN REF_NO under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//SENDER_COMP_ACCT_NO

			testcaseBBLSEGMENT=extentreport.createTest("Verify SENDER_COMP_ACCT_NO under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment SENDER_COMP_ACCT_NO is "+istvalues.SendCompAcctNo+"  &  "+"DN Segment SENDER_COMP_ACCT_NO is "+dnvalues.SENDER_COMP_ACCT_NO);

			if((dnvalues.SENDER_COMP_ACCT_NO.trim()).equals(istvalues.SendCompAcctNo.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN SENDER_COMP_ACCT_NO under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN SENDER_COMP_ACCT_NO under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//SENDER_COMP_TAX_ID

			testcaseBBLSEGMENT=extentreport.createTest("Verify SENDER_COMP_TAX_ID under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment SENDER_COMP_TAX_ID is "+istvalues.SendCompTaxID+"  &  "+"DN Segment SENDER_COMP_TAX_ID is "+dnvalues.SENDER_COMP_TAX_ID);

			if((dnvalues.SENDER_COMP_TAX_ID.trim()).equals(istvalues.SendCompTaxID.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN SENDER_COMP_TAX_ID under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN SENDER_COMP_TAX_ID under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//SENDER_COMP_TAX_ID

			testcaseBBLSEGMENT=extentreport.createTest("Verify SENDER_COMP_TAX_ID under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment SENDER_COMP_TAX_ID is "+istvalues.SendCompTaxID+"  &  "+"DN Segment SENDER_COMP_TAX_ID is "+dnvalues.SENDER_COMP_TAX_ID);

			if((dnvalues.SENDER_COMP_TAX_ID.trim()).equals(istvalues.SendCompTaxID.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN SENDER_COMP_TAX_ID under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN SENDER_COMP_TAX_ID under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//SENDER_REF_NO

			testcaseBBLSEGMENT=extentreport.createTest("Verify SENDER_REF_NO under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment SENDER_REF_NO is "+istvalues.SendRefNo+"  &  "+"DN Segment SENDER_REF_NO is "+dnvalues.SENDER_REF_NO);

			if((dnvalues.SENDER_REF_NO.trim()).equals(istvalues.SendRefNo.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN SENDER_REF_NO under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN SENDER_REF_NO under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//SENDER_TAX_ID

			testcaseBBLSEGMENT=extentreport.createTest("Verify SENDER_TAX_ID under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment SENDER_TAX_ID is "+istvalues.SenderTaxID+"  &  "+"DN Segment SENDER_TAX_ID is "+dnvalues.SENDER_TAX_ID);

			if((dnvalues.SENDER_TAX_ID.trim()).equals(istvalues.SenderTaxID.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN SENDER_TAX_ID under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN SENDER_TAX_ID under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//SENDER_PROXY_ID

			testcaseBBLSEGMENT=extentreport.createTest("Verify SENDER_PROXY_ID under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment SENDER_PROXY_ID is "+istvalues.SendProxyID+"  &  "+"DN Segment SENDER_PROXY_ID is "+dnvalues.SENDER_PROXY_ID);

			if((dnvalues.SENDER_PROXY_ID.trim()).equals(istvalues.SendProxyID.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN SENDER_PROXY_ID under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN SENDER_PROXY_ID under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//SENDER_PROXY_TYPE

			testcaseBBLSEGMENT=extentreport.createTest("Verify SENDER_PROXY_TYPE under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment SENDER_PROXY_TYPE is "+istvalues.SendProxyType+"  &  "+"DN Segment SENDER_PROXY_TYPE is "+dnvalues.SENDER_PROXY_TYPE);

			if((dnvalues.SENDER_PROXY_TYPE.trim()).equals(istvalues.SendProxyType.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN SENDER_PROXY_TYPE under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN SENDER_PROXY_TYPE under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			/*//SERV_TYPE_CODE-- doubht

			testcaseBBLSEGMENT=extentreport.createTest("Verify SERV_TYPE_CODE under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment SERV_TYPE_CODE is "+istvalues.SendProxyType+"  &  "+"DN Segment SERV_TYPE_CODE is "+dnvalues.SENDER_PROXY_TYPE);

			if((dnvalues.SERV_TYPE_CODE.trim()).equals(istvalues.Se.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN SERV_TYPE_CODE under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN SERV_TYPE_CODE under BBL Tab is not matched for selected cash withdrawal Transaction");
			}*/

			//SERVICE_CODE

			testcaseBBLSEGMENT=extentreport.createTest("Verify SERVICE_CODE under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment SERVICE_CODE is "+istvalues.ServCode+"  &  "+"DN Segment SERVICE_CODE is "+dnvalues.SERVICE_CODE);

			if((dnvalues.SERVICE_CODE.trim()).equals(istvalues.ServCode.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN SERVICE_CODE under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN SERVICE_CODE under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//SMS_FEE

			testcaseBBLSEGMENT=extentreport.createTest("Verify SMS_FEE under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment SMS_FEE is "+istvalues.sms_fee+"  &  "+"DN Segment SMS_FEE is "+dnvalues.SMS_FEE);

			if((dnvalues.SMS_FEE.trim()).equals(istvalues.sms_fee.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN SMS_FEE under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN SMS_FEE under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//SMS_MOBILE

			testcaseBBLSEGMENT=extentreport.createTest("Verify SMS_MOBILE under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment SMS_MOBILE is "+istvalues.sms_mobile+"  &  "+"DN Segment SMS_MOBILE is "+dnvalues.SMS_MOBILE);

			if((dnvalues.SMS_MOBILE.trim()).equals(istvalues.sms_mobile.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN SMS_MOBILE under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN SMS_MOBILE under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//STANDIN_ACT

			testcaseBBLSEGMENT=extentreport.createTest("Verify STANDIN_ACT under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment STANDIN_ACT is "+istvalues.IST_StandIn_Ind+"  &  "+"DN Segment STANDIN_ACT is "+dnvalues.STANDIN_ACT);

			if((dnvalues.STANDIN_ACT.trim()).equals(istvalues.IST_StandIn_Ind.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN STANDIN_ACT under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN STANDIN_ACT under BBL Tab is not matched for selected cash withdrawal Transaction");
			}


			//SURCHARGE_FEE

			testcaseBBLSEGMENT=extentreport.createTest("Verify SURCHARGE_FEE under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment SURCHARGE_FEE is "+istvalues.Surcharge_Fee+"  &  "+"DN Segment SURCHARGE_FEE is "+dnvalues.SURCHARGE_FEE);

			if((dnvalues.SURCHARGE_FEE.trim()).equals(istvalues.Surcharge_Fee.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN SURCHARGE_FEE under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN SURCHARGE_FEE under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//TAX_INVOICE

			testcaseBBLSEGMENT=extentreport.createTest("Verify TAX_INVOICE under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment TAX_INVOICE is "+istvalues.TaxInvoice+"  &  "+"DN Segment TAX_INVOICE is "+dnvalues.TAX_INVOICE);

			if((dnvalues.TAX_INVOICE.trim()).equals(istvalues.TaxInvoice.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN TAX_INVOICE under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN TAX_INVOICE under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//Terminal_Owner_BranchCode

			testcaseBBLSEGMENT=extentreport.createTest("Verify Terminal_Owner_BranchCode under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment Terminal_Owner_BranchCode is "+istvalues.Terminal_Owner_BranchCode+"  &  "+"DN Segment Terminal_Owner_BranchCode is "+dnvalues.Terminal_Owner_BranchCode);

			if((dnvalues.Terminal_Owner_BranchCode.trim()).equals(istvalues.Terminal_Owner_BranchCode.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN Terminal_Owner_BranchCode under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN Terminal_Owner_BranchCode under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//Terminal_Provice_RegionID

			testcaseBBLSEGMENT=extentreport.createTest("Verify Terminal_Provice_RegionID under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment Terminal_Provice_RegionID is "+istvalues.Terminal_Provice_RegionID+"  &  "+"DN Segment Terminal_Provice_RegionID is "+dnvalues.Terminal_Provice_RegionID);

			if((dnvalues.Terminal_Provice_RegionID.trim()).equals(istvalues.Terminal_Provice_RegionID.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN Terminal_Provice_RegionID under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN Terminal_Provice_RegionID under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			/*//TERMINAL_TRACE

			testcaseBBLSEGMENT=extentreport.createTest("Verify TERMINAL_TRACE under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment TERMINAL_TRACE is "+istvalues.Terminal_State+"  &  "+"DN Segment TERMINAL_TRACE is "+dnvalues.Terminal_State);

			if((dnvalues.TERMINAL_TRACE.trim()).equals(istvalues.Terminaltra.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN TERMINAL_TRACE under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN TERMINAL_TRACE under BBL Tab is not matched for selected cash withdrawal Transaction");
			}*/

			//TO_ACCT_DISP_NAME

			testcaseBBLSEGMENT=extentreport.createTest("Verify TO_ACCT_DISP_NAME under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment TO_ACCT_DISP_NAME is "+istvalues.ToAcctDispName+"  &  "+"DN Segment TO_ACCT_DISP_NAME is "+dnvalues.TO_ACCT_DISP_NAME);

			if((dnvalues.TO_ACCT_DISP_NAME.trim()).equals(istvalues.ToAcctDispName.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN TO_ACCT_DISP_NAME under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN TO_ACCT_DISP_NAME under BBL Tab is not matched for selected cash withdrawal Transaction");
			}


			//TO_ACCT_NAME

			testcaseBBLSEGMENT=extentreport.createTest("Verify TO_ACCT_NAME under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment TO_ACCT_NAME is "+istvalues.ToAcctName+"  &  "+"DN Segment TO_ACCT_DISP_NAME is "+dnvalues.TO_ACCT_NAME);

			if((dnvalues.TO_ACCT_NAME.trim()).equals(istvalues.ToAcctName.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN TO_ACCT_NAME under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN TO_ACCT_NAME under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//ToAcct_Owner_Branch

			testcaseBBLSEGMENT=extentreport.createTest("Verify ToAcct_Owner_Branch under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment ToAcct_Owner_Branch is "+istvalues.ToAcct_Owner_Branch+"  &  "+"DN Segment ToAcct_Owner_Branch is "+dnvalues.ToAcct_Owner_Branch);

			if((dnvalues.ToAcct_Owner_Branch.trim()).equals(istvalues.ToAcct_Owner_Branch.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN ToAcct_Owner_Branch under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN ToAcct_Owner_Branch under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//TO_FUND_CODE

			testcaseBBLSEGMENT=extentreport.createTest("Verify TO_FUND_CODE under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment TO_FUND_CODE is "+istvalues.To_FundCode+"  &  "+"DN Segment ToAcct_Owner_Branch is "+dnvalues.TO_FUND_CODE);

			if((dnvalues.TO_FUND_CODE.trim()).equals(istvalues.To_FundCode.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN TO_FUND_CODE under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN TO_FUND_CODE under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//txn_service

			testcaseBBLSEGMENT=extentreport.createTest("Verify txn_service under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment txn_service is "+istvalues.txn_service+"  &  "+"DN Segment ToAcct_Owner_Branch is "+dnvalues.txn_service);

			if((dnvalues.txn_service.trim()).equals(istvalues.txn_service.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN txn_service under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN txn_service under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//TYPE_OF_INCOME

			testcaseBBLSEGMENT=extentreport.createTest("Verify TYPE_OF_INCOME under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment TYPE_OF_INCOME is "+istvalues.TypeOfIncome+"  &  "+"DN Segment TYPE_OF_INCOME is "+dnvalues.TYPE_OF_INCOME);

			if((dnvalues.TYPE_OF_INCOME.trim()).equals(istvalues.TypeOfIncome.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN TYPE_OF_INCOME under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN TYPE_OF_INCOME under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//UNIT_PRICE

			testcaseBBLSEGMENT=extentreport.createTest("Verify UNIT_PRICE under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment UNIT_PRICE is "+istvalues.UnitPrice+"  &  "+"DN Segment TYPE_OF_INCOME is "+dnvalues.UNIT_PRICE);

			if((dnvalues.UNIT_PRICE.trim()).equals(istvalues.UnitPrice.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN UNIT_PRICE under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN UNIT_PRICE under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//UNIT

			testcaseBBLSEGMENT=extentreport.createTest("Verify UNIT under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment UNIT is "+istvalues.Unit+"  &  "+"DN Segment UNIT is "+dnvalues.UNIT);

			if((dnvalues.UNIT.trim()).equals(istvalues.Unit.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN UNIT under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN UNIT under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//USER_DATA_1

			testcaseBBLSEGMENT=extentreport.createTest("Verify USER_DATA_1 under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment USER_DATA_1 is "+istvalues.UserData1+"  &  "+"DN Segment USER_DATA_1 is "+dnvalues.USER_DATA_1);

			if((dnvalues.USER_DATA_1.trim()).equals(istvalues.UserData1.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN USER_DATA_1 under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN USER_DATA_1 under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//USER_DATA_2

			testcaseBBLSEGMENT=extentreport.createTest("Verify USER_DATA_2 under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment USER_DATA_2 is "+istvalues.UserData2+"  &  "+"DN Segment USER_DATA_2 is "+dnvalues.USER_DATA_2);

			if((dnvalues.USER_DATA_2.trim()).equals(istvalues.UserData2.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN USER_DATA_2 under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN USER_DATA_2 under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//USER_DATA_3

			testcaseBBLSEGMENT=extentreport.createTest("Verify USER_DATA_3 under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment USER_DATA_3 is "+istvalues.UserData3+"  &  "+"DN Segment USER_DATA_3 is "+dnvalues.USER_DATA_3);

			if((dnvalues.USER_DATA_3.trim()).equals(istvalues.UserData3.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN USER_DATA_3 under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN USER_DATA_3 under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//USER_DATA_4

			testcaseBBLSEGMENT=extentreport.createTest("Verify USER_DATA_4 under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment USER_DATA_4 is "+istvalues.UserData4+"  &  "+"DN Segment USER_DATA_4 is "+dnvalues.USER_DATA_4);

			if((dnvalues.USER_DATA_4.trim()).equals(istvalues.UserData4.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN USER_DATA_4 under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN USER_DATA_4 under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//USER_DATA_5

			testcaseBBLSEGMENT=extentreport.createTest("Verify USER_DATA_5 under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment USER_DATA_5 is "+istvalues.UserData5+"  &  "+"DN Segment USER_DATA_5 is "+dnvalues.USER_DATA_5);

			if((dnvalues.USER_DATA_5.trim()).equals(istvalues.UserData5.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN USER_DATA_5 under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN USER_DATA_5 under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//VAT

			testcaseBBLSEGMENT=extentreport.createTest("Verify VAT under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment VAT is "+istvalues.Vat+"  &  "+"DN Segment VAT is "+dnvalues.VAT);

			if((dnvalues.VAT.trim()).equals(istvalues.Vat.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN VAT under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN VAT under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//VAT_RATE

			testcaseBBLSEGMENT=extentreport.createTest("Verify VAT_RATE under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment VAT_RATE is "+istvalues.VatRate+"  &  "+"DN Segment VAT_RATE is "+dnvalues.VAT_RATE);

			if((dnvalues.VAT_RATE.trim()).equals(istvalues.VatRate.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN VAT_RATE under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN VAT_RATE under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//WHT_TAX_COND

			testcaseBBLSEGMENT=extentreport.createTest("Verify WHT_TAX_COND under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment WHT_TAX_COND is "+istvalues.WHTTaxCon+"  &  "+"DN Segment WHT_TAX_COND is "+dnvalues.WHT_TAX_COND);

			if((dnvalues.WHT_TAX_COND.trim()).equals(istvalues.WHTTaxCon.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN WHT_TAX_COND under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN WHT_TAX_COND under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//WHT_TAX_RATE

			testcaseBBLSEGMENT=extentreport.createTest("Verify WHT_TAX_RATE under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment WHT_TAX_RATE is "+istvalues.WHTTaxRate+"  &  "+"DN Segment WHT_TAX_RATE is "+dnvalues.WHT_TAX_RATE);

			if((dnvalues.WHT_TAX_RATE.trim()).equals(istvalues.WHTTaxRate.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN WHT_TAX_RATE under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN WHT_TAX_RATE under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			//WHT_TAX

			testcaseBBLSEGMENT=extentreport.createTest("Verify WHT_TAX under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment WHT_TAX is "+istvalues.WHTTax+"  &  "+"DN Segment WHT_TAX is "+dnvalues.WHT_TAX);

			if((dnvalues.WHT_TAX.trim()).equals(istvalues.WHTTax.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN WHT_TAX under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN WHT_TAX under BBL Tab is not matched for selected cash withdrawal Transaction");
			}


			testcaseBBLSEGMENT=extentreport.createTest("Verify RecvProxyID under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment RecvProxyID is "+istvalues.RecvProxyID+"  &  "+"DN Segment RecvProxyID is "+dnvalues.RECV_PROXY_ID);

			if((dnvalues.RECV_PROXY_ID.trim()).equals(istvalues.RecvProxyID.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN RecvProxyID under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN RecvProxyID under BBL Tab is not matched for selected cash withdrawal Transaction");
			}

			testcaseBBLSEGMENT=extentreport.createTest("Verify SendProxyID under BBL Tab between IST & DN for cash withdrawal transaction");
			testcaseBBLSEGMENT.log(Status.INFO, "IST Segment SendProxyID is "+istvalues.SendProxyID+"  &  "+"DN Segment SendProxyID  is "+dnvalues.SENDER_PROXY_ID);

			if((dnvalues.SENDER_PROXY_ID.trim()).equals(istvalues.SendProxyID.trim()))
			{
				testcaseBBLSEGMENT.log(Status.PASS, "IST & DN SendProxyID under BBL Tab is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcaseBBLSEGMENT.log(Status.FAIL, "IST & DN SendProxyID under BBL Tab is not matched for selected cash withdrawal Transaction");
			}




		}

		catch (ClassNotFoundException | SQLException | IOException  |AWTException | TimeoutException | RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("Verifying BBL Tab fields - Issue with Database or file import or Date Parsing",e);
			System.out.println("Issue with Database or file import or Date Parsing");
		}

		extentreport.flush();



	}


	public void transactionDetailsTab() throws InterruptedException, IOException, ClassNotFoundException, SQLException, ParseException, AWTException, TimeoutException {

		PropertyConfigurator.configure("DNlogs.properties");

		try {

			DnPojo dnvalues=DnInspection.searchTransaction();

			ShclogPojo istvalues=ShclogData.getShclogData();

			extentreport=new ExtentReports();
			htmlreporter=new ExtentHtmlReporter("DNWithdrawalValidation.html");
			extentreport.attachReporter(htmlreporter);



			//Date Conversion

			String istDate=istvalues.LOCAL_DATE.split(" ")[0];
			String dndate=dnvalues.TSTAMP_LOCAL.split(" ")[0];

			DateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");// 2020-04-10
			DateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");// 04/10/2020

			Date date=inputFormat.parse(dndate);
			String DnDate=outputFormat.format(date);

			testcase=extentreport.createTest("Verify Local Date between IST & DN for cash withdrawal transaction");
			testcase.log(Status.INFO, "IST Date is "+istDate+" "+" DN Date is "+DnDate);

			if((istDate).equals(DnDate)) 
			{
				testcase.log(Status.PASS, " IST & DN Date is matched for selected cash withdrawal Transaction");
			}
			else
			{
				testcase.log(Status.FAIL, " IST & DN Date is not matched for selected cash withdrawal Transaction");
			}



			testcase=extentreport.createTest("Verify Trace between IST & DN for cash withdrawal transaction");
			testcase.log(Status.INFO, "IST Trace is "+istvalues.ORIGTRACE+" "+"DN Trace is "+dnvalues.SYS_TRACE_AUDIT_NO);

			if(dnvalues.SYS_TRACE_AUDIT_NO==istvalues.ORIGTRACE)
			{
				testcase.log(Status.PASS, "IST & DN Trace is matched for selected cash withdrawal Transaction");
			}
			else 
			{
				testcase.log(Status.FAIL, "IST & DN Trace is not matched for selected cash withdrawal Transaction");
			}

			testcase=extentreport.createTest("Verify Acquirer between IST & DN for cash withdrawal transaction");
			testcase.log(Status.INFO, " IST Acquirer is "+istvalues.ACQUIRER+" "+"DN Acquirer is  "+dnvalues.INST_ID_ACQ);

			if((dnvalues.INST_ID_ACQ).equalsIgnoreCase(istvalues.ACQUIRER))
			{
				testcase.log(Status.PASS, "IST & DN Acquirer is matched for selected cash withdrawal Transaction");
			}
			else {
				testcase.log(Status.FAIL, "IST & DN Acquirer is not matched for selected cash withdrawal Transaction");
			}

			testcase=extentreport.createTest("Verify Issuer between IST & DN for cash withdrawal transaction" );
			testcase.log(Status.INFO, " IST Issuer is "+istvalues.ISSUER+" "+"DN Acquirer is  "+dnvalues.INST_ID_ISS);

			if((dnvalues.INST_ID_ISS).equalsIgnoreCase(istvalues.ISSUER))
			{
				testcase.log(Status.PASS, "IST & DN Issuer is matched for selected cash withdrawal Transaction");
			}
			else {
				testcase.log(Status.FAIL, "IST & DN Issuer is not matched for selected cash withdrawal Transaction");
			}

			testcase=extentreport.createTest("Verify REF number between IST & DN for cash withdrawal transaction" );
			testcase.log(Status.INFO, " IST REF number is "+istvalues.REFNUM+" "+"DN REF number is  "+dnvalues.RETRIEVAL_REF_NO);


			if((dnvalues.RETRIEVAL_REF_NO).equalsIgnoreCase(istvalues.REFNUM)) 
			{
				testcase.log(Status.PASS,"IST & DN REF number is matched for selected cash withdrawal Transaction" );
			}
			else {
				testcase.log(Status.FAIL, "IST & DN REF number is not matched for selected cash withdrawal Transaction");
			}

			testcase=extentreport.createTest("Verify Approvalcode between IST & DN for cash withdrawal transaction" );
			testcase.log(Status.INFO, " IST Approvalcode is "+istvalues.AUTHNUM+" "+"DN Approvalcode is  "+dnvalues.APPROVAL_CODE);

			if((dnvalues.APPROVAL_CODE).equalsIgnoreCase(istvalues.AUTHNUM))

			{
				testcase.log(Status.PASS,"IST & DN Approvalcode is matched for selected cash withdrawal Transaction" );
			}
			else {
				testcase.log(Status.FAIL, "IST & DN Approvalcode is not matched for selected cash withdrawal Transaction");
			}



		} 

		catch (ClassNotFoundException | SQLException | IOException | AWTException | TimeoutException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.info("Transaction Tab fields- Issue with Database or file import or Date Parsing",e);
			System.out.println("Issue with Database or file import or Date Parsing");
		}

		extentreport.flush();

	}




}		








