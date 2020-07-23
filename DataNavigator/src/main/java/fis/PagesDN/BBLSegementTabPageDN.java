package fis.PagesDN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import fis.DataNavigator.DnPojo;

public class BBLSegementTabPageDN {
	
	WebDriver driver;
	
	static DnPojo transDnPojo= DnPojo.getInstance();
	
	public BBLSegementTabPageDN(WebDriver driver1) {
		this.driver=driver1;
		
	}
	
	@FindBy(how=How.XPATH,using="//a[@id='ui-id-5']")
	WebElement BBLDNSegmentTab;
	@FindBy(how=How.XPATH,using="//*[text()='Receiving Proxy Type:']/following::span[1]")
	WebElement receiverProxyid;
	@FindBy(how=How.XPATH,using="//*[text()='Sending Proxy ID:']/following::span[1]")
	WebElement senderProxyid;
	@FindBy(how=How.XPATH,using="//*[text()='Receiving Proxy Type:']/following::span[1]")
	WebElement receiverproxytype;
	@FindBy(how=How.XPATH,using="//*[text()='Receiving Proxy Type:']/following::span[1]")// ---> need to change
	WebElement senderProxytype;
	@FindBy(how=How.XPATH,using="//*[text()='Sender Tax ID:']/following::span[1]")
	WebElement senderTaxid;
	@FindBy(how=How.XPATH,using="//*[text()='Receiving Tax ID:']/following::span[1]")
	WebElement receiverTaxid;
	@FindBy(how=How.XPATH,using="//*[text()='VAT Rate:']/following::span[1]")
	WebElement vatRate;
	@FindBy(how=How.XPATH,using="//*[text()='VAT']/following::span[1]/following::span[1]")
	WebElement Vat;
	@FindBy(how=How.XPATH,using="//*[text()='Withholding Tax:']/following::span[1]")
	WebElement WHT_TAX;
	@FindBy(how=How.XPATH,using="//*[text()='Withholding Tax Rate:']/following::span[1]")
	WebElement WHT_TAX_RATE;
	@FindBy(how=How.XPATH,using="//*[text()='Withholding Tax Condition:']/following::span[1]")
	WebElement WHT_TAX_COND;
	@FindBy(how=How.XPATH,using="//*[text()='Sender Reference Number:']/following::span[1]")
	WebElement SENDER_REF_NO;
	@FindBy(how=How.XPATH,using="//*[text()='Transaction Reference Number:']/following::span[1]")
	WebElement TRAN_REF_NO;
	@FindBy(how=How.XPATH,using="//*[text()='Reference Number:']/following::span[1]")
	WebElement REF_NO;
	@FindBy(how=How.XPATH,using="//*[text()='BBL Reference Number:']/following::span[1]")
	WebElement BBL_REF_NO;
	@FindBy(how=How.XPATH,using="//*[text()='From Account Name:']/following::span[1]")
	WebElement FROM_ACCT_NAME;
	@FindBy(how=How.XPATH,using="//*[text()='To Account Name:']/following::span[1]")
	WebElement TO_ACCT_NAME;
	@FindBy(how=How.XPATH,using="//*[text()='To Account Display Name:']/following::span[1]")
	WebElement TO_ACCT_DISP_NAME;
	@FindBy(how=How.XPATH,using="//*[text()='BBL Filler1:']/following::span[1]")
	WebElement BBL_FILLER_1;
	@FindBy(how=How.XPATH,using="//*[text()='BBL Filler2:']/following::span[1]")
	WebElement BBL_FILLER_2;
	@FindBy(how=How.XPATH,using="//*[text()='Tax Invoice:']/following::span[1]")
	WebElement TAX_INVOICE;
	@FindBy(how=How.XPATH,using="//*[text()='Type Of Income:']/following::span[1]")
	WebElement TYPE_OF_INCOME;
	@FindBy(how=How.XPATH,using="//*[text()='EDC Number:']/following::span[1]")
	WebElement EDC_NUMBER;
	@FindBy(how=How.XPATH,using="//*[text()='EDC Number:']/following::span[1]")// need to change
	WebElement TSTAMP_TRANS;
	@FindBy(how=How.XPATH,using="//*[text()='Product Code:']/following::span[1]")
	WebElement PRODUCT_CODE;
	@FindBy(how=How.XPATH,using="//*[text()='Server Type Code:']/following::span[1]")
	WebElement SERV_TYPE_CODE;
	@FindBy(how=How.XPATH,using="//*[text()='Biller Reference:']/following::span[1]")
	WebElement BILL_REFERENCE;
	@FindBy(how=How.XPATH,using="//*[text()='BP Due date/RTP Exp date:']/following::span[1]")
	WebElement BPDUE_RTPEXP_DATE;
	@FindBy(how=How.XPATH,using="//*[text()='Credit Notification:']/following::span[1]")
	WebElement CREDIT_NOTIF_REF;
	@FindBy(how=How.XPATH,using="//*[text()='BP Url:']/following::span[1]")
	WebElement BP_URL;
	@FindBy(how=How.XPATH,using="//*[text()='Sender Company TaxId:']/following::span[1]")
	WebElement SENDER_COMP_TAX_ID;
	@FindBy(how=How.XPATH,using="//*[text()='Sender Company AccountNo:']/following::span[1]")
	WebElement SENDER_COMP_ACCT_NO;
	@FindBy(how=How.XPATH,using="//*[text()='Receiver Company TaxId:']/following::span[1]")
	WebElement RECV_COMP_TAX_ID;
	@FindBy(how=How.XPATH,using="//*[text()='Receiver Company AccountNo:']/following::span[1]")
	WebElement RECV_COMP_ACCT_NO;
	@FindBy(how=How.XPATH,using="//*[text()='Company Code:']/following::span[1]")
	WebElement COMPANY_CODE;
	@FindBy(how=How.XPATH,using="//*[text()='Service Code:']/following::span[1]")
	WebElement SERVICE_CODE;
	@FindBy(how=How.XPATH,using="//*[text()='Flags:']/following::span[1]")
	WebElement FLAGS;
	@FindBy(how=How.XPATH,using="//*[text()='Bill Reference 2:']/following::span[1]")
	WebElement BILL_REFERENCE2;
	@FindBy(how=How.XPATH,using="//*[text()='User Data 1:']/following::span[1]")
	WebElement USER_DATA_1;
	@FindBy(how=How.XPATH,using="//*[text()='User Data 2:']/following::span[1]")
	WebElement USER_DATA_2;
	@FindBy(how=How.XPATH,using="//*[text()='User Data 3:']/following::span[1]")
	WebElement USER_DATA_3;
	@FindBy(how=How.XPATH,using="//*[text()='User Data 4:']/following::span[1]")
	WebElement USER_DATA_4;
	@FindBy(how=How.XPATH,using="//*[text()='User Data 5:']/following::span[1]")
	WebElement USER_DATA_5;
	@FindBy(how=How.XPATH,using="//*[text()='Payment 1:']/following::span[1]")
	WebElement PAYMENT_1;
	@FindBy(how=How.XPATH,using="//*[text()='Payment 2:']/following::span[1]")
	WebElement PAYMENT_2;
	@FindBy(how=How.XPATH,using="//*[text()='Payment 3:']/following::span[1]")
	WebElement PAYMENT_3;
	@FindBy(how=How.XPATH,using="//*[text()='SMS Fee:']/following::span[1]")
	WebElement SMS_FEE;
	@FindBy(how=How.XPATH,using="//*[text()='SMS Mobile:']/following::span[1]")
	WebElement SMS_MOBILE;
	@FindBy(how=How.XPATH,using="//*[text()='SMS Mobile:']/following::span[1]")// change
	WebElement OTP;
	@FindBy(how=How.XPATH,using="//*[text()='Account Info 1:']/following::span[1]")
	WebElement ACCT_INFO_1;
	@FindBy(how=How.XPATH,using="//*[text()='Account Info 2:']/following::span[1]")
	WebElement ACCT_INFO_2;
	@FindBy(how=How.XPATH,using="//*[text()='BBL Filler 3:']/following::span[1]")
	WebElement BBL_FILLER_3;
	@FindBy(how=How.XPATH,using="//*[text()='From Fund Code:']/following::span[1]")
	WebElement FRM_FUND_CODE;
	@FindBy(how=How.XPATH,using="//*[text()='Account Info 2:']/following::span[1]")
	WebElement TO_FUND_CODE;
	@FindBy(how=How.XPATH,using="//*[text()='Unit:']/following::span[1]")
	WebElement UNIT;
	@FindBy(how=How.XPATH,using="//*[text()='Unit Price:']/following::span[1]")
	WebElement UNIT_PRICE;
	@FindBy(how=How.XPATH,using="//*[text()='Bond Yield:']/following::span[1]")
	WebElement BOND_YIELD;
	@FindBy(how=How.XPATH,using="//*[text()='Surcharge Fee:']/following::span[1]")
	WebElement SURCHARGE_FEE;
	@FindBy(how=How.XPATH,using="//*[text()='Ext From Account Type:']/following::span[1]")
	WebElement EXT_FROM_ACCT_TYPE;
	@FindBy(how=How.XPATH,using="//*[text()='Ext To Acct Type:']/following::span[1]")
	WebElement EXT_TO_ACCT_TYPE;
	@FindBy(how=How.XPATH,using="//*[text()='From Account Display Name:']/following::span[1]")
	WebElement FROM_ACCT_DISP_NAME;
	@FindBy(how=How.XPATH,using="//*[text()='Terminal Trace:']/following::span[1]")
	WebElement TERMINAL_TRACE;
	@FindBy(how=How.XPATH,using="//*[text()='QRC Voucher:']/following::span[1]")
	WebElement QRC_VOUCHER;
	@FindBy(how=How.XPATH,using="//*[text()='BBL Filler 4:']/following::span[1]")
	WebElement BBL_FILLER_4;
	@FindBy(how=How.XPATH,using="//*[text()='CDM DATA:']/following::span[1]")
	WebElement CDM_DATA;
	@FindBy(how=How.XPATH,using="//*[text()='BBL Filler 5:']/following::span[1]")
	WebElement BBL_FILLER_5;
	@FindBy(how=How.XPATH,using="//*[text()='Cross Border Flag:']/following::span[1]")
	WebElement CrossBorderFlag;
	@FindBy(how=How.XPATH,using="//*[text()='Card Brand:']/following::span[1]")
	WebElement cardBrand;
	@FindBy(how=How.XPATH,using="//*[text()='Card Location:']/following::span[1]")
	WebElement card_location;
	@FindBy(how=How.XPATH,using="//*[text()='Card Scheme:']/following::span[1]")
	WebElement card_scheme;
	@FindBy(how=How.XPATH,using="//*[text()='Card Owner Branch:']/following::span[1]")
	WebElement Card_Owner_BranchCode;
	@FindBy(how=How.XPATH,using="//*[text()='Card Location:']/following::span[1]")// change
	WebElement txn_service;
	@FindBy(how=How.XPATH,using="//*[text()='BBL Private:']/following::span[1]")
	WebElement bbl_private;
	@FindBy(how=How.XPATH,using="//*[text()='ATC Result:']/following::span[1]")
	WebElement ATCResult;
	@FindBy(how=How.XPATH,using="//*[text()='CVV2 Issuer Result:']/following::span[1]")
	WebElement CVV2AcquirerResult;
	@FindBy(how=How.XPATH,using="//*[text()='CVV2 Issuer Result:']/following::span[1]")
	WebElement CVV2IssuerResult;
	@FindBy(how=How.XPATH,using="//*[text()='CVV2 Pres Ind:']/following::span[1]")
	WebElement CVV2PresenceIndicator;
	@FindBy(how=How.XPATH,using="//*[text()='CVV2 Resp Ind:']/following::span[1]")
	WebElement CVV2ResponseIndicator;
	@FindBy(how=How.XPATH,using="//*[text()='Acquirer Routing No:']/following::span[1]")
	WebElement AcqRoutingNo;
	@FindBy(how=How.XPATH,using="//*[text()='ATM Terminal ID:']/following::span[1]")
	WebElement ATM_Terminal_ID;
	@FindBy(how=How.XPATH,using="//*[text()='BBL ATM Terminal ID:']/following::span[1]")
	WebElement bblATM_Terminal_ID;
	@FindBy(how=How.XPATH,using="//*[text()='BBL Card Owner:']/following::span[1]")
	WebElement Card_Owner;
	@FindBy(how=How.XPATH,using="//*[text()='DCC Home CCY Name:']/following::span[1]")
	WebElement DCC_Home_CCY_Name;
	@FindBy(how=How.XPATH,using="//*[text()='Destination Routing No:']/following::span[1]")
	WebElement DestRoutingNo;
	@FindBy(how=How.XPATH,using="//*[text()='Device Type Channel:']/following::span[1]")
	WebElement deviceTypeChannel;
	@FindBy(how=How.XPATH,using="//*[text()='From Account Owner Branch:']/following::span[1]")
	WebElement FrAcct_Owner_Branch;
	@FindBy(how=How.XPATH,using="//*[text()='IR Counter:']/following::span[1]")
	WebElement IR_Counter;
	@FindBy(how=How.XPATH,using="//*[text()='IR Flag:']/following::span[1]")
	WebElement IR_Flag;
	@FindBy(how=How.XPATH,using="//*[text()='Issuer Routing No:']/following::span[1]")
	WebElement IssRoutingNo;
	@FindBy(how=How.XPATH,using="//*[text()='Original Card Owner:']/following::span[1]")
	WebElement Original_Card_Owner;
	@FindBy(how=How.XPATH,using="//*[text()='Original Terminal Owner']/following::span[1]")
	WebElement Original_Terminal_Owner;
	@FindBy(how=How.XPATH,using="//*[text()='Other Bank Use Counter:']/following::span[1]")
	WebElement Oth_Bank_Use_Counter;
	@FindBy(how=How.XPATH,using="//*[text()='Partial Reverse Amount']/following::span[1]")
	WebElement Partial_Reverse_Amount;
	@FindBy(how=How.XPATH,using="//*[text()='Payee:']/following::span[1]")
	WebElement Payee;
	@FindBy(how=How.XPATH,using="//*[text()='Standin Action:']/following::span[1]")
	WebElement STANDIN_ACT;
	@FindBy(how=How.XPATH,using="//*[text()='Terminal Owner Branch:']/following::span[1]")
	WebElement Terminal_Owner_BranchCode;
	@FindBy(how=How.XPATH,using="//*[text()='Terminal Province Region ID:']/following::span[1]")
	WebElement Terminal_Provice_RegionID;
	@FindBy(how=How.XPATH,using="//*[text()='To Account Owner Branch:']/following::span[1]")
	WebElement Terminal_State;
	@FindBy(how=How.XPATH,using="//*[text()='Terminal State:']/following::span[1]")
	WebElement ToAcct_Owner_Branch;
	@FindBy(how=How.XPATH,using="//*[text()='Withholding Tax:']/following::span[1]")
	WebElement WHTTax;
	@FindBy(how=How.XPATH,using="//*[text()='Withholding Tax Condition:']/following::span[1]")
	WebElement WHTTaxCon;
	

	public void bblDNSegmentPageDN() {
		
		
		BBLDNSegmentTab.click();


		//RECV_PROXY_ID
		
		String receiverproxyid=receiverProxyid.getText();
		transDnPojo.setRECV_PROXY_ID(receiverproxyid);
		System.out.println("receiverproxyid is "+transDnPojo.getRECV_PROXY_ID());
		
		//SENDER_PROXY_ID
		
		String senderproxyid=senderProxyid.getText();
		transDnPojo.setSENDER_PROXY_ID(senderproxyid);
		System.out.println("senderproxyid is "+transDnPojo.getSENDER_PROXY_ID());
		
		//RECV_PROXY_TYPE
		
		String receiverProxytype=receiverproxytype.getText();
		transDnPojo.setRECV_PROXY_TYPE(receiverProxytype);
		System.out.println("receiverproxytype is "+transDnPojo.getRECV_PROXY_TYPE());
		
		//SENDER_PROXY_TYPE
		
		String sENDER_PROXY_TYPE=senderProxytype.getText();
		

		transDnPojo.setSENDER_PROXY_TYPE(sENDER_PROXY_TYPE);
		System.out.println("sENDER_PROXY_TYPE is "+transDnPojo.getSENDER_PROXY_TYPE());

		//SENDER_TAX_ID
		
		String sENDER_TAX_ID=senderTaxid.getText();
		transDnPojo.setSENDER_TAX_ID(sENDER_TAX_ID);
		System.out.println("sENDER_TAX_ID is "+transDnPojo.getSENDER_TAX_ID());
		
		//RECV_TAX_ID
		
		String receivertaxid=receiverTaxid.getText();
		transDnPojo.setRECV_TAX_ID(receivertaxid);
		System.out.println("receivertaxid is "+transDnPojo.getRECV_TAX_ID());
		
		//VAT_RATE
		
		String vatrate=vatRate.getText();
		transDnPojo.setVAT_RATE(vatrate);
		System.out.println("vatrate is "+transDnPojo.getVAT_RATE());
		
		//VAT
		
		String vat=Vat.getText();
		transDnPojo.setVAT(vat);
		System.out.println("vat is "+transDnPojo.getVAT());

		//WHT_TAX_RATE
		
		String wHT_TAX_RATE=WHT_TAX_RATE.getText();
		transDnPojo.setWHT_TAX_RATE(wHT_TAX_RATE);
		System.out.println("wHT_TAX_RATE is "+transDnPojo.getWHT_TAX_RATE());

		//WHT_TAX
		
		String wHT_TAX=WHT_TAX.getText();
		transDnPojo.setWHT_TAX(wHT_TAX);
		System.out.println("wHT_TAX is "+transDnPojo.getWHT_TAX());
		
		//WHT_TAX_COND
		
		String wHT_TAX_COND=WHT_TAX_COND.getText();
		transDnPojo.setWHT_TAX_COND(wHT_TAX_COND);
		System.out.println("wHT_TAX_COND is "+transDnPojo.getWHT_TAX_COND());

		//SENDER_REF_NO
		
		String sENDER_REF_NO=SENDER_REF_NO.getText();
		transDnPojo.setSENDER_REF_NO(sENDER_REF_NO);
		System.out.println("sENDER_REF_NO is "+transDnPojo.getSENDER_REF_NO());
		
		//TRAN_REF_NO
		
		String tRAN_REF_NO=TRAN_REF_NO.getText();
		transDnPojo.setTRAN_REF_NO(tRAN_REF_NO);
		System.out.println("tRAN_REF_NO is "+transDnPojo.getTRAN_REF_NO());
		
		
		//REF_NO
		
		String rEF_NO=REF_NO.getText();
		transDnPojo.setREF_NO(rEF_NO);
		System.out.println("rEF_NO is "+transDnPojo.getREF_NO());
		
		//BBL_REF_NO
		
		String bBL_REF_NO=BBL_REF_NO.getText();
		transDnPojo.setBBL_REF_NO(bBL_REF_NO);
		System.out.println("bBL_REF_NO is "+transDnPojo.getBBL_REF_NO());

		//FROM_ACCT_NAME
		
		String fROM_ACCT_NAME=FROM_ACCT_NAME.getText();
		transDnPojo.setFROM_ACCT_NAME(fROM_ACCT_NAME);
		System.out.println("fROM_ACCT_NAME is "+transDnPojo.getFROM_ACCT_NAME());
		
		//TO_ACCT_NAME
		
		String tO_ACCT_NAME=TO_ACCT_NAME.getText();
		transDnPojo.setTO_ACCT_NAME(tO_ACCT_NAME);
		System.out.println("tO_ACCT_NAME is "+transDnPojo.getTO_ACCT_NAME());
		
		
		//TO_ACCT_DISP_NAME
		
		String tO_ACCT_DISP_NAME=TO_ACCT_DISP_NAME.getText();
		transDnPojo.setTO_ACCT_DISP_NAME(tO_ACCT_DISP_NAME);
		System.out.println("tO_ACCT_DISP_NAME is "+transDnPojo.getTO_ACCT_DISP_NAME());


		//BBL_FILLER_1
		
		String bBL_FILLER_1=BBL_FILLER_1.getText();
		transDnPojo.setBBL_FILLER_1(bBL_FILLER_1);
		System.out.println("bBL_FILLER_1 is "+transDnPojo.getBBL_FILLER_1());
		
		//BBL_FILLER_2
		
		String bBL_FILLER_2=BBL_FILLER_2.getText();
		transDnPojo.setBBL_FILLER_2(bBL_FILLER_2);
		System.out.println("bBL_FILLER_2 is "+transDnPojo.getBBL_FILLER_2());
		
		//TAX_INVOICE
		
		String tAX_INVOICE=TAX_INVOICE.getText();
		transDnPojo.setTAX_INVOICE(tAX_INVOICE);
		System.out.println("tAX_INVOICE is "+transDnPojo.getTAX_INVOICE());
		
	
		//TYPE_OF_INCOME
	
		String tYPE_OF_INCOME=TYPE_OF_INCOME.getText();
		transDnPojo.setTYPE_OF_INCOME(tYPE_OF_INCOME);
		System.out.println("tYPE_OF_INCOME is "+transDnPojo.getTYPE_OF_INCOME());

		//EDC_NUMBER
		
		String eDC_NUMBER=EDC_NUMBER.getText();
		transDnPojo.setEDC_NUMBER(eDC_NUMBER);
		System.out.println("eDC_NUMBER is "+transDnPojo.getEDC_NUMBER());
		
		//TSTAMP_TRANS
		
		String tSTAMP_TRANS=TSTAMP_TRANS.getText();
		transDnPojo.setTSTAMP_TRANS(tSTAMP_TRANS);
		System.out.println("tSTAMP_TRANS "+transDnPojo.getTSTAMP_TRANS());

		//PRODUCT_CODE
		
		String pRODUCT_CODE=PRODUCT_CODE.getText();
		transDnPojo.setPRODUCT_CODE(pRODUCT_CODE);
		System.out.println("pRODUCT_CODE is "+transDnPojo.getPRODUCT_CODE());

		//SERV_TYPE_CODE
		
		String sERV_TYPE_CODE=SERV_TYPE_CODE.getText();
		transDnPojo.setSERV_TYPE_CODE(sERV_TYPE_CODE);
		System.out.println("sERV_TYPE_CODE is "+transDnPojo.getSERV_TYPE_CODE());
		
		//BILL_REFERENCE
		
		String bILL_REFERENCE=BILL_REFERENCE.getText();
		transDnPojo.setBILL_REFERENCE(bILL_REFERENCE);
		System.out.println("bILL_REFERENCE is "+transDnPojo.getBILL_REFERENCE());
		
		//BPDUE_RTPEXP_DATE
		
		String bPDUE_RTPEXP_DATE=BPDUE_RTPEXP_DATE.getText();
		transDnPojo.setBPDUE_RTPEXP_DATE(bPDUE_RTPEXP_DATE);
		System.out.println("bPDUE_RTPEXP_DATE is "+transDnPojo.getBPDUE_RTPEXP_DATE());
		
		
		//CREDIT_NOTIF_REF
		
		String cREDIT_NOTIF_REF=CREDIT_NOTIF_REF.getText();
		transDnPojo.setCREDIT_NOTIF_REF(cREDIT_NOTIF_REF);
		System.out.println("cREDIT_NOTIF_REF is "+transDnPojo.getCREDIT_NOTIF_REF());
		
		
		//BP_URL
		
		String bP_URL=BP_URL.getText();
		transDnPojo.setBP_URL(bP_URL);
		System.out.println("bP_URL is "+transDnPojo.getBP_URL());
		
		//SENDER_COMP_TAX_ID
		
		String sENDER_COMP_TAX_ID=SENDER_COMP_TAX_ID.getText();
		transDnPojo.setSENDER_COMP_TAX_ID(sENDER_COMP_TAX_ID);
		System.out.println("sENDER_COMP_TAX_ID is "+transDnPojo.getSENDER_COMP_TAX_ID());
		
		//SENDER_COMP_ACCT_NO
		
		String sENDER_COMP_ACCT_NO=SENDER_COMP_ACCT_NO.getText();
		transDnPojo.setSENDER_COMP_ACCT_NO(sENDER_COMP_ACCT_NO);
		System.out.println("sENDER_COMP_ACCT_NO is "+transDnPojo.getSENDER_COMP_ACCT_NO());	
		
		//RECV_COMP_TAX_ID
		
		String rECV_COMP_TAX_ID=RECV_COMP_TAX_ID.getText();
		transDnPojo.setRECV_COMP_TAX_ID(rECV_COMP_TAX_ID);
		System.out.println("rECV_COMP_TAX_ID is "+transDnPojo.getRECV_COMP_TAX_ID());
		
		
		//RECV_COMP_ACCT_NO
	
		String rECV_COMP_ACCT_NO=RECV_COMP_ACCT_NO.getText();
		transDnPojo.setRECV_COMP_ACCT_NO(rECV_COMP_ACCT_NO);
		System.out.println("rECV_COMP_ACCT_NO is "+transDnPojo.getRECV_COMP_ACCT_NO());

		//COMPANY_CODE
		
		String cOMPANY_CODE=COMPANY_CODE.getText();
		transDnPojo.setCOMPANY_CODE(cOMPANY_CODE);
		System.out.println("cOMPANY_CODE is "+transDnPojo.getCOMPANY_CODE());
		
		
		//SERVICE_CODE
		
		String sERVICE_CODE=SERVICE_CODE.getText();
		transDnPojo.setSERVICE_CODE(sERVICE_CODE);
		System.out.println("sERVICE_CODE is "+transDnPojo.getSERVICE_CODE());
		
		//FLAGS
		
		String fLAGS=FLAGS.getText();
		transDnPojo.setFLAGS(fLAGS);
		System.out.println("fLAGS is "+transDnPojo.getFLAGS());
		
		
		//BILL_REFERENCE2
		
		String bILL_REFERENCE2=BILL_REFERENCE2.getText();
		transDnPojo.setBILL_REFERENCE2(bILL_REFERENCE2);
		System.out.println("bILL_REFERENCE2 is "+transDnPojo.getBILL_REFERENCE2());

		//USER_DATA_1
		
		String uSER_DATA_1=USER_DATA_1.getText();
		transDnPojo.setUSER_DATA_1(uSER_DATA_1);
		System.out.println("uSER_DATA_1 is "+transDnPojo.getUSER_DATA_1());
		
		//USER_DATA_2
		
		String uSER_DATA_2=USER_DATA_2.getText();
		transDnPojo.setUSER_DATA_2(uSER_DATA_2);
		System.out.println("uSER_DATA_2 is "+transDnPojo.getUSER_DATA_2());
		
		//USER_DATA_3
		
		String uSER_DATA_3=USER_DATA_3.getText();
		transDnPojo.setUSER_DATA_3(uSER_DATA_3);
		System.out.println("uSER_DATA_3 is "+transDnPojo.getUSER_DATA_3());

		//USER_DATA_4
		
		String uSER_DATA_4=USER_DATA_4.getText();
		transDnPojo.setUSER_DATA_4(uSER_DATA_4);
		System.out.println("uSER_DATA_4 is "+transDnPojo.getUSER_DATA_4());

		//USER_DATA_5
		
		String uSER_DATA_5=USER_DATA_5.getText();
		transDnPojo.setUSER_DATA_5(uSER_DATA_5);
		System.out.println("uSER_DATA_5 is "+transDnPojo.getUSER_DATA_5());
		
		//PAYMENT_1
		
		String pAYMENT_1=PAYMENT_1.getText();
		transDnPojo.setPAYMENT_1(pAYMENT_1);
		System.out.println("pAYMENT_1 is "+transDnPojo.getPAYMENT_1());
		
		//PAYMENT_2
	
		String pAYMENT_2=PAYMENT_2.getText();
		transDnPojo.setPAYMENT_2(pAYMENT_2);
		System.out.println("pAYMENT_2 is "+transDnPojo.getPAYMENT_2());
		
		//PAYMENT_3
		
		String pAYMENT_3=PAYMENT_3.getText();
		transDnPojo.setPAYMENT_3(pAYMENT_3);
		System.out.println("pAYMENT_3 is "+transDnPojo.getPAYMENT_3());
		
		
		//SMS_FEE
		
		String sMS_FEE=SMS_FEE.getText();
		transDnPojo.setSMS_FEE(sMS_FEE);
		System.out.println("sMS_FEE is "+transDnPojo.getSMS_FEE());

		//SMS_MOBILE
		
		String sMS_MOBILE=SMS_MOBILE.getText();
		transDnPojo.setSMS_MOBILE(sMS_MOBILE);
		System.out.println("sMS_MOBILE is "+transDnPojo.getSMS_MOBILE());
		
		//OTP
		
		String oTP=OTP.getText();
		transDnPojo.setOTP(oTP);
		System.out.println("oTP is "+transDnPojo.getOTP());
		
		
		//ACCT_INFO_1
		
		String aCCT_INFO_1=ACCT_INFO_1.getText();
		transDnPojo.setACCT_INFO_1(aCCT_INFO_1);
		System.out.println("aCCT_INFO_1 is "+transDnPojo.getACCT_INFO_1());
		
		//ACCT_INFO_2
		
		String aCCT_INFO_2=ACCT_INFO_2.getText();
		transDnPojo.setACCT_INFO_2(aCCT_INFO_2);
		System.out.println("aCCT_INFO_2 is "+transDnPojo.getACCT_INFO_2());


		//BBL_FILLER_3
		
		String bBL_FILLER_3=BBL_FILLER_3.getText();
		transDnPojo.setBBL_FILLER_3(bBL_FILLER_3);
		System.out.println("bBL_FILLER_3 is "+transDnPojo.getBBL_FILLER_3());

		//FRM_FUND_CODE
		
		String fRM_FUND_CODE=FRM_FUND_CODE.getText();
		transDnPojo.setFRM_FUND_CODE(fRM_FUND_CODE);
		System.out.println("fRM_FUND_CODE is "+ transDnPojo.getFRM_FUND_CODE());
		
		//TO_FUND_CODE
		
		String tO_FUND_CODE=TO_FUND_CODE.getText();
		transDnPojo.setTO_FUND_CODE(tO_FUND_CODE);
		System.out.println("tO_FUND_CODE is "+transDnPojo.getTO_FUND_CODE());
		
		//UNIT
		
		String uNIT=UNIT.getText();
		transDnPojo.setUNIT(uNIT);
		System.out.println("uNIT is "+transDnPojo.getUNIT());
		
		
		//UNIT_PRICE
		
		String uNIT_PRICE=UNIT_PRICE.getText();
		transDnPojo.setUNIT_PRICE(uNIT_PRICE);
		System.out.println("uNIT_PRICE is "+transDnPojo.getUNIT_PRICE());
		
		//BOND_YIELD
		
		String bOND_YIELD=BOND_YIELD.getText();
		transDnPojo.setBOND_YIELD(bOND_YIELD);
		System.out.println("bOND_YIELD is "+transDnPojo.getBOND_YIELD());
		
		//SURCHARGE_FEE
		
		String sURCHARGE_FEE=SURCHARGE_FEE.getText();
		transDnPojo.setSURCHARGE_FEE(sURCHARGE_FEE);
		System.out.println("sURCHARGE_FEE is "+transDnPojo.getSURCHARGE_FEE());
		
		//EXT_FROM_ACCT_TYPE
		
		String eXT_FROM_ACCT_TYPE=EXT_FROM_ACCT_TYPE.getText();
		transDnPojo.setEXT_FROM_ACCT_TYPE(eXT_FROM_ACCT_TYPE);
		System.out.println("eXT_FROM_ACCT_TYPE is "+transDnPojo.getEXT_FROM_ACCT_TYPE());
		
		//EXT_TO_ACCT_TYPE
	
		String eXT_TO_ACCT_TYPE=EXT_TO_ACCT_TYPE.getText();
		transDnPojo.setEXT_TO_ACCT_TYPE(eXT_TO_ACCT_TYPE);
		System.out.println("eXT_TO_ACCT_TYPE is "+transDnPojo.getEXT_TO_ACCT_TYPE());
		
		
		//FROM_ACCT_DISP_NAME
		
		String fROM_ACCT_DISP_NAME=FROM_ACCT_DISP_NAME.getText();
		transDnPojo.setFROM_ACCT_DISP_NAME(fROM_ACCT_DISP_NAME);
		System.out.println("fROM_ACCT_DISP_NAME is "+transDnPojo.getFROM_ACCT_DISP_NAME());

		//TERMINAL_TRACE
		
		String tERMINAL_TRACE=TERMINAL_TRACE.getText();
		transDnPojo.setTERMINAL_TRACE(tERMINAL_TRACE);
		System.out.println("tERMINAL_TRACE is "+transDnPojo.getTERMINAL_TRACE());
		
		
		//QRC_VOUCHER
		
		String qRC_VOUCHER=QRC_VOUCHER.getText();
		transDnPojo.setQRC_VOUCHER(qRC_VOUCHER);
		System.out.println("qRC_VOUCHER is "+transDnPojo.getQRC_VOUCHER());
		
		//BBL_FILLER_4
		
		String bBL_FILLER_4=BBL_FILLER_4.getText();
		transDnPojo.setBBL_FILLER_4(bBL_FILLER_4);
		System.out.println("bBL_FILLER_4 is "+transDnPojo.getBBL_FILLER_4());

		//CDM_DATA
		
		String cDM_DATA=CDM_DATA.getText();
		transDnPojo.setCDM_DATA(cDM_DATA);
		System.out.println("cDM_DATA is "+transDnPojo.getCDM_DATA());
		
		//BBL_FILLER_5
		
		String bBL_FILLER_5=BBL_FILLER_5.getText();
		transDnPojo.setBBL_FILLER_5(bBL_FILLER_5);
		System.out.println("bBL_FILLER_5 is "+transDnPojo.getBBL_FILLER_5());


		//CrossBorderFlag
		
		String crossBorderFlag=CrossBorderFlag.getText();
		transDnPojo.setCrossBorderFlag(crossBorderFlag);
		System.out.println("CrossBorderFlag is "+transDnPojo.getCrossBorderFlag());


		//cardBrand

		String cardbrand=cardBrand.getText();
		transDnPojo.setCardBrand(cardbrand);
		System.out.println("card_Brand is "+transDnPojo.getCardBrand());

		//card_location

		
		String cardlocation=card_location.getText();
		transDnPojo.setCard_location(cardlocation);
		System.out.println("card_location is "+transDnPojo.getCard_location());

		//card_scheme

		
		String cardscheme=card_scheme.getText();
		transDnPojo.setCard_scheme(cardscheme);
		System.out.println("card_scheme is "+transDnPojo.getCard_scheme());

		//Card_Owner_BranchCode
		
		String card_Owner_BranchCode=Card_Owner_BranchCode.getText();
		transDnPojo.setCard_Owner_BranchCode(card_Owner_BranchCode);
		System.out.println("card_location is "+transDnPojo.getCard_Owner_BranchCode());



		//txn_service

		
		String txnservice=txn_service.getText();

		transDnPojo.setTxn_service(txnservice);
		System.out.println("txn_service is "+transDnPojo.getTxn_service());

		//bbl_private
		String bblprivate=bbl_private.getText();
		transDnPojo.setBbl_private(bblprivate);
		System.out.println("bblprivate is "+transDnPojo.getBbl_private());

		//ATCResult

		String aTCResult=ATCResult.getText();
		transDnPojo.setATCResult(aTCResult);
		System.out.println("ATCResult is "+transDnPojo.getATCResult());



		//CVV2AcquirerResult

		String cVV2AcquirerResult=CVV2AcquirerResult.getText();
		transDnPojo.setCVV2AcquirerResult(cVV2AcquirerResult);
		System.out.println("CVV2IssuerResult is "+transDnPojo.getCVV2AcquirerResult());

		//CVV2IssuerResult

		
		String cVV2IssuerResult=CVV2IssuerResult.getText();
		transDnPojo.setCVV2IssuerResult(cVV2IssuerResult);
		System.out.println("CVV2IssuerResult is "+transDnPojo.getCVV2IssuerResult());

		//CVV2PresenceIndicator

		
		String cVV2PresenceIndicator=CVV2PresenceIndicator.getText();
		transDnPojo.setCVV2PresenceIndicator(cVV2PresenceIndicator);
		System.out.println("CVV2PresenceIndicator is "+transDnPojo.getCVV2PresenceIndicator());

		//CVV2ResponseIndicator

	
		String cVV2ResponseIndicator=CVV2ResponseIndicator.getText();
		transDnPojo.setCVV2ResponseIndicator(cVV2ResponseIndicator);
		System.out.println("CVV2ResponseIndicator is "+transDnPojo.getCVV2ResponseIndicator());

		//AcqRoutingNo

		String acqRoutingNo=AcqRoutingNo.getText();
		transDnPojo.setACQ_ROUTING_NO(acqRoutingNo);
		System.out.println("AcqRoutingNo is "+transDnPojo.getACQ_ROUTING_NO());

		//ATM_Terminal_ID

		String aTM_Terminal_ID=ATM_Terminal_ID.getText();
		transDnPojo.setATM_Terminal_ID(aTM_Terminal_ID);
		System.out.println("ATM_Terminal_ID is "+transDnPojo.getATM_Terminal_ID());


		//bblATM_Terminal_ID

		String BblATM_Terminal_ID=bblATM_Terminal_ID.getText();
		transDnPojo.setBblATM_Terminal_ID(BblATM_Terminal_ID);
		System.out.println("bblATM_Terminal_ID is "+transDnPojo.getBblATM_Terminal_ID());


		//Card_Owner

		String card_Owner=Card_Owner.getText();
		transDnPojo.setCARD_OWNER(card_Owner);
		System.out.println("Card_Owner is "+transDnPojo.getCARD_OWNER());


		//DCC_Home_CCY_Name

		String dCC_Home_CCY_Name=DCC_Home_CCY_Name.getText();
		transDnPojo.setDCC_Home_CCY_Name(dCC_Home_CCY_Name);
		System.out.println("DCC_Home_CCY_Name is "+transDnPojo.getDCC_Home_CCY_Name());

		//DestRoutingNo
	
		String destRoutingNo=DestRoutingNo.getText();
		transDnPojo.setDEST_ROUTING_NO(destRoutingNo);
		System.out.println("DestRoutingNo is "+transDnPojo.getDEST_ROUTING_NO());


		//deviceTypeChannel

		String DeviceTypeChannel=deviceTypeChannel.getText();
		transDnPojo.setDeviceTypeChannel(DeviceTypeChannel);
		System.out.println("deviceTypeChannel is "+transDnPojo.getDeviceTypeChannel());


		//FrAcct_Owner_Branch

		String frAcct_Owner_Branch=FrAcct_Owner_Branch.getText();
		transDnPojo.setFrAcct_Owner_Branch(frAcct_Owner_Branch);
		System.out.println("FrAcct_Owner_Branch is "+transDnPojo.getFrAcct_Owner_Branch());

		//IR_Counter

		String iR_Counter=IR_Counter.getText();
		transDnPojo.setIR_Counter(iR_Counter);
		System.out.println("IR_Counter is "+transDnPojo.getIR_Counter());

		//IR_Flag

		String iR_Flag=IR_Flag.getText();
		transDnPojo.setIR_Flag(iR_Flag);
		System.out.println("IR_Flag is "+transDnPojo.getIR_Flag());

		//IssRoutingNo

	
		String issRoutingNo=IssRoutingNo.getText();
		transDnPojo.setIssRoutingNo(issRoutingNo);
		System.out.println("IssRoutingNo is "+transDnPojo.getIssRoutingNo());


		//Original_Card_Owner

		String original_Card_Owner=Original_Card_Owner.getText();
		transDnPojo.setOriginal_Card_Owner(original_Card_Owner);
		System.out.println("Original_Card_Owner is "+transDnPojo.getOriginal_Card_Owner());

		//Original_Terminal_Owner

		
		String original_Terminal_Owner=Original_Terminal_Owner.getText();
		transDnPojo.setOriginal_Terminal_Owner(original_Terminal_Owner);
		System.out.println("Original_Terminal_Owner is "+transDnPojo.getOriginal_Terminal_Owner());


		//Oth_Bank_Use_Counter

		
		String oth_Bank_Use_Counter=Oth_Bank_Use_Counter.getText();
		transDnPojo.setOth_Bank_Use_Counter(oth_Bank_Use_Counter);
		System.out.println("Oth_Bank_Use_Counter is "+transDnPojo.getOth_Bank_Use_Counter());

		//Partial_Reverse_Amount


		String partial_Reverse_Amount=Partial_Reverse_Amount.getText();
		transDnPojo.setPartial_Reverse_Amount(partial_Reverse_Amount);
		System.out.println("Partial_Reverse_Amount is "+transDnPojo.getPartial_Reverse_Amount());



		//Payee

		
		String payee=Payee.getText();
		transDnPojo.setPAYEE(payee);
		System.out.println("Payee is "+transDnPojo.getPAYEE());	

		//STANDIN_ACT


		String sTANDIN_ACT=STANDIN_ACT.getText();
		transDnPojo.setSTANDIN_ACT(sTANDIN_ACT);
		System.out.println("sTANDIN_ACT is "+transDnPojo.getSTANDIN_ACT()); 

		//Terminal_Owner_BranchCode

		
		String terminal_Owner_BranchCode=Terminal_Owner_BranchCode.getText();
		transDnPojo.setTerminal_Owner_BranchCode(terminal_Owner_BranchCode);
		System.out.println("Terminal_Owner_BranchCode is "+transDnPojo.getTerminal_Owner_BranchCode());

		//Terminal_Provice_RegionID

		String terminal_Provice_RegionID=Terminal_Provice_RegionID.getText();
		transDnPojo.setTerminal_Provice_RegionID(terminal_Provice_RegionID);
		System.out.println("Terminal_Provice_RegionID is "+transDnPojo.getTerminal_Provice_RegionID());	

		//Terminal_State
		String terminal_State=Terminal_State.getText();
		transDnPojo.setTerminal_State(terminal_State);
		System.out.println("Terminal_State is "+transDnPojo.getTerminal_State());


		//ToAcct_Owner_Branch

		String toAcct_Owner_Branch=ToAcct_Owner_Branch.getText();
		transDnPojo.setToAcct_Owner_Branch(toAcct_Owner_Branch);
		System.out.println("ToAcct_Owner_Branch is "+transDnPojo.getToAcct_Owner_Branch());

		// WHTTax;

		String wHTTax=WHTTax.getText();
		transDnPojo.setWHT_TAX(wHTTax);
		System.out.println("WHTTax is "+transDnPojo.getWHT_TAX());

		// WHTTaxCon;

		
		String wHTTaxCon=WHTTaxCon.getText();
		transDnPojo.setWHT_TAX_COND(wHTTaxCon);
		System.out.println("WHTTaxCon is "+transDnPojo.getWHT_TAX_COND());
		
		
		
	}

}
