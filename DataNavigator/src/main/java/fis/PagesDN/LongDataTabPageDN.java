package fis.PagesDN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import fis.DataNavigator.DnPojo;

public class LongDataTabPageDN {
	
	static DnPojo transDnPojo= DnPojo.getInstance();
	
	WebDriver driver;
	public LongDataTabPageDN(WebDriver driver1) {
		this.driver=driver1;
		
	}
	
	
	//Need to update xpath for all values
	//Also need to check whether all fields are added
	@FindBy(how=How.ID,using="ui-id-3")
	WebElement longdataTab;
	@FindBy(how=How.XPATH,using="//*[text()='Reference Data:']/following::span[1]")
	WebElement REF_DATA_ACQ;
	@FindBy(how=How.XPATH,using="//*[text()='Reference Data:']/following::span[1]/following::div[1]")
	WebElement REF_DATA_ACQ_PreLongData;
	@FindBy(how=How.XPATH,using="//*[text()='Private Data:']/following::span[1]")
	WebElement DATA_PRIV_ACQ;
	@FindBy(how=How.XPATH,using="//*[text()='Private Data:']/following::span[1]/following::div[1]")
	WebElement DATA_PRIV_ACQ_PreLongData;
	@FindBy(how=How.XPATH,using="//*[text()='Additional Private Data:']/following::span[1]")
	WebElement ADL_DATA_PRIV_ACQ;
	@FindBy(how=How.XPATH,using="//*[text()='Additional Private Data:']/following::span[1]/following::div[1]")
	WebElement ADL_DATA_PRIV_ACQ_PreLongData;
	@FindBy(how=How.XPATH,using="//div[@class='content_group_name']/following::div[7]/following::span[1]")
	WebElement REF_DATA_ISS;
	@FindBy(how=How.XPATH,using="//div[@class='content_group_name']/following::div[7]/following::span[1]/following::div[1]")
	WebElement REF_DATA_ISS_PreLongData;
	@FindBy(how=How.XPATH,using="//div[@class='content_group_name']/following::div[7]/following::span[2]")
	WebElement DATA_PRIV_ISS;
	@FindBy(how=How.XPATH,using="//div[@class='content_group_name']/following::div[7]/following::span[2]/following::div[1]")	
	WebElement DATA_PRIV_ISS_PreLongData;
	@FindBy(how=How.XPATH,using="//div[@class='content_group_name']/following::div[7]/following::span[3]")
	WebElement ADL_DATA_PRIV_ISS;
	@FindBy(how=How.XPATH,using="//div[@class='content_group_name']/following::div[7]/following::span[3]/following::div[1]")
	WebElement ADL_DATA_PRIV_ISS_PreLongData;
	@FindBy(how=How.XPATH,using="//*[text()='Additional Response Data:']/following::span[1]")
	WebElement ADL_RESP_DATA;
	@FindBy(how=How.XPATH,using="//*[text()='Additional Response Data:']/following::span[1]/following::div[1]")
	WebElement ADL_RESP_DATA_PreLongData;
	@FindBy(how=How.XPATH,using="//*[text()='Track 2 Data:']/following::span[1]")
	WebElement TRACK_2_DATA;
	@FindBy(how=How.XPATH,using="//*[text()='Track 2 Data:']/following::span[1]/following::div[1]")
	WebElement TRACK_2_DATA_PreLongData;
	@FindBy(how=How.XPATH,using="//*[text()='Tran Unique Data:']/following::span[1]")
	WebElement TRAN_UNIQUE_DATA;
	@FindBy(how=How.XPATH,using="//*[text()='Tran Unique Data:']/following::span[1]/following::div[1]")
	WebElement TRAN_UNIQUE_DATA_PreLongData;
	@FindBy(how=How.XPATH,using="//*[text()='Tran Description:']/following::span[1]")
	WebElement TRAN_DESC;
	@FindBy(how=How.XPATH,using="//*[text()='Tran Description:']/following::span[1]/following::div[1]")
	WebElement TRAN_DESC_PreLongData;
	@FindBy(how=How.XPATH,using="//*[text()='Unformatted MICR Data:']/following::span[1]")
	WebElement UNFORMATTED_MICR_DATA;
	@FindBy(how=How.XPATH,using="//*[text()='Unformatted MICR Data:']/following::span[1]/following::div[1]")
	WebElement UNFORMATTED_MICR_DATA_PreLongData;
	@FindBy(how=How.XPATH,using="//*[text()='Unformatted MICR Data:']/following::span[1]")
	WebElement PAYEE;
	@FindBy(how=How.XPATH,using="//*[text()='Unformatted MICR Data:']/following::span[1]/following::div[1]")
	WebElement PAYEE_PreLongData;



public void longDataTabPageDN() {
	


longdataTab.click();



//Acquirer Data 


//REF_DATA_ACQ

String rEF_DATA_ACQ=REF_DATA_ACQ.getText();

transDnPojo.setREF_DATA_ACQ(rEF_DATA_ACQ);
System.out.println("rEF_DATA_ACQ is "+transDnPojo.getREF_DATA_ACQ());

//REF_DATA_ACQ_PreLongData

String rEF_DATA_ACQ_PreLongData=REF_DATA_ACQ_PreLongData.getText();

transDnPojo.setREF_DATA_ACQ_PreLongData(rEF_DATA_ACQ_PreLongData);
System.out.println("rEF_DATA_ACQ_PreLongData is "+transDnPojo.getREF_DATA_ACQ_PreLongData());

//DATA_PRIV_ACQ

String dATA_PRIV_ACQ=DATA_PRIV_ACQ.getText();

transDnPojo.setDATA_PRIV_ACQ(dATA_PRIV_ACQ);
System.out.println("dATA_PRIV_ACQ is "+transDnPojo.getDATA_PRIV_ACQ());

//DATA_PRIV_ACQ_PreLongData

String dATA_PRIV_ACQ_PreLongData=DATA_PRIV_ACQ_PreLongData.getText();

transDnPojo.setDATA_PRIV_ACQ_PreLongData(dATA_PRIV_ACQ_PreLongData);
System.out.println("dATA_PRIV_ACQ_PreLongData is "+transDnPojo.getDATA_PRIV_ACQ_PreLongData());



//ADL_DATA_PRIV_ACQ

String aDL_DATA_PRIV_ACQ=ADL_DATA_PRIV_ACQ.getText();

transDnPojo.setADL_DATA_PRIV_ACQ(aDL_DATA_PRIV_ACQ);
System.out.println("aDL_DATA_PRIV_ACQ is "+transDnPojo.getADL_DATA_PRIV_ACQ());

//ADL_DATA_PRIV_ACQ_PreLongData ---> need to check

String aDL_DATA_PRIV_ACQ_PreLongData=ADL_DATA_PRIV_ACQ_PreLongData.getText();

transDnPojo.setADL_DATA_PRIV_ACQ_PreLongData(aDL_DATA_PRIV_ACQ_PreLongData);
System.out.println("aDL_DATA_PRIV_ACQ_PreLongData is "+transDnPojo.getADL_DATA_PRIV_ACQ_PreLongData());


//Issuer Data 


String rEF_DATA_ISS=REF_DATA_ISS.getText();

transDnPojo.setREF_DATA_ISS(rEF_DATA_ISS);
System.out.println("rEF_DATA_ISS is "+transDnPojo.getREF_DATA_ISS());

//REF_DATA_ISS_PreLongData---> need to check

String rEF_DATA_ISS_PreLongData=REF_DATA_ISS_PreLongData.getText();

transDnPojo.setREF_DATA_ISS_PreLongData(rEF_DATA_ISS_PreLongData);
System.out.println("rEF_DATA_ISS_PreLongData is "+transDnPojo.getREF_DATA_ISS_PreLongData());

//DATA_PRIV_ISS

String dATA_PRIV_ISS=DATA_PRIV_ISS.getText();

transDnPojo.setDATA_PRIV_ISS(dATA_PRIV_ISS);
System.out.println("dATA_PRIV_ISS is "+transDnPojo.getDATA_PRIV_ISS());

//DATA_PRIV_ISS_PreLongData---> need to check

String dATA_PRIV_ISS_PreLongData=DATA_PRIV_ISS_PreLongData.getText();

transDnPojo.setDATA_PRIV_ISS_PreLongData(dATA_PRIV_ISS_PreLongData);
System.out.println("dATA_PRIV_ISS_PreLongData is "+transDnPojo.getDATA_PRIV_ISS_PreLongData());

//ADL_DATA_PRIV_ISS

String aDL_DATA_PRIV_ISS=ADL_DATA_PRIV_ISS.getText();

transDnPojo.setADL_DATA_PRIV_ISS(aDL_DATA_PRIV_ISS);
System.out.println("aDL_DATA_PRIV_ISS is "+transDnPojo.getADL_DATA_PRIV_ISS());

//ADL_DATA_PRIV_ISS_PreLongData---> need to check

String aDL_DATA_PRIV_ISS_PreLongData=ADL_DATA_PRIV_ISS_PreLongData.getText();

transDnPojo.setADL_DATA_PRIV_ISS_PreLongData(aDL_DATA_PRIV_ISS_PreLongData);

System.out.println("aDL_DATA_PRIV_ISS_PreLongData is "+transDnPojo.getADL_DATA_PRIV_ISS_PreLongData());


//Other Data


//ADL_RESP_DATA



String aDL_RESP_DATA=ADL_RESP_DATA.getText();

transDnPojo.setADL_RESP_DATA(aDL_RESP_DATA);
System.out.println("aDL_RESP_DATA is "+transDnPojo.getADL_RESP_DATA());

//ADL_RESP_DATA_PreLongData-->need to check


String aDL_RESP_DATA_PreLongData=ADL_RESP_DATA_PreLongData.getText();

transDnPojo.setADL_RESP_DATA_PreLongData(aDL_RESP_DATA_PreLongData);
System.out.println("aDL_RESP_DATA_PreLongData is "+transDnPojo.getADL_RESP_DATA_PreLongData());

//TRACK_2_DATA


String tRACK_2_DATA=TRACK_2_DATA.getText();

transDnPojo.setTRACK_2_DATA(tRACK_2_DATA);
System.out.println("tRACK_2_DATA is "+transDnPojo.getTRACK_2_DATA());

//TRACK_2_DATA_PreLongData


String tRACK_2_DATA_PreLongData=TRACK_2_DATA_PreLongData.getText();

transDnPojo.setTRACK_2_DATA_PreLongData(tRACK_2_DATA_PreLongData);
System.out.println("tRACK_2_DATA_PreLongData is "+transDnPojo.getTRACK_2_DATA_PreLongData());

//TRAN_UNIQUE_DATA


String tRAN_UNIQUE_DATA=TRAN_UNIQUE_DATA.getText();

transDnPojo.setTRAN_UNIQUE_DATA(tRAN_UNIQUE_DATA);
System.out.println("tRAN_UNIQUE_DATA is "+transDnPojo.getTRAN_UNIQUE_DATA());

//TRAN_UNIQUE_DATA_PreLongData

String tRAN_UNIQUE_DATA_PreLongData=TRAN_UNIQUE_DATA_PreLongData.getText();

transDnPojo.setTRAN_UNIQUE_DATA_PreLongData(tRAN_UNIQUE_DATA_PreLongData);
System.out.println("tRAN_UNIQUE_DATA_PreLongData is "+transDnPojo.getTRAN_UNIQUE_DATA_PreLongData());



//TRAN_DESC

String tRAN_DESC=TRAN_DESC.getText();

transDnPojo.setTRAN_DESC(tRAN_DESC);
System.out.println("tRAN_DESC is "+transDnPojo.getTRAN_DESC());

//TRAN_DESC_PreLongData

String tRAN_DESC_PreLongData=TRAN_DESC_PreLongData.getText();

transDnPojo.setTRAN_DESC_PreLongData(tRAN_DESC_PreLongData);
System.out.println("tRAN_DESC_PreLongData is "+transDnPojo.getTRAN_DESC_PreLongData());



//UNFORMATTED_MICR_DATA

String uNFORMATTED_MICR_DATA=UNFORMATTED_MICR_DATA.getText();

transDnPojo.setUNFORMATTED_MICR_DATA(uNFORMATTED_MICR_DATA);
System.out.println("uNFORMATTED_MICR_DATA is "+transDnPojo.getUNFORMATTED_MICR_DATA());


//UNFORMATTED_MICR_DATA_PreLongData

String uNFORMATTED_MICR_DATA_PreLongData=UNFORMATTED_MICR_DATA_PreLongData.getText();

transDnPojo.setUNFORMATTED_MICR_DATA_PreLongData(uNFORMATTED_MICR_DATA_PreLongData);
System.out.println("uNFORMATTED_MICR_DATA_PreLongData is "+transDnPojo.getUNFORMATTED_MICR_DATA_PreLongData());


//PAYEE

String pAYEE=PAYEE.getText();

transDnPojo.setPAYEE(pAYEE);
System.out.println("pAYEE is "+transDnPojo.getPAYEE());

//PAYEE_PreLongData

String pAYEE_PreLongData=PAYEE_PreLongData.getText();

transDnPojo.setPAYEE_PreLongData(pAYEE_PreLongData);
System.out.println("pAYEE_PreLongData is "+transDnPojo.getPAYEE_PreLongData());


}

}
