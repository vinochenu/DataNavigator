package fis.TXNACT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.LineNumberReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import fis.DataNavigator.DnPojo;

public class TXNACT_Validation {

	static DnPojo transDnPojo= DnPojo.getInstance();

	TXNACTPojo txnactPojo;
	

	public TXNACT_Validation(Object obj) {
		// TODO Auto-generated constructor stub

		this.txnactPojo=(TXNACTPojo) obj;
	 

	}
	
	

	//Extend Report 
	public static ExtentReports extentreport;
	public static ExtentHtmlReporter htmlreporter;

	public static ExtentTest testcase_TXNACT;
	
 

	public void txnact_validation(String reportname) throws ParseException, IOException {
	

		extentreport=new ExtentReports();
	
		
		htmlreporter=new ExtentHtmlReporter(reportname);
		
		
		//htmlreporter=new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/MyOwnReport.html");

		extentreport.attachReporter(htmlreporter);






		//testcase_TXNACT.log(Status.INFO, "Transaction Details Tab Validation");

		//PAN

		testcase_TXNACT=extentreport.createTest("Verify PAN between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT PAN is  "+txnactPojo.getPAN()+"  &  "+"DN PAN  is "+transDnPojo.getPAN());

		if(txnactPojo.getPAN().trim().equalsIgnoreCase(transDnPojo.getPAN().trim())) {

			testcase_TXNACT.log(Status.PASS, "PAN between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "PAN between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}

		//TRAN_TYPE_ID

		testcase_TXNACT=extentreport.createTest("Verify TRAN_TYPE_ID between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TRAN_TYPE_ID is  "+txnactPojo.getTRAN_TYPE_ID()+"  &  "+"DN TRAN_TYPE_ID  is "+transDnPojo.getTRAN_TYPE_ID());

		if(txnactPojo.getTRAN_TYPE_ID().trim().equalsIgnoreCase(transDnPojo.getTRAN_TYPE_ID().trim())) {

			testcase_TXNACT.log(Status.PASS, "TRAN_TYPE_ID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TRAN_TYPE_ID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//SYS_TRACE_AUDIT_NO

		testcase_TXNACT=extentreport.createTest("Verify SYS_TRACE_AUDIT_NO between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT SYS_TRACE_AUDIT_NO is  "+txnactPojo.getSYS_TRACE_AUDIT_NO()+"  &  "+"DN SYS_TRACE_AUDIT_NO  is "+transDnPojo.getSYS_TRACE_AUDIT_NO());

		if(txnactPojo.getSYS_TRACE_AUDIT_NO().trim().equalsIgnoreCase(transDnPojo.getSYS_TRACE_AUDIT_NO().trim())) {

			testcase_TXNACT.log(Status.PASS, "SYS_TRACE_AUDIT_NO between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "SYS_TRACE_AUDIT_NO between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TSTAMP_LOCAL

		testcase_TXNACT=extentreport.createTest("Verify TSTAMP_LOCAL between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TSTAMP_LOCAL is  "+txnactPojo.getTSTAMP_LOCAL()+"  &  "+"DN TSTAMP_LOCAL  is "+transDnPojo.getTSTAMP_LOCAL());

		if(txnactPojo.getTSTAMP_LOCAL().trim().equalsIgnoreCase(transDnPojo.getTSTAMP_LOCAL().trim())) {

			testcase_TXNACT.log(Status.PASS, "TSTAMP_LOCAL between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TSTAMP_LOCAL between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//FUNC_CODE

		String func_code=transDnPojo.getFUNC_CODE().substring(0, 3);

		testcase_TXNACT=extentreport.createTest("Verify FUNC_CODE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT FUNC_CODE is  "+txnactPojo.getFUNC_CODE()+"  &  "+"DN FUNC_CODE  is "+func_code);

		if(txnactPojo.getFUNC_CODE().trim().equalsIgnoreCase(func_code.trim())) {

			testcase_TXNACT.log(Status.PASS, "FUNC_CODE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "FUNC_CODE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}

		//RETRIEVAL_REF_NO

		testcase_TXNACT=extentreport.createTest("Verify RETRIEVAL_REF_NO between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT RETRIEVAL_REF_NO is  "+txnactPojo.getRETRIEVAL_REF_NO()+"  &  "+"DN RETRIEVAL_REF_NO  is "+transDnPojo.getRETRIEVAL_REF_NO());

		if(txnactPojo.getRETRIEVAL_REF_NO().trim().equalsIgnoreCase(transDnPojo.getRETRIEVAL_REF_NO().trim())) {

			testcase_TXNACT.log(Status.PASS, "RETRIEVAL_REF_NO between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "RETRIEVAL_REF_NO between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//APPROVAL_CODE

		testcase_TXNACT=extentreport.createTest("Verify APPROVAL_CODE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT APPROVAL_CODE is  "+txnactPojo.getAPPROVAL_CODE()+"  &  "+"DN APPROVAL_CODE  is "+transDnPojo.getAPPROVAL_CODE());

		if(txnactPojo.getAPPROVAL_CODE().trim().equalsIgnoreCase(transDnPojo.getAPPROVAL_CODE().trim())) {

			testcase_TXNACT.log(Status.PASS, "APPROVAL_CODE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "APPROVAL_CODE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//ACT_CODE

		testcase_TXNACT=extentreport.createTest("Verify ACT_CODE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT ACT_CODE is  "+txnactPojo.getACT_CODE()+"  &  "+"DN ACT_CODE  is "+transDnPojo.getACT_CODE());

		if(txnactPojo.getACT_CODE().trim().equalsIgnoreCase(transDnPojo.getACT_CODE().trim())) {

			testcase_TXNACT.log(Status.PASS, "ACT_CODE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "ACT_CODE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//INST_ID_ISS

		testcase_TXNACT=extentreport.createTest("Verify INST_ID_ISS between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT INST_ID_ISS is  "+txnactPojo.getINST_ID_ISS()+"  &  "+"DN INST_ID_ISS  is "+transDnPojo.getINST_ID_ISS());

		if(txnactPojo.getINST_ID_ISS().trim().equalsIgnoreCase(transDnPojo.getINST_ID_ISS().trim())) {

			testcase_TXNACT.log(Status.PASS, "INST_ID_ISS between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "INST_ID_ISS between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//INST_ID_ACQ

		testcase_TXNACT=extentreport.createTest("Verify INST_ID_ACQ between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT INST_ID_ACQ is  "+txnactPojo.getINST_ID_ACQ()+"  &  "+"DN INST_ID_ACQ  is "+transDnPojo.getINST_ID_ACQ());

		if(txnactPojo.getINST_ID_ACQ().trim().equalsIgnoreCase(transDnPojo.getINST_ID_ACQ().trim())) {

			testcase_TXNACT.log(Status.PASS, "INST_ID_ACQ between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "INST_ID_ACQ between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}



		//INST_ID_RECON_ISS

		testcase_TXNACT=extentreport.createTest("Verify INST_ID_RECON_ISS between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT INST_ID_RECON_ISS is  "+txnactPojo.getINST_ID_RECON_ISS()+"  &  "+"DN INST_ID_RECON_ISS  is "+transDnPojo.getINST_ID_RECON_ISS());

		if(txnactPojo.getINST_ID_RECON_ISS().trim().equalsIgnoreCase(transDnPojo.getINST_ID_RECON_ISS().trim())) {

			testcase_TXNACT.log(Status.PASS, "INST_ID_RECON_ISS between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "INST_ID_RECON_ISS between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//AUTH_BY

		testcase_TXNACT=extentreport.createTest("Verify AUTH_BY between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT AUTH_BY is  "+txnactPojo.getAUTH_BY()+"  &  "+"DN AUTH_BY  is "+transDnPojo.getAUTH_BY());

		if(txnactPojo.getAUTH_BY().trim().equalsIgnoreCase(transDnPojo.getAUTH_BY().trim())) {

			testcase_TXNACT.log(Status.PASS, "AUTH_BY between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "AUTH_BY between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TRAN_CLASS

		testcase_TXNACT=extentreport.createTest("Verify TRAN_CLASS between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TRAN_CLASS is  "+txnactPojo.getTRAN_CLASS()+"  &  "+"DN TRAN_CLASS  is "+transDnPojo.getTRAN_CLASS());

		if(txnactPojo.getTRAN_CLASS().trim().equalsIgnoreCase(transDnPojo.getTRAN_CLASS().trim())) {

			testcase_TXNACT.log(Status.PASS, "TRAN_CLASS between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TRAN_CLASS between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//PROC_ID_ACQ

		testcase_TXNACT=extentreport.createTest("Verify PROC_ID_ACQ between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT PROC_ID_ACQ is  "+txnactPojo.getPROC_ID_ACQ_B()+"  &  "+"DN PROC_ID_ACQ  is "+transDnPojo.getPROC_ID_ACQ());

		if(txnactPojo.getPROC_ID_ACQ_B().trim().equalsIgnoreCase(transDnPojo.getPROC_ID_ACQ().trim())) {

			testcase_TXNACT.log(Status.PASS, "PROC_ID_ACQ between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "PROC_ID_ACQ between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}

		//PROC_ID_ISS

		testcase_TXNACT=extentreport.createTest("Verify PROC_ID_ISS between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT PROC_ID_ISS is  "+txnactPojo.getPROC_ID_ISS_B()+"  &  "+"DN PROC_ID_ISS  is "+transDnPojo.getPROC_ID_ISS());

		if(txnactPojo.getPROC_ID_ISS_B().trim().equalsIgnoreCase(transDnPojo.getPROC_ID_ISS().trim())) {

			testcase_TXNACT.log(Status.PASS, "PROC_ID_ISS between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "PROC_ID_ISS between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}

		//DATE_RECON_ACQ

		String txndate=txnactPojo.getDATE_RECON_ACQ();

		DateFormat outputFormat = new SimpleDateFormat("MM/dd/yyyy");// 12/18/2019
		DateFormat inputFormat = new SimpleDateFormat("yyyyMMdd");//   20191218
		Date date=inputFormat.parse(txndate);
		String DATE_RECON_ACQ=outputFormat.format(date);// Date


		testcase_TXNACT=extentreport.createTest("Verify DATE_RECON_ACQ between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT DATE_RECON_ACQ is  "+DATE_RECON_ACQ+"  &  "+"DN DATE_RECON_ACQ  is "+transDnPojo.getTrans_DATE_RECON_ACQ());

		if(DATE_RECON_ACQ.trim().equalsIgnoreCase(transDnPojo.getTrans_DATE_RECON_ACQ().trim())) {

			testcase_TXNACT.log(Status.PASS, "DATE_RECON_ACQ between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "DATE_RECON_ACQ between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}

		//DATE_RECON_ISS

		String txndate1=txnactPojo.getDATE_RECON_ACQ();

		DateFormat outputFormat1 = new SimpleDateFormat("MM/dd/yyyy");// 12/18/2019
		DateFormat inputFormat1 = new SimpleDateFormat("yyyyMMdd");//   20191218
		Date date1=inputFormat1.parse(txndate1);
		String DATE_RECON_ISS=outputFormat1.format(date1);// Date

		testcase_TXNACT=extentreport.createTest("Verify DATE_RECON_ISS between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT DATE_RECON_ISS is  "+DATE_RECON_ISS+"  &  "+"DN DATE_RECON_ISS  is "+transDnPojo.getTrans_DATE_RECON_ISS());

		if(DATE_RECON_ISS.trim().equalsIgnoreCase(transDnPojo.getTrans_DATE_RECON_ISS().trim())) {

			testcase_TXNACT.log(Status.PASS, "DATE_RECON_ISS between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "DATE_RECON_ISS between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}

		//AMT_RECON_NET

		testcase_TXNACT=extentreport.createTest("Verify AMT_RECON_NET between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT AMT_RECON_NET is  "+txnactPojo.getAMT_RECON_NET()+"  &  "+"DN AMT_RECON_NET  is "+transDnPojo.getTrans_AMT_RECON_NET());

		if(txnactPojo.getAMT_RECON_NET().trim().equalsIgnoreCase(transDnPojo.getTrans_AMT_RECON_NET().trim())) {

			testcase_TXNACT.log(Status.PASS, "AMT_RECON_NET between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "AMT_RECON_NET between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}

		//CUR_RECON_NET

		String CUR_RECON_NET=transDnPojo.getTrans_CUR_RECON_NET().substring(0, 3);

		testcase_TXNACT=extentreport.createTest("Verify CUR_RECON_NET between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT CUR_RECON_NET is  "+txnactPojo.getCUR_RECON_NET()+"  &  "+"DN CUR_RECON_NET  is "+CUR_RECON_NET);

		if(txnactPojo.getCUR_RECON_NET().trim().equalsIgnoreCase(CUR_RECON_NET.trim())) {

			testcase_TXNACT.log(Status.PASS, "CUR_RECON_NET between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "CUR_RECON_NET between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//CARD_ACPT_TERM_ID

		testcase_TXNACT=extentreport.createTest("Verify CARD_ACPT_TERM_ID between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT CARD_ACPT_TERM_ID is  "+txnactPojo.getCARD_ACPT_TERM_ID()+"  &  "+"DN CARD_ACPT_TERM_ID  is "+transDnPojo.getCARD_ACPT_TERM_ID());

		if(txnactPojo.getCARD_ACPT_TERM_ID().trim().equalsIgnoreCase(transDnPojo.getCARD_ACPT_TERM_ID().trim())) {

			testcase_TXNACT.log(Status.PASS, "CARD_ACPT_TERM_ID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "CARD_ACPT_TERM_ID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//NET_TERM_ID

		testcase_TXNACT=extentreport.createTest("Verify NET_TERM_ID between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT NET_TERM_ID is  "+txnactPojo.getNET_TERM_ID()+"  &  "+"DN NET_TERM_ID  is "+transDnPojo.getNET_TERM_ID());

		if(txnactPojo.getNET_TERM_ID().trim().equalsIgnoreCase(transDnPojo.getNET_TERM_ID().trim())) {

			testcase_TXNACT.log(Status.PASS, "NET_TERM_ID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "NET_TERM_ID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//ACCT_ID_1

		testcase_TXNACT=extentreport.createTest("Verify ACCT_ID_1 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT ACCT_ID_1 is  "+txnactPojo.getACCT_ID_1()+"  &  "+"DN ACCT_ID_1  is "+transDnPojo.getTrans_ACCT_ID_1());

		if(txnactPojo.getACCT_ID_1().trim().equalsIgnoreCase(transDnPojo.getTrans_ACCT_ID_1().trim())) {

			testcase_TXNACT.log(Status.PASS, "ACCT_ID_1 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "ACCT_ID_1 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}

		//MERCH_TYPE

		testcase_TXNACT=extentreport.createTest("Verify MERCH_TYPE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT MERCH_TYPE is  "+txnactPojo.getMERCH_TYPE()+"  &  "+"DN MERCH_TYPE  is "+transDnPojo.getTrans_MERCH_TYPE());

		if(txnactPojo.getMERCH_TYPE().trim().equalsIgnoreCase(transDnPojo.getTrans_MERCH_TYPE().trim())) {

			testcase_TXNACT.log(Status.PASS, "MERCH_TYPE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "MERCH_TYPE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}

		//BBL TAB Validation

		testcase_TXNACT.log(Status.INFO, "Transaction Details Tab Validation");

		//RECV_PROXY_ID

		testcase_TXNACT=extentreport.createTest("Verify RECV_PROXY_ID between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT RECV_PROXY_ID is  "+txnactPojo.getRECV_PROXY_ID()+"  &  "+"DN RECV_PROXY_ID  is "+transDnPojo.getRECV_PROXY_ID());

		if(txnactPojo.getRECV_PROXY_ID().trim().equalsIgnoreCase(transDnPojo.getRECV_PROXY_ID().trim())) {

			testcase_TXNACT.log(Status.PASS, "RECV_PROXY_ID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "RECV_PROXY_ID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//SENDER_PROXY_ID

		testcase_TXNACT=extentreport.createTest("Verify SENDER_PROXY_ID between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT SENDER_PROXY_ID is  "+txnactPojo.getSENDER_PROXY_ID()+"  &  "+"DN SENDER_PROXY_ID  is "+transDnPojo.getSENDER_PROXY_ID());

		if(txnactPojo.getSENDER_PROXY_ID().trim().equalsIgnoreCase(transDnPojo.getSENDER_PROXY_ID().trim())) {

			testcase_TXNACT.log(Status.PASS, "SENDER_PROXY_ID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "SENDER_PROXY_ID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//RECV_PROXY_TYPE

		testcase_TXNACT=extentreport.createTest("Verify RECV_PROXY_TYPE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT RECV_PROXY_TYPE is  "+txnactPojo.getRECV_PROXY_TYPE()+"  &  "+"DN RECV_PROXY_TYPE  is "+transDnPojo.getRECV_PROXY_TYPE());

		if(txnactPojo.getRECV_PROXY_TYPE().trim().equalsIgnoreCase(transDnPojo.getRECV_PROXY_TYPE().trim())) {

			testcase_TXNACT.log(Status.PASS, "RECV_PROXY_TYPE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "RECV_PROXY_TYPE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//SENDER_PROXY_TYPE

		testcase_TXNACT=extentreport.createTest("Verify SENDER_PROXY_TYPE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT SENDER_PROXY_TYPE is  "+txnactPojo.getSENDER_PROXY_TYPE()+"  &  "+"DN SENDER_PROXY_TYPE  is "+transDnPojo.getSENDER_PROXY_TYPE());

		if(txnactPojo.getSENDER_PROXY_TYPE().trim().equalsIgnoreCase(transDnPojo.getSENDER_PROXY_TYPE().trim())) {

			testcase_TXNACT.log(Status.PASS, "SENDER_PROXY_TYPE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "SENDER_PROXY_TYPE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//SENDER_TAX_ID

		testcase_TXNACT=extentreport.createTest("Verify SENDER_TAX_ID between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT SENDER_TAX_ID is  "+txnactPojo.getSENDER_TAX_ID()+"  &  "+"DN SENDER_TAX_ID  is "+transDnPojo.getSENDER_TAX_ID());

		if(txnactPojo.getSENDER_TAX_ID().trim().equalsIgnoreCase(transDnPojo.getSENDER_TAX_ID().trim())) {

			testcase_TXNACT.log(Status.PASS, "SENDER_TAX_ID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "SENDER_TAX_ID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//RECV_TAX_ID

		testcase_TXNACT=extentreport.createTest("Verify RECV_TAX_ID between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT RECV_TAX_ID is  "+txnactPojo.getRECV_TAX_ID()+"  &  "+"DN RECV_TAX_ID  is "+transDnPojo.getRECV_TAX_ID());

		if(txnactPojo.getRECV_TAX_ID().trim().equalsIgnoreCase(transDnPojo.getRECV_TAX_ID().trim())) {

			testcase_TXNACT.log(Status.PASS, "RECV_TAX_ID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "RECV_TAX_ID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//VAT_RATE

		testcase_TXNACT=extentreport.createTest("Verify VAT_RATE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT VAT_RATE is  "+txnactPojo.getVAT_RATE()+"  &  "+"DN VAT_RATE  is "+transDnPojo.getVAT_RATE());

		if(txnactPojo.getVAT_RATE().trim().equalsIgnoreCase(transDnPojo.getVAT_RATE().trim())) {

			testcase_TXNACT.log(Status.PASS, "VAT_RATE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "VAT_RATE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//VAT

		testcase_TXNACT=extentreport.createTest("Verify VAT between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT VAT is  "+txnactPojo.getVAT()+"  &  "+"DN VAT  is "+transDnPojo.getVAT());

		if(txnactPojo.getVAT().trim().equalsIgnoreCase(transDnPojo.getVAT().trim())) {

			testcase_TXNACT.log(Status.PASS, "VAT between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "VAT between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//WHT_TAX_RATE

		testcase_TXNACT=extentreport.createTest("Verify WHT_TAX_RATE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT WHT_TAX_RATE is  "+txnactPojo.getWHT_TAX_RATE()+"  &  "+"DN WHT_TAX_RATE  is "+transDnPojo.getWHT_TAX_RATE());

		if(txnactPojo.getWHT_TAX_RATE().trim().equalsIgnoreCase(transDnPojo.getWHT_TAX_RATE().trim())) {

			testcase_TXNACT.log(Status.PASS, "WHT_TAX_RATE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "WHT_TAX_RATE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//WHT_TAX

		testcase_TXNACT=extentreport.createTest("Verify WHT_TAX between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT WHT_TAX is  "+txnactPojo.getWHT_TAX()+"  &  "+"DN WHT_TAX  is "+transDnPojo.getWHT_TAX());

		if(txnactPojo.getWHT_TAX().trim().equalsIgnoreCase(transDnPojo.getWHT_TAX().trim())) {

			testcase_TXNACT.log(Status.PASS, "WHT_TAX between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "WHT_TAX between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//WHT_TAX_COND

		testcase_TXNACT=extentreport.createTest("Verify WHT_TAX_COND between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT WHT_TAX_COND is  "+txnactPojo.getWHT_TAX_COND()+"  &  "+"DN WHT_TAX_COND  is "+transDnPojo.getWHT_TAX_COND());

		if(txnactPojo.getWHT_TAX_COND().trim().equalsIgnoreCase(transDnPojo.getWHT_TAX_COND().trim())) {

			testcase_TXNACT.log(Status.PASS, "WHT_TAX_COND between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "WHT_TAX_COND between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//SENDER_REF_NO

		testcase_TXNACT=extentreport.createTest("Verify SENDER_REF_NO between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT SENDER_REF_NO is  "+txnactPojo.getSENDER_REF_NO()+"  &  "+"DN SENDER_REF_NO  is "+transDnPojo.getSENDER_REF_NO());

		if(txnactPojo.getSENDER_REF_NO().trim().equalsIgnoreCase(transDnPojo.getSENDER_REF_NO().trim())) {

			testcase_TXNACT.log(Status.PASS, "SENDER_REF_NO between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "SENDER_REF_NO between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TRAN_REF_NO

		testcase_TXNACT=extentreport.createTest("Verify TRAN_REF_NO between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TRAN_REF_NO is  "+txnactPojo.getTRAN_REF_NO()+"  &  "+"DN TRAN_REF_NO  is "+transDnPojo.getTRAN_REF_NO());

		if(txnactPojo.getTRAN_REF_NO().trim().equalsIgnoreCase(transDnPojo.getTRAN_REF_NO().trim())) {

			testcase_TXNACT.log(Status.PASS, "TRAN_REF_NO between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TRAN_REF_NO between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//REF_NO

		testcase_TXNACT=extentreport.createTest("Verify REF_NO between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT REF_NO is  "+txnactPojo.getREF_NO()+"  &  "+"DN REF_NO  is "+transDnPojo.getREF_NO());

		if(txnactPojo.getREF_NO().trim().equalsIgnoreCase(transDnPojo.getREF_NO().trim())) {

			testcase_TXNACT.log(Status.PASS, "REF_NO between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "REF_NO between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//BBL_REF_NO

		testcase_TXNACT=extentreport.createTest("Verify BBL_REF_NO between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT BBL_REF_NO is  "+txnactPojo.getBBL_REF_NO()+"  &  "+"DN BBL_REF_NO  is "+transDnPojo.getBBL_REF_NO());

		if(txnactPojo.getBBL_REF_NO().trim().equalsIgnoreCase(transDnPojo.getBBL_REF_NO().trim())) {

			testcase_TXNACT.log(Status.PASS, "BBL_REF_NO between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "BBL_REF_NO between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//FROM_ACCT_NAME

		testcase_TXNACT=extentreport.createTest("Verify FROM_ACCT_NAME between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT FROM_ACCT_NAME is  "+txnactPojo.getFROM_ACCT_NAME()+"  &  "+"DN FROM_ACCT_NAME  is "+transDnPojo.getFROM_ACCT_NAME());

		if(txnactPojo.getFROM_ACCT_NAME().trim().equalsIgnoreCase(transDnPojo.getFROM_ACCT_NAME().trim())) {

			testcase_TXNACT.log(Status.PASS, "FROM_ACCT_NAME between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "FROM_ACCT_NAME between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TO_ACCT_NAME

		testcase_TXNACT=extentreport.createTest("Verify TO_ACCT_NAME between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TO_ACCT_NAME is  "+txnactPojo.getTO_ACCT_NAME()+"  &  "+"DN TO_ACCT_NAME  is "+transDnPojo.getTO_ACCT_NAME());

		if(txnactPojo.getTO_ACCT_NAME().trim().equalsIgnoreCase(transDnPojo.getTO_ACCT_NAME().trim())) {

			testcase_TXNACT.log(Status.PASS, "TO_ACCT_NAME between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TO_ACCT_NAME between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TO_ACCT_DISP_NAME

		testcase_TXNACT=extentreport.createTest("Verify TO_ACCT_DISP_NAME between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TO_ACCT_DISP_NAME is  "+txnactPojo.getTO_ACCT_DISP_NAME()+"  &  "+"DN TO_ACCT_DISP_NAME  is "+transDnPojo.getTO_ACCT_DISP_NAME());

		if(txnactPojo.getTO_ACCT_DISP_NAME().trim().equalsIgnoreCase(transDnPojo.getTO_ACCT_DISP_NAME().trim())) {

			testcase_TXNACT.log(Status.PASS, "TO_ACCT_DISP_NAME between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TO_ACCT_DISP_NAME between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//BBL_FILLER_1

		testcase_TXNACT=extentreport.createTest("Verify BBL_FILLER_1 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT BBL_FILLER_1 is  "+txnactPojo.getBBL_FILLER_1()+"  &  "+"DN BBL_FILLER_1  is "+transDnPojo.getBBL_FILLER_1());

		if(txnactPojo.getBBL_FILLER_1().trim().equalsIgnoreCase(transDnPojo.getBBL_FILLER_1().trim())) {

			testcase_TXNACT.log(Status.PASS, "BBL_FILLER_1 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "BBL_FILLER_1 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//BBL_FILLER_2

		testcase_TXNACT=extentreport.createTest("Verify BBL_FILLER_2 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT BBL_FILLER_2 is  "+txnactPojo.getBBL_FILLER_2()+"  &  "+"DN BBL_FILLER_2  is "+transDnPojo.getBBL_FILLER_2());

		if(txnactPojo.getBBL_FILLER_2().trim().equalsIgnoreCase(transDnPojo.getBBL_FILLER_2().trim())) {

			testcase_TXNACT.log(Status.PASS, "BBL_FILLER_2 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "BBL_FILLER_2 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TAX_INVOICE

		testcase_TXNACT=extentreport.createTest("Verify TAX_INVOICE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TAX_INVOICE is  "+txnactPojo.getTAX_INVOICE()+"  &  "+"DN TAX_INVOICE  is "+transDnPojo.getTAX_INVOICE());

		if(txnactPojo.getTAX_INVOICE().trim().equalsIgnoreCase(transDnPojo.getTAX_INVOICE().trim())) {

			testcase_TXNACT.log(Status.PASS, "TAX_INVOICE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TAX_INVOICE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TYPE_OF_INCOME

		testcase_TXNACT=extentreport.createTest("Verify TYPE_OF_INCOME between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TYPE_OF_INCOME is  "+txnactPojo.getTYPE_OF_INCOME()+"  &  "+"DN TYPE_OF_INCOME  is "+transDnPojo.getTYPE_OF_INCOME());

		if(txnactPojo.getTYPE_OF_INCOME().trim().equalsIgnoreCase(transDnPojo.getTYPE_OF_INCOME().trim())) {

			testcase_TXNACT.log(Status.PASS, "TYPE_OF_INCOME between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TYPE_OF_INCOME between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//EDC_NUMBER

		testcase_TXNACT=extentreport.createTest("Verify EDC_NUMBER between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT EDC_NUMBER is  "+txnactPojo.getEDC_NUMBER()+"  &  "+"DN EDC_NUMBER  is "+transDnPojo.getEDC_NUMBER());

		if(txnactPojo.getEDC_NUMBER().trim().equalsIgnoreCase(transDnPojo.getEDC_NUMBER().trim())) {

			testcase_TXNACT.log(Status.PASS, "EDC_NUMBER between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "EDC_NUMBER between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TSTAMP_TRANS

		testcase_TXNACT=extentreport.createTest("Verify TSTAMP_TRANS between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TSTAMP_TRANS is  "+txnactPojo.getTSTAMP_TRANS()+"  &  "+"DN TSTAMP_TRANS  is "+transDnPojo.getTSTAMP_TRANS());

		if(txnactPojo.getTSTAMP_TRANS().trim().equalsIgnoreCase(transDnPojo.getTSTAMP_TRANS().trim())) {

			testcase_TXNACT.log(Status.PASS, "TSTAMP_TRANS between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TSTAMP_TRANS between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//PRODUCT_CODE

		/*	testcase_TXNACT=extentreport.createTest("Verify PRODUCT_CODE between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT PRODUCT_CODE is  "+txnactPojo.getPRODUCT_CODE()+"  &  "+"DN PRODUCT_CODE  is "+transDnPojo.getPRODUCT_CODE());

			if(txnactPojo.getPRODUCT_CODE().trim().equalsIgnoreCase(transDnPojo.getPRODUCT_CODE().trim())) {

				testcase_TXNACT.log(Status.PASS, "PRODUCT_CODE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "PRODUCT_CODE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/


		//SERV_TYPE_CODE

		/*	testcase_TXNACT=extentreport.createTest("Verify SERV_TYPE_CODE between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT SERV_TYPE_CODE is  "+txnactPojo.getSERV_TYPE_CODE()+"  &  "+"DN SERV_TYPE_CODE  is "+transDnPojo.getSERV_TYPE_CODE());

			if(txnactPojo.getSERV_TYPE_CODE().trim().equalsIgnoreCase(transDnPojo.getSERV_TYPE_CODE().trim())) {

				testcase_TXNACT.log(Status.PASS, "SERV_TYPE_CODE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "SERV_TYPE_CODE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}
		 */


		//BILL_REFERENCE

		testcase_TXNACT=extentreport.createTest("Verify BILL_REFERENCE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT BILL_REFERENCE is  "+txnactPojo.getBILL_REFERENCE()+"  &  "+"DN BILL_REFERENCE  is "+transDnPojo.getBILL_REFERENCE());

		if(txnactPojo.getBILL_REFERENCE().trim().equalsIgnoreCase(transDnPojo.getBILL_REFERENCE().trim())) {

			testcase_TXNACT.log(Status.PASS, "BILL_REFERENCE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "BILL_REFERENCE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//BPDUE_RTPEXP_DATE

		testcase_TXNACT=extentreport.createTest("Verify BPDUE_RTPEXP_DATE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT BPDUE_RTPEXP_DATE is  "+txnactPojo.getBPDUE_RTPEXP_DATE()+"  &  "+"DN BPDUE_RTPEXP_DATE  is "+transDnPojo.getBPDUE_RTPEXP_DATE());

		if(txnactPojo.getBPDUE_RTPEXP_DATE().trim().equalsIgnoreCase(transDnPojo.getBPDUE_RTPEXP_DATE().trim())) {

			testcase_TXNACT.log(Status.PASS, "BPDUE_RTPEXP_DATE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "BPDUE_RTPEXP_DATE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//CREDIT_NOTIF_REF

		testcase_TXNACT=extentreport.createTest("Verify CREDIT_NOTIF_REF between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT CREDIT_NOTIF_REF is  "+txnactPojo.getCREDIT_NOTIF_REF()+"  &  "+"DN CREDIT_NOTIF_REF  is "+transDnPojo.getCREDIT_NOTIF_REF());

		if(txnactPojo.getCREDIT_NOTIF_REF().trim().equalsIgnoreCase(transDnPojo.getCREDIT_NOTIF_REF().trim())) {

			testcase_TXNACT.log(Status.PASS, "CREDIT_NOTIF_REF between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "CREDIT_NOTIF_REF between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//BP_URL

		testcase_TXNACT=extentreport.createTest("Verify BP_URL between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT BP_URL is  "+txnactPojo.getBP_URL()+"  &  "+"DN BP_URL  is "+transDnPojo.getBP_URL());

		if(txnactPojo.getBP_URL().trim().equalsIgnoreCase(transDnPojo.getBP_URL().trim())) {

			testcase_TXNACT.log(Status.PASS, "BP_URL between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "BP_URL between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//SENDER_COMP_TAX_ID

		testcase_TXNACT=extentreport.createTest("Verify SENDER_COMP_TAX_ID between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT SENDER_COMP_TAX_ID is  "+txnactPojo.getSENDER_COMP_TAX_ID()+"  &  "+"DN SENDER_COMP_TAX_ID  is "+transDnPojo.getSENDER_COMP_TAX_ID());

		if(txnactPojo.getSENDER_COMP_TAX_ID().trim().equalsIgnoreCase(transDnPojo.getSENDER_COMP_TAX_ID().trim())) {

			testcase_TXNACT.log(Status.PASS, "SENDER_COMP_TAX_ID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "SENDER_COMP_TAX_ID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//SENDER_COMP_ACCT_NO

		testcase_TXNACT=extentreport.createTest("Verify SENDER_COMP_ACCT_NO between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT SENDER_COMP_ACCT_NO is  "+txnactPojo.getSENDER_COMP_ACCT_NO()+"  &  "+"DN SENDER_COMP_ACCT_NO  is "+transDnPojo.getSENDER_COMP_ACCT_NO());

		if(txnactPojo.getSENDER_COMP_ACCT_NO().trim().equalsIgnoreCase(transDnPojo.getSENDER_COMP_ACCT_NO().trim())) {

			testcase_TXNACT.log(Status.PASS, "SENDER_COMP_ACCT_NO between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "SENDER_COMP_ACCT_NO between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//RECV_COMP_TAX_ID

		testcase_TXNACT=extentreport.createTest("Verify RECV_COMP_TAX_ID between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT RECV_COMP_TAX_ID is  "+txnactPojo.getRECV_COMP_TAX_ID()+"  &  "+"DN RECV_COMP_TAX_ID  is "+transDnPojo.getRECV_COMP_TAX_ID());

		if(txnactPojo.getRECV_COMP_TAX_ID().trim().equalsIgnoreCase(transDnPojo.getRECV_COMP_TAX_ID().trim())) {

			testcase_TXNACT.log(Status.PASS, "RECV_COMP_TAX_ID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "RECV_COMP_TAX_ID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//RECV_COMP_ACCT_NO

		testcase_TXNACT=extentreport.createTest("Verify RECV_COMP_ACCT_NO between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT RECV_COMP_ACCT_NO is  "+txnactPojo.getRECV_COMP_ACCT_NO()+"  &  "+"DN RECV_COMP_ACCT_NO  is "+transDnPojo.getRECV_COMP_ACCT_NO());

		if(txnactPojo.getRECV_COMP_ACCT_NO().trim().equalsIgnoreCase(transDnPojo.getRECV_COMP_ACCT_NO().trim())) {

			testcase_TXNACT.log(Status.PASS, "RECV_COMP_ACCT_NO between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "RECV_COMP_ACCT_NO between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//COMPANY_CODE

		testcase_TXNACT=extentreport.createTest("Verify COMPANY_CODE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT COMPANY_CODE is  "+txnactPojo.getCOMPANY_CODE()+"  &  "+"DN COMPANY_CODE  is "+transDnPojo.getCOMPANY_CODE());

		if(txnactPojo.getCOMPANY_CODE().trim().equalsIgnoreCase(transDnPojo.getCOMPANY_CODE().trim())) {

			testcase_TXNACT.log(Status.PASS, "COMPANY_CODE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "COMPANY_CODE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//SERVICE_CODE

		testcase_TXNACT=extentreport.createTest("Verify SERVICE_CODE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT SERVICE_CODE is  "+txnactPojo.getSERVICE_CODE()+"  &  "+"DN SERVICE_CODE  is "+transDnPojo.getSERVICE_CODE());

		if(txnactPojo.getSERVICE_CODE().trim().equalsIgnoreCase(transDnPojo.getSERVICE_CODE().trim())) {

			testcase_TXNACT.log(Status.PASS, "SERVICE_CODE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "SERVICE_CODE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//FLAGS

		testcase_TXNACT=extentreport.createTest("Verify FLAGS between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT FLAGS is  "+txnactPojo.getFLAGS()+"  &  "+"DN FLAGS  is "+transDnPojo.getFLAGS());

		if(txnactPojo.getFLAGS().trim().equalsIgnoreCase(transDnPojo.getFLAGS().trim())) {

			testcase_TXNACT.log(Status.PASS, "FLAGS between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "FLAGS between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//BILL_REFERENCE2

		testcase_TXNACT=extentreport.createTest("Verify BILL_REFERENCE2 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT BILL_REFERENCE2 is  "+txnactPojo.getBILL_REFERENCE2()+"  &  "+"DN BILL_REFERENCE2  is "+transDnPojo.getBILL_REFERENCE2());

		if(txnactPojo.getBILL_REFERENCE2().trim().equalsIgnoreCase(transDnPojo.getBILL_REFERENCE2().trim())) {

			testcase_TXNACT.log(Status.PASS, "BILL_REFERENCE2 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "BILL_REFERENCE2 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//USER_DATA_1

		testcase_TXNACT=extentreport.createTest("Verify USER_DATA_1 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT USER_DATA_1 is  "+txnactPojo.getUSER_DATA_1()+"  &  "+"DN USER_DATA_1  is "+transDnPojo.getUSER_DATA_1());

		if(txnactPojo.getUSER_DATA_1().trim().equalsIgnoreCase(transDnPojo.getUSER_DATA_1().trim())) {

			testcase_TXNACT.log(Status.PASS, "USER_DATA_1 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "USER_DATA_1 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}



		//USER_DATA_2

		testcase_TXNACT=extentreport.createTest("Verify USER_DATA_2 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT USER_DATA_2 is  "+txnactPojo.getUSER_DATA_2()+"  &  "+"DN USER_DATA_2  is "+transDnPojo.getUSER_DATA_2());

		if(txnactPojo.getUSER_DATA_2().trim().equalsIgnoreCase(transDnPojo.getUSER_DATA_2().trim())) {

			testcase_TXNACT.log(Status.PASS, "USER_DATA_2 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "USER_DATA_2 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//USER_DATA_3

		testcase_TXNACT=extentreport.createTest("Verify USER_DATA_3 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT USER_DATA_3 is  "+txnactPojo.getUSER_DATA_3()+"  &  "+"DN USER_DATA_3  is "+transDnPojo.getUSER_DATA_3());

		if(txnactPojo.getUSER_DATA_3().trim().equalsIgnoreCase(transDnPojo.getUSER_DATA_3().trim())) {

			testcase_TXNACT.log(Status.PASS, "USER_DATA_3 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "USER_DATA_3 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//USER_DATA_4

		testcase_TXNACT=extentreport.createTest("Verify USER_DATA_4 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT USER_DATA_4 is  "+txnactPojo.getUSER_DATA_4()+"  &  "+"DN USER_DATA_4  is "+transDnPojo.getUSER_DATA_4());

		if(txnactPojo.getUSER_DATA_4().trim().equalsIgnoreCase(transDnPojo.getUSER_DATA_4().trim())) {

			testcase_TXNACT.log(Status.PASS, "USER_DATA_4 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "USER_DATA_4 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//USER_DATA_5

		testcase_TXNACT=extentreport.createTest("Verify USER_DATA_5 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT USER_DATA_5 is  "+txnactPojo.getUSER_DATA_5()+"  &  "+"DN USER_DATA_5  is "+transDnPojo.getUSER_DATA_5());

		if(txnactPojo.getUSER_DATA_5().trim().equalsIgnoreCase(transDnPojo.getUSER_DATA_5().trim())) {

			testcase_TXNACT.log(Status.PASS, "USER_DATA_5 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "USER_DATA_5 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}

		//PAYMENT_1

		testcase_TXNACT=extentreport.createTest("Verify PAYMENT_1 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT PAYMENT_1 is  "+txnactPojo.getPAYMENT_1()+"  &  "+"DN PAYMENT_1  is "+transDnPojo.getPAYMENT_1());

		if(txnactPojo.getPAYMENT_1().trim().equalsIgnoreCase(transDnPojo.getPAYMENT_1().trim())) {

			testcase_TXNACT.log(Status.PASS, "PAYMENT_1 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "PAYMENT_1 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//PAYMENT_2

		testcase_TXNACT=extentreport.createTest("Verify PAYMENT_2 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT PAYMENT_2 is  "+txnactPojo.getPAYMENT_2()+"  &  "+"DN PAYMENT_2  is "+transDnPojo.getPAYMENT_2());

		if(txnactPojo.getPAYMENT_2().trim().equalsIgnoreCase(transDnPojo.getPAYMENT_2().trim())) {

			testcase_TXNACT.log(Status.PASS, "PAYMENT_2 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "PAYMENT_2 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//PAYMENT_3

		testcase_TXNACT=extentreport.createTest("Verify PAYMENT_3 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT PAYMENT_3 is  "+txnactPojo.getPAYMENT_3()+"  &  "+"DN PAYMENT_3  is "+transDnPojo.getPAYMENT_3());

		if(txnactPojo.getPAYMENT_3().trim().equalsIgnoreCase(transDnPojo.getPAYMENT_3().trim())) {

			testcase_TXNACT.log(Status.PASS, "PAYMENT_3 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "PAYMENT_3 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//SMS_FEE

		testcase_TXNACT=extentreport.createTest("Verify SMS_FEE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT SMS_FEE is  "+txnactPojo.getSMS_FEE()+"  &  "+"DN SMS_FEE  is "+transDnPojo.getSMS_FEE());

		if(txnactPojo.getSMS_FEE().trim().equalsIgnoreCase(transDnPojo.getSMS_FEE().trim())) {

			testcase_TXNACT.log(Status.PASS, "SMS_FEE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "SMS_FEE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//SMS_MOBILE

		testcase_TXNACT=extentreport.createTest("Verify SMS_MOBILE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT SMS_MOBILE is  "+txnactPojo.getSMS_MOBILE()+"  &  "+"DN SMS_MOBILE  is "+transDnPojo.getSMS_MOBILE());

		if(txnactPojo.getSMS_MOBILE().trim().equalsIgnoreCase(transDnPojo.getSMS_MOBILE().trim())) {

			testcase_TXNACT.log(Status.PASS, "SMS_MOBILE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "SMS_MOBILE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//OTP

		testcase_TXNACT=extentreport.createTest("Verify OTP between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT OTP is  "+txnactPojo.getOTP()+"  &  "+"DN OTP  is "+transDnPojo.getOTP());

		if(txnactPojo.getOTP().trim().equalsIgnoreCase(transDnPojo.getOTP().trim())) {

			testcase_TXNACT.log(Status.PASS, "OTP between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "OTP between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//ACCT_INFO_1

		testcase_TXNACT=extentreport.createTest("Verify ACCT_INFO_1 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT ACCT_INFO_1 is  "+txnactPojo.getACCT_INFO_1()+"  &  "+"DN ACCT_INFO_1  is "+transDnPojo.getACCT_INFO_1());

		if(txnactPojo.getACCT_INFO_1().trim().equalsIgnoreCase(transDnPojo.getACCT_INFO_1().trim())) {

			testcase_TXNACT.log(Status.PASS, "ACCT_INFO_1 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "ACCT_INFO_1 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//ACCT_INFO_2

		testcase_TXNACT=extentreport.createTest("Verify ACCT_INFO_2 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT ACCT_INFO_2 is  "+txnactPojo.getACCT_INFO_2()+"  &  "+"DN ACCT_INFO_2  is "+transDnPojo.getACCT_INFO_2());

		if(txnactPojo.getACCT_INFO_2().trim().equalsIgnoreCase(transDnPojo.getACCT_INFO_2().trim())) {

			testcase_TXNACT.log(Status.PASS, "ACCT_INFO_2 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "ACCT_INFO_2 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//BBL_FILLER_3

		testcase_TXNACT=extentreport.createTest("Verify BBL_FILLER_3 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT BBL_FILLER_3 is  "+txnactPojo.getBBL_FILLER_3()+"  &  "+"DN BBL_FILLER_3  is "+transDnPojo.getBBL_FILLER_3());

		if(txnactPojo.getBBL_FILLER_3().trim().equalsIgnoreCase(transDnPojo.getBBL_FILLER_3().trim())) {

			testcase_TXNACT.log(Status.PASS, "BBL_FILLER_3 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "BBL_FILLER_3 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//FRM_FUND_CODE

		testcase_TXNACT=extentreport.createTest("Verify FRM_FUND_CODE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT FRM_FUND_CODE is  "+txnactPojo.getFROM_FUND_CODE()+"  &  "+"DN FRM_FUND_CODE  is "+transDnPojo.getFRM_FUND_CODE());

		if(txnactPojo.getFROM_FUND_CODE().trim().equalsIgnoreCase(transDnPojo.getFRM_FUND_CODE().trim())) {

			testcase_TXNACT.log(Status.PASS, "FRM_FUND_CODE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "FRM_FUND_CODE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}

		//TO_FUND_CODE

		testcase_TXNACT=extentreport.createTest("Verify TO_FUND_CODE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TO_FUND_CODE is  "+txnactPojo.getTO_FUND_CODE()+"  &  "+"DN TO_FUND_CODE  is "+transDnPojo.getTO_FUND_CODE());

		if(txnactPojo.getTO_FUND_CODE().trim().equalsIgnoreCase(transDnPojo.getTO_FUND_CODE().trim())) {

			testcase_TXNACT.log(Status.PASS, "TO_FUND_CODE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TO_FUND_CODE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//UNIT

		testcase_TXNACT=extentreport.createTest("Verify UNIT between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT UNIT is  "+txnactPojo.getUNIT()+"  &  "+"DN UNIT  is "+transDnPojo.getUNIT());

		if(txnactPojo.getUNIT().trim().equalsIgnoreCase(transDnPojo.getUNIT().trim())) {

			testcase_TXNACT.log(Status.PASS, "UNIT between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "UNIT between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//UNIT_PRICE

		testcase_TXNACT=extentreport.createTest("Verify UNIT_PRICE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT UNIT_PRICE is  "+txnactPojo.getUNIT_PRICE()+"  &  "+"DN UNIT_PRICE  is "+transDnPojo.getUNIT_PRICE());

		if(txnactPojo.getUNIT_PRICE().trim().equalsIgnoreCase(transDnPojo.getUNIT_PRICE().trim())) {

			testcase_TXNACT.log(Status.PASS, "UNIT_PRICE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "UNIT_PRICE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//BOND_YIELD

		testcase_TXNACT=extentreport.createTest("Verify BOND_YIELD between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT BOND_YIELD is  "+txnactPojo.getBOND_YIELD()+"  &  "+"DN BOND_YIELD  is "+transDnPojo.getBOND_YIELD());

		if(txnactPojo.getBOND_YIELD().trim().equalsIgnoreCase(transDnPojo.getBOND_YIELD().trim())) {

			testcase_TXNACT.log(Status.PASS, "BOND_YIELD between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "BOND_YIELD between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//SURCHARGE_FEE

		testcase_TXNACT=extentreport.createTest("Verify SURCHARGE_FEE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT SURCHARGE_FEE is  "+txnactPojo.getSURCHARGE_FEE()+"  &  "+"DN SURCHARGE_FEE  is "+transDnPojo.getSURCHARGE_FEE());

		if(txnactPojo.getSURCHARGE_FEE().trim().equalsIgnoreCase(transDnPojo.getSURCHARGE_FEE().trim())) {

			testcase_TXNACT.log(Status.PASS, "SURCHARGE_FEE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "SURCHARGE_FEE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//EXT_FROM_ACCT_TYPE

		testcase_TXNACT=extentreport.createTest("Verify EXT_FROM_ACCT_TYPE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT EXT_FROM_ACCT_TYPE is  "+txnactPojo.getEXT_FROM_ACCT_TYPE()+"  &  "+"DN EXT_FROM_ACCT_TYPE  is "+transDnPojo.getEXT_FROM_ACCT_TYPE());

		if(txnactPojo.getEXT_FROM_ACCT_TYPE().trim().equalsIgnoreCase(transDnPojo.getEXT_FROM_ACCT_TYPE().trim())) {

			testcase_TXNACT.log(Status.PASS, "EXT_FROM_ACCT_TYPE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "EXT_FROM_ACCT_TYPE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//EXT_TO_ACCT_TYPE

		testcase_TXNACT=extentreport.createTest("Verify EXT_TO_ACCT_TYPE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT EXT_TO_ACCT_TYPE is  "+txnactPojo.getEXT_TO_ACCT_TYPE()+"  &  "+"DN EXT_TO_ACCT_TYPE  is "+transDnPojo.getEXT_TO_ACCT_TYPE());

		if(txnactPojo.getEXT_TO_ACCT_TYPE().trim().equalsIgnoreCase(transDnPojo.getEXT_TO_ACCT_TYPE().trim())) {

			testcase_TXNACT.log(Status.PASS, "EXT_TO_ACCT_TYPE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "EXT_TO_ACCT_TYPE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//FROM_ACCT_DISP_NAME

		testcase_TXNACT=extentreport.createTest("Verify FROM_ACCT_DISP_NAME between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT FROM_ACCT_DISP_NAME is  "+txnactPojo.getFROM_ACCT_DISP_NAME()+"  &  "+"DN FROM_ACCT_DISP_NAME  is "+transDnPojo.getFROM_ACCT_DISP_NAME());

		if(txnactPojo.getFROM_ACCT_DISP_NAME().trim().equalsIgnoreCase(transDnPojo.getFROM_ACCT_DISP_NAME().trim())) {

			testcase_TXNACT.log(Status.PASS, "FROM_ACCT_DISP_NAME between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "FROM_ACCT_DISP_NAME between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TERMINAL_TRACE

		testcase_TXNACT=extentreport.createTest("Verify TERMINAL_TRACE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TERMINAL_TRACE is  "+txnactPojo.getTERMINAL_TRACE()+"  &  "+"DN TERMINAL_TRACE  is "+transDnPojo.getTERMINAL_TRACE());

		if(txnactPojo.getTERMINAL_TRACE().trim().equalsIgnoreCase(transDnPojo.getTERMINAL_TRACE().trim())) {

			testcase_TXNACT.log(Status.PASS, "TERMINAL_TRACE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TERMINAL_TRACE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//QRC_VOUCHER

		testcase_TXNACT=extentreport.createTest("Verify QRC_VOUCHER between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT QRC_VOUCHER is  "+txnactPojo.getQRC_VOUCHER()+"  &  "+"DN QRC_VOUCHER  is "+transDnPojo.getQRC_VOUCHER());

		if(txnactPojo.getQRC_VOUCHER().trim().equalsIgnoreCase(transDnPojo.getQRC_VOUCHER().trim())) {

			testcase_TXNACT.log(Status.PASS, "QRC_VOUCHER between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "QRC_VOUCHER between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//BBL_FILLER_4

		testcase_TXNACT=extentreport.createTest("Verify BBL_FILLER_4 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT BBL_FILLER_4 is  "+txnactPojo.getBBL_FILLER_4()+"  &  "+"DN BBL_FILLER_4  is "+transDnPojo.getBBL_FILLER_4());

		if(txnactPojo.getBBL_FILLER_4().trim().equalsIgnoreCase(transDnPojo.getBBL_FILLER_4().trim())) {

			testcase_TXNACT.log(Status.PASS, "BBL_FILLER_4 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "BBL_FILLER_4 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//CDM_DATA

		testcase_TXNACT=extentreport.createTest("Verify CDM_DATA between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT CDM_DATA is  "+txnactPojo.getCDM_DATA()+"  &  "+"DN CDM_DATA  is "+transDnPojo.getCDM_DATA());

		if(txnactPojo.getCDM_DATA().trim().equalsIgnoreCase(transDnPojo.getCDM_DATA().trim())) {

			testcase_TXNACT.log(Status.PASS, "CDM_DATA between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "CDM_DATA between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}



		//BBL_FILLER_5

		testcase_TXNACT=extentreport.createTest("Verify BBL_FILLER_5 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT BBL_FILLER_5 is  "+txnactPojo.getBBL_FILLER_5()+"  &  "+"DN BBL_FILLER_5  is "+transDnPojo.getBBL_FILLER_5());

		if(txnactPojo.getBBL_FILLER_5().trim().equalsIgnoreCase(transDnPojo.getBBL_FILLER_5().trim())) {

			testcase_TXNACT.log(Status.PASS, "BBL_FILLER_5 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "BBL_FILLER_5 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//CrossBorderFlag

		/*	testcase_TXNACT=extentreport.createTest("Verify CrossBorderFlag between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT CrossBorderFlag is  "+txnactPojo.getCrossBorderFlag()+"  &  "+"DN CrossBorderFlag  is "+transDnPojo.getCrossBorderFlag());

			if(txnactPojo.getCrossBorderFlag().trim().equalsIgnoreCase(transDnPojo.getCrossBorderFlag().trim())) {

				testcase_TXNACT.log(Status.PASS, "CrossBorderFlag between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "CrossBorderFlag between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/

		//cardBrand

		/*	testcase_TXNACT=extentreport.createTest("Verify cardBrand between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT cardBrand is  "+txnactPojo.getcardBrand()+"  &  "+"DN cardBrand  is "+transDnPojo.getcardBrand());

			if(txnactPojo.getcardBrand().trim().equalsIgnoreCase(transDnPojo.getcardBrand().trim())) {

				testcase_TXNACT.log(Status.PASS, "cardBrand between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "cardBrand between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/



		//card_location

		/*	testcase_TXNACT=extentreport.createTest("Verify card_location between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT card_location is  "+txnactPojo.getcard_location()+"  &  "+"DN card_location  is "+transDnPojo.getcard_location());

			if(txnactPojo.getcard_location().trim().equalsIgnoreCase(transDnPojo.getcard_location().trim())) {

				testcase_TXNACT.log(Status.PASS, "card_location between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "card_location between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/

		//card_scheme

		/*		testcase_TXNACT=extentreport.createTest("Verify card_scheme between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT card_scheme is  "+txnactPojo.getcard_scheme()+"  &  "+"DN card_scheme  is "+transDnPojo.getcard_scheme());

			if(txnactPojo.getcard_scheme().trim().equalsIgnoreCase(transDnPojo.getcard_scheme().trim())) {

				testcase_TXNACT.log(Status.PASS, "card_scheme between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "card_scheme between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/


		//Card_Owner_BranchCode

		/*	testcase_TXNACT=extentreport.createTest("Verify Card_Owner_BranchCode between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT Card_Owner_BranchCode is  "+txnactPojo.getCard_Owner_BranchCode()+"  &  "+"DN Card_Owner_BranchCode  is "+transDnPojo.getCard_Owner_BranchCode());

			if(txnactPojo.getCard_Owner_BranchCode().trim().equalsIgnoreCase(transDnPojo.getCard_Owner_BranchCode().trim())) {

				testcase_TXNACT.log(Status.PASS, "Card_Owner_BranchCode between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "Card_Owner_BranchCode between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/


		//txn_service

		/*	testcase_TXNACT=extentreport.createTest("Verify txn_service between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT txn_service is  "+txnactPojo.gettxn_service()+"  &  "+"DN txn_service  is "+transDnPojo.gettxn_service());

			if(txnactPojo.gettxn_service().trim().equalsIgnoreCase(transDnPojo.gettxn_service().trim())) {

				testcase_TXNACT.log(Status.PASS, "txn_service between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "txn_service between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/

		//bbl_private

		/*	testcase_TXNACT=extentreport.createTest("Verify bbl_private between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT bbl_private is  "+txnactPojo.getbbl_private()+"  &  "+"DN bbl_private  is "+transDnPojo.getbbl_private());

			if(txnactPojo.getbbl_private().trim().equalsIgnoreCase(transDnPojo.getbbl_private().trim())) {

				testcase_TXNACT.log(Status.PASS, "bbl_private between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "bbl_private between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/

		//ATCResult

		/*	testcase_TXNACT=extentreport.createTest("Verify ATCResult between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT ATCResult is  "+txnactPojo.getATCResult()+"  &  "+"DN ATCResult  is "+transDnPojo.getATCResult());

			if(txnactPojo.getATCResult().trim().equalsIgnoreCase(transDnPojo.getATCResult().trim())) {

				testcase_TXNACT.log(Status.PASS, "ATCResult between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "ATCResult between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/


		//CVV2AcquirerResult

		/*		testcase_TXNACT=extentreport.createTest("Verify CVV2AcquirerResult between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT CVV2AcquirerResult is  "+txnactPojo.getCVV2AcquirerResult()+"  &  "+"DN CVV2AcquirerResult  is "+transDnPojo.getCVV2AcquirerResult());

			if(txnactPojo.getCVV2AcquirerResult().trim().equalsIgnoreCase(transDnPojo.getCVV2AcquirerResult().trim())) {

				testcase_TXNACT.log(Status.PASS, "CVV2AcquirerResult between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "CVV2AcquirerResult between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


//CVV2IssuerResult

			testcase_TXNACT=extentreport.createTest("Verify CVV2IssuerResult between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT CVV2IssuerResult is  "+txnactPojo.getCVV2IssuerResult()+"  &  "+"DN CVV2IssuerResult  is "+transDnPojo.getCVV2IssuerResult());

			if(txnactPojo.getCVV2IssuerResult().trim().equalsIgnoreCase(transDnPojo.getCVV2IssuerResult().trim())) {

				testcase_TXNACT.log(Status.PASS, "CVV2IssuerResult between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "CVV2IssuerResult between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


//CVV2PresenceIndicator

			testcase_TXNACT=extentreport.createTest("Verify CVV2PresenceIndicator between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT CVV2PresenceIndicator is  "+txnactPojo.getCVV2PresenceIndicator()+"  &  "+"DN CVV2PresenceIndicator  is "+transDnPojo.getCVV2PresenceIndicator());

			if(txnactPojo.getCVV2PresenceIndicator().trim().equalsIgnoreCase(transDnPojo.getCVV2PresenceIndicator().trim())) {

				testcase_TXNACT.log(Status.PASS, "CVV2PresenceIndicator between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "CVV2PresenceIndicator between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


//CVV2ResponseIndicator

			testcase_TXNACT=extentreport.createTest("Verify CVV2ResponseIndicator between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT CVV2ResponseIndicator is  "+txnactPojo.getCVV2ResponseIndicator()+"  &  "+"DN CVV2ResponseIndicator  is "+transDnPojo.getCVV2ResponseIndicator());

			if(txnactPojo.getCVV2ResponseIndicator().trim().equalsIgnoreCase(transDnPojo.getCVV2ResponseIndicator().trim())) {

				testcase_TXNACT.log(Status.PASS, "CVV2ResponseIndicator between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "CVV2ResponseIndicator between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


//AcqRoutingNo

			testcase_TXNACT=extentreport.createTest("Verify AcqRoutingNo between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT AcqRoutingNo is  "+txnactPojo.getAcqRoutingNo()+"  &  "+"DN AcqRoutingNo  is "+transDnPojo.getAcqRoutingNo());

			if(txnactPojo.getAcqRoutingNo().trim().equalsIgnoreCase(transDnPojo.getAcqRoutingNo().trim())) {

				testcase_TXNACT.log(Status.PASS, "AcqRoutingNo between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "AcqRoutingNo between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


//ATM_Terminal_ID

			testcase_TXNACT=extentreport.createTest("Verify ATM_Terminal_ID between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT ATM_Terminal_ID is  "+txnactPojo.getATM_Terminal_ID()+"  &  "+"DN ATM_Terminal_ID  is "+transDnPojo.getATM_Terminal_ID());

			if(txnactPojo.getATM_Terminal_ID().trim().equalsIgnoreCase(transDnPojo.getATM_Terminal_ID().trim())) {

				testcase_TXNACT.log(Status.PASS, "ATM_Terminal_ID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "ATM_Terminal_ID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


//bblATM_Terminal_ID

			testcase_TXNACT=extentreport.createTest("Verify bblATM_Terminal_ID between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT bblATM_Terminal_ID is  "+txnactPojo.getbblATM_Terminal_ID()+"  &  "+"DN bblATM_Terminal_ID  is "+transDnPojo.getbblATM_Terminal_ID());

			if(txnactPojo.getbblATM_Terminal_ID().trim().equalsIgnoreCase(transDnPojo.getbblATM_Terminal_ID().trim())) {

				testcase_TXNACT.log(Status.PASS, "bblATM_Terminal_ID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "bblATM_Terminal_ID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


//Card_Owner

			testcase_TXNACT=extentreport.createTest("Verify Card_Owner between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT Card_Owner is  "+txnactPojo.getCard_Owner()+"  &  "+"DN Card_Owner  is "+transDnPojo.getCard_Owner());

			if(txnactPojo.getCard_Owner().trim().equalsIgnoreCase(transDnPojo.getCard_Owner().trim())) {

				testcase_TXNACT.log(Status.PASS, "Card_Owner between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "Card_Owner between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


//DCC_Home_CCY_Name

			testcase_TXNACT=extentreport.createTest("Verify DCC_Home_CCY_Name between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT DCC_Home_CCY_Name is  "+txnactPojo.getDCC_Home_CCY_Name()+"  &  "+"DN DCC_Home_CCY_Name  is "+transDnPojo.getDCC_Home_CCY_Name());

			if(txnactPojo.getDCC_Home_CCY_Name().trim().equalsIgnoreCase(transDnPojo.getDCC_Home_CCY_Name().trim())) {

				testcase_TXNACT.log(Status.PASS, "DCC_Home_CCY_Name between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "DCC_Home_CCY_Name between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


//DestRoutingNo

			testcase_TXNACT=extentreport.createTest("Verify DestRoutingNo between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT DestRoutingNo is  "+txnactPojo.getDestRoutingNo()+"  &  "+"DN DestRoutingNo  is "+transDnPojo.getDestRoutingNo());

			if(txnactPojo.getDestRoutingNo().trim().equalsIgnoreCase(transDnPojo.getDestRoutingNo().trim())) {

				testcase_TXNACT.log(Status.PASS, "DestRoutingNo between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "DestRoutingNo between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


//deviceTypeChannel

			testcase_TXNACT=extentreport.createTest("Verify deviceTypeChannel between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT deviceTypeChannel is  "+txnactPojo.getdeviceTypeChannel()+"  &  "+"DN deviceTypeChannel  is "+transDnPojo.getdeviceTypeChannel());

			if(txnactPojo.getdeviceTypeChannel().trim().equalsIgnoreCase(transDnPojo.getdeviceTypeChannel().trim())) {

				testcase_TXNACT.log(Status.PASS, "deviceTypeChannel between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "deviceTypeChannel between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


//FrAcct_Owner_Branch

			testcase_TXNACT=extentreport.createTest("Verify FrAcct_Owner_Branch between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT FrAcct_Owner_Branch is  "+txnactPojo.getFrAcct_Owner_Branch()+"  &  "+"DN FrAcct_Owner_Branch  is "+transDnPojo.getFrAcct_Owner_Branch());

			if(txnactPojo.getFrAcct_Owner_Branch().trim().equalsIgnoreCase(transDnPojo.getFrAcct_Owner_Branch().trim())) {

				testcase_TXNACT.log(Status.PASS, "FrAcct_Owner_Branch between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "FrAcct_Owner_Branch between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


//IR_Counter

			testcase_TXNACT=extentreport.createTest("Verify IR_Counter between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT IR_Counter is  "+txnactPojo.getIR_Counter()+"  &  "+"DN IR_Counter  is "+transDnPojo.getIR_Counter());

			if(txnactPojo.getIR_Counter().trim().equalsIgnoreCase(transDnPojo.getIR_Counter().trim())) {

				testcase_TXNACT.log(Status.PASS, "IR_Counter between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "IR_Counter between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


//IR_Flag

			testcase_TXNACT=extentreport.createTest("Verify IR_Flag between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT IR_Flag is  "+txnactPojo.getIR_Flag()+"  &  "+"DN IR_Flag  is "+transDnPojo.getIR_Flag());

			if(txnactPojo.getIR_Flag().trim().equalsIgnoreCase(transDnPojo.getIR_Flag().trim())) {

				testcase_TXNACT.log(Status.PASS, "IR_Flag between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "IR_Flag between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//IssRoutingNo

			testcase_TXNACT=extentreport.createTest("Verify IssRoutingNo between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT IssRoutingNo is  "+txnactPojo.getIssRoutingNo()+"  &  "+"DN IssRoutingNo  is "+transDnPojo.getIssRoutingNo());

			if(txnactPojo.getIssRoutingNo().trim().equalsIgnoreCase(transDnPojo.getIssRoutingNo().trim())) {

				testcase_TXNACT.log(Status.PASS, "IssRoutingNo between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "IssRoutingNo between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//Original_Card_Owner

			testcase_TXNACT=extentreport.createTest("Verify Original_Card_Owner between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT Original_Card_Owner is  "+txnactPojo.getOriginal_Card_Owner()+"  &  "+"DN Original_Card_Owner  is "+transDnPojo.getOriginal_Card_Owner());

			if(txnactPojo.getOriginal_Card_Owner().trim().equalsIgnoreCase(transDnPojo.getOriginal_Card_Owner().trim())) {

				testcase_TXNACT.log(Status.PASS, "Original_Card_Owner between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "Original_Card_Owner between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//Original_Terminal_Owner

			testcase_TXNACT=extentreport.createTest("Verify Original_Terminal_Owner between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT Original_Terminal_Owner is  "+txnactPojo.getOriginal_Terminal_Owner()+"  &  "+"DN Original_Terminal_Owner  is "+transDnPojo.getOriginal_Terminal_Owner());

			if(txnactPojo.getOriginal_Terminal_Owner().trim().equalsIgnoreCase(transDnPojo.getOriginal_Terminal_Owner().trim())) {

				testcase_TXNACT.log(Status.PASS, "Original_Terminal_Owner between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "Original_Terminal_Owner between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//Oth_Bank_Use_Counter

			testcase_TXNACT=extentreport.createTest("Verify Oth_Bank_Use_Counter between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT Oth_Bank_Use_Counter is  "+txnactPojo.getOth_Bank_Use_Counter()+"  &  "+"DN Oth_Bank_Use_Counter  is "+transDnPojo.getOth_Bank_Use_Counter());

			if(txnactPojo.getOth_Bank_Use_Counter().trim().equalsIgnoreCase(transDnPojo.getOth_Bank_Use_Counter().trim())) {

				testcase_TXNACT.log(Status.PASS, "Oth_Bank_Use_Counter between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "Oth_Bank_Use_Counter between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//Partial_Reverse_Amount

			testcase_TXNACT=extentreport.createTest("Verify Partial_Reverse_Amount between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT Partial_Reverse_Amount is  "+txnactPojo.getPartial_Reverse_Amount()+"  &  "+"DN Partial_Reverse_Amount  is "+transDnPojo.getPartial_Reverse_Amount());

			if(txnactPojo.getPartial_Reverse_Amount().trim().equalsIgnoreCase(transDnPojo.getPartial_Reverse_Amount().trim())) {

				testcase_TXNACT.log(Status.PASS, "Partial_Reverse_Amount between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "Partial_Reverse_Amount between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//Payee

			testcase_TXNACT=extentreport.createTest("Verify Payee between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT Payee is  "+txnactPojo.getPayee()+"  &  "+"DN Payee  is "+transDnPojo.getPayee());

			if(txnactPojo.getPayee().trim().equalsIgnoreCase(transDnPojo.getPayee().trim())) {

				testcase_TXNACT.log(Status.PASS, "Payee between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "Payee between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/


		//STANDIN_ACT

		testcase_TXNACT=extentreport.createTest("Verify STANDIN_ACT between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT STANDIN_ACT is  "+txnactPojo.getSTANDIN_ACT()+"  &  "+"DN STANDIN_ACT  is "+transDnPojo.getSTANDIN_ACT());

		if(txnactPojo.getSTANDIN_ACT().trim().equalsIgnoreCase(transDnPojo.getSTANDIN_ACT().trim())) {

			testcase_TXNACT.log(Status.PASS, "STANDIN_ACT between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "STANDIN_ACT between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}

		//Terminal_Owner_BranchCode

		/*		testcase_TXNACT=extentreport.createTest("Verify Terminal_Owner_BranchCode between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT Terminal_Owner_BranchCode is  "+txnactPojo.getTerminal_Owner_BranchCode()+"  &  "+"DN Terminal_Owner_BranchCode  is "+transDnPojo.getTerminal_Owner_BranchCode());

			if(txnactPojo.getTerminal_Owner_BranchCode().trim().equalsIgnoreCase(transDnPojo.getTerminal_Owner_BranchCode().trim())) {

				testcase_TXNACT.log(Status.PASS, "Terminal_Owner_BranchCode between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "Terminal_Owner_BranchCode between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//Terminal_Provice_RegionID

			testcase_TXNACT=extentreport.createTest("Verify Terminal_Provice_RegionID between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT Terminal_Provice_RegionID is  "+txnactPojo.getTerminal_Provice_RegionID()+"  &  "+"DN Terminal_Provice_RegionID  is "+transDnPojo.getTerminal_Provice_RegionID());

			if(txnactPojo.getTerminal_Provice_RegionID().trim().equalsIgnoreCase(transDnPojo.getTerminal_Provice_RegionID().trim())) {

				testcase_TXNACT.log(Status.PASS, "Terminal_Provice_RegionID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "Terminal_Provice_RegionID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//Terminal_State

			testcase_TXNACT=extentreport.createTest("Verify Terminal_State between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT Terminal_State is  "+txnactPojo.getTerminal_State()+"  &  "+"DN Terminal_State  is "+transDnPojo.getTerminal_State());

			if(txnactPojo.getTerminal_State().trim().equalsIgnoreCase(transDnPojo.getTerminal_State().trim())) {

				testcase_TXNACT.log(Status.PASS, "Terminal_State between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "Terminal_State between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//ToAcct_Owner_Branch

			testcase_TXNACT=extentreport.createTest("Verify ToAcct_Owner_Branch between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT ToAcct_Owner_Branch is  "+txnactPojo.getToAcct_Owner_Branch()+"  &  "+"DN ToAcct_Owner_Branch  is "+transDnPojo.getToAcct_Owner_Branch());

			if(txnactPojo.getToAcct_Owner_Branch().trim().equalsIgnoreCase(transDnPojo.getToAcct_Owner_Branch().trim())) {

				testcase_TXNACT.log(Status.PASS, "ToAcct_Owner_Branch between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "ToAcct_Owner_Branch between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//WHTTax

			testcase_TXNACT=extentreport.createTest("Verify WHTTax between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT WHTTax is  "+txnactPojo.getWHTTax()+"  &  "+"DN WHTTax  is "+transDnPojo.getWHTTax());

			if(txnactPojo.getWHTTax().trim().equalsIgnoreCase(transDnPojo.getWHTTax().trim())) {

				testcase_TXNACT.log(Status.PASS, "WHTTax between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "WHTTax between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//WHTTaxCon

			testcase_TXNACT=extentreport.createTest("Verify WHTTaxCon between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT WHTTaxCon is  "+txnactPojo.getWHTTaxCon()+"  &  "+"DN WHTTaxCon  is "+transDnPojo.getWHTTaxCon());

			if(txnactPojo.getWHTTaxCon().trim().equalsIgnoreCase(transDnPojo.getWHTTaxCon().trim())) {

				testcase_TXNACT.log(Status.PASS, "WHTTaxCon between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "WHTTaxCon between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/



		//LongData Tab Validation

		//REF_DATA_ACQ

		testcase_TXNACT=extentreport.createTest("Verify REF_DATA_ACQ between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT REF_DATA_ACQ is  "+txnactPojo.getREF_DATA_ACQ()+"  &  "+"DN REF_DATA_ACQ  is "+transDnPojo.getREF_DATA_ACQ());

		if(txnactPojo.getREF_DATA_ACQ().trim().equalsIgnoreCase(transDnPojo.getREF_DATA_ACQ().trim())) {

			testcase_TXNACT.log(Status.PASS, "REF_DATA_ACQ between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "REF_DATA_ACQ between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//REF_DATA_ACQ_PreLongData

		/*	testcase_TXNACT=extentreport.createTest("Verify REF_DATA_ACQ_PreLongData between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT REF_DATA_ACQ_PreLongData is  "+txnactPojo.getREF_DATA_ACQ_PreLongData()+"  &  "+"DN REF_DATA_ACQ_PreLongData  is "+transDnPojo.getREF_DATA_ACQ_PreLongData());

			if(txnactPojo.getREF_DATA_ACQ_PreLongData().trim().equalsIgnoreCase(transDnPojo.getREF_DATA_ACQ_PreLongData().trim())) {

				testcase_TXNACT.log(Status.PASS, "REF_DATA_ACQ_PreLongData between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "REF_DATA_ACQ_PreLongData between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/

		//DATA_PRIV_ACQ

		/*	testcase_TXNACT=extentreport.createTest("Verify DATA_PRIV_ACQ between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT DATA_PRIV_ACQ is  "+txnactPojo.getDATA_PRIV_ACQ()+"  &  "+"DN DATA_PRIV_ACQ  is "+transDnPojo.getDATA_PRIV_ACQ());

			if(txnactPojo.getDATA_PRIV_ACQ().trim().equalsIgnoreCase(transDnPojo.getDATA_PRIV_ACQ().trim())) {

				testcase_TXNACT.log(Status.PASS, "DATA_PRIV_ACQ between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "DATA_PRIV_ACQ between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/

		//DATA_PRIV_ACQ_PreLongData

		/*testcase_TXNACT=extentreport.createTest("Verify DATA_PRIV_ACQ_PreLongData between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT DATA_PRIV_ACQ_PreLongData is  "+txnactPojo.getDATA_PRIV_ACQ_PreLongData()+"  &  "+"DN DATA_PRIV_ACQ_PreLongData  is "+transDnPojo.getDATA_PRIV_ACQ_PreLongData());

			if(txnactPojo.getDATA_PRIV_ACQ_PreLongData().trim().equalsIgnoreCase(transDnPojo.getDATA_PRIV_ACQ_PreLongData().trim())) {

				testcase_TXNACT.log(Status.PASS, "DATA_PRIV_ACQ_PreLongData between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "DATA_PRIV_ACQ_PreLongData between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/


		//ADL_DATA_PRIV_ACQ

		testcase_TXNACT=extentreport.createTest("Verify ADL_DATA_PRIV_ACQ between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT ADL_DATA_PRIV_ACQ is  "+txnactPojo.getADL_DATA_PRIV_ACQ()+"  &  "+"DN ADL_DATA_PRIV_ACQ  is "+transDnPojo.getADL_DATA_PRIV_ACQ());

		if(txnactPojo.getADL_DATA_PRIV_ACQ().trim().equalsIgnoreCase(transDnPojo.getADL_DATA_PRIV_ACQ().trim())) {

			testcase_TXNACT.log(Status.PASS, "ADL_DATA_PRIV_ACQ between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "ADL_DATA_PRIV_ACQ between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//ADL_DATA_PRIV_ACQ_PreLongData

		/*	testcase_TXNACT=extentreport.createTest("Verify ADL_DATA_PRIV_ACQ_PreLongData between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT ADL_DATA_PRIV_ACQ_PreLongData is  "+txnactPojo.getADL_DATA_PRIV_ACQ_PreLongData()+"  &  "+"DN ADL_DATA_PRIV_ACQ_PreLongData  is "+transDnPojo.getADL_DATA_PRIV_ACQ_PreLongData());

			if(txnactPojo.getADL_DATA_PRIV_ACQ_PreLongData().trim().equalsIgnoreCase(transDnPojo.getADL_DATA_PRIV_ACQ_PreLongData().trim())) {

				testcase_TXNACT.log(Status.PASS, "ADL_DATA_PRIV_ACQ_PreLongData between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "ADL_DATA_PRIV_ACQ_PreLongData between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/


		//REF_DATA_ISS

		testcase_TXNACT=extentreport.createTest("Verify REF_DATA_ISS between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT REF_DATA_ISS is  "+txnactPojo.getREF_DATA_ISS()+"  &  "+"DN REF_DATA_ISS  is "+transDnPojo.getREF_DATA_ISS());

		if(txnactPojo.getREF_DATA_ISS().trim().equalsIgnoreCase(transDnPojo.getREF_DATA_ISS().trim())) {

			testcase_TXNACT.log(Status.PASS, "REF_DATA_ISS between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "REF_DATA_ISS between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//REF_DATA_ISS_PreLongData

		/*	testcase_TXNACT=extentreport.createTest("Verify REF_DATA_ISS_PreLongData between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT REF_DATA_ISS_PreLongData is  "+txnactPojo.getREF_DATA_ISS_PreLongData()+"  &  "+"DN REF_DATA_ISS_PreLongData  is "+transDnPojo.getREF_DATA_ISS_PreLongData());

			if(txnactPojo.getREF_DATA_ISS_PreLongData().trim().equalsIgnoreCase(transDnPojo.getREF_DATA_ISS_PreLongData().trim())) {

				testcase_TXNACT.log(Status.PASS, "REF_DATA_ISS_PreLongData between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "REF_DATA_ISS_PreLongData between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/

		//DATA_PRIV_ISS

		/*		testcase_TXNACT=extentreport.createTest("Verify DATA_PRIV_ISS between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT DATA_PRIV_ISS is  "+txnactPojo.getDATA_PRIV_ISS()+"  &  "+"DN DATA_PRIV_ISS  is "+transDnPojo.getDATA_PRIV_ISS());

			if(txnactPojo.getDATA_PRIV_ISS().trim().equalsIgnoreCase(transDnPojo.getDATA_PRIV_ISS().trim())) {

				testcase_TXNACT.log(Status.PASS, "DATA_PRIV_ISS between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "DATA_PRIV_ISS between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/

		//DATA_PRIV_ISS_PreLongData

		/*	testcase_TXNACT=extentreport.createTest("Verify DATA_PRIV_ISS_PreLongData between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT DATA_PRIV_ISS_PreLongData is  "+txnactPojo.getDATA_PRIV_ISS_PreLongData()+"  &  "+"DN DATA_PRIV_ISS_PreLongData  is "+transDnPojo.getDATA_PRIV_ISS_PreLongData());

			if(txnactPojo.getDATA_PRIV_ISS_PreLongData().trim().equalsIgnoreCase(transDnPojo.getDATA_PRIV_ISS_PreLongData().trim())) {

				testcase_TXNACT.log(Status.PASS, "DATA_PRIV_ISS_PreLongData between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "DATA_PRIV_ISS_PreLongData between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/

		//ADL_DATA_PRIV_ISS

		testcase_TXNACT=extentreport.createTest("Verify ADL_DATA_PRIV_ISS between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT ADL_DATA_PRIV_ISS is  "+txnactPojo.getADL_DATA_PRIV_ISS()+"  &  "+"DN ADL_DATA_PRIV_ISS  is "+transDnPojo.getADL_DATA_PRIV_ISS());

		if(txnactPojo.getADL_DATA_PRIV_ISS().trim().equalsIgnoreCase(transDnPojo.getADL_DATA_PRIV_ISS().trim())) {

			testcase_TXNACT.log(Status.PASS, "ADL_DATA_PRIV_ISS between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "ADL_DATA_PRIV_ISS between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//ADL_DATA_PRIV_ISS_PreLongData

		/*testcase_TXNACT=extentreport.createTest("Verify ADL_DATA_PRIV_ISS_PreLongData between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT ADL_DATA_PRIV_ISS_PreLongData is  "+txnactPojo.getADL_DATA_PRIV_ISS_PreLongData()+"  &  "+"DN ADL_DATA_PRIV_ISS_PreLongData  is "+transDnPojo.getADL_DATA_PRIV_ISS_PreLongData());

			if(txnactPojo.getADL_DATA_PRIV_ISS_PreLongData().trim().equalsIgnoreCase(transDnPojo.getADL_DATA_PRIV_ISS_PreLongData().trim())) {

				testcase_TXNACT.log(Status.PASS, "ADL_DATA_PRIV_ISS_PreLongData between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "ADL_DATA_PRIV_ISS_PreLongData between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/

		//ADL_RESP_DATA

		testcase_TXNACT=extentreport.createTest("Verify ADL_RESP_DATA between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT ADL_RESP_DATA is  "+txnactPojo.getADL_RESP_DATA()+"  &  "+"DN ADL_RESP_DATA  is "+transDnPojo.getADL_RESP_DATA());

		if(txnactPojo.getADL_RESP_DATA().trim().equalsIgnoreCase(transDnPojo.getADL_RESP_DATA().trim())) {

			testcase_TXNACT.log(Status.PASS, "ADL_RESP_DATA between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "ADL_RESP_DATA between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//ADL_RESP_DATA_PreLongData

		/*	testcase_TXNACT=extentreport.createTest("Verify ADL_RESP_DATA_PreLongData between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT ADL_RESP_DATA_PreLongData is  "+txnactPojo.getADL_RESP_DATA_PreLongData()+"  &  "+"DN ADL_RESP_DATA_PreLongData  is "+transDnPojo.getADL_RESP_DATA_PreLongData());

			if(txnactPojo.getADL_RESP_DATA_PreLongData().trim().equalsIgnoreCase(transDnPojo.getADL_RESP_DATA_PreLongData().trim())) {

				testcase_TXNACT.log(Status.PASS, "ADL_RESP_DATA_PreLongData between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "ADL_RESP_DATA_PreLongData between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/


		//TRACK_2_DATA

		testcase_TXNACT=extentreport.createTest("Verify TRACK_2_DATA between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TRACK_2_DATA is  "+txnactPojo.getTRACK_2_DATA()+"  &  "+"DN TRACK_2_DATA  is "+transDnPojo.getTRACK_2_DATA());

		if(txnactPojo.getTRACK_2_DATA().trim().equalsIgnoreCase(transDnPojo.getTRACK_2_DATA().trim())) {

			testcase_TXNACT.log(Status.PASS, "TRACK_2_DATA between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TRACK_2_DATA between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TRACK_2_DATA_PreLongData

		/*	testcase_TXNACT=extentreport.createTest("Verify TRACK_2_DATA_PreLongData between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT TRACK_2_DATA_PreLongData is  "+txnactPojo.getTRACK_2_DATA_PreLongData()+"  &  "+"DN TRACK_2_DATA_PreLongData  is "+transDnPojo.getTRACK_2_DATA_PreLongData());

			if(txnactPojo.getTRACK_2_DATA_PreLongData().trim().equalsIgnoreCase(transDnPojo.getTRACK_2_DATA_PreLongData().trim())) {

				testcase_TXNACT.log(Status.PASS, "TRACK_2_DATA_PreLongData between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "TRACK_2_DATA_PreLongData between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/

		//TRAN_UNIQUE_DATA

		testcase_TXNACT=extentreport.createTest("Verify TRAN_UNIQUE_DATA between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TRAN_UNIQUE_DATA is  "+txnactPojo.getTRAN_UNIQUE_DATA()+"  &  "+"DN TRAN_UNIQUE_DATA  is "+transDnPojo.getTRAN_UNIQUE_DATA());

		if(txnactPojo.getTRAN_UNIQUE_DATA().trim().equalsIgnoreCase(transDnPojo.getTRAN_UNIQUE_DATA().trim())) {

			testcase_TXNACT.log(Status.PASS, "TRAN_UNIQUE_DATA between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TRAN_UNIQUE_DATA between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}

		//TRAN_UNIQUE_DATA_PreLongData

		/*	testcase_TXNACT=extentreport.createTest("Verify TRAN_UNIQUE_DATA_PreLongData between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT TRAN_UNIQUE_DATA_PreLongData is  "+txnactPojo.getTRAN_UNIQUE_DATA_PreLongData()+"  &  "+"DN TRAN_UNIQUE_DATA_PreLongData  is "+transDnPojo.getTRAN_UNIQUE_DATA_PreLongData());

			if(txnactPojo.getTRAN_UNIQUE_DATA_PreLongData().trim().equalsIgnoreCase(transDnPojo.getTRAN_UNIQUE_DATA_PreLongData().trim())) {

				testcase_TXNACT.log(Status.PASS, "TRAN_UNIQUE_DATA_PreLongData between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "TRAN_UNIQUE_DATA_PreLongData between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/

		//TRAN_DESC

		testcase_TXNACT=extentreport.createTest("Verify TRAN_DESC between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TRAN_DESC is  "+txnactPojo.getTRAN_DESC()+"  &  "+"DN TRAN_DESC  is "+transDnPojo.getTRAN_DESC());

		if(txnactPojo.getTRAN_DESC().trim().equalsIgnoreCase(transDnPojo.getTRAN_DESC().trim())) {

			testcase_TXNACT.log(Status.PASS, "TRAN_DESC between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TRAN_DESC between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TRAN_DESC_PreLongData

		/*	testcase_TXNACT=extentreport.createTest("Verify TRAN_DESC_PreLongData between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT TRAN_DESC_PreLongData is  "+txnactPojo.getTRAN_DESC_PreLongData()+"  &  "+"DN TRAN_DESC_PreLongData  is "+transDnPojo.getTRAN_DESC_PreLongData());

			if(txnactPojo.getTRAN_DESC_PreLongData().trim().equalsIgnoreCase(transDnPojo.getTRAN_DESC_PreLongData().trim())) {

				testcase_TXNACT.log(Status.PASS, "TRAN_DESC_PreLongData between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "TRAN_DESC_PreLongData between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/


		//UNFORMATTED_MICR_DATA

		/*	testcase_TXNACT=extentreport.createTest("Verify UNFORMATTED_MICR_DATA between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT UNFORMATTED_MICR_DATA is  "+txnactPojo.getUNFORMATTED_MICR_DATA()+"  &  "+"DN UNFORMATTED_MICR_DATA  is "+transDnPojo.getUNFORMATTED_MICR_DATA());

			if(txnactPojo.getUNFORMATTED_MICR_DATA().trim().equalsIgnoreCase(transDnPojo.getUNFORMATTED_MICR_DATA().trim())) {

				testcase_TXNACT.log(Status.PASS, "UNFORMATTED_MICR_DATA between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "UNFORMATTED_MICR_DATA between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/


		//UNFORMATTED_MICR_DATA_PreLongData

		/*	testcase_TXNACT=extentreport.createTest("Verify UNFORMATTED_MICR_DATA_PreLongData between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT UNFORMATTED_MICR_DATA_PreLongData is  "+txnactPojo.getUNFORMATTED_MICR_DATA_PreLongData()+"  &  "+"DN UNFORMATTED_MICR_DATA_PreLongData  is "+transDnPojo.getUNFORMATTED_MICR_DATA_PreLongData());

			if(txnactPojo.getUNFORMATTED_MICR_DATA_PreLongData().trim().equalsIgnoreCase(transDnPojo.getUNFORMATTED_MICR_DATA_PreLongData().trim())) {

				testcase_TXNACT.log(Status.PASS, "UNFORMATTED_MICR_DATA_PreLongData between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "UNFORMATTED_MICR_DATA_PreLongData between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/

		//PAYEE

		testcase_TXNACT=extentreport.createTest("Verify PAYEE between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT PAYEE is  "+txnactPojo.getPAYEE()+"  &  "+"DN PAYEE  is "+transDnPojo.getPAYEE());

		if(txnactPojo.getPAYEE().trim().equalsIgnoreCase(transDnPojo.getPAYEE().trim())) {

			testcase_TXNACT.log(Status.PASS, "PAYEE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "PAYEE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//PAYEE_PreLongData

		/*	testcase_TXNACT=extentreport.createTest("Verify PAYEE_PreLongData between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT PAYEE_PreLongData is  "+txnactPojo.getPAYEE_PreLongData()+"  &  "+"DN PAYEE_PreLongData  is "+transDnPojo.getPAYEE_PreLongData());

			if(txnactPojo.getPAYEE_PreLongData().trim().equalsIgnoreCase(transDnPojo.getPAYEE_PreLongData().trim())) {

				testcase_TXNACT.log(Status.PASS, "PAYEE_PreLongData between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "PAYEE_PreLongData between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}*/


		//IntegratedCircuit Tab Validation

		/*//TRAN_TYPE

			testcase_TXNACT=extentreport.createTest("Verify TRAN_TYPE between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT TRAN_TYPE is  "+txnactPojo.getTRAN_TYPE()+"  &  "+"DN TRAN_TYPE  is "+transDnPojo.getTRAN_TYPE());

			if(txnactPojo.getTRAN_TYPE().trim().equalsIgnoreCase(transDnPojo.getTRAN_TYPE().trim())) {

				testcase_TXNACT.log(Status.PASS, "TRAN_TYPE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "TRAN_TYPE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}

//TRAN_DATE

			testcase_TXNACT=extentreport.createTest("Verify TRAN_DATE between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT TRAN_DATE is  "+txnactPojo.getTRAN_DATE()+"  &  "+"DN TRAN_DATE  is "+transDnPojo.getTRAN_DATE());

			if(txnactPojo.getTRAN_DATE().trim().equalsIgnoreCase(transDnPojo.getTRAN_DATE().trim())) {

				testcase_TXNACT.log(Status.PASS, "TRAN_DATE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "TRAN_DATE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}

//TRAN_CATEGORY_CODE

			testcase_TXNACT=extentreport.createTest("Verify TRAN_CATEGORY_CODE between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT TRAN_CATEGORY_CODE is  "+txnactPojo.getTRAN_CATEGORY_CODE()+"  &  "+"DN TRAN_CATEGORY_CODE  is "+transDnPojo.getTRAN_CATEGORY_CODE());

			if(txnactPojo.getTRAN_CATEGORY_CODE().trim().equalsIgnoreCase(transDnPojo.getTRAN_CATEGORY_CODE().trim())) {

				testcase_TXNACT.log(Status.PASS, "TRAN_CATEGORY_CODE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "TRAN_CATEGORY_CODE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}

			//TRAN_SEQ_COUNTER

			testcase_TXNACT=extentreport.createTest("Verify TRAN_SEQ_COUNTER between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT TRAN_SEQ_COUNTER is  "+txnactPojo.getTRAN_SEQ_COUNTER()+"  &  "+"DN TRAN_SEQ_COUNTER  is "+transDnPojo.getTRAN_SEQ_COUNTER());

			if(txnactPojo.getTRAN_SEQ_COUNTER().trim().equalsIgnoreCase(transDnPojo.getTRAN_SEQ_COUNTER().trim())) {

				testcase_TXNACT.log(Status.PASS, "TRAN_SEQ_COUNTER between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "TRAN_SEQ_COUNTER between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//TRAN_CURRENCY_CODE

			testcase_TXNACT=extentreport.createTest("Verify TRAN_CURRENCY_CODE between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT TRAN_CURRENCY_CODE is  "+txnactPojo.getTRAN_CURRENCY_CODE()+"  &  "+"DN TRAN_CURRENCY_CODE  is "+transDnPojo.getTRAN_CURRENCY_CODE());

			if(txnactPojo.getTRAN_CURRENCY_CODE().trim().equalsIgnoreCase(transDnPojo.getTRAN_CURRENCY_CODE().trim())) {

				testcase_TXNACT.log(Status.PASS, "TRAN_CURRENCY_CODE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "TRAN_CURRENCY_CODE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}

			//TERM_SERIAL_NO

			testcase_TXNACT=extentreport.createTest("Verify TERM_SERIAL_NO between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT TERM_SERIAL_NO is  "+txnactPojo.getTERM_SERIAL_NO()+"  &  "+"DN TERM_SERIAL_NO  is "+transDnPojo.getTERM_SERIAL_NO());

			if(txnactPojo.getTERM_SERIAL_NO().trim().equalsIgnoreCase(transDnPojo.getTERM_SERIAL_NO().trim())) {

				testcase_TXNACT.log(Status.PASS, "TERM_SERIAL_NO between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "TERM_SERIAL_NO between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//TERM_TERMINAL_TYPE

			testcase_TXNACT=extentreport.createTest("Verify TERM_TERMINAL_TYPE between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT TERM_TERMINAL_TYPE is  "+txnactPojo.getTERM_TERMINAL_TYPE()+"  &  "+"DN TERM_TERMINAL_TYPE  is "+transDnPojo.getTERM_TERMINAL_TYPE());

			if(txnactPojo.getTERM_TERMINAL_TYPE().trim().equalsIgnoreCase(transDnPojo.getTERM_TERMINAL_TYPE().trim())) {

				testcase_TXNACT.log(Status.PASS, "TERM_TERMINAL_TYPE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "TERM_TERMINAL_TYPE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//TERM_COUNTRY_CODE

			testcase_TXNACT=extentreport.createTest("Verify TERM_COUNTRY_CODE between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT TERM_COUNTRY_CODE is  "+txnactPojo.getTERM_COUNTRY_CODE()+"  &  "+"DN TERM_COUNTRY_CODE  is "+transDnPojo.getTERM_COUNTRY_CODE());

			if(txnactPojo.getTERM_COUNTRY_CODE().trim().equalsIgnoreCase(transDnPojo.getTERM_COUNTRY_CODE().trim())) {

				testcase_TXNACT.log(Status.PASS, "TERM_COUNTRY_CODE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "TERM_COUNTRY_CODE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//TERM_CAPABILITIES

			testcase_TXNACT=extentreport.createTest("Verify TERM_CAPABILITIES between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT TERM_CAPABILITIES is  "+txnactPojo.getTERM_CAPABILITIES()+"  &  "+"DN TERM_CAPABILITIES  is "+transDnPojo.getTERM_CAPABILITIES());

			if(txnactPojo.getTERM_CAPABILITIES().trim().equalsIgnoreCase(transDnPojo.getTERM_CAPABILITIES().trim())) {

				testcase_TXNACT.log(Status.PASS, "TERM_CAPABILITIES between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "TERM_CAPABILITIES between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//TERM_VERIFY_RESULT

			testcase_TXNACT=extentreport.createTest("Verify TERM_VERIFY_RESULT between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT TERM_VERIFY_RESULT is  "+txnactPojo.getTERM_VERIFY_RESULT()+"  &  "+"DN TERM_VERIFY_RESULT  is "+transDnPojo.getTERM_VERIFY_RESULT());

			if(txnactPojo.getTERM_VERIFY_RESULT().trim().equalsIgnoreCase(transDnPojo.getTERM_VERIFY_RESULT().trim())) {

				testcase_TXNACT.log(Status.PASS, "TERM_VERIFY_RESULT between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "TERM_VERIFY_RESULT between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}

			//ISS_APPL_DATA

			testcase_TXNACT=extentreport.createTest("Verify ISS_APPL_DATA between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT ISS_APPL_DATA is  "+txnactPojo.getISS_APPL_DATA()+"  &  "+"DN ISS_APPL_DATA  is "+transDnPojo.getISS_APPL_DATA());

			if(txnactPojo.getISS_APPL_DATA().trim().equalsIgnoreCase(transDnPojo.getISS_APPL_DATA().trim())) {

				testcase_TXNACT.log(Status.PASS, "ISS_APPL_DATA between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "ISS_APPL_DATA between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//ISS_AUTH_DATA

			testcase_TXNACT=extentreport.createTest("Verify ISS_AUTH_DATA between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT ISS_AUTH_DATA is  "+txnactPojo.getISS_AUTH_DATA()+"  &  "+"DN ISS_AUTH_DATA  is "+transDnPojo.getISS_AUTH_DATA());

			if(txnactPojo.getISS_AUTH_DATA().trim().equalsIgnoreCase(transDnPojo.getISS_AUTH_DATA().trim())) {

				testcase_TXNACT.log(Status.PASS, "ISS_AUTH_DATA between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "ISS_AUTH_DATA between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//ISS_DISCR_DATA

			testcase_TXNACT=extentreport.createTest("Verify ISS_DISCR_DATA between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT ISS_DISCR_DATA is  "+txnactPojo.getISS_DISCR_DATA()+"  &  "+"DN ISS_DISCR_DATA  is "+transDnPojo.getISS_DISCR_DATA());

			if(txnactPojo.getISS_DISCR_DATA().trim().equalsIgnoreCase(transDnPojo.getISS_DISCR_DATA().trim())) {

				testcase_TXNACT.log(Status.PASS, "ISS_DISCR_DATA between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "ISS_DISCR_DATA between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//ISS_SCRIPT_RESULT

			testcase_TXNACT=extentreport.createTest("Verify ISS_SCRIPT_RESULT between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT ISS_SCRIPT_RESULT is  "+txnactPojo.getISS_SCRIPT_RESULT()+"  &  "+"DN ISS_SCRIPT_RESULT  is "+transDnPojo.getISS_SCRIPT_RESULT());

			if(txnactPojo.getISS_SCRIPT_RESULT().trim().equalsIgnoreCase(transDnPojo.getISS_SCRIPT_RESULT().trim())) {

				testcase_TXNACT.log(Status.PASS, "ISS_SCRIPT_RESULT between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "ISS_SCRIPT_RESULT between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//ISS_SCRIPT1_DATA

			testcase_TXNACT=extentreport.createTest("Verify ISS_SCRIPT1_DATA between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT ISS_SCRIPT1_DATA is  "+txnactPojo.getISS_SCRIPT1_DATA()+"  &  "+"DN ISS_SCRIPT1_DATA  is "+transDnPojo.getISS_SCRIPT1_DATA());

			if(txnactPojo.getISS_SCRIPT1_DATA().trim().equalsIgnoreCase(transDnPojo.getISS_SCRIPT1_DATA().trim())) {

				testcase_TXNACT.log(Status.PASS, "ISS_SCRIPT1_DATA between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "ISS_SCRIPT1_DATA between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//ISS_SCRIPT2_DATA

			testcase_TXNACT=extentreport.createTest("Verify ISS_SCRIPT2_DATA between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT ISS_SCRIPT2_DATA is  "+txnactPojo.getISS_SCRIPT2_DATA()+"  &  "+"DN ISS_SCRIPT2_DATA  is "+transDnPojo.getISS_SCRIPT2_DATA());

			if(txnactPojo.getISS_SCRIPT2_DATA().trim().equalsIgnoreCase(transDnPojo.getISS_SCRIPT2_DATA().trim())) {

				testcase_TXNACT.log(Status.PASS, "ISS_SCRIPT2_DATA between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "ISS_SCRIPT2_DATA between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}



			//APPL_AMOUNT

			testcase_TXNACT=extentreport.createTest("Verify APPL_AMOUNT between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT APPL_AMOUNT is  "+txnactPojo.getAPPL_AMOUNT()+"  &  "+"DN APPL_AMOUNT  is "+transDnPojo.getAPPL_AMOUNT());

			if(txnactPojo.getAPPL_AMOUNT().trim().equalsIgnoreCase(transDnPojo.getAPPL_AMOUNT().trim())) {

				testcase_TXNACT.log(Status.PASS, "APPL_AMOUNT between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "APPL_AMOUNT between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//APPL_AMOUNT_OTHER

			testcase_TXNACT=extentreport.createTest("Verify APPL_AMOUNT_OTHER between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT APPL_AMOUNT_OTHER is  "+txnactPojo.getAPPL_AMOUNT_OTHER()+"  &  "+"DN APPL_AMOUNT_OTHER  is "+transDnPojo.getAPPL_AMOUNT_OTHER());

			if(txnactPojo.getAPPL_AMOUNT_OTHER().trim().equalsIgnoreCase(transDnPojo.getAPPL_AMOUNT_OTHER().trim())) {

				testcase_TXNACT.log(Status.PASS, "APPL_AMOUNT_OTHER between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "APPL_AMOUNT_OTHER between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//APPL_CRYPTOGRAM

			testcase_TXNACT=extentreport.createTest("Verify APPL_CRYPTOGRAM between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT APPL_CRYPTOGRAM is  "+txnactPojo.getAPPL_CRYPTOGRAM()+"  &  "+"DN APPL_CRYPTOGRAM  is "+transDnPojo.getAPPL_CRYPTOGRAM());

			if(txnactPojo.getAPPL_CRYPTOGRAM().trim().equalsIgnoreCase(transDnPojo.getAPPL_CRYPTOGRAM().trim())) {

				testcase_TXNACT.log(Status.PASS, "APPL_CRYPTOGRAM between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "APPL_CRYPTOGRAM between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//APPL_INTRCHG_PROF

			testcase_TXNACT=extentreport.createTest("Verify APPL_INTRCHG_PROF between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT APPL_INTRCHG_PROF is  "+txnactPojo.getAPPL_INTRCHG_PROF()+"  &  "+"DN APPL_INTRCHG_PROF  is "+transDnPojo.getAPPL_INTRCHG_PROF());

			if(txnactPojo.getAPPL_INTRCHG_PROF().trim().equalsIgnoreCase(transDnPojo.getAPPL_INTRCHG_PROF().trim())) {

				testcase_TXNACT.log(Status.PASS, "APPL_INTRCHG_PROF between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "APPL_INTRCHG_PROF between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//APPL_TRAN_COUNTER

			testcase_TXNACT=extentreport.createTest("Verify APPL_TRAN_COUNTER between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT APPL_TRAN_COUNTER is  "+txnactPojo.getAPPL_TRAN_COUNTER()+"  &  "+"DN APPL_TRAN_COUNTER  is "+transDnPojo.getAPPL_TRAN_COUNTER());

			if(txnactPojo.getAPPL_TRAN_COUNTER().trim().equalsIgnoreCase(transDnPojo.getAPPL_TRAN_COUNTER().trim())) {

				testcase_TXNACT.log(Status.PASS, "APPL_TRAN_COUNTER between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "APPL_TRAN_COUNTER between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//APPL_VERSION_NO

			testcase_TXNACT=extentreport.createTest("Verify APPL_VERSION_NO between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT APPL_VERSION_NO is  "+txnactPojo.getAPPL_VERSION_NO()+"  &  "+"DN APPL_VERSION_NO  is "+transDnPojo.getAPPL_VERSION_NO());

			if(txnactPojo.getAPPL_VERSION_NO().trim().equalsIgnoreCase(transDnPojo.getAPPL_VERSION_NO().trim())) {

				testcase_TXNACT.log(Status.PASS, "APPL_VERSION_NO between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "APPL_VERSION_NO between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//APPL_ID

			testcase_TXNACT=extentreport.createTest("Verify APPL_ID between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT APPL_ID is  "+txnactPojo.getAPPL_ID()+"  &  "+"DN APPL_ID  is "+transDnPojo.getAPPL_ID());

			if(txnactPojo.getAPPL_ID().trim().equalsIgnoreCase(transDnPojo.getAPPL_ID().trim())) {

				testcase_TXNACT.log(Status.PASS, "APPL_ID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "APPL_ID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//CARDH_VER_RESULT

			testcase_TXNACT=extentreport.createTest("Verify CARDH_VER_RESULT between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT CARDH_VER_RESULT is  "+txnactPojo.getCARDH_VER_RESULT()+"  &  "+"DN CARDH_VER_RESULT  is "+transDnPojo.getCARDH_VER_RESULT());

			if(txnactPojo.getCARDH_VER_RESULT().trim().equalsIgnoreCase(transDnPojo.getCARDH_VER_RESULT().trim())) {

				testcase_TXNACT.log(Status.PASS, "CARDH_VER_RESULT between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "CARDH_VER_RESULT between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//COPAC_CCS_CRYPTO

			testcase_TXNACT=extentreport.createTest("Verify COPAC_CCS_CRYPTO between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT COPAC_CCS_CRYPTO is  "+txnactPojo.getCOPAC_CCS_CRYPTO()+"  &  "+"DN COPAC_CCS_CRYPTO  is "+transDnPojo.getCOPAC_CCS_CRYPTO());

			if(txnactPojo.getCOPAC_CCS_CRYPTO().trim().equalsIgnoreCase(transDnPojo.getCOPAC_CCS_CRYPTO().trim())) {

				testcase_TXNACT.log(Status.PASS, "COPAC_CCS_CRYPTO between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "COPAC_CCS_CRYPTO between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//CRYPT_INFO_DATA

			testcase_TXNACT=extentreport.createTest("Verify CRYPT_INFO_DATA between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT CRYPT_INFO_DATA is  "+txnactPojo.getCRYPT_INFO_DATA()+"  &  "+"DN CRYPT_INFO_DATA  is "+transDnPojo.getCRYPT_INFO_DATA());

			if(txnactPojo.getCRYPT_INFO_DATA().trim().equalsIgnoreCase(transDnPojo.getCRYPT_INFO_DATA().trim())) {

				testcase_TXNACT.log(Status.PASS, "CRYPT_INFO_DATA between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "CRYPT_INFO_DATA between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//CARDHOLDER_INFO

			testcase_TXNACT=extentreport.createTest("Verify CARDHOLDER_INFO between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT CARDHOLDER_INFO is  "+txnactPojo.getCARDHOLDER_INFO()+"  &  "+"DN CARDHOLDER_INFO  is "+transDnPojo.getCARDHOLDER_INFO());

			if(txnactPojo.getCARDHOLDER_INFO().trim().equalsIgnoreCase(transDnPojo.getCARDHOLDER_INFO().trim())) {

				testcase_TXNACT.log(Status.PASS, "CARDHOLDER_INFO between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "CARDHOLDER_INFO between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//DEDICATED_FILE_NAM

			testcase_TXNACT=extentreport.createTest("Verify DEDICATED_FILE_NAM between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT DEDICATED_FILE_NAM is  "+txnactPojo.getDEDICATED_FILE_NAM()+"  &  "+"DN DEDICATED_FILE_NAM  is "+transDnPojo.getDEDICATED_FILE_NAM());

			if(txnactPojo.getDEDICATED_FILE_NAM().trim().equalsIgnoreCase(transDnPojo.getDEDICATED_FILE_NAM().trim())) {

				testcase_TXNACT.log(Status.PASS, "DEDICATED_FILE_NAM between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "DEDICATED_FILE_NAM between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//UNPREDICTABLE_NO

			testcase_TXNACT=extentreport.createTest("Verify UNPREDICTABLE_NO between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT UNPREDICTABLE_NO is  "+txnactPojo.getUNPREDICTABLE_NO()+"  &  "+"DN UNPREDICTABLE_NO  is "+transDnPojo.getUNPREDICTABLE_NO());

			if(txnactPojo.getUNPREDICTABLE_NO().trim().equalsIgnoreCase(transDnPojo.getUNPREDICTABLE_NO().trim())) {

				testcase_TXNACT.log(Status.PASS, "UNPREDICTABLE_NO between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "UNPREDICTABLE_NO between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//DERIVATION_KEY_IDX

			testcase_TXNACT=extentreport.createTest("Verify DERIVATION_KEY_IDX between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT DERIVATION_KEY_IDX is  "+txnactPojo.getDERIVATION_KEY_IDX()+"  &  "+"DN DERIVATION_KEY_IDX  is "+transDnPojo.getDERIVATION_KEY_IDX());

			if(txnactPojo.getDERIVATION_KEY_IDX().trim().equalsIgnoreCase(transDnPojo.getDERIVATION_KEY_IDX().trim())) {

				testcase_TXNACT.log(Status.PASS, "DERIVATION_KEY_IDX between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "DERIVATION_KEY_IDX between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//ARPC_CRYPTOGRAM

			testcase_TXNACT=extentreport.createTest("Verify ARPC_CRYPTOGRAM between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT ARPC_CRYPTOGRAM is  "+txnactPojo.getARPC_CRYPTOGRAM()+"  &  "+"DN ARPC_CRYPTOGRAM  is "+transDnPojo.getARPC_CRYPTOGRAM());

			if(txnactPojo.getARPC_CRYPTOGRAM().trim().equalsIgnoreCase(transDnPojo.getARPC_CRYPTOGRAM().trim())) {

				testcase_TXNACT.log(Status.PASS, "ARPC_CRYPTOGRAM between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "ARPC_CRYPTOGRAM between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//ARPC_RESPCODE

			testcase_TXNACT=extentreport.createTest("Verify ARPC_RESPCODE between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT ARPC_RESPCODE is  "+txnactPojo.getARPC_RESPCODE()+"  &  "+"DN ARPC_RESPCODE  is "+transDnPojo.getARPC_RESPCODE());

			if(txnactPojo.getARPC_RESPCODE().trim().equalsIgnoreCase(transDnPojo.getARPC_RESPCODE().trim())) {

				testcase_TXNACT.log(Status.PASS, "ARPC_RESPCODE between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "ARPC_RESPCODE between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//DEDICATED_FNAME

			testcase_TXNACT=extentreport.createTest("Verify DEDICATED_FNAME between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT DEDICATED_FNAME is  "+txnactPojo.getDEDICATED_FNAME()+"  &  "+"DN DEDICATED_FNAME  is "+transDnPojo.getDEDICATED_FNAME());

			if(txnactPojo.getDEDICATED_FNAME().trim().equalsIgnoreCase(transDnPojo.getDEDICATED_FNAME().trim())) {

				testcase_TXNACT.log(Status.PASS, "DEDICATED_FNAME between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "DEDICATED_FNAME between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}


			//FORM_FACTOR_IND

			testcase_TXNACT=extentreport.createTest("Verify FORM_FACTOR_IND between TXNACT file  & DN Application");
			testcase_TXNACT.log(Status.INFO, "TXN ACT FORM_FACTOR_IND is  "+txnactPojo.getFORM_FACTOR_IND()+"  &  "+"DN FORM_FACTOR_IND  is "+transDnPojo.getFORM_FACTOR_IND());

			if(txnactPojo.getFORM_FACTOR_IND().trim().equalsIgnoreCase(transDnPojo.getFORM_FACTOR_IND().trim())) {

				testcase_TXNACT.log(Status.PASS, "FORM_FACTOR_IND between TXNACT file  & DN Application are matched & hence Testcase got Passed");

			}else {

				testcase_TXNACT.log(Status.FAIL, "FORM_FACTOR_IND between TXNACT file  & DN Application are not matched & hence Testcase got failed");
			}
		 */



		//Additional Data Tab

		/*	//TAI_Present_L

		testcase_TXNACT=extentreport.createTest("Verify TAI_Present_L between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TAI_Present_L is  "+txnactPojo.getTAI_Present_L()+"  &  "+"DN TAI_Present_L  is "+transDnPojo.getTAI_Present_L());

		if(txnactPojo.getTAI_Present_L().trim().equalsIgnoreCase(transDnPojo.getTAI_Present_L().trim())) {

			testcase_TXNACT.log(Status.PASS, "TAI_Present_L between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TAI_Present_L between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TAI_Capture_Capability

		testcase_TXNACT=extentreport.createTest("Verify TAI_Capture_Capability between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TAI_Capture_Capability is  "+txnactPojo.getTAI_Capture_Capability()+"  &  "+"DN TAI_Capture_Capability  is "+transDnPojo.getTAI_Capture_Capability());

		if(txnactPojo.getTAI_Capture_Capability().trim().equalsIgnoreCase(transDnPojo.getTAI_Capture_Capability().trim())) {

			testcase_TXNACT.log(Status.PASS, "TAI_Capture_Capability between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TAI_Capture_Capability between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TAI_Input_Capability

		testcase_TXNACT=extentreport.createTest("Verify TAI_Input_Capability between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TAI_Input_Capability is  "+txnactPojo.getTAI_Input_Capability()+"  &  "+"DN TAI_Input_Capability  is "+transDnPojo.getTAI_Input_Capability());

		if(txnactPojo.getTAI_Input_Capability().trim().equalsIgnoreCase(transDnPojo.getTAI_Input_Capability().trim())) {

			testcase_TXNACT.log(Status.PASS, "TAI_Input_Capability between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TAI_Input_Capability between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TAI_Input_Mode

		testcase_TXNACT=extentreport.createTest("Verify TAI_Input_Mode between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TAI_Input_Mode is  "+txnactPojo.getTAI_Input_Mode()+"  &  "+"DN TAI_Input_Mode  is "+transDnPojo.getTAI_Input_Mode());

		if(txnactPojo.getTAI_Input_Mode().trim().equalsIgnoreCase(transDnPojo.getTAI_Input_Mode().trim())) {

			testcase_TXNACT.log(Status.PASS, "TAI_Input_Mode between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TAI_Input_Mode between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TAI_Output_Capability

		testcase_TXNACT=extentreport.createTest("Verify TAI_Output_Capability between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TAI_Output_Capability is  "+txnactPojo.getTAI_Output_Capability()+"  &  "+"DN TAI_Output_Capability  is "+transDnPojo.getTAI_Output_Capability());

		if(txnactPojo.getTAI_Output_Capability().trim().equalsIgnoreCase(transDnPojo.getTAI_Output_Capability().trim())) {

			testcase_TXNACT.log(Status.PASS, "TAI_Output_Capability between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TAI_Output_Capability between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TAI_PIN_Capture_Capability

		testcase_TXNACT=extentreport.createTest("Verify TAI_PIN_Capture_Capability between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TAI_PIN_Capture_Capability is  "+txnactPojo.getTAI_PIN_Capture_Capability()+"  &  "+"DN TAI_PIN_Capture_Capability  is "+transDnPojo.getTAI_PIN_Capture_Capability());

		if(txnactPojo.getTAI_PIN_Capture_Capability().trim().equalsIgnoreCase(transDnPojo.getTAI_PIN_Capture_Capability().trim())) {

			testcase_TXNACT.log(Status.PASS, "TAI_PIN_Capture_Capability between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TAI_PIN_Capture_Capability between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TAI_Present_R

		testcase_TXNACT=extentreport.createTest("Verify TAI_Present_R between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TAI_Present_R is  "+txnactPojo.getTAI_Present_R()+"  &  "+"DN TAI_Present_R  is "+transDnPojo.getTAI_Present_R());

		if(txnactPojo.getTAI_Present_R().trim().equalsIgnoreCase(transDnPojo.getTAI_Present_R().trim())) {

			testcase_TXNACT.log(Status.PASS, "TAI_Present_R between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TAI_Present_R between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TAI_Authentication_Capability

		testcase_TXNACT=extentreport.createTest("Verify TAI_Authentication_Capability between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TAI_Authentication_Capability is  "+txnactPojo.getTAI_Authentication_Capability()+"  &  "+"DN TAI_Authentication_Capability  is "+transDnPojo.getTAI_Authentication_Capability());

		if(txnactPojo.getTAI_Authentication_Capability().trim().equalsIgnoreCase(transDnPojo.getTAI_Authentication_Capability().trim())) {

			testcase_TXNACT.log(Status.PASS, "TAI_Authentication_Capability between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TAI_Authentication_Capability between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TAI_Authentication_Entity

		testcase_TXNACT=extentreport.createTest("Verify TAI_Authentication_Entity between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TAI_Authentication_Entity is  "+txnactPojo.getTAI_Authentication_Entity()+"  &  "+"DN TAI_Authentication_Entity  is "+transDnPojo.getTAI_Authentication_Entity());

		if(txnactPojo.getTAI_Authentication_Entity().trim().equalsIgnoreCase(transDnPojo.getTAI_Authentication_Entity().trim())) {

			testcase_TXNACT.log(Status.PASS, "TAI_Authentication_Entity between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TAI_Authentication_Entity between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TAI_Authentication_Method

		testcase_TXNACT=extentreport.createTest("Verify TAI_Authentication_Method between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TAI_Authentication_Method is  "+txnactPojo.getTAI_Authentication_Method()+"  &  "+"DN TAI_Authentication_Method  is "+transDnPojo.getTAI_Authentication_Method());

		if(txnactPojo.getTAI_Authentication_Method().trim().equalsIgnoreCase(transDnPojo.getTAI_Authentication_Method().trim())) {

			testcase_TXNACT.log(Status.PASS, "TAI_Authentication_Method between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TAI_Authentication_Method between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TAI_TerminalOutput_Capability

		testcase_TXNACT=extentreport.createTest("Verify TAI_TerminalOutput_Capability between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TAI_TerminalOutput_Capability is  "+txnactPojo.getTAI_TerminalOutput_Capability()+"  &  "+"DN TAI_TerminalOutput_Capability  is "+transDnPojo.getTAI_TerminalOutput_Capability());

		if(txnactPojo.getTAI_TerminalOutput_Capability().trim().equalsIgnoreCase(transDnPojo.getTAI_TerminalOutput_Capability().trim())) {

			testcase_TXNACT.log(Status.PASS, "TAI_TerminalOutput_Capability between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TAI_TerminalOutput_Capability between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TAI_Operating_Environment

		testcase_TXNACT=extentreport.createTest("Verify TAI_Operating_Environment between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TAI_Operating_Environment is  "+txnactPojo.getTAI_Operating_Environment()+"  &  "+"DN TAI_Operating_Environment  is "+transDnPojo.getTAI_Operating_Environment());

		if(txnactPojo.getTAI_Operating_Environment().trim().equalsIgnoreCase(transDnPojo.getTAI_Operating_Environment().trim())) {

			testcase_TXNACT.log(Status.PASS, "TAI_Operating_Environment between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TAI_Operating_Environment between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//CII_AccountQualifier1

		testcase_TXNACT=extentreport.createTest("Verify CII_AccountQualifier1 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT CII_AccountQualifier1 is  "+txnactPojo.getCII_AccountQualifier1()+"  &  "+"DN CII_AccountQualifier1  is "+transDnPojo.getCII_AccountQualifier1());

		if(txnactPojo.getCII_AccountQualifier1().trim().equalsIgnoreCase(transDnPojo.getCII_AccountQualifier1().trim())) {

			testcase_TXNACT.log(Status.PASS, "CII_AccountQualifier1 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "CII_AccountQualifier1 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//CII_AccountQualifier2

		testcase_TXNACT=extentreport.createTest("Verify CII_AccountQualifier2 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT CII_AccountQualifier2 is  "+txnactPojo.getCII_AccountQualifier2()+"  &  "+"DN CII_AccountQualifier2  is "+transDnPojo.getCII_AccountQualifier2());

		if(txnactPojo.getCII_AccountQualifier2().trim().equalsIgnoreCase(transDnPojo.getCII_AccountQualifier2().trim())) {

			testcase_TXNACT.log(Status.PASS, "CII_AccountQualifier2 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "CII_AccountQualifier2 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//CII_MessageTypeIdentifier

		testcase_TXNACT=extentreport.createTest("Verify CII_MessageTypeIdentifier between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT CII_MessageTypeIdentifier is  "+txnactPojo.getCII_MessageTypeIdentifier()+"  &  "+"DN CII_MessageTypeIdentifier  is "+transDnPojo.getCII_MessageTypeIdentifier());

		if(txnactPojo.getCII_MessageTypeIdentifier().trim().equalsIgnoreCase(transDnPojo.getCII_MessageTypeIdentifier().trim())) {

			testcase_TXNACT.log(Status.PASS, "CII_MessageTypeIdentifier between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "CII_MessageTypeIdentifier between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//CII_FinancialType

		testcase_TXNACT=extentreport.createTest("Verify CII_FinancialType between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT CII_FinancialType is  "+txnactPojo.getCII_FinancialType()+"  &  "+"DN CII_FinancialType  is "+transDnPojo.getCII_FinancialType());

		if(txnactPojo.getCII_FinancialType().trim().equalsIgnoreCase(transDnPojo.getCII_FinancialType().trim())) {

			testcase_TXNACT.log(Status.PASS, "CII_FinancialType between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "CII_FinancialType between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//CII_CardType

		testcase_TXNACT=extentreport.createTest("Verify CII_CardType between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT CII_CardType is  "+txnactPojo.getCII_CardType()+"  &  "+"DN CII_CardType  is "+transDnPojo.getCII_CardType());

		if(txnactPojo.getCII_CardType().trim().equalsIgnoreCase(transDnPojo.getCII_CardType().trim())) {

			testcase_TXNACT.log(Status.PASS, "CII_CardType between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "CII_CardType between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//CII_CardOwnerID

		testcase_TXNACT=extentreport.createTest("Verify CII_CardOwnerID between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT CII_CardOwnerID is  "+txnactPojo.getCII_CardOwnerID()+"  &  "+"DN CII_CardOwnerID  is "+transDnPojo.getCII_CardOwnerID());

		if(txnactPojo.getCII_CardOwnerID().trim().equalsIgnoreCase(transDnPojo.getCII_CardOwnerID().trim())) {

			testcase_TXNACT.log(Status.PASS, "CII_CardOwnerID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "CII_CardOwnerID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//CII_ServiceCode

		testcase_TXNACT=extentreport.createTest("Verify CII_ServiceCode between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT CII_ServiceCode is  "+txnactPojo.getCII_ServiceCode()+"  &  "+"DN CII_ServiceCode  is "+transDnPojo.getCII_ServiceCode());

		if(txnactPojo.getCII_ServiceCode().trim().equalsIgnoreCase(transDnPojo.getCII_ServiceCode().trim())) {

			testcase_TXNACT.log(Status.PASS, "CII_ServiceCode between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "CII_ServiceCode between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//CII_ProgramID

		testcase_TXNACT=extentreport.createTest("Verify CII_ProgramID between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT CII_ProgramID is  "+txnactPojo.getCII_ProgramID()+"  &  "+"DN CII_ProgramID  is "+transDnPojo.getCII_ProgramID());

		if(txnactPojo.getCII_ProgramID().trim().equalsIgnoreCase(transDnPojo.getCII_ProgramID().trim())) {

			testcase_TXNACT.log(Status.PASS, "CII_ProgramID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "CII_ProgramID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//FI_HostReceived

		testcase_TXNACT=extentreport.createTest("Verify FI_HostReceived between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT FI_HostReceived is  "+txnactPojo.getFI_HostReceived()+"  &  "+"DN FI_HostReceived  is "+transDnPojo.getFI_HostReceived());

		if(txnactPojo.getFI_HostReceived().trim().equalsIgnoreCase(transDnPojo.getFI_HostReceived().trim())) {

			testcase_TXNACT.log(Status.PASS, "FI_HostReceived between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "FI_HostReceived between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//FI_HostSent

		testcase_TXNACT=extentreport.createTest("Verify FI_HostSent between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT FI_HostSent is  "+txnactPojo.getFI_HostSent()+"  &  "+"DN FI_HostSent  is "+transDnPojo.getFI_HostSent());

		if(txnactPojo.getFI_HostSent().trim().equalsIgnoreCase(transDnPojo.getFI_HostSent().trim())) {

			testcase_TXNACT.log(Status.PASS, "FI_HostSent between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "FI_HostSent between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//FI_APFlag

		testcase_TXNACT=extentreport.createTest("Verify FI_APFlag between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT FI_APFlag is  "+txnactPojo.getFI_APFlag()+"  &  "+"DN FI_APFlag  is "+transDnPojo.getFI_APFlag());

		if(txnactPojo.getFI_APFlag().trim().equalsIgnoreCase(transDnPojo.getFI_APFlag().trim())) {

			testcase_TXNACT.log(Status.PASS, "FI_APFlag between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "FI_APFlag between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//FI_ReversedBy

		testcase_TXNACT=extentreport.createTest("Verify FI_ReversedBy between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT FI_ReversedBy is  "+txnactPojo.getFI_ReversedBy()+"  &  "+"DN FI_ReversedBy  is "+transDnPojo.getFI_ReversedBy());

		if(txnactPojo.getFI_ReversedBy().trim().equalsIgnoreCase(transDnPojo.getFI_ReversedBy().trim())) {

			testcase_TXNACT.log(Status.PASS, "FI_ReversedBy between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "FI_ReversedBy between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//FI_PlatformProductID

		testcase_TXNACT=extentreport.createTest("Verify FI_PlatformProductID between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT FI_PlatformProductID is  "+txnactPojo.getFI_PlatformProductID()+"  &  "+"DN FI_PlatformProductID  is "+transDnPojo.getFI_PlatformProductID());

		if(txnactPojo.getFI_PlatformProductID().trim().equalsIgnoreCase(transDnPojo.getFI_PlatformProductID().trim())) {

			testcase_TXNACT.log(Status.PASS, "FI_PlatformProductID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "FI_PlatformProductID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//FI_OARRequest

		testcase_TXNACT=extentreport.createTest("Verify FI_OARRequest between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT FI_OARRequest is  "+txnactPojo.getFI_OARRequest()+"  &  "+"DN FI_OARRequest  is "+transDnPojo.getFI_OARRequest());

		if(txnactPojo.getFI_OARRequest().trim().equalsIgnoreCase(transDnPojo.getFI_OARRequest().trim())) {

			testcase_TXNACT.log(Status.PASS, "FI_OARRequest between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "FI_OARRequest between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//AF_PinDataFormat

		testcase_TXNACT=extentreport.createTest("Verify AF_PinDataFormat between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT AF_PinDataFormat is  "+txnactPojo.getAF_PinDataFormat()+"  &  "+"DN AF_PinDataFormat  is "+transDnPojo.getAF_PinDataFormat());

		if(txnactPojo.getAF_PinDataFormat().trim().equalsIgnoreCase(transDnPojo.getAF_PinDataFormat().trim())) {

			testcase_TXNACT.log(Status.PASS, "AF_PinDataFormat between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "AF_PinDataFormat between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//AF_PINResults

		testcase_TXNACT=extentreport.createTest("Verify AF_PINResults between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT AF_PINResults is  "+txnactPojo.getAF_PINResults()+"  &  "+"DN AF_PINResults  is "+transDnPojo.getAF_PINResults());

		if(txnactPojo.getAF_PINResults().trim().equalsIgnoreCase(transDnPojo.getAF_PINResults().trim())) {

			testcase_TXNACT.log(Status.PASS, "AF_PINResults between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "AF_PINResults between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//AF_PMCError

		testcase_TXNACT=extentreport.createTest("Verify AF_PMCError between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT AF_PMCError is  "+txnactPojo.getAF_PMCError()+"  &  "+"DN AF_PMCError  is "+transDnPojo.getAF_PMCError());

		if(txnactPojo.getAF_PMCError().trim().equalsIgnoreCase(transDnPojo.getAF_PMCError().trim())) {

			testcase_TXNACT.log(Status.PASS, "AF_PMCError between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "AF_PMCError between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//AF_StandinOption

		testcase_TXNACT=extentreport.createTest("Verify AF_StandinOption between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT AF_StandinOption is  "+txnactPojo.getAF_StandinOption()+"  &  "+"DN AF_StandinOption  is "+transDnPojo.getAF_StandinOption());

		if(txnactPojo.getAF_StandinOption().trim().equalsIgnoreCase(transDnPojo.getAF_StandinOption().trim())) {

			testcase_TXNACT.log(Status.PASS, "AF_StandinOption between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "AF_StandinOption between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//AF_StandinAction

		testcase_TXNACT=extentreport.createTest("Verify AF_StandinAction between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT AF_StandinAction is  "+txnactPojo.getAF_StandinAction()+"  &  "+"DN AF_StandinAction  is "+transDnPojo.getAF_StandinAction());

		if(txnactPojo.getAF_StandinAction().trim().equalsIgnoreCase(transDnPojo.getAF_StandinAction().trim())) {

			testcase_TXNACT.log(Status.PASS, "AF_StandinAction between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "AF_StandinAction between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//AP_ApprovalCode

		testcase_TXNACT=extentreport.createTest("Verify AP_ApprovalCode between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT AP_ApprovalCode is  "+txnactPojo.getAP_ApprovalCode()+"  &  "+"DN AP_ApprovalCode  is "+transDnPojo.getAP_ApprovalCode());

		if(txnactPojo.getAP_ApprovalCode().trim().equalsIgnoreCase(transDnPojo.getAP_ApprovalCode().trim())) {

			testcase_TXNACT.log(Status.PASS, "AP_ApprovalCode between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "AP_ApprovalCode between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//AP_CardGroup

		testcase_TXNACT=extentreport.createTest("Verify AP_CardGroup between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT AP_CardGroup is  "+txnactPojo.getAP_CardGroup()+"  &  "+"DN AP_CardGroup  is "+transDnPojo.getAP_CardGroup());

		if(txnactPojo.getAP_CardGroup().trim().equalsIgnoreCase(transDnPojo.getAP_CardGroup().trim())) {

			testcase_TXNACT.log(Status.PASS, "AP_CardGroup between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "AP_CardGroup between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//AP_Data

		testcase_TXNACT=extentreport.createTest("Verify AP_Data between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT AP_Data is  "+txnactPojo.getAP_Data()+"  &  "+"DN AP_Data  is "+transDnPojo.getAP_Data());

		if(txnactPojo.getAP_Data().trim().equalsIgnoreCase(transDnPojo.getAP_Data().trim())) {

			testcase_TXNACT.log(Status.PASS, "AP_Data between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "AP_Data between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//AP_Error

		testcase_TXNACT=extentreport.createTest("Verify AP_Error between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT AP_Error is  "+txnactPojo.getAP_Error()+"  &  "+"DN AP_Error  is "+transDnPojo.getAP_Error());

		if(txnactPojo.getAP_Error().trim().equalsIgnoreCase(transDnPojo.getAP_Error().trim())) {

			testcase_TXNACT.log(Status.PASS, "AP_Error between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "AP_Error between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//AP_ErrorTraceLocal

		testcase_TXNACT=extentreport.createTest("Verify AP_ErrorTraceLocal between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT AP_ErrorTraceLocal is  "+txnactPojo.getAP_ErrorTraceLocal()+"  &  "+"DN AP_ErrorTraceLocal  is "+transDnPojo.getAP_ErrorTraceLocal());

		if(txnactPojo.getAP_ErrorTraceLocal().trim().equalsIgnoreCase(transDnPojo.getAP_ErrorTraceLocal().trim())) {

			testcase_TXNACT.log(Status.PASS, "AP_ErrorTraceLocal between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "AP_ErrorTraceLocal between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//AP_RejectReason

		testcase_TXNACT=extentreport.createTest("Verify AP_RejectReason between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT AP_RejectReason is  "+txnactPojo.getAP_RejectReason()+"  &  "+"DN AP_RejectReason  is "+transDnPojo.getAP_RejectReason());

		if(txnactPojo.getAP_RejectReason().trim().equalsIgnoreCase(transDnPojo.getAP_RejectReason().trim())) {

			testcase_TXNACT.log(Status.PASS, "AP_RejectReason between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "AP_RejectReason between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//SBA_ACQ_ReconInstID

		testcase_TXNACT=extentreport.createTest("Verify SBA_ACQ_ReconInstID between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT SBA_ACQ_ReconInstID is  "+txnactPojo.getSBA_ACQ_ReconInstID()+"  &  "+"DN SBA_ACQ_ReconInstID  is "+transDnPojo.getSBA_ACQ_ReconInstID());

		if(txnactPojo.getSBA_ACQ_ReconInstID().trim().equalsIgnoreCase(transDnPojo.getSBA_ACQ_ReconInstID().trim())) {

			testcase_TXNACT.log(Status.PASS, "SBA_ACQ_ReconInstID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "SBA_ACQ_ReconInstID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//SBA_ACQ_ProcessorGroupID

		testcase_TXNACT=extentreport.createTest("Verify SBA_ACQ_ProcessorGroupID between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT SBA_ACQ_ProcessorGroupID is  "+txnactPojo.getSBA_ACQ_ProcessorGroupID()+"  &  "+"DN SBA_ACQ_ProcessorGroupID  is "+transDnPojo.getSBA_ACQ_ProcessorGroupID());

		if(txnactPojo.getSBA_ACQ_ProcessorGroupID().trim().equalsIgnoreCase(transDnPojo.getSBA_ACQ_ProcessorGroupID().trim())) {

			testcase_TXNACT.log(Status.PASS, "SBA_ACQ_ProcessorGroupID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "SBA_ACQ_ProcessorGroupID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//SBA_ACQ_ProcessorID

		testcase_TXNACT=extentreport.createTest("Verify SBA_ACQ_ProcessorID between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT SBA_ACQ_ProcessorID is  "+txnactPojo.getSBA_ACQ_ProcessorID()+"  &  "+"DN SBA_ACQ_ProcessorID  is "+transDnPojo.getSBA_ACQ_ProcessorID());

		if(txnactPojo.getSBA_ACQ_ProcessorID().trim().equalsIgnoreCase(transDnPojo.getSBA_ACQ_ProcessorID().trim())) {

			testcase_TXNACT.log(Status.PASS, "SBA_ACQ_ProcessorID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "SBA_ACQ_ProcessorID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//SBA_ACQ_ReportingLevelID

		testcase_TXNACT=extentreport.createTest("Verify SBA_ACQ_ReportingLevelID between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT SBA_ACQ_ReportingLevelID is  "+txnactPojo.getSBA_ACQ_ReportingLevelID()+"  &  "+"DN SBA_ACQ_ReportingLevelID  is "+transDnPojo.getSBA_ACQ_ReportingLevelID());

		if(txnactPojo.getSBA_ACQ_ReportingLevelID().trim().equalsIgnoreCase(transDnPojo.getSBA_ACQ_ReportingLevelID().trim())) {

			testcase_TXNACT.log(Status.PASS, "SBA_ACQ_ReportingLevelID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "SBA_ACQ_ReportingLevelID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//SBA_ACQ_MerchantTierID

		testcase_TXNACT=extentreport.createTest("Verify SBA_ACQ_MerchantTierID between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT SBA_ACQ_MerchantTierID is  "+txnactPojo.getSBA_ACQ_MerchantTierID()+"  &  "+"DN SBA_ACQ_MerchantTierID  is "+transDnPojo.getSBA_ACQ_MerchantTierID());

		if(txnactPojo.getSBA_ACQ_MerchantTierID().trim().equalsIgnoreCase(transDnPojo.getSBA_ACQ_MerchantTierID().trim())) {

			testcase_TXNACT.log(Status.PASS, "SBA_ACQ_MerchantTierID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "SBA_ACQ_MerchantTierID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//SBA_ISS_ReconInstID

		testcase_TXNACT=extentreport.createTest("Verify SBA_ISS_ReconInstID between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT SBA_ISS_ReconInstID is  "+txnactPojo.getSBA_ISS_ReconInstID()+"  &  "+"DN SBA_ISS_ReconInstID  is "+transDnPojo.getSBA_ISS_ReconInstID());

		if(txnactPojo.getSBA_ISS_ReconInstID().trim().equalsIgnoreCase(transDnPojo.getSBA_ISS_ReconInstID().trim())) {

			testcase_TXNACT.log(Status.PASS, "SBA_ISS_ReconInstID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "SBA_ISS_ReconInstID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//SBA_ISS_ProcessorGroupID

		testcase_TXNACT=extentreport.createTest("Verify SBA_ISS_ProcessorGroupID between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT SBA_ISS_ProcessorGroupID is  "+txnactPojo.getSBA_ISS_ProcessorGroupID()+"  &  "+"DN SBA_ISS_ProcessorGroupID  is "+transDnPojo.getSBA_ISS_ProcessorGroupID());

		if(txnactPojo.getSBA_ISS_ProcessorGroupID().trim().equalsIgnoreCase(transDnPojo.getSBA_ISS_ProcessorGroupID().trim())) {

			testcase_TXNACT.log(Status.PASS, "SBA_ISS_ProcessorGroupID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "SBA_ISS_ProcessorGroupID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//SBA_ISS_ProcessorID

		testcase_TXNACT=extentreport.createTest("Verify SBA_ISS_ProcessorID between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT SBA_ISS_ProcessorID is  "+txnactPojo.getSBA_ISS_ProcessorID()+"  &  "+"DN SBA_ISS_ProcessorID  is "+transDnPojo.getSBA_ISS_ProcessorID());

		if(txnactPojo.getSBA_ISS_ProcessorID().trim().equalsIgnoreCase(transDnPojo.getSBA_ISS_ProcessorID().trim())) {

			testcase_TXNACT.log(Status.PASS, "SBA_ISS_ProcessorID between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "SBA_ISS_ProcessorID between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//UTA_DynamicCVVResult

		testcase_TXNACT=extentreport.createTest("Verify UTA_DynamicCVVResult between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT UTA_DynamicCVVResult is  "+txnactPojo.getUTA_DynamicCVVResult()+"  &  "+"DN UTA_DynamicCVVResult  is "+transDnPojo.getUTA_DynamicCVVResult());

		if(txnactPojo.getUTA_DynamicCVVResult().trim().equalsIgnoreCase(transDnPojo.getUTA_DynamicCVVResult().trim())) {

			testcase_TXNACT.log(Status.PASS, "UTA_DynamicCVVResult between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "UTA_DynamicCVVResult between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//UTA_ATCResults

		testcase_TXNACT=extentreport.createTest("Verify UTA_ATCResults between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT UTA_ATCResults is  "+txnactPojo.getUTA_ATCResults()+"  &  "+"DN UTA_ATCResults  is "+transDnPojo.getUTA_ATCResults());

		if(txnactPojo.getUTA_ATCResults().trim().equalsIgnoreCase(transDnPojo.getUTA_ATCResults().trim())) {

			testcase_TXNACT.log(Status.PASS, "UTA_ATCResults between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "UTA_ATCResults between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//UTA_CVV2_CVC2Result

		testcase_TXNACT=extentreport.createTest("Verify UTA_CVV2_CVC2Result between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT UTA_CVV2_CVC2Result is  "+txnactPojo.getUTA_CVV2_CVC2Result()+"  &  "+"DN UTA_CVV2_CVC2Result  is "+transDnPojo.getUTA_CVV2_CVC2Result());

		if(txnactPojo.getUTA_CVV2_CVC2Result().trim().equalsIgnoreCase(transDnPojo.getUTA_CVV2_CVC2Result().trim())) {

			testcase_TXNACT.log(Status.PASS, "UTA_CVV2_CVC2Result between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "UTA_CVV2_CVC2Result between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//UTA_Track1_NameMatching

		testcase_TXNACT=extentreport.createTest("Verify UTA_Track1_NameMatching between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT UTA_Track1_NameMatching is  "+txnactPojo.getUTA_Track1_NameMatching()+"  &  "+"DN UTA_Track1_NameMatching  is "+transDnPojo.getUTA_Track1_NameMatching());

		if(txnactPojo.getUTA_Track1_NameMatching().trim().equalsIgnoreCase(transDnPojo.getUTA_Track1_NameMatching().trim())) {

			testcase_TXNACT.log(Status.PASS, "UTA_Track1_NameMatching between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "UTA_Track1_NameMatching between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//UTA_CVV1_CVC1Result

		testcase_TXNACT=extentreport.createTest("Verify UTA_CVV1_CVC1Result between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT UTA_CVV1_CVC1Result is  "+txnactPojo.getUTA_CVV1_CVC1Result()+"  &  "+"DN UTA_CVV1_CVC1Result  is "+transDnPojo.getUTA_CVV1_CVC1Result());

		if(txnactPojo.getUTA_CVV1_CVC1Result().trim().equalsIgnoreCase(transDnPojo.getUTA_CVV1_CVC1Result().trim())) {

			testcase_TXNACT.log(Status.PASS, "UTA_CVV1_CVC1Result between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "UTA_CVV1_CVC1Result between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//UTA_AVSResult

		testcase_TXNACT=extentreport.createTest("Verify UTA_AVSResult between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT UTA_AVSResult is  "+txnactPojo.getUTA_AVSResult()+"  &  "+"DN UTA_AVSResult  is "+transDnPojo.getUTA_AVSResult());

		if(txnactPojo.getUTA_AVSResult().trim().equalsIgnoreCase(transDnPojo.getUTA_AVSResult().trim())) {

			testcase_TXNACT.log(Status.PASS, "UTA_AVSResult between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "UTA_AVSResult between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F1_ACQ_ReconAmount

		testcase_TXNACT=extentreport.createTest("Verify F1_ACQ_ReconAmount between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F1_ACQ_ReconAmount is  "+txnactPojo.getF1_ACQ_ReconAmount()+"  &  "+"DN F1_ACQ_ReconAmount  is "+transDnPojo.getF1_ACQ_ReconAmount());

		if(txnactPojo.getF1_ACQ_ReconAmount().trim().equalsIgnoreCase(transDnPojo.getF1_ACQ_ReconAmount().trim())) {

			testcase_TXNACT.log(Status.PASS, "F1_ACQ_ReconAmount between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F1_ACQ_ReconAmount between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F1_ACQ_ReconCurrency

		testcase_TXNACT=extentreport.createTest("Verify F1_ACQ_ReconCurrency between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F1_ACQ_ReconCurrency is  "+txnactPojo.getF1_ACQ_ReconCurrency()+"  &  "+"DN F1_ACQ_ReconCurrency  is "+transDnPojo.getF1_ACQ_ReconCurrency());

		if(txnactPojo.getF1_ACQ_ReconCurrency().trim().equalsIgnoreCase(transDnPojo.getF1_ACQ_ReconCurrency().trim())) {

			testcase_TXNACT.log(Status.PASS, "F1_ACQ_ReconCurrency between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F1_ACQ_ReconCurrency between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F1_ACQ_ConversionRate

		testcase_TXNACT=extentreport.createTest("Verify F1_ACQ_ConversionRate between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F1_ACQ_ConversionRate is  "+txnactPojo.getF1_ACQ_ConversionRate()+"  &  "+"DN F1_ACQ_ConversionRate  is "+transDnPojo.getF1_ACQ_ConversionRate());

		if(txnactPojo.getF1_ACQ_ConversionRate().trim().equalsIgnoreCase(transDnPojo.getF1_ACQ_ConversionRate().trim())) {

			testcase_TXNACT.log(Status.PASS, "F1_ACQ_ConversionRate between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F1_ACQ_ConversionRate between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F1_ISS_ReconAmount

		testcase_TXNACT=extentreport.createTest("Verify F1_ISS_ReconAmount between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F1_ISS_ReconAmount is  "+txnactPojo.getF1_ISS_ReconAmount()+"  &  "+"DN F1_ISS_ReconAmount  is "+transDnPojo.getF1_ISS_ReconAmount());

		if(txnactPojo.getF1_ISS_ReconAmount().trim().equalsIgnoreCase(transDnPojo.getF1_ISS_ReconAmount().trim())) {

			testcase_TXNACT.log(Status.PASS, "F1_ISS_ReconAmount between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F1_ISS_ReconAmount between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F1_ISS_ReconCurrency

		testcase_TXNACT=extentreport.createTest("Verify F1_ISS_ReconCurrency between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F1_ISS_ReconCurrency is  "+txnactPojo.getF1_ISS_ReconCurrency()+"  &  "+"DN F1_ISS_ReconCurrency  is "+transDnPojo.getF1_ISS_ReconCurrency());

		if(txnactPojo.getF1_ISS_ReconCurrency().trim().equalsIgnoreCase(transDnPojo.getF1_ISS_ReconCurrency().trim())) {

			testcase_TXNACT.log(Status.PASS, "F1_ISS_ReconCurrency between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F1_ISS_ReconCurrency between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F1_ISS_ConversionRate

		testcase_TXNACT=extentreport.createTest("Verify F1_ISS_ConversionRate between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F1_ISS_ConversionRate is  "+txnactPojo.getF1_ISS_ConversionRate()+"  &  "+"DN F1_ISS_ConversionRate  is "+transDnPojo.getF1_ISS_ConversionRate());

		if(txnactPojo.getF1_ISS_ConversionRate().trim().equalsIgnoreCase(transDnPojo.getF1_ISS_ConversionRate().trim())) {

			testcase_TXNACT.log(Status.PASS, "F1_ISS_ConversionRate between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F1_ISS_ConversionRate between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F1_Amount

		testcase_TXNACT=extentreport.createTest("Verify F1_Amount between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F1_Amount is  "+txnactPojo.getF1_Amount()+"  &  "+"DN F1_Amount  is "+transDnPojo.getF1_Amount());

		if(txnactPojo.getF1_Amount().trim().equalsIgnoreCase(transDnPojo.getF1_Amount().trim())) {

			testcase_TXNACT.log(Status.PASS, "F1_Amount between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F1_Amount between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F1_Currency

		testcase_TXNACT=extentreport.createTest("Verify F1_Currency between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F1_Currency is  "+txnactPojo.getF1_Currency()+"  &  "+"DN F1_Currency  is "+transDnPojo.getF1_Currency());

		if(txnactPojo.getF1_Currency().trim().equalsIgnoreCase(transDnPojo.getF1_Currency().trim())) {

			testcase_TXNACT.log(Status.PASS, "F1_Currency between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F1_Currency between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F1_Type

		testcase_TXNACT=extentreport.createTest("Verify F1_Type between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F1_Type is  "+txnactPojo.getF1_Type()+"  &  "+"DN F1_Type  is "+transDnPojo.getF1_Type());

		if(txnactPojo.getF1_Type().trim().equalsIgnoreCase(transDnPojo.getF1_Type().trim())) {

			testcase_TXNACT.log(Status.PASS, "F1_Type between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F1_Type between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F1_Indicator

		testcase_TXNACT=extentreport.createTest("Verify F1_Indicator between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F1_Indicator is  "+txnactPojo.getF1_Indicator()+"  &  "+"DN F1_Indicator  is "+transDnPojo.getF1_Indicator());

		if(txnactPojo.getF1_Indicator().trim().equalsIgnoreCase(transDnPojo.getF1_Indicator().trim())) {

			testcase_TXNACT.log(Status.PASS, "F1_Indicator between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F1_Indicator between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F1_Memo

		testcase_TXNACT=extentreport.createTest("Verify F1_Memo between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F1_Memo is  "+txnactPojo.getF1_Memo()+"  &  "+"DN F1_Memo  is "+transDnPojo.getF1_Memo());

		if(txnactPojo.getF1_Memo().trim().equalsIgnoreCase(transDnPojo.getF1_Memo().trim())) {

			testcase_TXNACT.log(Status.PASS, "F1_Memo between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F1_Memo between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F1_NetworkReconAmount

		testcase_TXNACT=extentreport.createTest("Verify F1_NetworkReconAmount between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F1_NetworkReconAmount is  "+txnactPojo.getF1_NetworkReconAmount()+"  &  "+"DN F1_NetworkReconAmount  is "+transDnPojo.getF1_NetworkReconAmount());

		if(txnactPojo.getF1_NetworkReconAmount().trim().equalsIgnoreCase(transDnPojo.getF1_NetworkReconAmount().trim())) {

			testcase_TXNACT.log(Status.PASS, "F1_NetworkReconAmount between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F1_NetworkReconAmount between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F2_ACQ_ReconAmount

		testcase_TXNACT=extentreport.createTest("Verify F2_ACQ_ReconAmount between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F2_ACQ_ReconAmount is  "+txnactPojo.getF2_ACQ_ReconAmount()+"  &  "+"DN F2_ACQ_ReconAmount  is "+transDnPojo.getF2_ACQ_ReconAmount());

		if(txnactPojo.getF2_ACQ_ReconAmount().trim().equalsIgnoreCase(transDnPojo.getF2_ACQ_ReconAmount().trim())) {

			testcase_TXNACT.log(Status.PASS, "F2_ACQ_ReconAmount between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F2_ACQ_ReconAmount between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F2_ACQ_ReconCurrency

		testcase_TXNACT=extentreport.createTest("Verify F2_ACQ_ReconCurrency between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F2_ACQ_ReconCurrency is  "+txnactPojo.getF2_ACQ_ReconCurrency()+"  &  "+"DN F2_ACQ_ReconCurrency  is "+transDnPojo.getF2_ACQ_ReconCurrency());

		if(txnactPojo.getF2_ACQ_ReconCurrency().trim().equalsIgnoreCase(transDnPojo.getF2_ACQ_ReconCurrency().trim())) {

			testcase_TXNACT.log(Status.PASS, "F2_ACQ_ReconCurrency between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F2_ACQ_ReconCurrency between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F2_ACQ_ConversionRate

		testcase_TXNACT=extentreport.createTest("Verify F2_ACQ_ConversionRate between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F2_ACQ_ConversionRate is  "+txnactPojo.getF2_ACQ_ConversionRate()+"  &  "+"DN F2_ACQ_ConversionRate  is "+transDnPojo.getF2_ACQ_ConversionRate());

		if(txnactPojo.getF2_ACQ_ConversionRate().trim().equalsIgnoreCase(transDnPojo.getF2_ACQ_ConversionRate().trim())) {

			testcase_TXNACT.log(Status.PASS, "F2_ACQ_ConversionRate between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F2_ACQ_ConversionRate between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F2_ISS_ReconAmount

		testcase_TXNACT=extentreport.createTest("Verify F2_ISS_ReconAmount between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F2_ISS_ReconAmount is  "+txnactPojo.getF2_ISS_ReconAmount()+"  &  "+"DN F2_ISS_ReconAmount  is "+transDnPojo.getF2_ISS_ReconAmount());

		if(txnactPojo.getF2_ISS_ReconAmount().trim().equalsIgnoreCase(transDnPojo.getF2_ISS_ReconAmount().trim())) {

			testcase_TXNACT.log(Status.PASS, "F2_ISS_ReconAmount between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F2_ISS_ReconAmount between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F2_ISS_ReconCurrency

		testcase_TXNACT=extentreport.createTest("Verify F2_ISS_ReconCurrency between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F2_ISS_ReconCurrency is  "+txnactPojo.getF2_ISS_ReconCurrency()+"  &  "+"DN F2_ISS_ReconCurrency  is "+transDnPojo.getF2_ISS_ReconCurrency());

		if(txnactPojo.getF2_ISS_ReconCurrency().trim().equalsIgnoreCase(transDnPojo.getF2_ISS_ReconCurrency().trim())) {

			testcase_TXNACT.log(Status.PASS, "F2_ISS_ReconCurrency between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F2_ISS_ReconCurrency between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F2_ISS_ConversionRate

		testcase_TXNACT=extentreport.createTest("Verify F2_ISS_ConversionRate between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F2_ISS_ConversionRate is  "+txnactPojo.getF2_ISS_ConversionRate()+"  &  "+"DN F2_ISS_ConversionRate  is "+transDnPojo.getF2_ISS_ConversionRate());

		if(txnactPojo.getF2_ISS_ConversionRate().trim().equalsIgnoreCase(transDnPojo.getF2_ISS_ConversionRate().trim())) {

			testcase_TXNACT.log(Status.PASS, "F2_ISS_ConversionRate between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F2_ISS_ConversionRate between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F2_Amount

		testcase_TXNACT=extentreport.createTest("Verify F2_Amount between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F2_Amount is  "+txnactPojo.getF2_Amount()+"  &  "+"DN F2_Amount  is "+transDnPojo.getF2_Amount());

		if(txnactPojo.getF2_Amount().trim().equalsIgnoreCase(transDnPojo.getF2_Amount().trim())) {

			testcase_TXNACT.log(Status.PASS, "F2_Amount between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F2_Amount between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F2_Currency

		testcase_TXNACT=extentreport.createTest("Verify F2_Currency between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F2_Currency is  "+txnactPojo.getF2_Currency()+"  &  "+"DN F2_Currency  is "+transDnPojo.getF2_Currency());

		if(txnactPojo.getF2_Currency().trim().equalsIgnoreCase(transDnPojo.getF2_Currency().trim())) {

			testcase_TXNACT.log(Status.PASS, "F2_Currency between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F2_Currency between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F2_Type

		testcase_TXNACT=extentreport.createTest("Verify F2_Type between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F2_Type is  "+txnactPojo.getF2_Type()+"  &  "+"DN F2_Type  is "+transDnPojo.getF2_Type());

		if(txnactPojo.getF2_Type().trim().equalsIgnoreCase(transDnPojo.getF2_Type().trim())) {

			testcase_TXNACT.log(Status.PASS, "F2_Type between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F2_Type between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F2_Indicator

		testcase_TXNACT=extentreport.createTest("Verify F2_Indicator between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F2_Indicator is  "+txnactPojo.getF2_Indicator()+"  &  "+"DN F2_Indicator  is "+transDnPojo.getF2_Indicator());

		if(txnactPojo.getF2_Indicator().trim().equalsIgnoreCase(transDnPojo.getF2_Indicator().trim())) {

			testcase_TXNACT.log(Status.PASS, "F2_Indicator between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F2_Indicator between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F2_Memo

		testcase_TXNACT=extentreport.createTest("Verify F2_Memo between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F2_Memo is  "+txnactPojo.getF2_Memo()+"  &  "+"DN F2_Memo  is "+transDnPojo.getF2_Memo());

		if(txnactPojo.getF2_Memo().trim().equalsIgnoreCase(transDnPojo.getF2_Memo().trim())) {

			testcase_TXNACT.log(Status.PASS, "F2_Memo between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F2_Memo between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F2_NetworkReconAmount

		testcase_TXNACT=extentreport.createTest("Verify F2_NetworkReconAmount between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F2_NetworkReconAmount is  "+txnactPojo.getF2_NetworkReconAmount()+"  &  "+"DN F2_NetworkReconAmount  is "+transDnPojo.getF2_NetworkReconAmount());

		if(txnactPojo.getF2_NetworkReconAmount().trim().equalsIgnoreCase(transDnPojo.getF2_NetworkReconAmount().trim())) {

			testcase_TXNACT.log(Status.PASS, "F2_NetworkReconAmount between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F2_NetworkReconAmount between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F3_ACQ_ReconAmount

		testcase_TXNACT=extentreport.createTest("Verify F3_ACQ_ReconAmount between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F3_ACQ_ReconAmount is  "+txnactPojo.getF3_ACQ_ReconAmount()+"  &  "+"DN F3_ACQ_ReconAmount  is "+transDnPojo.getF3_ACQ_ReconAmount());

		if(txnactPojo.getF3_ACQ_ReconAmount().trim().equalsIgnoreCase(transDnPojo.getF3_ACQ_ReconAmount().trim())) {

			testcase_TXNACT.log(Status.PASS, "F3_ACQ_ReconAmount between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F3_ACQ_ReconAmount between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F3_ACQ_ReconCurrency

		testcase_TXNACT=extentreport.createTest("Verify F3_ACQ_ReconCurrency between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F3_ACQ_ReconCurrency is  "+txnactPojo.getF3_ACQ_ReconCurrency()+"  &  "+"DN F3_ACQ_ReconCurrency  is "+transDnPojo.getF3_ACQ_ReconCurrency());

		if(txnactPojo.getF3_ACQ_ReconCurrency().trim().equalsIgnoreCase(transDnPojo.getF3_ACQ_ReconCurrency().trim())) {

			testcase_TXNACT.log(Status.PASS, "F3_ACQ_ReconCurrency between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F3_ACQ_ReconCurrency between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F3_ACQ_ConversionRate

		testcase_TXNACT=extentreport.createTest("Verify F3_ACQ_ConversionRate between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F3_ACQ_ConversionRate is  "+txnactPojo.getF3_ACQ_ConversionRate()+"  &  "+"DN F3_ACQ_ConversionRate  is "+transDnPojo.getF3_ACQ_ConversionRate());

		if(txnactPojo.getF3_ACQ_ConversionRate().trim().equalsIgnoreCase(transDnPojo.getF3_ACQ_ConversionRate().trim())) {

			testcase_TXNACT.log(Status.PASS, "F3_ACQ_ConversionRate between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F3_ACQ_ConversionRate between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F3_ISS_ReconAmount

		testcase_TXNACT=extentreport.createTest("Verify F3_ISS_ReconAmount between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F3_ISS_ReconAmount is  "+txnactPojo.getF3_ISS_ReconAmount()+"  &  "+"DN F3_ISS_ReconAmount  is "+transDnPojo.getF3_ISS_ReconAmount());

		if(txnactPojo.getF3_ISS_ReconAmount().trim().equalsIgnoreCase(transDnPojo.getF3_ISS_ReconAmount().trim())) {

			testcase_TXNACT.log(Status.PASS, "F3_ISS_ReconAmount between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F3_ISS_ReconAmount between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F3_ISS_ReconCurrency

		testcase_TXNACT=extentreport.createTest("Verify F3_ISS_ReconCurrency between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F3_ISS_ReconCurrency is  "+txnactPojo.getF3_ISS_ReconCurrency()+"  &  "+"DN F3_ISS_ReconCurrency  is "+transDnPojo.getF3_ISS_ReconCurrency());

		if(txnactPojo.getF3_ISS_ReconCurrency().trim().equalsIgnoreCase(transDnPojo.getF3_ISS_ReconCurrency().trim())) {

			testcase_TXNACT.log(Status.PASS, "F3_ISS_ReconCurrency between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F3_ISS_ReconCurrency between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F3_ISS_ConversionRate

		testcase_TXNACT=extentreport.createTest("Verify F3_ISS_ConversionRate between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F3_ISS_ConversionRate is  "+txnactPojo.getF3_ISS_ConversionRate()+"  &  "+"DN F3_ISS_ConversionRate  is "+transDnPojo.getF3_ISS_ConversionRate());

		if(txnactPojo.getF3_ISS_ConversionRate().trim().equalsIgnoreCase(transDnPojo.getF3_ISS_ConversionRate().trim())) {

			testcase_TXNACT.log(Status.PASS, "F3_ISS_ConversionRate between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F3_ISS_ConversionRate between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F3_Amount

		testcase_TXNACT=extentreport.createTest("Verify F3_Amount between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F3_Amount is  "+txnactPojo.getF3_Amount()+"  &  "+"DN F3_Amount  is "+transDnPojo.getF3_Amount());

		if(txnactPojo.getF3_Amount().trim().equalsIgnoreCase(transDnPojo.getF3_Amount().trim())) {

			testcase_TXNACT.log(Status.PASS, "F3_Amount between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F3_Amount between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F3_Currency

		testcase_TXNACT=extentreport.createTest("Verify F3_Currency between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F3_Currency is  "+txnactPojo.getF3_Currency()+"  &  "+"DN F3_Currency  is "+transDnPojo.getF3_Currency());

		if(txnactPojo.getF3_Currency().trim().equalsIgnoreCase(transDnPojo.getF3_Currency().trim())) {

			testcase_TXNACT.log(Status.PASS, "F3_Currency between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F3_Currency between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F3_Type

		testcase_TXNACT=extentreport.createTest("Verify F3_Type between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F3_Type is  "+txnactPojo.getF3_Type()+"  &  "+"DN F3_Type  is "+transDnPojo.getF3_Type());

		if(txnactPojo.getF3_Type().trim().equalsIgnoreCase(transDnPojo.getF3_Type().trim())) {

			testcase_TXNACT.log(Status.PASS, "F3_Type between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F3_Type between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F3_Indicator

		testcase_TXNACT=extentreport.createTest("Verify F3_Indicator between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F3_Indicator is  "+txnactPojo.getF3_Indicator()+"  &  "+"DN F3_Indicator  is "+transDnPojo.getF3_Indicator());

		if(txnactPojo.getF3_Indicator().trim().equalsIgnoreCase(transDnPojo.getF3_Indicator().trim())) {

			testcase_TXNACT.log(Status.PASS, "F3_Indicator between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F3_Indicator between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F3_Memo

		testcase_TXNACT=extentreport.createTest("Verify F3_Memo between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F3_Memo is  "+txnactPojo.getF3_Memo()+"  &  "+"DN F3_Memo  is "+transDnPojo.getF3_Memo());

		if(txnactPojo.getF3_Memo().trim().equalsIgnoreCase(transDnPojo.getF3_Memo().trim())) {

			testcase_TXNACT.log(Status.PASS, "F3_Memo between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F3_Memo between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//F3_NetworkReconAmount

		testcase_TXNACT=extentreport.createTest("Verify F3_NetworkReconAmount between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT F3_NetworkReconAmount is  "+txnactPojo.getF3_NetworkReconAmount()+"  &  "+"DN F3_NetworkReconAmount  is "+transDnPojo.getF3_NetworkReconAmount());

		if(txnactPojo.getF3_NetworkReconAmount().trim().equalsIgnoreCase(transDnPojo.getF3_NetworkReconAmount().trim())) {

			testcase_TXNACT.log(Status.PASS, "F3_NetworkReconAmount between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "F3_NetworkReconAmount between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}

		//Denomination_C1

		testcase_TXNACT=extentreport.createTest("Verify Denomination_C1 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Denomination_C1 is  "+txnactPojo.getDenomination_C1()+"  &  "+"DN Denomination_C1  is "+transDnPojo.getDenomination_C1());

		if(txnactPojo.getDenomination_C1().trim().equalsIgnoreCase(transDnPojo.getDenomination_C1().trim())) {

			testcase_TXNACT.log(Status.PASS, "Denomination_C1 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Denomination_C1 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Denomination_C2

		testcase_TXNACT=extentreport.createTest("Verify Denomination_C2 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Denomination_C2 is  "+txnactPojo.getDenomination_C2()+"  &  "+"DN Denomination_C2  is "+transDnPojo.getDenomination_C2());

		if(txnactPojo.getDenomination_C2().trim().equalsIgnoreCase(transDnPojo.getDenomination_C2().trim())) {

			testcase_TXNACT.log(Status.PASS, "Denomination_C2 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Denomination_C2 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Denomination_C3

		testcase_TXNACT=extentreport.createTest("Verify Denomination_C3 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Denomination_C3 is  "+txnactPojo.getDenomination_C3()+"  &  "+"DN Denomination_C3  is "+transDnPojo.getDenomination_C3());

		if(txnactPojo.getDenomination_C3().trim().equalsIgnoreCase(transDnPojo.getDenomination_C3().trim())) {

			testcase_TXNACT.log(Status.PASS, "Denomination_C3 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Denomination_C3 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Denomination_C4

		testcase_TXNACT=extentreport.createTest("Verify Denomination_C4 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Denomination_C4 is  "+txnactPojo.getDenomination_C4()+"  &  "+"DN Denomination_C4  is "+transDnPojo.getDenomination_C4());

		if(txnactPojo.getDenomination_C4().trim().equalsIgnoreCase(transDnPojo.getDenomination_C4().trim())) {

			testcase_TXNACT.log(Status.PASS, "Denomination_C4 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Denomination_C4 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Denomination_C5

		testcase_TXNACT=extentreport.createTest("Verify Denomination_C5 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Denomination_C5 is  "+txnactPojo.getDenomination_C5()+"  &  "+"DN Denomination_C5  is "+transDnPojo.getDenomination_C5());

		if(txnactPojo.getDenomination_C5().trim().equalsIgnoreCase(transDnPojo.getDenomination_C5().trim())) {

			testcase_TXNACT.log(Status.PASS, "Denomination_C5 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Denomination_C5 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Denomination_C6

		testcase_TXNACT=extentreport.createTest("Verify Denomination_C6 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Denomination_C6 is  "+txnactPojo.getDenomination_C6()+"  &  "+"DN Denomination_C6  is "+transDnPojo.getDenomination_C6());

		if(txnactPojo.getDenomination_C6().trim().equalsIgnoreCase(transDnPojo.getDenomination_C6().trim())) {

			testcase_TXNACT.log(Status.PASS, "Denomination_C6 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Denomination_C6 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Denomination_C7

		testcase_TXNACT=extentreport.createTest("Verify Denomination_C7 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Denomination_C7 is  "+txnactPojo.getDenomination_C7()+"  &  "+"DN Denomination_C7  is "+transDnPojo.getDenomination_C7());

		if(txnactPojo.getDenomination_C7().trim().equalsIgnoreCase(transDnPojo.getDenomination_C7().trim())) {

			testcase_TXNACT.log(Status.PASS, "Denomination_C7 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Denomination_C7 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Denomination_C8

		testcase_TXNACT=extentreport.createTest("Verify Denomination_C8 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Denomination_C8 is  "+txnactPojo.getDenomination_C8()+"  &  "+"DN Denomination_C8  is "+transDnPojo.getDenomination_C8());

		if(txnactPojo.getDenomination_C8().trim().equalsIgnoreCase(transDnPojo.getDenomination_C8().trim())) {

			testcase_TXNACT.log(Status.PASS, "Denomination_C8 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Denomination_C8 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Original_Items_C1

		testcase_TXNACT=extentreport.createTest("Verify Original_Items_C1 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Original_Items_C1 is  "+txnactPojo.getOriginal_Items_C1()+"  &  "+"DN Original_Items_C1  is "+transDnPojo.getOriginal_Items_C1());

		if(txnactPojo.getOriginal_Items_C1().trim().equalsIgnoreCase(transDnPojo.getOriginal_Items_C1().trim())) {

			testcase_TXNACT.log(Status.PASS, "Original_Items_C1 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Original_Items_C1 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Original_Items_C2

		testcase_TXNACT=extentreport.createTest("Verify Original_Items_C2 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Original_Items_C2 is  "+txnactPojo.getOriginal_Items_C2()+"  &  "+"DN Original_Items_C2  is "+transDnPojo.getOriginal_Items_C2());

		if(txnactPojo.getOriginal_Items_C2().trim().equalsIgnoreCase(transDnPojo.getOriginal_Items_C2().trim())) {

			testcase_TXNACT.log(Status.PASS, "Original_Items_C2 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Original_Items_C2 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Original_Items_C3

		testcase_TXNACT=extentreport.createTest("Verify Original_Items_C3 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Original_Items_C3 is  "+txnactPojo.getOriginal_Items_C3()+"  &  "+"DN Original_Items_C3  is "+transDnPojo.getOriginal_Items_C3());

		if(txnactPojo.getOriginal_Items_C3().trim().equalsIgnoreCase(transDnPojo.getOriginal_Items_C3().trim())) {

			testcase_TXNACT.log(Status.PASS, "Original_Items_C3 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Original_Items_C3 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Original_Items_C4

		testcase_TXNACT=extentreport.createTest("Verify Original_Items_C4 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Original_Items_C4 is  "+txnactPojo.getOriginal_Items_C4()+"  &  "+"DN Original_Items_C4  is "+transDnPojo.getOriginal_Items_C4());

		if(txnactPojo.getOriginal_Items_C4().trim().equalsIgnoreCase(transDnPojo.getOriginal_Items_C4().trim())) {

			testcase_TXNACT.log(Status.PASS, "Original_Items_C4 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Original_Items_C4 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Original_Items_C5

		testcase_TXNACT=extentreport.createTest("Verify Original_Items_C5 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Original_Items_C5 is  "+txnactPojo.getOriginal_Items_C5()+"  &  "+"DN Original_Items_C5  is "+transDnPojo.getOriginal_Items_C5());

		if(txnactPojo.getOriginal_Items_C5().trim().equalsIgnoreCase(transDnPojo.getOriginal_Items_C5().trim())) {

			testcase_TXNACT.log(Status.PASS, "Original_Items_C5 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Original_Items_C5 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Original_Items_C6

		testcase_TXNACT=extentreport.createTest("Verify Original_Items_C6 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Original_Items_C6 is  "+txnactPojo.getOriginal_Items_C6()+"  &  "+"DN Original_Items_C6  is "+transDnPojo.getOriginal_Items_C6());

		if(txnactPojo.getOriginal_Items_C6().trim().equalsIgnoreCase(transDnPojo.getOriginal_Items_C6().trim())) {

			testcase_TXNACT.log(Status.PASS, "Original_Items_C6 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Original_Items_C6 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Original_Items_C7

		testcase_TXNACT=extentreport.createTest("Verify Original_Items_C7 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Original_Items_C7 is  "+txnactPojo.getOriginal_Items_C7()+"  &  "+"DN Original_Items_C7  is "+transDnPojo.getOriginal_Items_C7());

		if(txnactPojo.getOriginal_Items_C7().trim().equalsIgnoreCase(transDnPojo.getOriginal_Items_C7().trim())) {

			testcase_TXNACT.log(Status.PASS, "Original_Items_C7 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Original_Items_C7 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Original_Items_C8

		testcase_TXNACT=extentreport.createTest("Verify Original_Items_C8 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Original_Items_C8 is  "+txnactPojo.getOriginal_Items_C8()+"  &  "+"DN Original_Items_C8  is "+transDnPojo.getOriginal_Items_C8());

		if(txnactPojo.getOriginal_Items_C8().trim().equalsIgnoreCase(transDnPojo.getOriginal_Items_C8().trim())) {

			testcase_TXNACT.log(Status.PASS, "Original_Items_C8 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Original_Items_C8 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Dispensed_C1

		testcase_TXNACT=extentreport.createTest("Verify Dispensed_C1 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Dispensed_C1 is  "+txnactPojo.getDispensed_C1()+"  &  "+"DN Dispensed_C1  is "+transDnPojo.getDispensed_C1());

		if(txnactPojo.getDispensed_C1().trim().equalsIgnoreCase(transDnPojo.getDispensed_C1().trim())) {

			testcase_TXNACT.log(Status.PASS, "Dispensed_C1 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Dispensed_C1 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Dispensed_C2

		testcase_TXNACT=extentreport.createTest("Verify Dispensed_C2 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Dispensed_C2 is  "+txnactPojo.getDispensed_C2()+"  &  "+"DN Dispensed_C2  is "+transDnPojo.getDispensed_C2());

		if(txnactPojo.getDispensed_C2().trim().equalsIgnoreCase(transDnPojo.getDispensed_C2().trim())) {

			testcase_TXNACT.log(Status.PASS, "Dispensed_C2 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Dispensed_C2 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Dispensed_C3

		testcase_TXNACT=extentreport.createTest("Verify Dispensed_C3 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Dispensed_C3 is  "+txnactPojo.getDispensed_C3()+"  &  "+"DN Dispensed_C3  is "+transDnPojo.getDispensed_C3());

		if(txnactPojo.getDispensed_C3().trim().equalsIgnoreCase(transDnPojo.getDispensed_C3().trim())) {

			testcase_TXNACT.log(Status.PASS, "Dispensed_C3 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Dispensed_C3 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Dispensed_C4

		testcase_TXNACT=extentreport.createTest("Verify Dispensed_C4 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Dispensed_C4 is  "+txnactPojo.getDispensed_C4()+"  &  "+"DN Dispensed_C4  is "+transDnPojo.getDispensed_C4());

		if(txnactPojo.getDispensed_C4().trim().equalsIgnoreCase(transDnPojo.getDispensed_C4().trim())) {

			testcase_TXNACT.log(Status.PASS, "Dispensed_C4 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Dispensed_C4 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Dispensed_C5

		testcase_TXNACT=extentreport.createTest("Verify Dispensed_C5 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Dispensed_C5 is  "+txnactPojo.getDispensed_C5()+"  &  "+"DN Dispensed_C5  is "+transDnPojo.getDispensed_C5());

		if(txnactPojo.getDispensed_C5().trim().equalsIgnoreCase(transDnPojo.getDispensed_C5().trim())) {

			testcase_TXNACT.log(Status.PASS, "Dispensed_C5 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Dispensed_C5 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Dispensed_C6

		testcase_TXNACT=extentreport.createTest("Verify Dispensed_C6 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Dispensed_C6 is  "+txnactPojo.getDispensed_C6()+"  &  "+"DN Dispensed_C6  is "+transDnPojo.getDispensed_C6());

		if(txnactPojo.getDispensed_C6().trim().equalsIgnoreCase(transDnPojo.getDispensed_C6().trim())) {

			testcase_TXNACT.log(Status.PASS, "Dispensed_C6 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Dispensed_C6 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Dispensed_C7

		testcase_TXNACT=extentreport.createTest("Verify Dispensed_C7 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Dispensed_C7 is  "+txnactPojo.getDispensed_C7()+"  &  "+"DN Dispensed_C7  is "+transDnPojo.getDispensed_C7());

		if(txnactPojo.getDispensed_C7().trim().equalsIgnoreCase(transDnPojo.getDispensed_C7().trim())) {

			testcase_TXNACT.log(Status.PASS, "Dispensed_C7 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Dispensed_C7 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//Dispensed_C8

		testcase_TXNACT=extentreport.createTest("Verify Dispensed_C8 between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT Dispensed_C8 is  "+txnactPojo.getDispensed_C8()+"  &  "+"DN Dispensed_C8  is "+transDnPojo.getDispensed_C8());

		if(txnactPojo.getDispensed_C8().trim().equalsIgnoreCase(transDnPojo.getDispensed_C8().trim())) {

			testcase_TXNACT.log(Status.PASS, "Dispensed_C8 between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "Dispensed_C8 between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TimeSpentRqstSwitch

		testcase_TXNACT=extentreport.createTest("Verify TimeSpentRqstSwitch between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TimeSpentRqstSwitch is  "+txnactPojo.getTimeSpentRqstSwitch()+"  &  "+"DN TimeSpentRqstSwitch  is "+transDnPojo.getTimeSpentRqstSwitch());

		if(txnactPojo.getTimeSpentRqstSwitch().trim().equalsIgnoreCase(transDnPojo.getTimeSpentRqstSwitch().trim())) {

			testcase_TXNACT.log(Status.PASS, "TimeSpentRqstSwitch between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TimeSpentRqstSwitch between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TimeSpentRespSwitch

		testcase_TXNACT=extentreport.createTest("Verify TimeSpentRespSwitch between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TimeSpentRespSwitch is  "+txnactPojo.getTimeSpentRespSwitch()+"  &  "+"DN TimeSpentRespSwitch  is "+transDnPojo.getTimeSpentRespSwitch());

		if(txnactPojo.getTimeSpentRespSwitch().trim().equalsIgnoreCase(transDnPojo.getTimeSpentRespSwitch().trim())) {

			testcase_TXNACT.log(Status.PASS, "TimeSpentRespSwitch between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TimeSpentRespSwitch between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TimeSpentIssuer

		testcase_TXNACT=extentreport.createTest("Verify TimeSpentIssuer between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TimeSpentIssuer is  "+txnactPojo.getTimeSpentIssuer()+"  &  "+"DN TimeSpentIssuer  is "+transDnPojo.getTimeSpentIssuer());

		if(txnactPojo.getTimeSpentIssuer().trim().equalsIgnoreCase(transDnPojo.getTimeSpentIssuer().trim())) {

			testcase_TXNACT.log(Status.PASS, "TimeSpentIssuer between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TimeSpentIssuer between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TimeSpentRqstQueued

		testcase_TXNACT=extentreport.createTest("Verify TimeSpentRqstQueued between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TimeSpentRqstQueued is  "+txnactPojo.getTimeSpentRqstQueued()+"  &  "+"DN TimeSpentRqstQueued  is "+transDnPojo.getTimeSpentRqstQueued());

		if(txnactPojo.getTimeSpentRqstQueued().trim().equalsIgnoreCase(transDnPojo.getTimeSpentRqstQueued().trim())) {

			testcase_TXNACT.log(Status.PASS, "TimeSpentRqstQueued between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TimeSpentRqstQueued between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TimeSpentRespQueued

		testcase_TXNACT=extentreport.createTest("Verify TimeSpentRespQueued between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TimeSpentRespQueued is  "+txnactPojo.getTimeSpentRespQueued()+"  &  "+"DN TimeSpentRespQueued  is "+transDnPojo.getTimeSpentRespQueued());

		if(txnactPojo.getTimeSpentRespQueued().trim().equalsIgnoreCase(transDnPojo.getTimeSpentRespQueued().trim())) {

			testcase_TXNACT.log(Status.PASS, "TimeSpentRespQueued between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TimeSpentRespQueued between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}


		//TimeSpentAP

		testcase_TXNACT=extentreport.createTest("Verify TimeSpentAP between TXNACT file  & DN Application");
		testcase_TXNACT.log(Status.INFO, "TXN ACT TimeSpentAP is  "+txnactPojo.getTimeSpentAP()+"  &  "+"DN TimeSpentAP  is "+transDnPojo.getTimeSpentAP());

		if(txnactPojo.getTimeSpentAP().trim().equalsIgnoreCase(transDnPojo.getTimeSpentAP().trim())) {

			testcase_TXNACT.log(Status.PASS, "TimeSpentAP between TXNACT file  & DN Application are matched & hence Testcase got Passed");

		}else {

			testcase_TXNACT.log(Status.FAIL, "TimeSpentAP between TXNACT file  & DN Application are not matched & hence Testcase got failed");
		}*/



		extentreport.flush();		

	}




}
