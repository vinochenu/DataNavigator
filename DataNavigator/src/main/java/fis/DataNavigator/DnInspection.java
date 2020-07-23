package fis.DataNavigator;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.imageio.ImageIO;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.apache.log4j.*;

public class DnInspection extends DriverInstance{

	public static DnInspection dnInspection=null;

	private DnInspection() {

	}

	public static DnInspection getInstance() {
		if(dnInspection==null)
			dnInspection=new DnInspection();
		return dnInspection;
	}



	static ArrayList<String> excelInput=new ArrayList<>();
	static DnPojo transDnPojo= DnPojo.getInstance();

	static Logger logger=Logger.getLogger(DnInspection.class);

	/*static ChromeOptions options = new ChromeOptions();
	public static WebDriver driver;*/

	public static ArrayList<String>  readInputExcel() throws IOException {

		PropertyConfigurator.configure("DNlogs.properties");

		try {

			File file=new File("DNExcel.xlsx");
			FileInputStream Fis=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(Fis);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			int rowcount=sheet.getLastRowNum();
			int columncount=sheet.getRow(0).getLastCellNum();
			DataFormatter formatter=new DataFormatter();
			for (int i=1;i<=rowcount;i++) {
				for(int j=0;j<columncount;j++) {
					excelInput.add(formatter.formatCellValue(sheet.getRow(i).getCell(j)));
				}
			}
			workbook.close();
			
		} 

		catch(IOException io)
		{

			io.printStackTrace();
			logger.error("IOException for reading input from excel is  "+io);
			System.err.println("IOException is"+io.getMessage());

		}

		return excelInput;

	}







	public static DnPojo  searchTransaction() throws IOException, AWTException, TimeoutException, InterruptedException {

		PropertyConfigurator.configure("DNlogs.properties");



		try {

			FileInputStream fileInputStream=new FileInputStream("configDN.properties");
			Properties properties=new Properties();
			properties.load(fileInputStream);
			String appurl=properties.getProperty("ApplicationUrl");

			DriverInstance.getdriver();//to use driver


			/*ChromeOptions options = new ChromeOptions();
			//options.setPageLoadStrategy(PageLoadStrategy.NONE);

			options.addArguments("start-maximized"); // open Browser in maximized mode
			options.addArguments("disable-infobars"); // disabling infobars
			options.addArguments("--disable-extensions"); // disabling extensions
			options.addArguments("--disable-gpu"); // applicable to windows os only
			options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
			options.addArguments("--no-sandbox"); // Bypass OS security model

			 driver = new ChromeDriver(options);*/


			driver.get(appurl);
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// Login DN

			WebElement UserID = driver.findElement(By.name("userId"));
			UserID.clear();
			UserID.click();
			String username=readInputExcel().get(0);

			UserID.sendKeys(username);


			WebElement Password = driver.findElement(By.name("password"));
			Password.clear();
			Password.click();
			String password= readInputExcel().get(1);
			Password.sendKeys(password);

			WebElement Login = driver.findElement(By.name("action"));
			Login.click();

			//Screenshot after login page
			/*Robot robot=new Robot();
			Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rectangle=new Rectangle(screensize);
			BufferedImage sourcefile=robot.createScreenCapture(rectangle);
			File destinationfile=new File("DNLogin.png");
			ImageIO.write(sourcefile, "png", destinationfile);*/




			// Navigating to Transaction Search

			//WebElement Transactions = driver.findElement(By.xpath("//*[@id=\"menubar\"]/ul/li[2]/a"));
			WebElement Transactions = driver.findElement(By.xpath("//*[text()='Transactions']"));

			//*[text()='Transactions']

			//WebElement TransactionSearch = driver.findElement(By.xpath("//*[@id=\"menubar\"]/ul/li[2]/ul/li[1]/a"));
			WebElement TransactionSearch = driver.findElement(By.xpath("//*[text()='Transaction Search']"));
			//*[text()='Transaction Search']

			Actions action = new Actions(driver);
			action.moveToElement(Transactions).perform();
			action.moveToElement(TransactionSearch).click().perform();

			// Input Data to search the Transaction

			Actions action_startdate = new Actions(driver);
			WebElement StartDate = driver.findElement(By.name("startDate"));
			action_startdate.moveToElement(StartDate).click().perform();
			StartDate.clear();
			String startdate= readInputExcel().get(2);
			StartDate.sendKeys(startdate + Keys.ENTER);

			Actions action_enddate = new Actions(driver);
			WebElement EndDate = driver.findElement(By.name("endDate"));
			action_enddate.moveToElement(EndDate).click().perform();
			EndDate.clear();
			String enddate= readInputExcel().get(3);
			EndDate.sendKeys(enddate + Keys.ENTER);

			WebElement StartTime_HR = driver.findElement(By.id("_startTimeHr"));
			Select startTime_HR = new Select(StartTime_HR);
			String starttime_hr=readInputExcel().get(4);
			startTime_HR.selectByValue(starttime_hr);

			WebElement EndTime_HR = driver.findElement(By.id("_endTimeHr"));
			Select endTime_HR = new Select(EndTime_HR);
			String endtime_hr=readInputExcel().get(5);
			endTime_HR.selectByValue(endtime_hr);

			WebElement StartTime_MIN = driver.findElement(By.id("_startTimeMin"));
			Select startTime_MIN = new Select(StartTime_MIN);
			String starttime_min=readInputExcel().get(6);
			startTime_MIN.selectByValue(starttime_min);

			WebElement EndTime_MIN = driver.findElement(By.id("_endTimeMin"));
			Select endTime_MIN = new Select(EndTime_MIN);
			String endtime_min=readInputExcel().get(7);
			endTime_MIN.selectByValue(endtime_min);

			WebElement StartTime_SEC = driver.findElement(By.id("_startTimeSec"));
			Select startTime_SEC = new Select(StartTime_SEC);
			String starttime_sec=readInputExcel().get(8);
			startTime_SEC.selectByValue(starttime_sec);

			WebElement EndTime_SEC = driver.findElement(By.id("_endTimeSec"));
			Select endTime_SEC = new Select(EndTime_SEC);
			String endtime_sec=readInputExcel().get(9);
			endTime_SEC.selectByValue(endtime_sec);

			WebElement Acq_Recon_Inst_ID_radio = driver.findElement(By.id("_acqReconInsIdMatch"));
			Acq_Recon_Inst_ID_radio.click();

			WebElement Acq_Recon_Inst_ID_data = driver.findElement(By.name("acqReconInstId"));
			String acquirerDN=readInputExcel().get(10);
			Acq_Recon_Inst_ID_data.sendKeys(acquirerDN);

			WebElement Retrieval_RefNo = driver.findElement(By.name("retrievalRefNo"));
			String refnumDN=readInputExcel().get(11);
			Retrieval_RefNo.sendKeys(refnumDN);


			WebElement Tran_Type_Group = driver.findElement(By.name("tranTypeGroup"));
			String pcode=readInputExcel().get(12);
			Tran_Type_Group.sendKeys(pcode);


			//Screenshot after providing inputs 
			Robot robot1=new Robot();
			Dimension screensize1=Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rectangle1=new Rectangle(screensize1);
			BufferedImage sourcefile1=robot1.createScreenCapture(rectangle1);
			File destinationfile1=new File("DNTranactionsearch.png");
			ImageIO.write(sourcefile1, "png", destinationfile1);



			WebElement Search = driver.findElement(By.id("search1"));
			Search.click();
			
			Thread.sleep(2000);

			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			//Screenshot for Transaction resultset 
			/*Robot robot2=new Robot();
			Dimension screensize2=Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rectangle2=new Rectangle(screensize2);
			BufferedImage sourcefile2=robot2.createScreenCapture(rectangle2);
			File destinationfile2=new File("DNTranactionsearchResults.png");
			ImageIO.write(sourcefile2, "png", destinationfile2);*/

			List<WebElement> Total_rows = driver.findElements(By.tagName("tr"));
			int row_count = Total_rows.size();
			System.out.println("Total Row count is " + row_count);

			List<WebElement> Total_columns = driver.findElements(By.tagName("td"));
			int column_counnt = Total_columns.size();
			System.out.println("Total Column count is " + column_counnt);
			
			

			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

			
			//To get the selected transaction in detail
			
			driver.get("http://localhost:8080/DNWebUI/tran/findTransactionDetail.do?action=Select&&selectedIndex=0");


			/*// TO select searched txn
			WebElement txn1 = driver.findElement(By.xpath("//*[@onclick='showLoadingContent();']"));
			//WebElement txn1 = driver.findElement(By.xpath("//*[@id=\"tranResults\"]/tbody/tr/td[2]/a"));
			JavascriptExecutor executor=(JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", txn1);*/

			//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);




			//****************************TRANSACTION DETAIL TAB******************************************************************

			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			/*//Screenshot for Transaction Tab 
			Robot robot3=new Robot();
			Dimension screensize3=Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rectangle3=new Rectangle(screensize3);
			BufferedImage sourcefile3=robot3.createScreenCapture(rectangle3);
			File destinationfile3=new File("DNTranactionTab.png");
			ImageIO.write(sourcefile3, "png", destinationfile3);*/


			//PAN
			WebElement PAN=driver.findElement(By.xpath("//td[@class='bold'][@dntitle='pan']"));
			String pAN=PAN.getText();
			System.out.println("pAN is "+pAN);

			transDnPojo.setPAN(pAN);


			//TRAN_TYPE_ID
			WebElement TRAN_TYPE_ID=driver.findElement(By.xpath("//td[@class='LINK_hide bold'][@dntitle='tranTypeIdentifier']"));
			String tRAN_TYPE_ID=TRAN_TYPE_ID.getText();
			System.out.println("tRAN_TYPE_ID : "+tRAN_TYPE_ID);

			transDnPojo.setTRAN_TYPE_ID(tRAN_TYPE_ID);



			//SYS_TRACE_AUDIT_NO
			WebElement SYS_TRACE_AUDIT_NO=driver.findElement(By.xpath("//td[@class='bold'][@dntitle='systemTraceAuditNbr']"));
			String sYS_TRACE_AUDIT_NO=SYS_TRACE_AUDIT_NO.getText();
			System.out.println("sYS_TRACE_AUDIT_NO : "+sYS_TRACE_AUDIT_NO);

			transDnPojo.setSYS_TRACE_AUDIT_NO(sYS_TRACE_AUDIT_NO);

			//TSTAMP_LOCAL
			WebElement TSTAMP_LOCAL=driver.findElement(By.xpath("//td[@class='bold'][@dntitle='dateTimeLocalTran']"));
			String tSTAMP_LOCAL=TSTAMP_LOCAL.getText();
			System.out.println("tSTAMP_LOCAL is "+tSTAMP_LOCAL);

			transDnPojo.setTSTAMP_LOCAL(tSTAMP_LOCAL);

			//FUNC_CODE
			WebElement FUNC_CODE=driver.findElement(By.xpath("//td[@class='bold'][@dntitle='funcCode']"));
			String fUNC_CODE=FUNC_CODE.getText();
			System.out.println("fUNC_CODE is "+fUNC_CODE);

			transDnPojo.setTrans_FUNC_CODE(fUNC_CODE);

			//RETRIEVAL_REF_NO
			WebElement RETRIEVAL_REF_NO=driver.findElement(By.xpath("//td[@class='bold'][@dntitle='retrievalRefNo']"));
			String rETRIEVAL_REF_NO=RETRIEVAL_REF_NO.getText();
			System.out.println("rETRIEVAL_REF_NO : "+rETRIEVAL_REF_NO);

			transDnPojo.setRETRIEVAL_REF_NO(rETRIEVAL_REF_NO);


			//APPROVAL_CODE
			WebElement APPROVAL_CODE=driver.findElement(By.xpath("//td[@class='bold'][@dntitle='approvalCode']"));
			String aPPROVAL_CODE=APPROVAL_CODE.getText();
			System.out.println("aPPROVAL_CODE is "+aPPROVAL_CODE);

			transDnPojo.setAPPROVAL_CODE(aPPROVAL_CODE);

			//ACT_CODE
			WebElement ACT_CODE=driver.findElement(By.xpath("//td[@class='LINK_hide bold'][@dntitle='actCode']"));
			String aCT_CODE=ACT_CODE.getText();
			System.out.println("aCT_CODE is "+aCT_CODE);

			transDnPojo.setACT_CODE(aCT_CODE);


			//INST_ID_ISS
			WebElement INST_ID_ISS=driver.findElement(By.xpath("//td[@class='bold'][@dntitle='instIdIssr']"));
			String iNST_ID_ISS=INST_ID_ISS.getText();
			System.out.println("iNST_ID_ISS is "+iNST_ID_ISS);

			transDnPojo.setINST_ID_ISS(iNST_ID_ISS);

			//INST_ID_ACQ
			WebElement INST_ID_ACQ=driver.findElement(By.xpath("//td[@class='bold'][@dntitle='instIdAcqr']"));
			String iNST_ID_ACQ=INST_ID_ACQ.getText();
			System.out.println("iNST_ID_ACQ is "+iNST_ID_ACQ);

			transDnPojo.setINST_ID_ACQ(iNST_ID_ACQ);

			//INST_ID_RECON_ISS
			WebElement INST_ID_RECON_ISS=driver.findElement(By.xpath("//td[@class='bold'][@dntitle='instIdReconIssr']"));
			String iNST_ID_RECON_ISS=INST_ID_RECON_ISS.getText();
			System.out.println("iNST_ID_RECON_ISS is "+iNST_ID_RECON_ISS);

			transDnPojo.setINST_ID_RECON_ISS(iNST_ID_RECON_ISS);

			//AUTH_BY
			WebElement AUTH_BY=driver.findElement(By.xpath("//td[@class='LINK_hide bold'][@dntitle='authBy']"));
			String aUTH_BY=AUTH_BY.getText();
			System.out.println("aUTH_BY is "+aUTH_BY);

			transDnPojo.setAUTH_BY(aUTH_BY);

			//TRAN_CLASS
			WebElement TRAN_CLASS=driver.findElement(By.xpath("//td[@class='LINK_hide bold'][@dntitle='tranClass']"));
			String tRAN_CLASS=TRAN_CLASS.getText();
			System.out.println("tRAN_CLASS is "+tRAN_CLASS);

			transDnPojo.setTRAN_CLASS(tRAN_CLASS);


			//PROC_ID_ACQ
			WebElement PROC_ID_ACQ=driver.findElement(By.xpath("//td[@class='bold'][@dntitle='procIdAcqr']"));
			String pROC_ID_ACQ=PROC_ID_ACQ.getText();
			System.out.println("pROC_ID_ACQ is "+ pROC_ID_ACQ);

			transDnPojo.setPROC_ID_ACQ(pROC_ID_ACQ);

			//PROC_ID_ISS
			WebElement PROC_ID_ISS=driver.findElement(By.xpath("//td[@class='bold'][@dntitle='procIdIssr']"));
			String pROC_ID_ISS=PROC_ID_ISS.getText();
			System.out.println("pROC_ID_ISS is "+pROC_ID_ISS);

			transDnPojo.setPROC_ID_ISS(pROC_ID_ISS);


			//DATE_RECON_ACQ
			WebElement DATE_RECON_ACQ=driver.findElement(By.xpath("//td[@class='bold'][@dntitle='dateReconAcqr']"));
			String dATE_RECON_ACQ=DATE_RECON_ACQ.getText();
			System.out.println("dATE_RECON_ACQ is "+dATE_RECON_ACQ);

			transDnPojo.setTrans_DATE_RECON_ACQ(dATE_RECON_ACQ);

			//DATE_RECON_ISS
			WebElement DATE_RECON_ISS=driver.findElement(By.xpath("//td[@class='bold'][@dntitle='dateReconIssr']"));
			String dATE_RECON_ISS=DATE_RECON_ISS.getText();
			System.out.println("dATE_RECON_ISS is "+dATE_RECON_ISS);

			transDnPojo.setTrans_DATE_RECON_ISS(dATE_RECON_ISS);


			//AMT_RECON_NET
			WebElement AMT_RECON_NET=driver.findElement(By.xpath("//td[@dntitle='amtReconNetwork']"));
			String aMT_RECON_NET=AMT_RECON_NET.getText();
			System.out.println("aMT_RECON_NET is "+aMT_RECON_NET);

			transDnPojo.setTrans_AMT_RECON_NET(aMT_RECON_NET);

			//CUR_RECON_NET
			WebElement CUR_RECON_NET=driver.findElement(By.xpath("//td[@dntitle='curReconNetwork']"));
			String cUR_RECON_NET=CUR_RECON_NET.getText();
			System.out.println("cUR_RECON_NET is "+cUR_RECON_NET);

			transDnPojo.setTrans_CUR_RECON_NET(cUR_RECON_NET);


			//CARD_ACPT_TERM_ID
			WebElement CARD_ACPT_TERM_ID=driver.findElement(By.xpath("//td[@class='LINK_hide bold'][@dntitle='cardAcptTermId']"));
			String cARD_ACPT_TERM_ID=CARD_ACPT_TERM_ID.getText();
			System.out.println("cARD_ACPT_TERM_ID is "+cARD_ACPT_TERM_ID);

			transDnPojo.setCARD_ACPT_TERM_ID(cARD_ACPT_TERM_ID);

			//NET_TERM_ID
			WebElement NET_TERM_ID=driver.findElement(By.xpath("//td[@class='LINK_hide bold'][@dntitle='networkTermId']"));
			String nET_TERM_ID=NET_TERM_ID.getText();
			System.out.println("nET_TERM_ID is "+nET_TERM_ID);

			transDnPojo.setNET_TERM_ID(nET_TERM_ID);



			//ACCT_ID_1
			WebElement ACCT_ID_1=driver.findElement(By.xpath("//td[@class='bold'][@dntitle='acctId1']"));
			String aCCT_ID_1=ACCT_ID_1.getText();
			System.out.println("aCCT_ID_1 is "+aCCT_ID_1);

			transDnPojo.setTrans_ACCT_ID_1(aCCT_ID_1);

			//MERCH_TYPE
			WebElement MERCH_TYPE=driver.findElement(By.xpath("//td[@class='LINK_hide bold'][@dntitle='merchType']"));
			String mERCH_TYPE=MERCH_TYPE.getText();
			System.out.println("mERCH_TYPE is "+mERCH_TYPE);

			transDnPojo.setTrans_MERCH_TYPE(mERCH_TYPE);


			//*************************BBLDNSEGMENT TAB*********************************************************************




			//Navigating to BBLDNSEGMENT TAB
			WebElement BBLDNSegment=driver.findElement(By.xpath("//a[@id='ui-id-5']"));
			BBLDNSegment.click();

			//Screenshot for BBL Tab 
			Robot robot4=new Robot();
			Dimension screensize4=Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rectangle4=new Rectangle(screensize4);
			BufferedImage sourcefile4=robot4.createScreenCapture(rectangle4);
			File destinationfile4=new File("DNBBLTab.png");
			ImageIO.write(sourcefile4, "png", destinationfile4);



			//RECV_PROXY_ID
			WebElement receiverProxyid=driver.findElement(By.xpath("//*[text()='Receiving Proxy Type:']/following::span[1]"));
			String receiverproxyid=receiverProxyid.getText();
			System.out.println("receiverproxyid is "+receiverproxyid);

			transDnPojo.setRECV_PROXY_ID(receiverproxyid);

			//SENDER_PROXY_ID
			WebElement senderProxyid=driver.findElement(By.xpath("//*[text()='Sending Proxy ID:']/following::span[1]"));
			String senderproxyid=senderProxyid.getText();
			System.out.println("senderproxyid is "+senderproxyid);

			transDnPojo.setSENDER_PROXY_ID(senderproxyid);

			//RECV_PROXY_TYPE
			WebElement receiverProxytype=driver.findElement(By.xpath("//*[text()='Receiving Proxy Type:']/following::span[1]"));
			String receiverproxytype=receiverProxytype.getText();
			System.out.println("receiverproxytype is "+receiverproxytype);

			transDnPojo.setRECV_PROXY_TYPE(receiverproxytype);

			//SENDER_PROXY_TYPE
			WebElement SENDER_PROXY_TYPE=driver.findElement(By.xpath("//*[text()='Receiving Proxy Type:']/following::span[1]"));
			String sENDER_PROXY_TYPE=SENDER_PROXY_TYPE.getText();
			System.out.println("sENDER_PROXY_TYPE is "+sENDER_PROXY_TYPE);

			transDnPojo.setSENDER_PROXY_TYPE(sENDER_PROXY_TYPE);

			//SENDER_TAX_ID
			WebElement SENDER_TAX_ID=driver.findElement(By.xpath("//*[text()='Sender Tax ID:']/following::span[1]"));
			String sENDER_TAX_ID=SENDER_TAX_ID.getText();
			System.out.println("sENDER_TAX_ID is "+sENDER_TAX_ID);

			transDnPojo.setSENDER_TAX_ID(sENDER_TAX_ID);

			//RECV_TAX_ID
			WebElement receiverTaxid=driver.findElement(By.xpath("//*[text()='Receiving Tax ID:']/following::span[1]"));
			String receivertaxid=receiverTaxid.getText();
			System.out.println("receivertaxid is "+receivertaxid);

			transDnPojo.setRECV_TAX_ID(receivertaxid);

			//VAT_RATE
			WebElement vatRate=driver.findElement(By.xpath("//*[text()='VAT Rate:']/following::span[1]"));
			String vatrate=vatRate.getText();
			System.out.println("vatrate is "+vatrate);

			transDnPojo.setVAT_RATE(vatrate);

			//VAT
			WebElement Vat=driver.findElement(By.xpath("//*[text()='VAT']/following::span[1]/following::span[1]"));
			String vat=Vat.getText();
			System.out.println("vat is "+vat);

			transDnPojo.setVAT(vat);


			//WHT_TAX_RATE
			WebElement WHT_TAX_RATE=driver.findElement(By.xpath("//*[text()='Withholding Tax Rate:']/following::span[1]"));
			String wHT_TAX_RATE=WHT_TAX_RATE.getText();
			System.out.println("wHT_TAX_RATE is "+wHT_TAX_RATE);

			transDnPojo.setWHT_TAX_RATE(wHT_TAX_RATE);


			//WHT_TAX
			WebElement WHT_TAX=driver.findElement(By.xpath("//*[text()='Withholding Tax:']/following::span[1]"));
			String wHT_TAX=WHT_TAX.getText();
			System.out.println("wHT_TAX is "+wHT_TAX);

			transDnPojo.setWHT_TAX(wHT_TAX);

			//WHT_TAX_COND
			WebElement WHT_TAX_COND=driver.findElement(By.xpath("//*[text()='Withholding Tax Condition:']/following::span[1]"));
			String wHT_TAX_COND=WHT_TAX_COND.getText();
			System.out.println("wHT_TAX_COND is "+wHT_TAX_COND);

			transDnPojo.setWHT_TAX_COND(wHT_TAX_COND);

			//SENDER_REF_NO
			WebElement SENDER_REF_NO=driver.findElement(By.xpath("//*[text()='Sender Reference Number:']/following::span[1]"));
			String sENDER_REF_NO=SENDER_REF_NO.getText();
			System.out.println("sENDER_REF_NO is "+sENDER_REF_NO);

			transDnPojo.setSENDER_REF_NO(sENDER_REF_NO);

			//TRAN_REF_NO
			WebElement TRAN_REF_NO=driver.findElement(By.xpath("//*[text()='Transaction Reference Number:']/following::span[1]"));
			String tRAN_REF_NO=TRAN_REF_NO.getText();
			System.out.println("tRAN_REF_NO is "+tRAN_REF_NO);

			transDnPojo.setTRAN_REF_NO(tRAN_REF_NO);

			//REF_NO
			WebElement REF_NO=driver.findElement(By.xpath("//*[text()='Reference Number:']/following::span[1]"));
			String rEF_NO=REF_NO.getText();
			System.out.println("rEF_NO is "+rEF_NO);

			transDnPojo.setREF_NO(rEF_NO);

			//BBL_REF_NO
			WebElement BBL_REF_NO=driver.findElement(By.xpath("//*[text()='BBL Reference Number:']/following::span[1]"));
			String bBL_REF_NO=BBL_REF_NO.getText();
			System.out.println("bBL_REF_NO is "+bBL_REF_NO);

			transDnPojo.setBBL_REF_NO(bBL_REF_NO);
			System.out.println("bBL_REF_NO is "+transDnPojo.getBBL_REF_NO());

			//FROM_ACCT_NAME
			WebElement FROM_ACCT_NAME=driver.findElement(By.xpath("//*[text()='From Account Name:']/following::span[1]"));
			String fROM_ACCT_NAME=FROM_ACCT_NAME.getText();
			System.out.println("fROM_ACCT_NAME is "+fROM_ACCT_NAME);

			transDnPojo.setFROM_ACCT_NAME(fROM_ACCT_NAME);

			//TO_ACCT_NAME
			WebElement TO_ACCT_NAME=driver.findElement(By.xpath("//*[text()='To Account Name:']/following::span[1]"));
			String tO_ACCT_NAME=TO_ACCT_NAME.getText();
			System.out.println("tO_ACCT_NAME is "+tO_ACCT_NAME);

			transDnPojo.setTO_ACCT_NAME(tO_ACCT_NAME);

			//TO_ACCT_DISP_NAME
			WebElement TO_ACCT_DISP_NAME=driver.findElement(By.xpath("//*[text()='To Account Display Name:']/following::span[1]"));
			String tO_ACCT_DISP_NAME=TO_ACCT_DISP_NAME.getText();
			System.out.println("tO_ACCT_DISP_NAME is "+tO_ACCT_DISP_NAME);

			transDnPojo.setTO_ACCT_DISP_NAME(tO_ACCT_DISP_NAME);



			//BBL_FILLER_1
			WebElement BBL_FILLER_1=driver.findElement(By.xpath("//*[text()='BBL Filler1:']/following::span[1]"));
			String bBL_FILLER_1=BBL_FILLER_1.getText();
			System.out.println("bBL_FILLER_1 is "+bBL_FILLER_1);

			transDnPojo.setBBL_FILLER_1(bBL_FILLER_1);

			//BBL_FILLER_2
			WebElement BBL_FILLER_2=driver.findElement(By.xpath("//*[text()='BBL Filler2:']/following::span[1]"));
			String bBL_FILLER_2=BBL_FILLER_2.getText();
			System.out.println("bBL_FILLER_2 is "+bBL_FILLER_2);


			transDnPojo.setBBL_FILLER_2(bBL_FILLER_2);

			//TAX_INVOICE
			WebElement TAX_INVOICE=driver.findElement(By.xpath("//*[text()='Tax Invoice:']/following::span[1]"));
			String tAX_INVOICE=TAX_INVOICE.getText();
			System.out.println("tAX_INVOICE is "+tAX_INVOICE);

			transDnPojo.setTAX_INVOICE(tAX_INVOICE);

			//TYPE_OF_INCOME
			WebElement TYPE_OF_INCOME=driver.findElement(By.xpath("//*[text()='Type Of Income:']/following::span[1]"));
			String tYPE_OF_INCOME=TYPE_OF_INCOME.getText();
			System.out.println("tYPE_OF_INCOME is "+tYPE_OF_INCOME);

			transDnPojo.setTYPE_OF_INCOME(tYPE_OF_INCOME);


			//EDC_NUMBER
			WebElement EDC_NUMBER=driver.findElement(By.xpath("//*[text()='EDC Number:']/following::span[1]"));
			String eDC_NUMBER=EDC_NUMBER.getText();
			System.out.println("eDC_NUMBER is "+eDC_NUMBER);

			transDnPojo.setEDC_NUMBER(eDC_NUMBER);

			//TSTAMP_TRANS
			WebElement TSTAMP_TRANS=driver.findElement(By.xpath("//*[text()='EDC Number:']/following::span[1]"));
			String tSTAMP_TRANS=TSTAMP_TRANS.getText();
			System.out.println("tSTAMP_TRANS "+tSTAMP_TRANS);

			transDnPojo.setTSTAMP_TRANS(tSTAMP_TRANS);


			//PRODUCT_CODE
			WebElement PRODUCT_CODE=driver.findElement(By.xpath("//*[text()='Product Code:']/following::span[1]"));
			String pRODUCT_CODE=PRODUCT_CODE.getText();
			System.out.println("pRODUCT_CODE is "+pRODUCT_CODE);

			transDnPojo.setPRODUCT_CODE(pRODUCT_CODE);


			//SERV_TYPE_CODE
			WebElement SERV_TYPE_CODE=driver.findElement(By.xpath("//*[text()='Server Type Code:']/following::span[1]"));
			String sERV_TYPE_CODE=SERV_TYPE_CODE.getText();
			System.out.println("sERV_TYPE_CODE is "+sERV_TYPE_CODE);

			transDnPojo.setSERV_TYPE_CODE(sERV_TYPE_CODE);

			//BILL_REFERENCE
			WebElement BILL_REFERENCE=driver.findElement(By.xpath("//*[text()='Biller Reference:']/following::span[1]"));
			String bILL_REFERENCE=BILL_REFERENCE.getText();
			System.out.println("bILL_REFERENCE is "+bILL_REFERENCE);

			transDnPojo.setBILL_REFERENCE(bILL_REFERENCE);

			//BPDUE_RTPEXP_DATE
			WebElement BPDUE_RTPEXP_DATE=driver.findElement(By.xpath("//*[text()='BP Due date/RTP Exp date:']/following::span[1]"));
			String bPDUE_RTPEXP_DATE=BPDUE_RTPEXP_DATE.getText();
			System.out.println("bPDUE_RTPEXP_DATE is "+bPDUE_RTPEXP_DATE);

			transDnPojo.setBPDUE_RTPEXP_DATE(bPDUE_RTPEXP_DATE);

			//CREDIT_NOTIF_REF
			WebElement CREDIT_NOTIF_REF=driver.findElement(By.xpath("//*[text()='Credit Notification:']/following::span[1]"));
			String cREDIT_NOTIF_REF=CREDIT_NOTIF_REF.getText();
			System.out.println("cREDIT_NOTIF_REF is "+cREDIT_NOTIF_REF);

			transDnPojo.setCREDIT_NOTIF_REF(cREDIT_NOTIF_REF);

			//BP_URL
			WebElement BP_URL=driver.findElement(By.xpath("//*[text()='BP Url:']/following::span[1]"));
			String bP_URL=BP_URL.getText();
			System.out.println("bP_URL is "+bP_URL);

			transDnPojo.setBP_URL(bP_URL);

			//SENDER_COMP_TAX_ID
			WebElement SENDER_COMP_TAX_ID=driver.findElement(By.xpath("//*[text()='Sender Company TaxId:']/following::span[1]"));
			String sENDER_COMP_TAX_ID=SENDER_COMP_TAX_ID.getText();
			System.out.println("sENDER_COMP_TAX_ID is "+sENDER_COMP_TAX_ID);

			transDnPojo.setSENDER_COMP_TAX_ID(sENDER_COMP_TAX_ID);

			//SENDER_COMP_ACCT_NO
			WebElement SENDER_COMP_ACCT_NO=driver.findElement(By.xpath("//*[text()='Sender Company AccountNo:']/following::span[1]"));
			String sENDER_COMP_ACCT_NO=SENDER_COMP_ACCT_NO.getText();
			System.out.println("sENDER_COMP_ACCT_NO is "+sENDER_COMP_ACCT_NO);	

			transDnPojo.setSENDER_COMP_ACCT_NO(sENDER_COMP_ACCT_NO);

			//RECV_COMP_TAX_ID
			WebElement RECV_COMP_TAX_ID=driver.findElement(By.xpath("//*[text()='Receiver Company TaxId:']/following::span[1]"));
			String rECV_COMP_TAX_ID=RECV_COMP_TAX_ID.getText();
			System.out.println("rECV_COMP_TAX_ID is "+rECV_COMP_TAX_ID);

			transDnPojo.setRECV_COMP_TAX_ID(rECV_COMP_TAX_ID);

			//RECV_COMP_ACCT_NO
			WebElement RECV_COMP_ACCT_NO=driver.findElement(By.xpath("//*[text()='Receiver Company AccountNo:']/following::span[1]"));
			String rECV_COMP_ACCT_NO=RECV_COMP_ACCT_NO.getText();
			System.out.println("rECV_COMP_ACCT_NO is "+rECV_COMP_ACCT_NO);

			transDnPojo.setRECV_COMP_ACCT_NO(rECV_COMP_ACCT_NO);

			//COMPANY_CODE
			WebElement COMPANY_CODE=driver.findElement(By.xpath("//*[text()='Company Code:']/following::span[1]"));
			String cOMPANY_CODE=COMPANY_CODE.getText();
			System.out.println("cOMPANY_CODE is "+cOMPANY_CODE);

			transDnPojo.setCOMPANY_CODE(cOMPANY_CODE);

			//SERVICE_CODE
			WebElement SERVICE_CODE=driver.findElement(By.xpath("//*[text()='Service Code:']/following::span[1]"));
			String sERVICE_CODE=SERVICE_CODE.getText();
			System.out.println("sERVICE_CODE is "+sERVICE_CODE);

			transDnPojo.setSERVICE_CODE(sERVICE_CODE);

			//FLAGS
			WebElement FLAGS=driver.findElement(By.xpath("//*[text()='Flags:']/following::span[1]"));
			String fLAGS=FLAGS.getText();
			System.out.println("fLAGS is "+fLAGS);

			transDnPojo.setFLAGS(fLAGS);

			//BILL_REFERENCE2
			WebElement BILL_REFERENCE2=driver.findElement(By.xpath("//*[text()='Bill Reference 2:']/following::span[1]"));
			String bILL_REFERENCE2=BILL_REFERENCE2.getText();
			System.out.println("bILL_REFERENCE2 is "+bILL_REFERENCE2);

			transDnPojo.setBILL_REFERENCE2(bILL_REFERENCE2);


			//USER_DATA_1
			WebElement USER_DATA_1=driver.findElement(By.xpath("//*[text()='User Data 1:']/following::span[1]"));
			String uSER_DATA_1=USER_DATA_1.getText();
			System.out.println("uSER_DATA_1 is "+uSER_DATA_1);

			transDnPojo.setUSER_DATA_1(uSER_DATA_1);

			//USER_DATA_2
			WebElement USER_DATA_2=driver.findElement(By.xpath("//*[text()='User Data 2:']/following::span[1]"));
			String uSER_DATA_2=USER_DATA_2.getText();
			System.out.println("uSER_DATA_2 is "+uSER_DATA_2);

			transDnPojo.setUSER_DATA_2(uSER_DATA_2);

			//USER_DATA_3
			WebElement USER_DATA_3=driver.findElement(By.xpath("//*[text()='User Data 3:']/following::span[1]"));
			String uSER_DATA_3=USER_DATA_3.getText();
			System.out.println("uSER_DATA_3 is "+uSER_DATA_3);

			transDnPojo.setUSER_DATA_3(uSER_DATA_3);


			//USER_DATA_4
			WebElement USER_DATA_4=driver.findElement(By.xpath("//*[text()='User Data 4:']/following::span[1]"));
			String uSER_DATA_4=USER_DATA_4.getText();
			System.out.println("uSER_DATA_4 is "+uSER_DATA_4);

			transDnPojo.setUSER_DATA_4(uSER_DATA_4);


			//USER_DATA_5
			WebElement USER_DATA_5=driver.findElement(By.xpath("//*[text()='User Data 5:']/following::span[1]"));
			String uSER_DATA_5=USER_DATA_5.getText();
			System.out.println("uSER_DATA_5 is "+uSER_DATA_5);

			transDnPojo.setUSER_DATA_5(uSER_DATA_5);

			//PAYMENT_1
			WebElement PAYMENT_1=driver.findElement(By.xpath("//*[text()='Payment 1:']/following::span[1]"));
			String pAYMENT_1=PAYMENT_1.getText();
			System.out.println("pAYMENT_1 is "+pAYMENT_1);

			transDnPojo.setPAYMENT_1(pAYMENT_1);

			//PAYMENT_2
			WebElement PAYMENT_2=driver.findElement(By.xpath("//*[text()='Payment 2:']/following::span[1]"));
			String pAYMENT_2=PAYMENT_2.getText();
			System.out.println("pAYMENT_2 is "+pAYMENT_2);

			transDnPojo.setPAYMENT_2(pAYMENT_2);

			//PAYMENT_3
			WebElement PAYMENT_3=driver.findElement(By.xpath("//*[text()='Payment 3:']/following::span[1]"));
			String pAYMENT_3=PAYMENT_3.getText();
			System.out.println("pAYMENT_3 is "+pAYMENT_3);

			transDnPojo.setPAYMENT_3(pAYMENT_3);

			//SMS_FEE
			WebElement SMS_FEE=driver.findElement(By.xpath("//*[text()='SMS Fee:']/following::span[1]"));
			String sMS_FEE=SMS_FEE.getText();
			System.out.println("sMS_FEE is "+sMS_FEE);

			transDnPojo.setSMS_FEE(sMS_FEE);


			//SMS_MOBILE
			WebElement SMS_MOBILE=driver.findElement(By.xpath("//*[text()='SMS Mobile:']/following::span[1]"));
			String sMS_MOBILE=SMS_MOBILE.getText();
			System.out.println("sMS_MOBILE is "+sMS_MOBILE);

			transDnPojo.setSMS_MOBILE(sMS_MOBILE);

			//OTP
			WebElement OTP=driver.findElement(By.xpath("//*[text()='SMS Mobile:']/following::span[1]"));
			String oTP=OTP.getText();
			System.out.println("oTP is "+oTP);

			transDnPojo.setOTP(oTP);

			//ACCT_INFO_1
			WebElement ACCT_INFO_1=driver.findElement(By.xpath("//*[text()='Account Info 1:']/following::span[1]"));
			String aCCT_INFO_1=ACCT_INFO_1.getText();
			System.out.println("aCCT_INFO_1 is "+aCCT_INFO_1);

			transDnPojo.setACCT_INFO_1(aCCT_INFO_1);

			//ACCT_INFO_2
			WebElement ACCT_INFO_2=driver.findElement(By.xpath("//*[text()='Account Info 2:']/following::span[1]"));
			String aCCT_INFO_2=ACCT_INFO_2.getText();
			System.out.println("aCCT_INFO_2 is "+aCCT_INFO_2);

			transDnPojo.setACCT_INFO_2(aCCT_INFO_2);



			//BBL_FILLER_3
			WebElement BBL_FILLER_3=driver.findElement(By.xpath("//*[text()='BBL Filler 3:']/following::span[1]"));
			String bBL_FILLER_3=BBL_FILLER_3.getText();


			transDnPojo.setBBL_FILLER_3(bBL_FILLER_3);
			System.out.println("bBL_FILLER_3 is "+transDnPojo.getBBL_FILLER_3());

			//FRM_FUND_CODE
			WebElement FRM_FUND_CODE=driver.findElement(By.xpath("//*[text()='From Fund Code:']/following::span[1]"));
			String fRM_FUND_CODE=FRM_FUND_CODE.getText();
			System.out.println("fRM_FUND_CODE is "+ fRM_FUND_CODE);

			transDnPojo.setFRM_FUND_CODE(fRM_FUND_CODE);

			//TO_FUND_CODE
			WebElement TO_FUND_CODE=driver.findElement(By.xpath("//*[text()='Account Info 2:']/following::span[1]"));
			String tO_FUND_CODE=TO_FUND_CODE.getText();
			System.out.println("tO_FUND_CODE is "+tO_FUND_CODE);

			transDnPojo.setTO_FUND_CODE(tO_FUND_CODE);

			//UNIT
			WebElement UNIT=driver.findElement(By.xpath("//*[text()='Unit:']/following::span[1]"));
			String uNIT=UNIT.getText();
			System.out.println("uNIT is "+uNIT);

			transDnPojo.setUNIT(uNIT);

			//UNIT_PRICE
			WebElement UNIT_PRICE=driver.findElement(By.xpath("//*[text()='Unit Price:']/following::span[1]"));
			String uNIT_PRICE=UNIT_PRICE.getText();
			System.out.println("uNIT_PRICE is "+uNIT_PRICE);

			transDnPojo.setUNIT_PRICE(uNIT_PRICE);

			//BOND_YIELD
			WebElement BOND_YIELD=driver.findElement(By.xpath("//*[text()='Bond Yield:']/following::span[1]"));
			String bOND_YIELD=BOND_YIELD.getText();
			System.out.println("bOND_YIELD is "+bOND_YIELD);

			transDnPojo.setBOND_YIELD(bOND_YIELD);

			//SURCHARGE_FEE
			WebElement SURCHARGE_FEE=driver.findElement(By.xpath("//*[text()='Surcharge Fee:']/following::span[1]"));
			String sURCHARGE_FEE=SURCHARGE_FEE.getText();
			System.out.println("sURCHARGE_FEE is "+sURCHARGE_FEE);

			transDnPojo.setSURCHARGE_FEE(sURCHARGE_FEE);

			//EXT_FROM_ACCT_TYPE
			WebElement EXT_FROM_ACCT_TYPE=driver.findElement(By.xpath("//*[text()='Ext From Account Type:']/following::span[1]"));
			String eXT_FROM_ACCT_TYPE=EXT_FROM_ACCT_TYPE.getText();
			System.out.println("eXT_FROM_ACCT_TYPE is "+eXT_FROM_ACCT_TYPE);

			transDnPojo.setEXT_FROM_ACCT_TYPE(eXT_FROM_ACCT_TYPE);

			//EXT_TO_ACCT_TYPE
			WebElement EXT_TO_ACCT_TYPE=driver.findElement(By.xpath("//*[text()='Ext To Acct Type:']/following::span[1]"));
			String eXT_TO_ACCT_TYPE=EXT_TO_ACCT_TYPE.getText();
			System.out.println("eXT_TO_ACCT_TYPE is "+eXT_TO_ACCT_TYPE);

			transDnPojo.setEXT_TO_ACCT_TYPE(eXT_TO_ACCT_TYPE);

			//FROM_ACCT_DISP_NAME
			WebElement FROM_ACCT_DISP_NAME=driver.findElement(By.xpath("//*[text()='From Account Display Name:']/following::span[1]"));
			String fROM_ACCT_DISP_NAME=FROM_ACCT_DISP_NAME.getText();
			System.out.println("fROM_ACCT_DISP_NAME is "+fROM_ACCT_DISP_NAME);

			transDnPojo.setFROM_ACCT_DISP_NAME(fROM_ACCT_DISP_NAME);


			//TERMINAL_TRACE
			WebElement TERMINAL_TRACE=driver.findElement(By.xpath("//*[text()='Terminal Trace:']/following::span[1]"));
			String tERMINAL_TRACE=TERMINAL_TRACE.getText();
			System.out.println("tERMINAL_TRACE is "+tERMINAL_TRACE);

			transDnPojo.setTERMINAL_TRACE(tERMINAL_TRACE);

			//QRC_VOUCHER
			WebElement QRC_VOUCHER=driver.findElement(By.xpath("//*[text()='QRC Voucher:']/following::span[1]"));
			String qRC_VOUCHER=QRC_VOUCHER.getText();
			System.out.println("qRC_VOUCHER is "+qRC_VOUCHER);

			transDnPojo.setQRC_VOUCHER(qRC_VOUCHER);

			//BBL_FILLER_4
			WebElement BBL_FILLER_4=driver.findElement(By.xpath("//*[text()='BBL Filler 4:']/following::span[1]"));
			String bBL_FILLER_4=BBL_FILLER_4.getText();


			transDnPojo.setBBL_FILLER_4(bBL_FILLER_4);
			System.out.println("bBL_FILLER_4 is "+transDnPojo.getBBL_FILLER_4());

			//CDM_DATA
			WebElement CDM_DATA=driver.findElement(By.xpath("//*[text()='CDM DATA:']/following::span[1]"));
			String cDM_DATA=CDM_DATA.getText();
			System.out.println("cDM_DATA is "+cDM_DATA);

			transDnPojo.setCDM_DATA(cDM_DATA);

			//BBL_FILLER_5
			WebElement BBL_FILLER_5=driver.findElement(By.xpath("//*[text()='BBL Filler 5:']/following::span[1]"));
			String bBL_FILLER_5=BBL_FILLER_5.getText();


			transDnPojo.setBBL_FILLER_5(bBL_FILLER_5);
			System.out.println("bBL_FILLER_5 is "+transDnPojo.getBBL_FILLER_5());


			//CrossBorderFlag
			//String CrossBorderFlag=tRAN_DESC_PreLongData.substring(0, 1);

			WebElement CrossBorderFlag=driver.findElement(By.xpath("//*[text()='Cross Border Flag:']/following::span[1]"));
			String crossBorderFlag=CrossBorderFlag.getText();
			transDnPojo.setCrossBorderFlag(crossBorderFlag);
			System.out.println("CrossBorderFlag is "+transDnPojo.getCrossBorderFlag());


			//cardBrand

			//String cardBrand=tRAN_DESC_PreLongData.substring(2, 13);
			WebElement card_Brand=driver.findElement(By.xpath("//*[text()='Card Brand:']/following::span[1]"));
			String cardBrand=card_Brand.getText();

			transDnPojo.setCardBrand(cardBrand);
			System.out.println("card_Brand is "+transDnPojo.getCardBrand());

			//card_location

			//String card_location=tRAN_DESC_PreLongData.substring(13, 14);
			WebElement card_location=driver.findElement(By.xpath("//*[text()='Card Location:']/following::span[1]"));
			String cardlocation=card_location.getText();
			transDnPojo.setCard_location(cardlocation);
			System.out.println("card_location is "+transDnPojo.getCard_location());

			//card_scheme

			WebElement card_scheme=driver.findElement(By.xpath("//*[text()='Card Scheme:']/following::span[1]"));
			String cardscheme=card_scheme.getText();
			transDnPojo.setCard_scheme(cardscheme);
			System.out.println("card_scheme is "+transDnPojo.getCard_scheme());

			//Card_Owner_BranchCode
			WebElement Card_Owner_BranchCode=driver.findElement(By.xpath("//*[text()='Card Owner Branch:']/following::span[1]"));
			String card_Owner_BranchCode=Card_Owner_BranchCode.getText();
			transDnPojo.setCard_Owner_BranchCode(card_Owner_BranchCode);
			System.out.println("card_location is "+transDnPojo.getCard_Owner_BranchCode());



			//txn_service

			//String txn_service=tRAN_DESC_PreLongData.substring(14, 20);
			WebElement txn_service=driver.findElement(By.xpath("//*[text()='Card Location:']/following::span[1]"));
			String txnservice=txn_service.getText();

			transDnPojo.setTxn_service(txnservice);
			System.out.println("txn_service is "+transDnPojo.getTxn_service());

			//bbl_private

			//String bbl_private=tRAN_DESC_PreLongData.substring(49, 99);
			WebElement bbl_private=driver.findElement(By.xpath("//*[text()='BBL Private:']/following::span[1]"));
			String bblprivate=bbl_private.getText();

			transDnPojo.setBbl_private(bblprivate);
			System.out.println("bblprivate is "+transDnPojo.getBbl_private());

			//ATCResult

			//String ATCResult=tRAN_UNIQUE_DATA_PreLongData.substring(28, 29);
			WebElement ATCResult=driver.findElement(By.xpath("//*[text()='ATC Result:']/following::span[1]"));
			String aTCResult=ATCResult.getText();

			transDnPojo.setATCResult(aTCResult);
			System.out.println("ATCResult is "+transDnPojo.getATCResult());



			//CVV2AcquirerResult

			WebElement CVV2AcquirerResult=driver.findElement(By.xpath("//*[text()='CVV2 Issuer Result:']/following::span[1]"));
			String cVV2AcquirerResult=CVV2AcquirerResult.getText();
			transDnPojo.setCVV2AcquirerResult(cVV2AcquirerResult);
			System.out.println("CVV2IssuerResult is "+transDnPojo.getCVV2AcquirerResult());

			//CVV2IssuerResult

			//String CVV2IssuerResult=tRAN_UNIQUE_DATA_PreLongData.substring(31, 32);
			WebElement CVV2IssuerResult=driver.findElement(By.xpath("//*[text()='CVV2 Issuer Result:']/following::span[1]"));
			String cVV2IssuerResult=CVV2IssuerResult.getText();
			transDnPojo.setCVV2IssuerResult(cVV2IssuerResult);
			System.out.println("CVV2IssuerResult is "+transDnPojo.getCVV2IssuerResult());

			//CVV2PresenceIndicator

			//String CVV2PresenceIndicator=tRAN_UNIQUE_DATA_PreLongData.substring(32, 33);
			WebElement CVV2PresenceIndicator=driver.findElement(By.xpath("//*[text()='CVV2 Pres Ind:']/following::span[1]"));
			String cVV2PresenceIndicator=CVV2PresenceIndicator.getText();
			transDnPojo.setCVV2PresenceIndicator(cVV2PresenceIndicator);
			System.out.println("CVV2PresenceIndicator is "+transDnPojo.getCVV2PresenceIndicator());

			//CVV2ResponseIndicator

			//String CVV2ResponseIndicator=tRAN_UNIQUE_DATA_PreLongData.substring(33, 34);

			WebElement CVV2ResponseIndicator=driver.findElement(By.xpath("//*[text()='CVV2 Resp Ind:']/following::span[1]"));
			String cVV2ResponseIndicator=CVV2ResponseIndicator.getText();
			transDnPojo.setCVV2ResponseIndicator(cVV2ResponseIndicator);
			System.out.println("CVV2ResponseIndicator is "+transDnPojo.getCVV2ResponseIndicator());

			//AcqRoutingNo

			WebElement AcqRoutingNo=driver.findElement(By.xpath("//*[text()='Acquirer Routing No:']/following::span[1]"));
			String acqRoutingNo=AcqRoutingNo.getText();
			transDnPojo.setACQ_ROUTING_NO(acqRoutingNo);
			System.out.println("AcqRoutingNo is "+transDnPojo.getACQ_ROUTING_NO());

			//ATM_Terminal_ID

			WebElement ATM_Terminal_ID=driver.findElement(By.xpath("//*[text()='ATM Terminal ID:']/following::span[1]"));
			String aTM_Terminal_ID=ATM_Terminal_ID.getText();
			transDnPojo.setATM_Terminal_ID(aTM_Terminal_ID);
			System.out.println("ATM_Terminal_ID is "+transDnPojo.getATM_Terminal_ID());


			//bblATM_Terminal_ID

			WebElement bblATM_Terminal_ID=driver.findElement(By.xpath("//*[text()='BBL ATM Terminal ID:']/following::span[1]"));
			String BblATM_Terminal_ID=bblATM_Terminal_ID.getText();
			transDnPojo.setBblATM_Terminal_ID(BblATM_Terminal_ID);
			System.out.println("bblATM_Terminal_ID is "+transDnPojo.getBblATM_Terminal_ID());


			//Card_Owner

			WebElement Card_Owner=driver.findElement(By.xpath("//*[text()='BBL Card Owner:']/following::span[1]"));
			String card_Owner=Card_Owner.getText();
			transDnPojo.setCARD_OWNER(card_Owner);
			System.out.println("Card_Owner is "+transDnPojo.getCARD_OWNER());


			//DCC_Home_CCY_Name


			WebElement DCC_Home_CCY_Name=driver.findElement(By.xpath("//*[text()='DCC Home CCY Name:']/following::span[1]"));
			String dCC_Home_CCY_Name=DCC_Home_CCY_Name.getText();
			transDnPojo.setDCC_Home_CCY_Name(dCC_Home_CCY_Name);
			System.out.println("DCC_Home_CCY_Name is "+transDnPojo.getDCC_Home_CCY_Name());

			//DestRoutingNo
			WebElement DestRoutingNo=driver.findElement(By.xpath("//*[text()='Destination Routing No:']/following::span[1]"));
			String destRoutingNo=DestRoutingNo.getText();
			transDnPojo.setDEST_ROUTING_NO(destRoutingNo);
			System.out.println("DestRoutingNo is "+transDnPojo.getDEST_ROUTING_NO());


			//deviceTypeChannel

			WebElement deviceTypeChannel=driver.findElement(By.xpath("//*[text()='Device Type Channel:']/following::span[1]"));
			String DeviceTypeChannel=deviceTypeChannel.getText();
			transDnPojo.setDeviceTypeChannel(DeviceTypeChannel);
			System.out.println("deviceTypeChannel is "+transDnPojo.getDeviceTypeChannel());


			//FrAcct_Owner_Branch

			WebElement FrAcct_Owner_Branch=driver.findElement(By.xpath("//*[text()='From Account Owner Branch:']/following::span[1]"));
			String frAcct_Owner_Branch=FrAcct_Owner_Branch.getText();
			transDnPojo.setFrAcct_Owner_Branch(frAcct_Owner_Branch);
			System.out.println("FrAcct_Owner_Branch is "+transDnPojo.getFrAcct_Owner_Branch());

			//IR_Counter

			WebElement IR_Counter=driver.findElement(By.xpath("//*[text()='IR Counter:']/following::span[1]"));
			String iR_Counter=IR_Counter.getText();
			transDnPojo.setIR_Counter(iR_Counter);
			System.out.println("IR_Counter is "+transDnPojo.getIR_Counter());

			//IR_Flag

			WebElement IR_Flag=driver.findElement(By.xpath("//*[text()='IR Flag:']/following::span[1]"));
			String iR_Flag=IR_Flag.getText();
			transDnPojo.setIR_Flag(iR_Flag);
			System.out.println("IR_Flag is "+transDnPojo.getIR_Flag());

			//IssRoutingNo

			WebElement IssRoutingNo=driver.findElement(By.xpath("//*[text()='Issuer Routing No:']/following::span[1]"));
			String issRoutingNo=IssRoutingNo.getText();
			transDnPojo.setIssRoutingNo(issRoutingNo);
			System.out.println("IssRoutingNo is "+transDnPojo.getIssRoutingNo());


			//Original_Card_Owner

			WebElement Original_Card_Owner=driver.findElement(By.xpath("//*[text()='Original Card Owner:']/following::span[1]"));
			String original_Card_Owner=Original_Card_Owner.getText();
			transDnPojo.setOriginal_Card_Owner(original_Card_Owner);
			System.out.println("Original_Card_Owner is "+transDnPojo.getOriginal_Card_Owner());

			//Original_Terminal_Owner

			WebElement Original_Terminal_Owner=driver.findElement(By.xpath("//*[text()='Original Terminal Owner']/following::span[1]"));
			String original_Terminal_Owner=Original_Terminal_Owner.getText();
			transDnPojo.setOriginal_Terminal_Owner(original_Terminal_Owner);
			System.out.println("Original_Terminal_Owner is "+transDnPojo.getOriginal_Terminal_Owner());


			//Oth_Bank_Use_Counter

			WebElement Oth_Bank_Use_Counter=driver.findElement(By.xpath("//*[text()='Other Bank Use Counter:']/following::span[1]"));
			String oth_Bank_Use_Counter=Oth_Bank_Use_Counter.getText();
			transDnPojo.setOth_Bank_Use_Counter(oth_Bank_Use_Counter);
			System.out.println("Oth_Bank_Use_Counter is "+transDnPojo.getOth_Bank_Use_Counter());

			//Partial_Reverse_Amount

			WebElement Partial_Reverse_Amount=driver.findElement(By.xpath("//*[text()='Partial Reverse Amount']/following::span[1]"));
			String partial_Reverse_Amount=Partial_Reverse_Amount.getText();
			transDnPojo.setPartial_Reverse_Amount(partial_Reverse_Amount);
			System.out.println("Partial_Reverse_Amount is "+transDnPojo.getPartial_Reverse_Amount());



			//Payee

			WebElement Payee=driver.findElement(By.xpath("//*[text()='Payee:']/following::span[1]"));
			String payee=Payee.getText();
			transDnPojo.setPAYEE(payee);
			System.out.println("Payee is "+transDnPojo.getPAYEE());	

			//STANDIN_ACT

			WebElement STANDIN_ACT=driver.findElement(By.xpath("//*[text()='Standin Action:']/following::span[1]"));
			String sTANDIN_ACT=STANDIN_ACT.getText();
			transDnPojo.setSTANDIN_ACT(sTANDIN_ACT);
			System.out.println("sTANDIN_ACT is "+transDnPojo.getSTANDIN_ACT()); 

			//Terminal_Owner_BranchCode

			WebElement Terminal_Owner_BranchCode=driver.findElement(By.xpath("//*[text()='Terminal Owner Branch:']/following::span[1]"));
			String terminal_Owner_BranchCode=Terminal_Owner_BranchCode.getText();
			transDnPojo.setTerminal_Owner_BranchCode(terminal_Owner_BranchCode);
			System.out.println("Terminal_Owner_BranchCode is "+transDnPojo.getTerminal_Owner_BranchCode());

			//Terminal_Provice_RegionID

			WebElement Terminal_Provice_RegionID=driver.findElement(By.xpath("//*[text()='Terminal Province Region ID:']/following::span[1]"));
			String terminal_Provice_RegionID=Terminal_Provice_RegionID.getText();
			transDnPojo.setTerminal_Provice_RegionID(terminal_Provice_RegionID);
			System.out.println("Terminal_Provice_RegionID is "+transDnPojo.getTerminal_Provice_RegionID());	

			//Terminal_State

			WebElement Terminal_State=driver.findElement(By.xpath("//*[text()='Terminal State:']/following::span[1]"));
			String terminal_State=Terminal_State.getText();
			transDnPojo.setTerminal_State(terminal_State);
			System.out.println("Terminal_State is "+transDnPojo.getTerminal_State());


			//ToAcct_Owner_Branch

			WebElement ToAcct_Owner_Branch=driver.findElement(By.xpath("//*[text()='To Account Owner Branch:']/following::span[1]"));
			String toAcct_Owner_Branch=ToAcct_Owner_Branch.getText();
			transDnPojo.setToAcct_Owner_Branch(toAcct_Owner_Branch);
			System.out.println("ToAcct_Owner_Branch is "+transDnPojo.getToAcct_Owner_Branch());

			// WHTTax;

			WebElement WHTTax=driver.findElement(By.xpath("//*[text()='Withholding Tax:']/following::span[1]"));
			String wHTTax=WHTTax.getText();
			transDnPojo.setWHT_TAX(wHT_TAX_COND);
			System.out.println("WHTTax is "+transDnPojo.getWHT_TAX());

			// WHTTaxCon;

			WebElement WHTTaxCon=driver.findElement(By.xpath("//*[text()='Withholding Tax Condition:']/following::span[1]"));
			String wHTTaxCon=WHTTaxCon.getText();
			transDnPojo.setWHT_TAX_COND(wHT_TAX_COND);
			System.out.println("WHTTaxCon is "+transDnPojo.getWHT_TAX_COND());





			//****************************LONG TAB TAB******************************************************************

			//Navigating to Long Data Tab

			WebElement longdataTab=driver.findElement(By.id("ui-id-3"));
			longdataTab.click();


			//Screenshot for LONG DATA Tab 
			Robot robot5=new Robot();
			Dimension screensize5=Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rectangle5=new Rectangle(screensize5);
			BufferedImage sourcefile5=robot5.createScreenCapture(rectangle5);
			File destinationfile5=new File("DNLongTab.png");
			ImageIO.write(sourcefile5, "png", destinationfile5);


			//Acquirer Data 


			//REF_DATA_ACQ
			WebElement REF_DATA_ACQ=driver.findElement(By.xpath("//*[text()='Reference Data:']/following::span[1]"));
			String rEF_DATA_ACQ=REF_DATA_ACQ.getText();
			System.out.println("rEF_DATA_ACQ is "+rEF_DATA_ACQ);

			//REF_DATA_ACQ_PreLongData
			WebElement REF_DATA_ACQ_PreLongData=driver.findElement(By.xpath("//*[text()='Reference Data:']/following::div[1]"));
			String rEF_DATA_ACQ_PreLongData=REF_DATA_ACQ_PreLongData.getText();
			System.out.println("rEF_DATA_ACQ_PreLongData is "+rEF_DATA_ACQ_PreLongData);

			//DATA_PRIV_ACQ
			WebElement DATA_PRIV_ACQ=driver.findElement(By.xpath("//*[text()='Private Data:']/following::span[1]"));
			String dATA_PRIV_ACQ=DATA_PRIV_ACQ.getText();
			System.out.println("dATA_PRIV_ACQ is "+dATA_PRIV_ACQ);

			//DATA_PRIV_ACQ_PreLongData
			WebElement DATA_PRIV_ACQ_PreLongData=driver.findElement(By.xpath("//*[text()='Private Data:']/following::div[1]"));
			String dATA_PRIV_ACQ_PreLongData=DATA_PRIV_ACQ_PreLongData.getText();
			System.out.println("dATA_PRIV_ACQ_PreLongData is "+dATA_PRIV_ACQ_PreLongData);

			//ADL_DATA_PRIV_ACQ
			WebElement ADL_DATA_PRIV_ACQ=driver.findElement(By.xpath("//*[text()='Additional Private Data:']/following::span[1]"));
			String aDL_DATA_PRIV_ACQ=ADL_DATA_PRIV_ACQ.getText();
			System.out.println("aDL_DATA_PRIV_ACQ is "+aDL_DATA_PRIV_ACQ);

			//ADL_DATA_PRIV_ACQ_PreLongData
			WebElement ADL_DATA_PRIV_ACQ_PreLongData=driver.findElement(By.xpath("//*[text()='Additional Private Data:']/following::div[1]"));
			String aDL_DATA_PRIV_ACQ_PreLongData=ADL_DATA_PRIV_ACQ_PreLongData.getText();
			System.out.println("aDL_DATA_PRIV_ACQ_PreLongData is "+aDL_DATA_PRIV_ACQ_PreLongData);


			//Issuer Data 

			//need to update xpath

			/*

			 //REF_DATA_ACQ

			WebElement REF_DATA_ISS=driver.findElement(By.xpath("//div[@class='content_group_name']/following::div[7]/following::span[1]"));
			String rEF_DATA_ISS=REF_DATA_ISS.getText();
			System.out.println("rEF_DATA_ISS is "+rEF_DATA_ISS);

			//REF_DATA_ISS_PreLongData
			WebElement REF_DATA_ISS_PreLongData=driver.findElement(By.xpath("//*[text()='Reference Data:']/following::span[1]"));
			String rEF_DATA_ISS_PreLongData=REF_DATA_ISS_PreLongData.getText();
			System.out.println("rEF_DATA_ISS_PreLongData is "+rEF_DATA_ISS_PreLongData);

			//DATA_PRIV_ISS
			WebElement DATA_PRIV_ISS=driver.findElement(By.xpath("//div[@class='content_group_name']/following::div[7]/following::span[2]"));
			String dATA_PRIV_ISS=DATA_PRIV_ISS.getText();
			System.out.println("dATA_PRIV_ISS is "+dATA_PRIV_ISS);

			//DATA_PRIV_ISS_PreLongData
			WebElement DATA_PRIV_ISS_PreLongData=driver.findElement(By.xpath("//*[text()='Private Data:']/following::span[1]"));
			String dATA_PRIV_ISS_PreLongData=DATA_PRIV_ISS_PreLongData.getText();
			System.out.println("dATA_PRIV_ISS_PreLongData is "+dATA_PRIV_ISS_PreLongData);

			//ADL_DATA_PRIV_ISS
			WebElement ADL_DATA_PRIV_ISS=driver.findElement(By.xpath("//div[@class='content_group_name']/following::div[7]/following::span[3]"));
			String aDL_DATA_PRIV_ISS=ADL_DATA_PRIV_ISS.getText();
			System.out.println("aDL_DATA_PRIV_ISS is "+aDL_DATA_PRIV_ISS);

			//ADL_DATA_PRIV_ISS_PreLongData
			WebElement ADL_DATA_PRIV_ISS_PreLongData=driver.findElement(By.xpath("//*[text()='Additional Private Data:']/following::div[1]"));
			String aDL_DATA_PRIV_ISS_PreLongData=ADL_DATA_PRIV_ISS_PreLongData.getText();
			System.out.println("aDL_DATA_PRIV_ISS_PreLongData is "+aDL_DATA_PRIV_ISS_PreLongData);

			 */


			//Other Data


			//ADL_RESP_DATA


			WebElement ADL_RESP_DATA=driver.findElement(By.xpath("//*[text()='Additional Response Data:']/following::span[1]"));
			String aDL_RESP_DATA=ADL_RESP_DATA.getText();
			System.out.println("aDL_RESP_DATA is "+aDL_RESP_DATA);

			//ADL_RESP_DATA_PreLongData

			WebElement ADL_RESP_DATA_PreLongData=driver.findElement(By.xpath("//*[text()='Additional Response Data:']/following::div[1]"));
			String aDL_RESP_DATA_PreLongData=ADL_RESP_DATA_PreLongData.getText();
			System.out.println("aDL_RESP_DATA_PreLongData is "+aDL_RESP_DATA_PreLongData);

			//TRACK_2_DATA

			WebElement TRACK_2_DATA=driver.findElement(By.xpath("//*[text()='Track 2 Data:']/following::span[1]"));
			String tRACK_2_DATA=TRACK_2_DATA.getText();
			System.out.println("tRACK_2_DATA is "+tRACK_2_DATA);

			//TRACK_2_DATA_PreLongData

			WebElement TRACK_2_DATA_PreLongData=driver.findElement(By.xpath("//*[text()='Tran Unique Data:']/following::div[1]"));
			String tRACK_2_DATA_PreLongData=TRACK_2_DATA_PreLongData.getText();
			System.out.println("tRACK_2_DATA_PreLongData is "+tRACK_2_DATA_PreLongData);

			//TRAN_UNIQUE_DATA

			WebElement TRAN_UNIQUE_DATA=driver.findElement(By.xpath("//*[text()='Tran Unique Data:']/following::span[1]"));
			String tRAN_UNIQUE_DATA=TRAN_UNIQUE_DATA.getText();
			System.out.println("tRAN_UNIQUE_DATA is "+tRAN_UNIQUE_DATA);

			//TRAN_UNIQUE_DATA_PreLongData

			WebElement TRAN_UNIQUE_DATA_PreLongData=driver.findElement(By.xpath("//*[text()='Tran Unique Data:']/following::div[1]"));
			String tRAN_UNIQUE_DATA_PreLongData=TRAN_UNIQUE_DATA_PreLongData.getText();
			System.out.println("tRAN_UNIQUE_DATA_PreLongData is "+tRAN_UNIQUE_DATA_PreLongData);




			//TRAN_DESC
			WebElement TRAN_DESC=driver.findElement(By.xpath("//*[text()='Tran Description:']/following::span[1]"));
			String tRAN_DESC=TRAN_DESC.getText();
			System.out.println("tRAN_DESC is "+tRAN_DESC);

			//TRAN_DESC_PreLongData
			WebElement TRAN_DESC_PreLongData=driver.findElement(By.xpath("//*[text()='Tran Description:']/following::div[1]"));
			String tRAN_DESC_PreLongData=TRAN_DESC_PreLongData.getText();
			System.out.println("tRAN_DESC_PreLongData is "+tRAN_DESC_PreLongData);


			/*	
			String CrossBorderFlag=tRAN_DESC_PreLongData.substring(0, 1);
			transDnPojo.setCrossBorderFlag(CrossBorderFlag);
			System.out.println("CrossBorderFlag is "+CrossBorderFlag);

			String card_scheme=tRAN_DESC_PreLongData.substring(1, 2);
			transDnPojo.setCard_scheme(card_scheme);
			System.out.println("card_scheme is "+card_scheme);


			String cardBrand=tRAN_DESC_PreLongData.substring(2, 13);
			transDnPojo.setCardBrand(cardBrand);
			System.out.println("cardBrand is "+cardBrand);

			String card_location=tRAN_DESC_PreLongData.substring(13, 14);
			transDnPojo.setCard_location(card_location);
			System.out.println("card_location is "+card_location);

			String txn_service=tRAN_DESC_PreLongData.substring(14, 20);
			transDnPojo.setTxn_service(txn_service);
			System.out.println("txn_service is "+txn_service);

			String bbl_private=tRAN_DESC_PreLongData.substring(49, 99);
			transDnPojo.setBbl_private(bbl_private);
			System.out.println("bbl_private is "+bbl_private);

			 */

			//UNFORMATTED_MICR_DATA
			WebElement UNFORMATTED_MICR_DATA=driver.findElement(By.xpath("//*[text()='Unformatted MICR Data:']/following::span[1]"));
			String uNFORMATTED_MICR_DATA=UNFORMATTED_MICR_DATA.getText();
			System.out.println("uNFORMATTED_MICR_DATA is "+uNFORMATTED_MICR_DATA);


			//UNFORMATTED_MICR_DATA_PreLongData
			WebElement UNFORMATTED_MICR_DATA_PreLongData=driver.findElement(By.xpath("//*[text()='Unformatted MICR Data:']/following::div[1]"));
			String uNFORMATTED_MICR_DATA_PreLongData=UNFORMATTED_MICR_DATA_PreLongData.getText();
			System.out.println("uNFORMATTED_MICR_DATA_PreLongData is "+uNFORMATTED_MICR_DATA_PreLongData);


			/*//PAYEE
			WebElement PAYEE=driver.findElement(By.xpath("//*[text()='Unformatted MICR Data:']/following::span[1]"));
			String pAYEE=PAYEE.getText();
			System.out.println("pAYEE is "+pAYEE);*/

			//PAYEE_PreLongData
			WebElement PAYEE_PreLongData=driver.findElement(By.xpath("//*[text()='Unformatted MICR Data:']/following::span[1]"));
			String pAYEE_PreLongData=PAYEE_PreLongData.getText();
			System.out.println("pAYEE_PreLongData is "+pAYEE_PreLongData);


			//****************************ADDITIONAL TRANSACTION INFORMATION TAB******************************************************************



			//Navigating to ADDITIONAL TRANSACTION INFORMATION TAB
			WebElement AdditionalTxnInfo=driver.findElement(By.id("ui-id-2"));
			AdditionalTxnInfo.click();


			//Screenshot for ADDITIONAL TRANSACTION INFORMATION  Tab 
			Robot robot6=new Robot();
			Dimension screensize6=Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rectangle6=new Rectangle(screensize6);
			BufferedImage sourcefile6=robot6.createScreenCapture(rectangle6);
			File destinationfile6=new File("DNAdditionalInfoTab.png");
			ImageIO.write(sourcefile6, "png", destinationfile6);


			/*//STANDIN_ACT

			WebElement STANDIN_ACT=driver.findElement(By.xpath("//td[@class='bold LCPL_hide'][@dntitle='standinAcct']"));
			String sTANDIN_ACT=STANDIN_ACT.getText();
			System.out.println("sTANDIN_ACT is "+sTANDIN_ACT); */



















		}


		catch(IOException | AWTException  e)
		{

			e.printStackTrace();
			logger.error("Property file about broswer IOException is"+e);
			System.err.println("IOException is"+e.getMessage());

		}

		return transDnPojo;
	}




	/*

	public void integratedCircuitCard() {

		//Navigating to Integrated Circuit Card
		WebElement integratedCircuitCard=driver.findElement(By.xpath("//a[@id='ui-id-4']"));
		integratedCircuitCard.click();


		//CRYPTOGRAM_AMOUNT
		WebElement CRYPTOGRAM_AMOUNT=driver.findElement(By.xpath("//*[text()='Cryptogram Information Data:']"));
		String cRYPTOGRAM_AMOUNT=CRYPTOGRAM_AMOUNT.getText();
		System.out.println(cRYPTOGRAM_AMOUNT);

		//AMOUNT_OTHER
		WebElement AMOUNT_OTHER=driver.findElement(By.xpath("//*[text()='Other Amount:']"));
		String aMOUNT_OTHER=AMOUNT_OTHER.getText();
		System.out.println(aMOUNT_OTHER);

		//APPL_CRYPTOGRAM
		WebElement APPL_CRYPTOGRAM=driver.findElement(By.xpath("//*[text()='Cryptogram:']"));
		String aPPL_CRYPTOGRAM=APPL_CRYPTOGRAM.getText();
		System.out.println(aPPL_CRYPTOGRAM);

		//APPL_INTRCHG_PROF
		WebElement APPL_INTRCHG_PROF=driver.findElement(By.xpath("//*[text()='Interchange Profile:']"));
		String aPPL_INTRCHG_PROF=APPL_INTRCHG_PROF.getText();
		System.out.println(aPPL_INTRCHG_PROF);

		//APPL_TRAN_COUNTER
		WebElement APPL_TRAN_COUNTER=driver.findElement(By.xpath("//*[text()='Transaction Counter:']"));
		String aPPL_TRAN_COUNTER=APPL_TRAN_COUNTER.getText();
		System.out.println(aPPL_TRAN_COUNTER);

		//APPL_VERSION_NO
		WebElement APPL_VERSION_NO=driver.findElement(By.xpath("//*[text()='Application Version Number:']"));
		String aPPL_VERSION_NO=APPL_VERSION_NO.getText();
		System.out.println(aPPL_VERSION_NO);

		//APPL_ID
		WebElement APPL_ID=driver.findElement(By.xpath("//*[text()='Application ID:']"));
		String aPPL_ID=APPL_ID.getText();
		System.out.println(aPPL_ID);

		//CARDH_VER_RESULT
		WebElement CARDH_VER_RESULT=driver.findElement(By.xpath("//*[text()='Application ID:']"));
		String cARDH_VER_RESULT=CARDH_VER_RESULT.getText();
		System.out.println(cARDH_VER_RESULT);

		//COPAC_CCS_CRYPTO
		WebElement COPAC_CCS_CRYPTO=driver.findElement(By.xpath("//*[text()='COPAC CCS CRYPTO:']"));
		String cOPAC_CCS_CRYPTO=COPAC_CCS_CRYPTO.getText();
		System.out.println(cOPAC_CCS_CRYPTO);

		//CRYPT_INFO_DATA
		WebElement CRYPT_INFO_DATA=driver.findElement(By.xpath("//*[text()='Cryptogram Information Data:']"));
		String cRYPT_INFO_DATA=CRYPT_INFO_DATA.getText();
		System.out.println(cRYPT_INFO_DATA);

		//DEDICATED_FILE_NAM
		WebElement DEDICATED_FILE_NAM=driver.findElement(By.xpath("//*[text()='Dedicated File Name:']"));
		String dEDICATED_FILE_NAM=DEDICATED_FILE_NAM.getText();
		System.out.println(dEDICATED_FILE_NAM);

		//TERM_CAPABILITIES
		WebElement TERM_CAPABILITIES=driver.findElement(By.xpath("//*[text()='Capabilities:']"));
		String tERM_CAPABILITIES=TERM_CAPABILITIES.getText();
		System.out.println(tERM_CAPABILITIES);

		//TERM_COUNTRY_CODE
		WebElement TERM_COUNTRY_CODE=driver.findElement(By.xpath("//*[text()='Country Code:']"));
		String tERM_COUNTRY_CODE=TERM_COUNTRY_CODE.getText();
		System.out.println(tERM_COUNTRY_CODE);

		//TERM_SERIAL_NO
		WebElement TERM_SERIAL_NO=driver.findElement(By.xpath("//*[text()='Serial Number:']"));
		String tERM_SERIAL_NO=TERM_SERIAL_NO.getText();
		System.out.println(tERM_SERIAL_NO);

		//TERM_VERIFY_RESULT
		WebElement TERM_VERIFY_RESULT=driver.findElement(By.xpath("//*[text()='Verification Result:']"));
		String tERM_VERIFY_RESULT=TERM_VERIFY_RESULT.getText();
		System.out.println(tERM_VERIFY_RESULT);


		//TERMINAL_TYPE --> Terminal Data Section
		WebElement TERMINAL_TYPE=driver.findElement(By.xpath("//*[@class='content_group_name']/following::div[14]/label[1]"));
		String tERMINAL_TYPE=TERMINAL_TYPE.getText();
		System.out.println(tERMINAL_TYPE);



		//TRAN_CATEGORY_CODE
		WebElement TRAN_CATEGORY_CODE=driver.findElement(By.xpath("//*[text()='Category Code:']"));
		String tRAN_CATEGORY_CODE=TRAN_CATEGORY_CODE.getText();
		System.out.println(tRAN_CATEGORY_CODE);

		//TRAN_CURRENCY_CODE
		WebElement TRAN_CURRENCY_CODE=driver.findElement(By.xpath("//*[text()='Currency Code:']"));
		String tRAN_CURRENCY_CODE=TRAN_CURRENCY_CODE.getText();
		System.out.println(tRAN_CURRENCY_CODE);

		//TRAN_DATE
		WebElement TRAN_DATE=driver.findElement(By.xpath("//*[text()='Date:']"));
		String tRAN_DATE=TRAN_DATE.getText();
		System.out.println(tRAN_DATE);


		//TRAN_SEQ_COUNTER
		WebElement TRAN_SEQ_COUNTER=driver.findElement(By.xpath("//*[text()='Sequence Counter:']"));
		String tRAN_SEQ_COUNTER=TRAN_SEQ_COUNTER.getText();
		System.out.println(tRAN_SEQ_COUNTER);



		//TRAN_TYPE  -> Transaction Date Section
		WebElement TRAN_TYPE=driver.findElement(By.xpath("//*[@class='content_group_name']/following::label[1]"));
		String tRAN_TYPE=TRAN_TYPE.getText();
		System.out.println(tRAN_TYPE);

		//UNPREDICTABLE_NO
		WebElement UNPREDICTABLE_NO=driver.findElement(By.xpath("//*[text()='Unpredictable Number:']"));
		String uNPREDICTABLE_NO=UNPREDICTABLE_NO.getText();
		System.out.println(uNPREDICTABLE_NO);

		//DERIVATION_KEY_IDX
		WebElement DERIVATION_KEY_IDX=driver.findElement(By.xpath("//*[text()='Derivation Key Index:']"));
		String dERIVATION_KEY_IDX=DERIVATION_KEY_IDX.getText();
		System.out.println(dERIVATION_KEY_IDX);


		//ARPC_CRYPTOGRAM
		WebElement ARPC_CRYPTOGRAM=driver.findElement(By.xpath("//*[text()='ARPC Cryptogram:']"));
		String aRPC_CRYPTOGRAM=ARPC_CRYPTOGRAM.getText();
		System.out.println(aRPC_CRYPTOGRAM);

		//ARPC_RESPCODE
		WebElement ARPC_RESPCODE=driver.findElement(By.xpath("//*[text()='ARPC Response Code:']"));
		String aRPC_RESPCODE=ARPC_RESPCODE.getText();
		System.out.println(aRPC_RESPCODE);


		//DEDICATED_FNAME
		WebElement DEDICATED_FNAME=driver.findElement(By.xpath("//*[text()='Dedicated File Name:']"));
		String dEDICATED_FNAME=DEDICATED_FNAME.getText();
		System.out.println(dEDICATED_FNAME);

		//ISS_APPL_DATA
		WebElement ISS_APPL_DATA=driver.findElement(By.xpath("//*[text()='Application Data:']"));
		String iSS_APPL_DATA=ISS_APPL_DATA.getText();
		System.out.println(iSS_APPL_DATA);

		//ISS_AUTH_DATA
		WebElement ISS_AUTH_DATA=driver.findElement(By.xpath("//*[text()='Authentication Data:']"));
		String iSS_AUTH_DATA=ISS_AUTH_DATA.getText();
		System.out.println(iSS_AUTH_DATA);


		//ISS_DISCR_DATA
		WebElement ISS_DISCR_DATA=driver.findElement(By.xpath("//*[text()='Discretionary Data:']"));
		String iSS_DISCR_DATA=ISS_DISCR_DATA.getText();
		System.out.println(iSS_DISCR_DATA);	

		//ISS_SCRIPT_RESULT
		WebElement ISS_SCRIPT_RESULT=driver.findElement(By.xpath("//*[text()='Script Results:']"));
		String iSS_SCRIPT_RESULT=ISS_SCRIPT_RESULT.getText();
		System.out.println(iSS_SCRIPT_RESULT);	

		//ISS_SCRIPT1_DATA
		WebElement ISS_SCRIPT1_DATA=driver.findElement(By.xpath("//*[text()='Script 1 Data:']"));
		String iSS_SCRIPT1_DATA=ISS_SCRIPT1_DATA.getText();
		System.out.println(iSS_SCRIPT1_DATA);

		//ISS_SCRIPT2_DATA
		WebElement ISS_SCRIPT2_DATA=driver.findElement(By.xpath("//*[text()='Script 2 Data:']"));
		String iSS_SCRIPT2_DATA=ISS_SCRIPT2_DATA.getText();
		System.out.println(iSS_SCRIPT2_DATA);

		//FORM_FACTOR_IND
		WebElement FORM_FACTOR_IND=driver.findElement(By.xpath("//*[text()='Form Factor Indicator:']"));
		String fORM_FACTOR_IND=FORM_FACTOR_IND.getText();
		System.out.println(fORM_FACTOR_IND);


	}*/

	/*public static void main(String[] args) throws IOException, AWTException, TimeoutException, InterruptedException {

		searchTransaction();

	}*/


}
