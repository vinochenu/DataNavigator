package fis.TXNACT;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.print.attribute.SetOfIntegerSyntax;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import fis.DataNavigator.DnPojo;
import fis.DataNavigator.DriverInstance;
import fis.PagesDN.AdditionalTabPageDN;
import fis.PagesDN.BBLSegementTabPageDN;
import fis.PagesDN.IntegratedCircuitCardTabPageDN;
import fis.PagesDN.LoginPageDN;
import fis.PagesDN.LongDataTabPageDN;
import fis.PagesDN.TransactionDetailsTabPageDN;
import fis.PagesDN.TransactionSearchPageDN;

public class TXNACT_DN extends DriverInstance{





	TXNACTPojo txnactPojo;
	static DnPojo transDnPojo= DnPojo.getInstance();



	@BeforeTest
	public void loginDN() throws IOException, InterruptedException {

		FileInputStream fileInputStream=new FileInputStream("configDN.properties");
		Properties properties=new Properties();
		properties.load(fileInputStream);
		String appurl=properties.getProperty("ApplicationUrl");
		String username=properties.getProperty("Username");
		String password=properties.getProperty("Password");

		DriverInstance.getdriver();//to use driver



		driver.get(appurl);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);

		// Navigating to DN Login Page

		LoginPageDN login=PageFactory.initElements(driver, LoginPageDN.class);
		login.loginPageDN(username, password);

		System.out.println("login successful");
	}



	@AfterTest
	public void dnLogoff() {

		//driver.quit();

	}

	@Test
	public void  readContentTXNACT() throws IOException, ParseException, InterruptedException 
	{

		try {


			FileReader fileReader=new FileReader("C:\\vinoth\\vinoth-Automation\\FIS_DataNavigator\\TXNACT_ATM_vino_sample.txt");
			BufferedReader bufferedReader=new BufferedReader(fileReader);

			String currentline;
			while((currentline=bufferedReader.readLine())!=null ) {



				String[] data=currentline.split(",");

				if((data[0].contains("FH")) || (data[0].contains("FT")))
				{	
					continue;
				}

				txnactPojo=new TXNACTPojo();

				txnactPojo.setMTI(data[0]);
				txnactPojo.setRECORDSTATUS(data[1]);
				txnactPojo.setPAN(data[2]);
				txnactPojo.setTRAN_TYPE_ID(data[3]);
				txnactPojo.setCUR_TRAN(data[4]);
				txnactPojo.setAMT_TRAN(data[5]);
				txnactPojo.setCUR_RECON_NET(data[6]);
				txnactPojo.setAMT_RECON_NET(data[7]);
				txnactPojo.setCUR_CARD_BILL(data[8]);
				txnactPojo.setAMT_CARD_BILL(data[9]);
				txnactPojo.setTSTAMP_TRANS(data[10]);
				txnactPojo.setF_AMTcb(data[11]);
				txnactPojo.setCNV_RCN_NET_RATE(data[12]);
				txnactPojo.setCNV_RCN_ACQ_RATE(data[13]);
				txnactPojo.setCNV_RCN_ISS_RATE(data[14]);
				txnactPojo.setCNV_CRD_BIL_RATE(data[15]);
				txnactPojo.setSYS_TRACE_AUDIT_NO(data[16]);
				txnactPojo.setTSTAMP_LOCAL(data[17]);
				txnactPojo.setDATE_EFFECTIVE(data[18]);
				txnactPojo.setDATE_EXP(data[19]);
				txnactPojo.setDATE_RECON_NET(data[20]);
				txnactPojo.setDATE_CNV_ACQ(data[21]);
				txnactPojo.setDATE_CNV_ISS(data[22]);
				txnactPojo.setDATE_CAPTURE(data[23]);
				txnactPojo.setCNTRY_RCN_ACQ_INST(data[24]);
				txnactPojo.setCNTRY_RCN_ISS_INST(data[25]);
				txnactPojo.setPOS_CRD_DAT_IN_MOD(data[26]);
				txnactPojo.setPOS_CRDHLDR_A_METH(data[27]);
				txnactPojo.setPOS_OPER_ENV(data[28]);
				txnactPojo.setPOS_CRDHLDR_PRESNT(data[29]);
				txnactPojo.setPOS_CARD_PRES(data[30]);
				txnactPojo.setPOS_CRDHLDR_AUTH(data[31]);
				txnactPojo.setCOUNTRY_ACQ_INST(data[32]);
				txnactPojo.setFUNC_CODE(data[33]);
				txnactPojo.setMSG_RESON_CODE_ACQ(data[34]);
				txnactPojo.setMERCH_TYPE(data[35]);
				txnactPojo.setPOS_CRD_DAT_IN_CAP(data[36]);
				txnactPojo.setPOS_CRDHLDR_AUTH_C(data[37]);
				txnactPojo.setPOS_TERM_OUT_CAP(data[38]);
				txnactPojo.setPOS_CRD_DAT_OT_CAP(data[38]);
				txnactPojo.setPOS_CARD_CAPT_CAP(data[40]);
				txnactPojo.setPOS_PIN_CAPT_CAP(data[41]);
				txnactPojo.setDATE_RECON_ACQ(data[42]);
				txnactPojo.setDATE_RECON_ISS(data[43]);
				txnactPojo.setCUR_TRAN_1(data[44]);
				txnactPojo.setO_AMT_TRAN(data[45]);
				txnactPojo.setCUR_RECON_NET_1(data[46]);
				txnactPojo.setO_AMT_RECON_NET(data[47]);
				txnactPojo.setACQ_REF_NO(data[48]);
				txnactPojo.setINST_ID_RECON_ACQ(data[49]);
				txnactPojo.setINST_ID_RECN_ACQ_B(data[50]);
				txnactPojo.setTRACK_2_DATA(data[51]);
				txnactPojo.setRETRIEVAL_REF_NO(data[52]);
				txnactPojo.setAPPROVAL_CODE(data[53]);
				txnactPojo.setACT_CODE(data[54]);
				txnactPojo.setSRV_GRP_INTCHG_IND(data[55]);
				txnactPojo.setSRV_GRP_SERV_CODE(data[56]);
				txnactPojo.setCARD_ACPT_TERM_ID(data[57]);
				txnactPojo.setCARD_ACPT_ID(data[58]);
				txnactPojo.setCLERK_ID(data[59]);
				txnactPojo.setCARD_ACPT_COUNTRY(data[60]);
				txnactPojo.setCARD_ACPT_PST_CODE(data[61]);
				txnactPojo.setCARD_ACPT_REGION(data[62]);
				txnactPojo.setCARD_ACPT_NAME_LOC(data[63]);
				txnactPojo.setADL_RESP_DATA(data[64]);
				txnactPojo.setF_TYPEn(data[65]);
				txnactPojo.setF_CUR_CODEn(data[66]);
				txnactPojo.setF_AMTn(data[67]);
				txnactPojo.setF_CUR_RECON_ACQn(data[68]);
				txnactPojo.setF_AMT_RECON_ACQn(data[69]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_1(data[70]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_2(data[71]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_3(data[72]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_4(data[73]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_5(data[74]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_6(data[75]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_7(data[76]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_8(data[77]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_9(data[78]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_10(data[79]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_11(data[80]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_12(data[81]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_13(data[82]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_14(data[83]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_15(data[84]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_16(data[85]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_17(data[86]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_18(data[87]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_19(data[88]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_20(data[89]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_21(data[90]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_22(data[91]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_23(data[92]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_24(data[93]);
				txnactPojo.setAfter_F_AMT_RECON_ACQn_25(data[94]);
				txnactPojo.setADL_DATA_PRIV_ACQ(data[95]);
				txnactPojo.setADL_DATA_PRIV_ISS(data[96]);
				txnactPojo.setCVV_CVC_RESULT(data[97]);
				txnactPojo.setCVV2_CVC2_RESULT(data[98]);
				txnactPojo.setCAVV_RESULT(data[99]);
				txnactPojo.setADL_RQST_ACCT_TYPn(data[100]);
				txnactPojo.setADL_RQST_AMTn(data[101]);
				txnactPojo.setADL_RQST_AMT_TYPn(data[102]);
				txnactPojo.setAfter_ADL_RQST_AMT_TYPn_1(data[103]);
				txnactPojo.setAfter_ADL_RQST_AMT_TYPn_2(data[104]);
				txnactPojo.setAfter_ADL_RQST_AMT_TYPn_3(data[105]);
				txnactPojo.setAfter_ADL_RQST_AMT_TYPn_4(data[106]);
				txnactPojo.setAfter_ADL_RQST_AMT_TYPn_5(data[107]);
				txnactPojo.setAfter_ADL_RQST_AMT_TYPn_6(data[108]);
				txnactPojo.setAfter_ADL_RQST_AMT_TYPn_7(data[109]);
				txnactPojo.setAfter_ADL_RQST_AMT_TYPn_8(data[110]);
				txnactPojo.setAfter_ADL_RQST_AMT_TYPn_9(data[111]);
				txnactPojo.setAfter_ADL_RQST_AMT_TYPn_10(data[112]);
				txnactPojo.setAfter_ADL_RQST_AMT_TYPn_11(data[113]);
				txnactPojo.setAfter_ADL_RQST_AMT_TYPn_12(data[114]);
				txnactPojo.setAfter_ADL_RQST_AMT_TYPn_13(data[115]);
				txnactPojo.setAfter_ADL_RQST_AMT_TYPn_14(data[116]);
				txnactPojo.setAfter_ADL_RQST_AMT_TYPn_15(data[117]);
				txnactPojo.setAfter_ADL_RQST_AMT_TYPn_16(data[118]);
				txnactPojo.setAfter_ADL_RQST_AMT_TYPn_17(data[119]);
				txnactPojo.setAfter_ADL_RQST_AMT_TYPn_18(data[120]);
				txnactPojo.setAfter_ADL_RQST_AMT_TYPn_19(data[121]);
				txnactPojo.setAfter_ADL_RQST_AMT_TYPn_20(data[122]);
				txnactPojo.setADL_RQST_CUR_CODEn(data[123]);
				txnactPojo.setODE_MTI(data[124]);
				txnactPojo.setODE_SYS_TRA_AUD_NO(data[125]);
				txnactPojo.setODE_TSTAMP_LOCL_TR(data[126]);
				txnactPojo.setODE_INST_ID_ACQ(data[127]);
				txnactPojo.setAUTH_LCYCLE_TCODE(data[128]);
				txnactPojo.setNET_TERM_ID(data[129]);
				txnactPojo.setRPT_LVL_ID_B(data[130]);
				txnactPojo.setNET_ID_ACQ(data[131]);
				txnactPojo.setNET_ID_ISS(data[132]);
				txnactPojo.setPROC_GRP_ID_ACQ_B(data[133]);
				txnactPojo.setPROC_GRP_ID_ISS_B(data[134]);
				txnactPojo.setPROC_ID_ACQ_B(data[135]);
				txnactPojo.setPROC_ID_ISS_B(data[136]);
				txnactPojo.setFO_TYPEn(data[137]);
				txnactPojo.setFO_CUR_CODEn(data[138]);
				txnactPojo.setFO_AMTn(data[139]);
				txnactPojo.setFO_CUR_RECON_ACQn(data[140]);
				txnactPojo.setFO_AMT_RECON_ACQn(data[141]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_1(data[142]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_2(data[143]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_3(data[144]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_4(data[145]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_5(data[146]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_6(data[147]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_7(data[148]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_8(data[149]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_9(data[150]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_10(data[151]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_11(data[152]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_12(data[153]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_13(data[154]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_14(data[155]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_15(data[156]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_16(data[157]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_17(data[158]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_18(data[159]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_19(data[160]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_20(data[161]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_21(data[162]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_22(data[163]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_23(data[164]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_24(data[165]);
				txnactPojo.setAfter_FO_AMT_RECON_ACQn_25(data[166]);
				txnactPojo.setEXTENDED_PAY_DATA(data[167]);
				txnactPojo.setDATE_ACTION(data[168]);
				txnactPojo.setINST_ID_ISS(data[169]);
				txnactPojo.setINST_ID_ACQ(data[170]);
				txnactPojo.setREF_DATA_ISS_FMT(data[171]);
				txnactPojo.setREF_DATA_ISS(data[172]);
				txnactPojo.setCUR_RECON_ACQ(data[173]);
				txnactPojo.setAMT_RECON_ACQ(data[174]);
				txnactPojo.setCUR_RECON_ISS(data[175]);
				txnactPojo.setAMT_RECON_ISS(data[176]);
				txnactPojo.setPAYEE(data[177]);
				txnactPojo.setINST_ID_RECN_ISS_B(data[178]);
				txnactPojo.setINST_ID_RECON_ISS(data[179]);
				txnactPojo.setACCT_ID_1(data[180]);
				txnactPojo.setACCT_ID_2(data[181]);
				txnactPojo.setTRAN_DESC(data[182]);
				txnactPojo.setTRAN_DISPOSITION(data[183]);
				txnactPojo.setAUTH_BY(data[184]);
				txnactPojo.setTERM_CLASS(data[185]);
				txnactPojo.setTRAN_CLASS(data[186]);
				txnactPojo.setCARD_OWNER(data[187]);
				txnactPojo.setCARD_TYPE(data[188]);
				txnactPojo.setTRAN_UNIQUE_DATA(data[189]);
				txnactPojo.setACQ_ROUTING_NO(data[190]);
				txnactPojo.setISS_ROUTING_NO(data[191]);
				txnactPojo.setTRANS_ROUTING_NO(data[192]);
				txnactPojo.setDEST_ROUTING_NO(data[193]);
				txnactPojo.setAUTH_LCYCLE_TRACE(data[194]);
				txnactPojo.setSTANDIN_ACT(data[195]);
				txnactPojo.setADL_DATA_NATIONAL(data[196]);
				txnactPojo.setREF_DATA_ACQ(data[197]);
				txnactPojo.setADL_RESP_AMT_TYPn(data[198]);
				txnactPojo.setADL_RESP_AMTn(data[199]);
				txnactPojo.setAfter_ADL_RESP_AMTn_1(data[200]);
				txnactPojo.setAfter_ADL_RESP_AMTn_2(data[201]);
				txnactPojo.setAfter_ADL_RESP_AMTn_3(data[202]);
				txnactPojo.setAfter_ADL_RESP_AMTn_4(data[203]);
				txnactPojo.setAfter_ADL_RESP_AMTn_5(data[204]);
				txnactPojo.setAfter_ADL_RESP_AMTn_6(data[205]);
				txnactPojo.setAfter_ADL_RESP_AMTn_7(data[206]);
				txnactPojo.setAfter_ADL_RESP_AMTn_8(data[207]);
				txnactPojo.setAfter_ADL_RESP_AMTn_9(data[208]);
				txnactPojo.setAfter_ADL_RESP_AMTn_10(data[209]);
				txnactPojo.setAfter_ADL_RESP_AMTn_11(data[210]);
				txnactPojo.setAfter_ADL_RESP_AMTn_12(data[211]);
				txnactPojo.setAfter_ADL_RESP_AMTn_13(data[212]);
				txnactPojo.setAfter_ADL_RESP_AMTn_14(data[213]);
				txnactPojo.setAfter_ADL_RESP_AMTn_15(data[214]);
				txnactPojo.setAfter_ADL_RESP_AMTn_16(data[215]);
				txnactPojo.setAfter_ADL_RESP_AMTn_17(data[216]);
				txnactPojo.setAfter_ADL_RESP_AMTn_18(data[217]);
				txnactPojo.setAfter_ADL_RESP_AMTn_19(data[218]);
				txnactPojo.setAfter_ADL_RESP_AMTn_20(data[219]);
				txnactPojo.setADL_RESP_ACCT_TYPn(data[220]);
				txnactPojo.setADL_RESP_CUR_CODEn(data[221]);
				txnactPojo.setO_AMT_RECON_ACQ(data[222]);
				txnactPojo.setRECV_PROXY_ID(data[223]);
				txnactPojo.setSENDER_PROXY_ID(data[224]);
				txnactPojo.setRECV_PROXY_TYPE(data[225]);
				txnactPojo.setSENDER_PROXY_TYPE(data[226]);
				txnactPojo.setSENDER_TAX_ID(data[227]);
				txnactPojo.setRECV_TAX_ID(data[228]);
				txnactPojo.setVAT_RATE(data[229]);
				txnactPojo.setVAT(data[230]);
				txnactPojo.setWHT_TAX_RATE(data[231]);
				txnactPojo.setWHT_TAX(data[232]);
				txnactPojo.setWHT_TAX_COND(data[233]);
				txnactPojo.setSENDER_REF_NO(data[234]);
				txnactPojo.setTRAN_REF_NO(data[235]);
				txnactPojo.setREF_NO(data[236]);
				txnactPojo.setBBL_REF_NO(data[237]);
				txnactPojo.setFROM_ACCT_NAME(data[238]);
				txnactPojo.setTO_ACCT_NAME(data[239]);
				txnactPojo.setTO_ACCT_DISP_NAME(data[240]);
				txnactPojo.setBBL_FILLER_1(data[241]);
				txnactPojo.setBBL_FILLER_2(data[242]);
				txnactPojo.setTAX_INVOICE(data[243]);
				txnactPojo.setTYPE_OF_INCOME(data[244]);
				txnactPojo.setEDC_NUMBER(data[245]);
				txnactPojo.setBILL_REFERENCE(data[246]);
				txnactPojo.setBPDUE_RTPEXP_DATE(data[247]);
				txnactPojo.setCREDIT_NOTIF_REF(data[248]);
				txnactPojo.setBP_URL(data[249]);
				txnactPojo.setSENDER_COMP_TAX_ID(data[250]);
				txnactPojo.setSENDER_COMP_ACCT_NO(data[251]);
				txnactPojo.setRECV_COMP_TAX_ID(data[252]);
				txnactPojo.setRECV_COMP_ACCT_NO(data[253]);
				txnactPojo.setCOMPANY_CODE(data[254]);
				txnactPojo.setSERVICE_CODE(data[255]);
				txnactPojo.setFLAGS(data[256]);
				txnactPojo.setBILL_REFERENCE2(data[257]);
				txnactPojo.setUSER_DATA_1(data[258]);
				txnactPojo.setUSER_DATA_2(data[259]);
				txnactPojo.setUSER_DATA_3(data[260]);
				txnactPojo.setUSER_DATA_4(data[261]);
				txnactPojo.setUSER_DATA_5(data[262]);
				txnactPojo.setPAYMENT_1(data[263]);
				txnactPojo.setPAYMENT_2(data[264]);
				txnactPojo.setPAYMENT_3(data[265]);
				txnactPojo.setSMS_FEE(data[266]);
				txnactPojo.setSMS_MOBILE(data[267]);
				txnactPojo.setOTP(data[268]);
				txnactPojo.setACCT_INFO_1(data[269]);
				txnactPojo.setACCT_INFO_2(data[270]);
				txnactPojo.setBBL_FILLER_3(data[271]);
				txnactPojo.setFROM_FUND_CODE(data[272]);
				txnactPojo.setTO_FUND_CODE(data[273]);
				txnactPojo.setUNIT(data[274]);
				txnactPojo.setUNIT_PRICE(data[275]);
				txnactPojo.setBOND_YIELD(data[276]);
				txnactPojo.setSURCHARGE_FEE(data[277]);
				txnactPojo.setEXT_FROM_ACCT_TYPE(data[278]);
				txnactPojo.setEXT_TO_ACCT_TYPE(data[279]);
				txnactPojo.setFROM_ACCT_DISP_NAME(data[280]);
				txnactPojo.setPRIVATE_DATA(data[281]);
				txnactPojo.setTERMINAL_TRACE(data[282]);
				txnactPojo.setQRC_VOUCHER(data[283]);
				txnactPojo.setBBL_FILLER_4(data[284]);
				txnactPojo.setCDM_DATA(data[285]);
				txnactPojo.setBBL_FILLER_5(data[286]);
				txnactPojo.setCARD_SEQ_NO(data[287]);




				//Transaction type group id

				String txntype=txnactPojo.getTRAN_TYPE_ID().substring(0,2);
				System.out.println(txntype);

				//Date split up
				String txndate=txnactPojo.getTSTAMP_TRANS().substring(0,8);
				System.out.println(txndate);


				//Date format change from TXNACT to DN app
				DateFormat outputFormat = new SimpleDateFormat("MM/dd/yyyy");// 12/18/2019
				DateFormat inputFormat = new SimpleDateFormat("yyyyMMdd");//   20191218
				Date date=inputFormat.parse(txndate);

				//Inputs
				String DnDate=outputFormat.format(date);// Date
				String acquirerDN=txnactPojo.getINST_ID_ACQ();//Acquirer		
				String refnumDN=txnactPojo.getREF_NO();//reference no


				// Navigating to Transaction Search Page

				TransactionSearchPageDN searchTransaction=PageFactory.initElements(driver, TransactionSearchPageDN.class);
				searchTransaction.searchTransactionPageDN(DnDate, acquirerDN, refnumDN);


				//Transaction Details Tab Data
				TransactionDetailsTabPageDN transactiondetailsPageDN=PageFactory.initElements(driver, TransactionDetailsTabPageDN.class);
				System.out.println("****************Transaction Details Data**************");
				transactiondetailsPageDN.transactionDetailsPageDN();



				//BBLDNSegment Tab Data
				BBLSegementTabPageDN bblSegmentTabPageDN=PageFactory.initElements(driver, BBLSegementTabPageDN.class);
				System.out.println("****************BBL DN Segment Tab Data**************");
				bblSegmentTabPageDN.bblDNSegmentPageDN();

				//IntegratedCircuitCard Tab Data

				IntegratedCircuitCardTabPageDN integratedCircuitCardTabPageDN=PageFactory.initElements(driver, IntegratedCircuitCardTabPageDN.class);
				System.out.println("****************IntegratedCircuitCard Tab Data**************");
				integratedCircuitCardTabPageDN.integratedCircuitcardTabPageDN();



				//Long Tab data

				LongDataTabPageDN longDataTabPageDN=PageFactory.initElements(driver, LongDataTabPageDN.class);
				System.out.println("****************Long Tab Data**************");
				longDataTabPageDN.longDataTabPageDN();

				//AdditionalTabData

				AdditionalTabPageDN additionalTabPageDN=PageFactory.initElements(driver, AdditionalTabPageDN.class);
				System.out.println("****************Additional Tab Data**************");
				additionalTabPageDN.additionalTabPageDN();


				//TXNACT Validation


				TXNACT_Validation txnact_Validation=new TXNACT_Validation(txnactPojo);
				System.out.println("****************DN & TXNACT Validation**************");
				txnact_Validation.txnact_validation();



			}


		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}




	}
}




