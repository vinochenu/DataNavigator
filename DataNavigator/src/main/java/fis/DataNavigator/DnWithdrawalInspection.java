package fis.DataNavigator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.net.HostSpecifier;

public class DnWithdrawalInspection {

	


	public static ArrayList<String>  readInputExcel() throws IOException {
		
		

		File file=new File("DNExcel.xlsx");
		
		FileInputStream Fis=new FileInputStream(file);
		
		XSSFWorkbook workbook=new XSSFWorkbook(Fis);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rowcount=sheet.getLastRowNum();
		
		
		int columncount=sheet.getRow(0).getLastCellNum();
		

		ArrayList<String> excelInput=new ArrayList<>();
		
		DataFormatter formatter=new DataFormatter();


		for (int i=1;i<=rowcount;i++) {
			
			for(int j=0;j<columncount;j++) {
			
			excelInput.add(formatter.formatCellValue(sheet.getRow(i).getCell(j)));
			}
			
		}

		workbook.close();

		return excelInput;
	}



	public static DNWithdrawalPojo login() throws InterruptedException, IOException {



		WebDriver driver = null;

		FileInputStream fileInputStream=new FileInputStream("configDN.properties");
		Properties properties=new Properties();
		properties.load(fileInputStream);

		String browser=properties.getProperty("Browser");
		String driverlocation=properties.getProperty("DriverLocation");
		String appurl=properties.getProperty("ApplicationUrl");
		if(browser.equalsIgnoreCase("chrome")) 
		{
			//System.setProperty("Webdriver.Chrome.driver",driverlocation );
			driver = new ChromeDriver();
		}
		else	
		{
			System.setProperty("Webdriver.ie.driver",driverlocation );
			driver = new InternetExplorerDriver();
		}

		driver.get(appurl);
		driver.manage().window().maximize();

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

		// Navigating to Transaction Search

		WebElement Transactions = driver.findElement(By.xpath("//*[@id=\"menubar\"]/ul/li[2]/a"));

		WebElement TransactionSearch = driver.findElement(By.xpath("//*[@id=\"menubar\"]/ul/li[2]/ul/li[1]/a"));

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

		WebElement Search = driver.findElement(By.id("search1"));
		Search.click();

		List<WebElement> Total_rows = driver.findElements(By.tagName("tr"));
		int row_count = Total_rows.size();
		System.out.println("Total Row count is " + row_count);

		List<WebElement> Total_columns = driver.findElements(By.tagName("td"));
		int column_counnt = Total_columns.size();
		System.out.println("Total Column count is " + column_counnt);

		// TO select searched txn
		WebElement txn1 = driver.findElement(By.xpath("//*[@id=\"tranResults\"]/tbody/tr[1]/td[2]/a"));
		txn1.click();

		WebElement txn_PAN = driver.findElement(By.xpath("//*[@id=\"current\"]/div[3]/table/tbody/tr[1]/td[2]"));
		String PAN = txn_PAN.getText();
		System.out.println("Selected Transaction PAN is " + PAN);

		WebElement txn_DevieID = driver.findElement(By.xpath("//*[@id=\"current\"]/div[3]/table/tbody/tr[3]/td[2]"));
		String Device_ID = txn_DevieID.getText();
		System.out.println("Selected Transaction Device_ID is " + Device_ID);

		WebElement txn_Pcode = driver.findElement(By.xpath("//*[@id=\"current\"]/div[3]/table/tbody/tr[4]/td[2]"));
		String PCODE = txn_Pcode.getText();
		System.out.println("Selected Transaction PCODE is " + PCODE);

		WebElement txn_Refno = driver.findElement(By.xpath("//*[@id=\"current\"]/div[3]/table/tbody/tr[4]/td[6]"));
		String Retrieval_REFNO = txn_Refno.getText();
		System.out.println("Selected Transaction REFNO is " + Retrieval_REFNO);

		// Assigning values to setRETRIEVAL_REF_NO()
		DNWithdrawalPojo dn_withdrawal = new DNWithdrawalPojo();
		dn_withdrawal.setRETRIEVAL_REF_NO(Retrieval_REFNO);

		WebElement txn_Trace = driver.findElement(By.xpath("//*[@id=\"current\"]/div[3]/table/tbody/tr[5]/td[5]"));
		String trace = txn_Trace.getText();
		int Trace=Integer.parseInt(trace);
		System.out.println("Selected Transaction Trace is " + Trace);

		// Assigning values to setSYS_TRACE_AUDIT_NO()
		dn_withdrawal.setSYS_TRACE_AUDIT_NO(Trace);

		WebElement txn_AuthNum = driver.findElement(By.xpath("//*[@id=\"current\"]/div[3]/table/tbody/tr[8]/td[4]"));
		String AuthNum = txn_AuthNum.getText();
		System.out.println("Selected Transaction AuthNum is " + AuthNum);

		// Assigning values to setAPPROVAL_CODE()
		dn_withdrawal.setAPPROVAL_CODE(AuthNum);

		WebElement txn_TXN_Date_Time = driver
				.findElement(By.xpath("//*[@id=\"current\"]/div[3]/table/tbody/tr[1]/td[4]"));
		String TXN_Date_Time = txn_TXN_Date_Time.getText();
		System.out.println("Selected Transaction TXN_Date_Time is " + TXN_Date_Time);

		//Assigning values to TSTAMP_TRANS()
		dn_withdrawal.setTSTAMP_TRANS(TXN_Date_Time);

		WebElement txn_Local_Date_Time = driver
				.findElement(By.xpath("//*[@id=\"current\"]/div[3]/table/tbody/tr[2]/td[6]"));
		String Local_Date_Time = txn_Local_Date_Time.getText();
		System.out.println("Selected Transaction Local_Date_Time is " + Local_Date_Time);


		//Assigning values to TSTAMP_TRANS()
		dn_withdrawal.setTSTAMP_LOCAL(Local_Date_Time);

		WebElement txn_Acquirer_ID = driver
				.findElement(By.xpath("//*[@id=\"current\"]/div[12]/table/tbody/tr[1]/td[2]"));
		String Acquirer_ID = txn_Acquirer_ID.getText();
		System.out.println("Selected Transaction Acquirer_ID is " + Acquirer_ID);

		// Assigning values to setINST_ID_ACQ()
		dn_withdrawal.setINST_ID_ACQ(Acquirer_ID);

		WebElement txn_Issuer_ID = driver.findElement(By.xpath("//*[@id=\"current\"]/div[15]/table/tbody/tr[1]/td[2]"));
		String Issuer_ID = txn_Issuer_ID.getText();
		System.out.println("Selected Transaction Issuer_ID is " + Issuer_ID);

		// Assigning values to setINST_ID_ACQ()
		dn_withdrawal.setINST_ID_ISS(Issuer_ID);

		WebElement txn_Termial_ID = driver.findElement(By.xpath("//*[@id=\"current\"]/div[9]/table/tbody/tr[3]/td[4]"));
		String txn_Term_ID = txn_Termial_ID.getText();
		System.out.println("Selected Transaction txn_Termial_ID is " + txn_Term_ID);

		// Assigning values to setINST_ID_ACQ()
		dn_withdrawal.setCARD_ACPT_TERM_ID(txn_Term_ID);

		driver.close();

		return dn_withdrawal;



	}
}
