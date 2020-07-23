package fis.TXNACT;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeoutException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import fis.DataNavigator.DnInspection;
import fis.DataNavigator.DriverInstance;

public class DNTxnSearch_TXNACT extends DriverInstance {
	
	static DnInspection txnDN=DnInspection.getInstance();
	
	
	
	public void dn_txnsearch() throws IOException, AWTException, TimeoutException, InterruptedException  {

		try {
			
		}
		FileInputStream fileInputStream=new FileInputStream("configDN.properties");
			Properties properties=new Properties();
			properties.load(fileInputStream);
			String appurl=properties.getProperty("ApplicationUrl");
			String username=properties.getProperty("Username");
			String password=properties.getProperty("Password");

			DriverInstance.getdriver();//to use driver


			driver.get(appurl);
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// Login DN

			WebElement UserID = driver.findElement(By.name("userId"));
			UserID.clear();
			UserID.click();
			UserID.sendKeys(username);


			WebElement Password = driver.findElement(By.name("password"));
			Password.clear();
			Password.click();
			Password.sendKeys(password);

			WebElement Login = driver.findElement(By.name("action"));
			Login.click();




			// Navigating to Transaction Search

			
			WebElement Transactions = driver.findElement(By.xpath("//*[text()='Transactions']"));

			//*[text()='Transactions']

			
			WebElement TransactionSearch = driver.findElement(By.xpath("//*[text()='Transaction Search']"));
			

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

			
			



			// TO select searched txn
			WebElement txn1 = driver.findElement(By.xpath("//*[@onclick='showLoadingContent();']"));
			//WebElement txn1 = driver.findElement(By.xpath("//*[@id=\"tranResults\"]/tbody/tr/td[2]/a"));
			JavascriptExecutor executor=(JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", txn1);
		
	}

}
