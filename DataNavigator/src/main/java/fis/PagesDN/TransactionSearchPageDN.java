package fis.PagesDN;

import java.awt.Window;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransactionSearchPageDN {
	
	WebDriver driver;
	
	public TransactionSearchPageDN(WebDriver driver1) {
		
		this.driver=driver1;
	}
	
	@FindBy(how=How.XPATH,using="//*[text()='Transactions']")
	WebElement Transactions;
	@FindBy(how=How.XPATH,using="//*[text()='Transaction Search']")
	WebElement TransactionSearch;
	@FindBy(how=How.NAME,using="startDate")
	WebElement StartDate;
	@FindBy(how=How.NAME,using="endDate")
	WebElement EndDate;
	@FindBy(how=How.ID,using="_acqReconInsIdMatch")
	WebElement Acq_Recon_Inst_ID_radio;
	@FindBy(how=How.NAME,using="acqReconInstId")
	WebElement Acq_Recon_Inst_ID_data;
	@FindBy(how=How.NAME,using="retrievalRefNo")
	WebElement Retrieval_RefNo;
	@FindBy(how=How.ID,using="search1")
	WebElement Search;
	@FindBy(how=How.XPATH,using="//*[@onclick='showLoadingContent();']")
	WebElement transactiondetails;
	
	
	
	
	public void searchTransactionPageDN(String DnDate, String acquirerDN, String refnumDN) throws InterruptedException {
		
		String homepage=driver.getWindowHandle();
		System.out.println("Home window is "+homepage);
		
		
		Actions action = new Actions(driver);
		action.moveToElement(Transactions).perform();
		action.moveToElement(TransactionSearch).click().perform();
		
		Actions action_startdate = new Actions(driver);
		action_startdate.moveToElement(StartDate).click().perform();
		StartDate.clear();
		StartDate.sendKeys(DnDate + Keys.ENTER);
		
		
		Actions action_enddate = new Actions(driver);
		action_enddate.moveToElement(EndDate).click().perform();
		EndDate.clear();
		EndDate.sendKeys(DnDate + Keys.ENTER);
		
		Acq_Recon_Inst_ID_radio.click();
		
		
		Acq_Recon_Inst_ID_data.sendKeys(acquirerDN);
		
		Retrieval_RefNo.sendKeys(refnumDN);
		
	
		Search.click();
		
		Thread.sleep(1000);
		
		transactiondetails.click();
	
	
		
	}
	


}
