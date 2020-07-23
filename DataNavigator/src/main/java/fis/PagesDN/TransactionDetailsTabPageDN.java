package fis.PagesDN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import fis.DataNavigator.DnPojo;

public class TransactionDetailsTabPageDN {
	
	WebDriver driver;
	
	static DnPojo transDnPojo= DnPojo.getInstance();
	
	public TransactionDetailsTabPageDN(WebDriver driver1) {
		
	this.driver=driver1;
		
	}
	
	
	@FindBy(how=How.XPATH,using="//td[@class='bold'][@dntitle='pan']")
	WebElement PAN;
	@FindBy(how=How.XPATH,using="//td[@class='LINK_hide bold'][@dntitle='tranTypeIdentifier']")
	WebElement TRAN_TYPE_ID;
	@FindBy(how=How.XPATH,using="//td[@class='bold'][@dntitle='systemTraceAuditNbr']")
	WebElement SYS_TRACE_AUDIT_NO;
	@FindBy(how=How.XPATH,using="//td[@class='bold'][@dntitle='dateTimeLocalTran']")
	WebElement TSTAMP_LOCAL;
	@FindBy(how=How.XPATH,using="//td[@class='bold'][@dntitle='funcCode']")
	WebElement FUNC_CODE;
	@FindBy(how=How.XPATH,using="//td[@class='bold'][@dntitle='retrievalRefNo']")
	WebElement RETRIEVAL_REF_NO;
	@FindBy(how=How.XPATH,using="//td[@class='bold'][@dntitle='approvalCode']")
	WebElement APPROVAL_CODE;
	@FindBy(how=How.XPATH,using="//td[@class='LINK_hide bold'][@dntitle='actCode']")
	WebElement ACT_CODE;
	@FindBy(how=How.XPATH,using="//td[@class='bold'][@dntitle='instIdIssr']")
	WebElement INST_ID_ISS;
	@FindBy(how=How.XPATH,using="//td[@class='bold'][@dntitle='instIdAcqr']")
	WebElement INST_ID_ACQ;
	@FindBy(how=How.XPATH,using="//td[@class='bold'][@dntitle='instIdReconIssr']")
	WebElement INST_ID_RECON_ISS;
	@FindBy(how=How.XPATH,using="//td[@class='LINK_hide bold'][@dntitle='authBy']")
	WebElement AUTH_BY;
	@FindBy(how=How.XPATH,using="//td[@class='LINK_hide bold'][@dntitle='tranClass']")
	WebElement TRAN_CLASS;
	@FindBy(how=How.XPATH,using="//td[@class='bold'][@dntitle='procIdAcqr']")
	WebElement PROC_ID_ACQ;
	@FindBy(how=How.XPATH,using="//td[@class='bold'][@dntitle='procIdIssr']")
	WebElement PROC_ID_ISS;
	@FindBy(how=How.XPATH,using="//td[@class='bold'][@dntitle='dateReconAcqr']")
	WebElement DATE_RECON_ACQ;
	@FindBy(how=How.XPATH,using="//td[@class='bold'][@dntitle='dateReconIssr']")
	WebElement DATE_RECON_ISS;
	@FindBy(how=How.XPATH,using="//td[@dntitle='amtReconNetwork']")
	WebElement AMT_RECON_NET;
	@FindBy(how=How.XPATH,using="//td[@dntitle='curReconNetwork']")
	WebElement CUR_RECON_NET;
	@FindBy(how=How.XPATH,using="//td[@class='LINK_hide bold'][@dntitle='cardAcptTermId']")
	WebElement CARD_ACPT_TERM_ID;
	@FindBy(how=How.XPATH,using="//td[@class='LINK_hide bold'][@dntitle='networkTermId']")
	WebElement NET_TERM_ID;
	@FindBy(how=How.XPATH,using="//td[@class='bold'][@dntitle='acctId1']")
	WebElement ACCT_ID_1;
	@FindBy(how=How.XPATH,using="//td[@class='LINK_hide bold'][@dntitle='merchType']")
	WebElement MERCH_TYPE;
	
	
	public void transactionDetailsPageDN() {
		
		
		
		String pAN=PAN.getText();
		transDnPojo.setPAN(pAN);
		System.out.println("pAN is "+transDnPojo.getPAN());
		
		String tRAN_TYPE_ID=TRAN_TYPE_ID.getText();
		transDnPojo.setTRAN_TYPE_ID(tRAN_TYPE_ID);
		System.out.println("tRAN_TYPE_ID : "+transDnPojo.getTRAN_TYPE_ID());
		
		String sYS_TRACE_AUDIT_NO=SYS_TRACE_AUDIT_NO.getText();
		transDnPojo.setSYS_TRACE_AUDIT_NO(sYS_TRACE_AUDIT_NO);
		System.out.println("sYS_TRACE_AUDIT_NO : "+transDnPojo.getSYS_TRACE_AUDIT_NO());
		
		String tSTAMP_LOCAL=TSTAMP_LOCAL.getText();
		transDnPojo.setTSTAMP_LOCAL(tSTAMP_LOCAL);
		System.out.println("tSTAMP_LOCAL is "+transDnPojo.getTSTAMP_LOCAL());
		
		String fUNC_CODE=FUNC_CODE.getText();
		transDnPojo.setFUNC_CODE(fUNC_CODE);
		System.out.println("fUNC_CODE is "+transDnPojo.getFUNC_CODE());
		
		String rETRIEVAL_REF_NO=RETRIEVAL_REF_NO.getText();
		transDnPojo.setRETRIEVAL_REF_NO(rETRIEVAL_REF_NO);
		System.out.println("rETRIEVAL_REF_NO is "+transDnPojo.getRETRIEVAL_REF_NO());
		
		
		String aPPROVAL_CODE=APPROVAL_CODE.getText();
		transDnPojo.setAPPROVAL_CODE(aPPROVAL_CODE);
		System.out.println("aPPROVAL_CODE is "+transDnPojo.getAPPROVAL_CODE());
		
		


		String aCT_CODE=ACT_CODE.getText();
		transDnPojo.setACT_CODE(aCT_CODE);
		System.out.println("aCT_CODE is "+transDnPojo.getACT_CODE());

		
		String iNST_ID_ISS=INST_ID_ISS.getText();
		transDnPojo.setINST_ID_ISS(iNST_ID_ISS);
		System.out.println("iNST_ID_ISS is "+transDnPojo.getINST_ID_ISS());
		
		String iNST_ID_ACQ=INST_ID_ACQ.getText();
		transDnPojo.setINST_ID_ACQ(iNST_ID_ACQ);
		System.out.println("iNST_ID_ACQ is "+transDnPojo.getINST_ID_ACQ());
	
		String iNST_ID_RECON_ISS=INST_ID_RECON_ISS.getText();
		transDnPojo.setINST_ID_RECON_ISS(iNST_ID_RECON_ISS);
		System.out.println("iNST_ID_RECON_ISS is "+transDnPojo.getINST_ID_RECON_ISS());
		
		String aUTH_BY=AUTH_BY.getText();
		transDnPojo.setAUTH_BY(aUTH_BY);
		System.out.println("aUTH_BY is "+transDnPojo.getAUTH_BY());
		
		String tRAN_CLASS=TRAN_CLASS.getText();
		transDnPojo.setTRAN_CLASS(tRAN_CLASS);
		System.out.println("tRAN_CLASS is "+transDnPojo.getTRAN_CLASS());

		
		String pROC_ID_ACQ=PROC_ID_ACQ.getText();
		transDnPojo.setPROC_ID_ACQ(pROC_ID_ACQ);
		System.out.println("pROC_ID_ACQ is "+ transDnPojo.getPROC_ID_ACQ());
		
		String pROC_ID_ISS=PROC_ID_ISS.getText();
		transDnPojo.setPROC_ID_ISS(pROC_ID_ISS);
		System.out.println("pROC_ID_ISS is "+transDnPojo.getPROC_ID_ISS());

		
		String dATE_RECON_ACQ=DATE_RECON_ACQ.getText();
		transDnPojo.setTrans_DATE_RECON_ACQ(dATE_RECON_ACQ);
		System.out.println("dATE_RECON_ACQ is "+transDnPojo.getTrans_DATE_RECON_ACQ());

		
		String dATE_RECON_ISS=DATE_RECON_ISS.getText();
		transDnPojo.setTrans_DATE_RECON_ISS(dATE_RECON_ISS);
		System.out.println("dATE_RECON_ISS is "+transDnPojo.getTrans_DATE_RECON_ISS());

		
		String aMT_RECON_NET=AMT_RECON_NET.getText();
		transDnPojo.setTrans_AMT_RECON_NET(aMT_RECON_NET);
		System.out.println("aMT_RECON_NET is "+transDnPojo.getTrans_AMT_RECON_NET());
		
		
		String cUR_RECON_NET=CUR_RECON_NET.getText();
		transDnPojo.setTrans_CUR_RECON_NET(cUR_RECON_NET);
		System.out.println("cUR_RECON_NET is "+transDnPojo.getTrans_CUR_RECON_NET());


		
		String cARD_ACPT_TERM_ID=CARD_ACPT_TERM_ID.getText();
		transDnPojo.setCARD_ACPT_TERM_ID(cARD_ACPT_TERM_ID);
		System.out.println("cARD_ACPT_TERM_ID is "+transDnPojo.getCARD_ACPT_TERM_ID());

		
		String nET_TERM_ID=NET_TERM_ID.getText();
		transDnPojo.setNET_TERM_ID(nET_TERM_ID);
		System.out.println("nET_TERM_ID is "+transDnPojo.getNET_TERM_ID());


		
		String aCCT_ID_1=ACCT_ID_1.getText();
		transDnPojo.setTrans_ACCT_ID_1(aCCT_ID_1);
		System.out.println("aCCT_ID_1 is "+transDnPojo.getTrans_ACCT_ID_1());
		
		String mERCH_TYPE=MERCH_TYPE.getText();
		transDnPojo.setTrans_MERCH_TYPE(mERCH_TYPE);
		System.out.println("mERCH_TYPE is "+transDnPojo.getTrans_MERCH_TYPE());
		
	}



}

