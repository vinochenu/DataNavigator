package fis.TXNACT;

import java.text.DateFormat;
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
	ExtentReports extentreport;
	ExtentHtmlReporter htmlreporter;
	ExtentTest testcase_TXNACT;

	public void txnact_validation() {


		try {

			extentreport=new ExtentReports();
			htmlreporter=new ExtentHtmlReporter("TXNACTFileValidation.html");
			extentreport.attachReporter(htmlreporter);


			//Transaction Search

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





























































			extentreport.flush();	

		} 

		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
