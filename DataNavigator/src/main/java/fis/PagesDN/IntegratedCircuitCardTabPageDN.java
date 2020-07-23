package fis.PagesDN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import fis.DataNavigator.DnPojo;

public class IntegratedCircuitCardTabPageDN {

	WebDriver driver;

	static DnPojo transDnPojo= DnPojo.getInstance();
	
	public IntegratedCircuitCardTabPageDN(WebDriver driver1) {
		this.driver=driver1;

	}

	@FindBy(how=How.XPATH,using="//a[@id='ui-id-4']")
	WebElement integratedCircuitCard;
	@FindBy(how=How.XPATH,using="//*[text()='Date:']/following::span[1]")
	WebElement TRAN_DATE;
	@FindBy(how=How.XPATH,using="//*[text()='Type:']/following::span[1]")
	WebElement TRAN_TYPE;
	@FindBy(how=How.XPATH,using="//*[text()='Category Code:']/following::span[1]")
	WebElement TRAN_CATEGORY_CODE;
	@FindBy(how=How.XPATH,using="//*[text()='Sequence Counter:']/following::span[1]")
	WebElement TRAN_SEQ_COUNTER;
	@FindBy(how=How.XPATH,using="//*[text()='Currency Code:']/following::span[1]")
	WebElement TRAN_CURRENCY_CODE;
	@FindBy(how=How.XPATH,using="//*[text()='Serial Number:']/following::span[1]")
	WebElement TERM_SERIAL_NO;
	@FindBy(how=How.XPATH,using="//*[@class='content_group_name']/following::div[14]/label[1]/following::span[1]")
	WebElement TERM_TERMINAL_TYPE;
	@FindBy(how=How.XPATH,using="//*[text()='Country Code:']/following::span[1]")
	WebElement TERM_COUNTRY_CODE;
	@FindBy(how=How.XPATH,using="//*[text()='Capabilities:']/following::span[1]")
	WebElement TERM_CAPABILITIES;
	@FindBy(how=How.XPATH,using="//*[text()='Verification Result:']/following::span[1]")
	WebElement TERM_VERIFY_RESULT;
	@FindBy(how=How.XPATH,using="//*[text()='Application Data:']/following::span[1]")
	WebElement ISS_APPL_DATA;
	@FindBy(how=How.XPATH,using="//*[text()='Authentication Data:']/following::span[1]")
	WebElement ISS_AUTH_DATA;
	@FindBy(how=How.XPATH,using="//*[text()='Discretionary Data:']/following::span[1]")
	WebElement ISS_DISCR_DATA;
	@FindBy(how=How.XPATH,using="//*[text()='Script Results:']/following::span[1]")
	WebElement ISS_SCRIPT_RESULT;
	@FindBy(how=How.XPATH,using="//*[text()='Script 1 Data:']/following::span[1]")
	WebElement ISS_SCRIPT1_DATA;
	@FindBy(how=How.XPATH,using="//*[text()='Script 2 Data:']/following::span[1]")
	WebElement ISS_SCRIPT2_DATA;
	@FindBy(how=How.XPATH,using="//*[text()='Amount:']/following::span[1]")
	WebElement APPL_AMOUNT;
	@FindBy(how=How.XPATH,using="//*[text()='Other Amount:']/following::span[1]")
	WebElement APPL_AMOUNT_OTHER;
	@FindBy(how=How.XPATH,using="//*[text()='Cryptogram:']/following::span[1]")
	WebElement APPL_CRYPTOGRAM;
	@FindBy(how=How.XPATH,using="//*[text()='Interchange Profile:']/following::span[1]")
	WebElement APPL_INTRCHG_PROF;
	@FindBy(how=How.XPATH,using="//*[text()='Transaction Counter:']/following::span[1]")
	WebElement APPL_TRAN_COUNTER;
	@FindBy(how=How.XPATH,using="//*[text()='Application Version Number:']/following::span[1]")
	WebElement APPL_VERSION_NO;
	@FindBy(how=How.XPATH,using="//*[text()='Application ID:']/following::span[1]")
	WebElement APPL_ID;
	@FindBy(how=How.XPATH,using="//*[text()='Application ID:']/following::span[1]")
	WebElement CARDH_VER_RESULT;
	@FindBy(how=How.XPATH,using="//*[text()='COPAC CCS CRYPTO:']/following::span[1]")
	WebElement COPAC_CCS_CRYPTO;
	@FindBy(how=How.XPATH,using="//*[text()='Cryptogram Information Data:']/following::span[1]")
	WebElement CRYPT_INFO_DATA;
	@FindBy(how=How.XPATH,using="//*[text()='Cardholder Information:']/following::span[1]")
	WebElement CARDHOLDER_INFO;
	@FindBy(how=How.XPATH,using="//*[text()='Dedicated File Name:']/following::span[1]")
	WebElement DEDICATED_FILE_NAM;
	@FindBy(how=How.XPATH,using="//*[text()='Unpredictable Number:']/following::span[1]")
	WebElement UNPREDICTABLE_NO;
	@FindBy(how=How.XPATH,using="//*[text()='Derivation Key Index:']/following::span[1]")
	WebElement DERIVATION_KEY_IDX;
	@FindBy(how=How.XPATH,using="//*[text()='ARPC Cryptogram:']/following::span[1]")
	WebElement ARPC_CRYPTOGRAM;
	@FindBy(how=How.XPATH,using="//*[text()='ARPC Response Code:']/following::span[1]")
	WebElement ARPC_RESPCODE;
	@FindBy(how=How.XPATH,using="//*[text()='Dedicated File Name:']/following::span[1]")
	WebElement DEDICATED_FNAME;
	@FindBy(how=How.XPATH,using="//*[text()='Form Factor Indicator:']/following::span[1]")
	WebElement FORM_FACTOR_IND;

	

	public void integratedCircuitcardTabPageDN() {

		//Navigating to Integrated Circuit Card

		integratedCircuitCard.click();


		//TRAN_CATEGORY_CODE
		
		String tRAN_CATEGORY_CODE=TRAN_CATEGORY_CODE.getText();
		
		transDnPojo.setTRAN_CATEGORY_CODE(tRAN_CATEGORY_CODE);
		System.out.println("tRAN_CATEGORY_CODE is "+transDnPojo.getTRAN_CATEGORY_CODE());

		//TRAN_CURRENCY_CODE
		
		String tRAN_CURRENCY_CODE=TRAN_CURRENCY_CODE.getText();
		
transDnPojo.setTRAN_CURRENCY_CODE(tRAN_CURRENCY_CODE);
System.out.println("tRAN_CURRENCY_CODE is "+transDnPojo.getTRAN_CURRENCY_CODE());

		//TRAN_DATE
		
		String tRAN_DATE=TRAN_DATE.getText();
		
		transDnPojo.setTRAN_DATE(tRAN_DATE);
		System.out.println("tRAN_DATE is "+transDnPojo.getTRAN_DATE());

		//TRAN_SEQ_COUNTER
		
		String tRAN_SEQ_COUNTER=TRAN_SEQ_COUNTER.getText();
		
		transDnPojo.setTRAN_SEQ_COUNTER(tRAN_SEQ_COUNTER);
		System.out.println("tRAN_SEQ_COUNTER is "+transDnPojo.getTRAN_SEQ_COUNTER());


		//TRAN_TYPE  -> Transaction Date Section
		
		String tRAN_TYPE=TRAN_TYPE.getText();
		
		transDnPojo.setTRAN_TYPE(tRAN_TYPE);
		System.out.println("tRAN_TYPE is "+transDnPojo.getTRAN_TYPE());



		//TERM_CAPABILITIES
		
		String tERM_CAPABILITIES=TERM_CAPABILITIES.getText();
		
		transDnPojo.setTERM_CAPABILITIES(tERM_CAPABILITIES);
		System.out.println("tERM_CAPABILITIES is "+transDnPojo.getTERM_CAPABILITIES());

		//TERM_COUNTRY_CODE
		
		String tERM_COUNTRY_CODE=TERM_COUNTRY_CODE.getText();
		
		transDnPojo.setTERM_COUNTRY_CODE(tERM_COUNTRY_CODE);
		System.out.println("tERM_COUNTRY_CODE is "+transDnPojo.getTERM_COUNTRY_CODE());

		//TERM_SERIAL_NO
		
		String tERM_SERIAL_NO=TERM_SERIAL_NO.getText();
		
		transDnPojo.setTERM_SERIAL_NO(tERM_SERIAL_NO);
		System.out.println("tERM_SERIAL_NO is "+transDnPojo.getTERM_SERIAL_NO());

		//TERM_VERIFY_RESULT
		
		String tERM_VERIFY_RESULT=TERM_VERIFY_RESULT.getText();
		
		transDnPojo.setTERM_VERIFY_RESULT(tERM_VERIFY_RESULT);
		System.out.println("tERM_VERIFY_RESULT is "+transDnPojo.getTERM_VERIFY_RESULT());


		//TERMINAL_TYPE --> Terminal Data Section
		
		String tERMINAL_TYPE=TERM_TERMINAL_TYPE.getText();
		
		transDnPojo.setTERMINAL_TYPE(tERMINAL_TYPE);
		System.out.println("tERMINAL_TYPE is "+transDnPojo.getTERMINAL_TYPE());



		//ISS_APPL_DATA
		
		String iSS_APPL_DATA=ISS_APPL_DATA.getText();
		
		transDnPojo.setISS_APPL_DATA(iSS_APPL_DATA);
		System.out.println("iSS_APPL_DATA is "+transDnPojo.getISS_APPL_DATA());

		//ISS_AUTH_DATA
		
		String iSS_AUTH_DATA=ISS_AUTH_DATA.getText();
		
		transDnPojo.setISS_AUTH_DATA(iSS_AUTH_DATA);
		System.out.println("iSS_AUTH_DATA is "+transDnPojo.getISS_AUTH_DATA());


		//ISS_DISCR_DATA
	
		String iSS_DISCR_DATA=ISS_DISCR_DATA.getText();
		
		transDnPojo.setISS_DISCR_DATA(iSS_DISCR_DATA);
		System.out.println("iSS_DISCR_DATA is "+transDnPojo.getISS_DISCR_DATA());	

		//ISS_SCRIPT_RESULT
		
		String iSS_SCRIPT_RESULT=ISS_SCRIPT_RESULT.getText();
			
		transDnPojo.setISS_SCRIPT_RESULT(iSS_SCRIPT_RESULT);
		System.out.println("iSS_SCRIPT_RESULT is "+transDnPojo.getISS_SCRIPT_RESULT());

		//ISS_SCRIPT1_DATA
		
		String iSS_SCRIPT1_DATA=ISS_SCRIPT1_DATA.getText();
		
		transDnPojo.setISS_SCRIPT1_DATA(iSS_SCRIPT1_DATA);
		System.out.println("iSS_SCRIPT1_DATA is "+transDnPojo.getISS_SCRIPT1_DATA());

		//ISS_SCRIPT2_DATA
		
		String iSS_SCRIPT2_DATA=ISS_SCRIPT2_DATA.getText();
		
		transDnPojo.setISS_SCRIPT2_DATA(iSS_SCRIPT2_DATA);
		System.out.println("iSS_SCRIPT2_DATA is "+transDnPojo.getISS_SCRIPT2_DATA());

		

		//CRYPTOGRAM_AMOUNT
		
		String cRYPTOGRAM_AMOUNT=APPL_AMOUNT.getText();
		
		transDnPojo.setCRYPTOGRAM_AMOUNT(cRYPTOGRAM_AMOUNT);
		System.out.println("cRYPTOGRAM_AMOUNT is "+transDnPojo.getCRYPTOGRAM_AMOUNT());

		//AMOUNT_OTHER
		
		String aMOUNT_OTHER=APPL_AMOUNT_OTHER.getText();
		
		transDnPojo.setAMOUNT_OTHER(aMOUNT_OTHER);
		System.out.println("aMOUNT_OTHER is "+transDnPojo.getAMOUNT_OTHER());

		//APPL_CRYPTOGRAM
		
		String aPPL_CRYPTOGRAM=APPL_CRYPTOGRAM.getText();
		
		transDnPojo.setAPPL_CRYPTOGRAM(aPPL_CRYPTOGRAM);
		System.out.println("aPPL_CRYPTOGRAM is "+transDnPojo.getAPPL_CRYPTOGRAM());
		
		//APPL_INTRCHG_PROF
		
		String aPPL_INTRCHG_PROF=APPL_INTRCHG_PROF.getText();
		
		transDnPojo.setAPPL_INTRCHG_PROF(aPPL_INTRCHG_PROF);
		System.out.println("aPPL_INTRCHG_PROF is "+transDnPojo.getAPPL_INTRCHG_PROF());

		//APPL_TRAN_COUNTER
		
		String aPPL_TRAN_COUNTER=APPL_TRAN_COUNTER.getText();
		
		transDnPojo.setAPPL_TRAN_COUNTER(aPPL_TRAN_COUNTER);
		System.out.println("aPPL_TRAN_COUNTER is "+transDnPojo.getAPPL_TRAN_COUNTER());
		
		//APPL_VERSION_NO
	
		String aPPL_VERSION_NO=APPL_VERSION_NO.getText();
		
		transDnPojo.setAPPL_VERSION_NO(aPPL_VERSION_NO);
		System.out.println("aPPL_VERSION_NO is "+transDnPojo.getAPPL_VERSION_NO());
		
		//APPL_ID
		
		String aPPL_ID=APPL_ID.getText();
		
		transDnPojo.setAPPL_ID(aPPL_ID);
		System.out.println("aPPL_ID is "+transDnPojo.getAPPL_ID());
		
		//CARDH_VER_RESULT
		
		String cARDH_VER_RESULT=CARDH_VER_RESULT.getText();
		
		transDnPojo.setCARDH_VER_RESULT(cARDH_VER_RESULT);
		System.out.println("cARDH_VER_RESULT is "+transDnPojo.getCARDH_VER_RESULT());
		
		//COPAC_CCS_CRYPTO
		
		String cOPAC_CCS_CRYPTO=COPAC_CCS_CRYPTO.getText();
		
		transDnPojo.setCOPAC_CCS_CRYPTO(cOPAC_CCS_CRYPTO);
		System.out.println("cOPAC_CCS_CRYPTO is "+transDnPojo.getCOPAC_CCS_CRYPTO());

		

		//CRYPT_INFO_DATA
		
		String cRYPT_INFO_DATA=CRYPT_INFO_DATA.getText();
		
		transDnPojo.setCRYPT_INFO_DATA(cRYPT_INFO_DATA);
		System.out.println("cRYPT_INFO_DATA is "+transDnPojo.getCRYPT_INFO_DATA());
		
		
		//CARDHOLDER_INFO
		

        String cARDHOLDER_INFO=CARDHOLDER_INFO.getText();
		
		transDnPojo.setCARDHOLDER_INFO(cARDHOLDER_INFO);
		System.out.println("cARDHOLDER_INFO is "+transDnPojo.getCARDHOLDER_INFO());
		
		//DEDICATED_FILE_NAM
		
		String dEDICATED_FILE_NAM=DEDICATED_FILE_NAM.getText();
		
		transDnPojo.setDEDICATED_FILE_NAM(dEDICATED_FILE_NAM);
		System.out.println("dEDICATED_FILE_NAM is "+transDnPojo.getDEDICATED_FILE_NAM());


		//UNPREDICTABLE_NO
		
		String uNPREDICTABLE_NO=UNPREDICTABLE_NO.getText();
		
		transDnPojo.setUNPREDICTABLE_NO(uNPREDICTABLE_NO);
		System.out.println("uNPREDICTABLE_NO is "+transDnPojo.getUNPREDICTABLE_NO());
		
		
		//DERIVATION_KEY_IDX
		
		String dERIVATION_KEY_IDX=DERIVATION_KEY_IDX.getText();
		
		transDnPojo.setDERIVATION_KEY_IDX(dERIVATION_KEY_IDX);
		System.out.println("dERIVATION_KEY_IDX is "+transDnPojo.getDERIVATION_KEY_IDX());


		//ARPC_CRYPTOGRAM
		
		String aRPC_CRYPTOGRAM=ARPC_CRYPTOGRAM.getText();
		
		transDnPojo.setARPC_CRYPTOGRAM(aRPC_CRYPTOGRAM);
		System.out.println("aRPC_CRYPTOGRAM is "+transDnPojo.getARPC_CRYPTOGRAM());

		//ARPC_RESPCODE
		
		String aRPC_RESPCODE=ARPC_RESPCODE.getText();
		
		transDnPojo.setARPC_RESPCODE(aRPC_RESPCODE);
		System.out.println("aRPC_RESPCODE is "+transDnPojo.getARPC_RESPCODE());


		//DEDICATED_FNAME
		
		String dEDICATED_FNAME=DEDICATED_FNAME.getText();
		
		transDnPojo.setDEDICATED_FNAME(dEDICATED_FNAME);
		System.out.println("dEDICATED_FNAME is "+transDnPojo.getDEDICATED_FNAME());


		//FORM_FACTOR_IND
		
		String fORM_FACTOR_IND=FORM_FACTOR_IND.getText();
	
		transDnPojo.setFORM_FACTOR_IND(fORM_FACTOR_IND);
		System.out.println("fORM_FACTOR_IND is "+transDnPojo.getFORM_FACTOR_IND());

	}
}




