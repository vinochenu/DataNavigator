package fis.PagesDN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import fis.DataNavigator.DnPojo;

public class AdditionalTabPageDN {
	
	static DnPojo transDnPojo= DnPojo.getInstance();
	
	WebDriver driver;
	public AdditionalTabPageDN(WebDriver driver1) {
		this.driver=driver1;
		
	}
	
	@FindBy(how=How.ID,using="ui-id-2")
	WebElement AdditionalTabData;
	@FindBy(how=How.XPATH,using="//*[@dntitle='posDataCardPres']")
	WebElement TAI_Present_L;
	@FindBy(how=How.XPATH,using="//*[text()='Capture Capability:']/following::td[1]")
	WebElement TAI_Capture_Capability;
	@FindBy(how=How.XPATH,using="//*[text()='Input Capability:']/following::td[1]")
	WebElement TAI_Input_Capability;
	@FindBy(how=How.XPATH,using="//*[text()='Input Mode:']/following::td[1]")
	WebElement TAI_Input_Mode;
	@FindBy(how=How.XPATH,using="//*[text()='Output Capability:']/following::td[1]")
	WebElement TAI_Output_Capability;
	@FindBy(how=How.XPATH,using="//*[text()='PIN Capture Capability:']/following::td[1]")
	WebElement TAI_PIN_Capture_Capability;
	@FindBy(how=How.XPATH,using="//*[@dntitle='posDataCardholderPres']")
	WebElement TAI_Present_R;
	@FindBy(how=How.XPATH,using="//*[text()='Authentication Capability:']/following::td[1]")
	WebElement TAI_Authentication_Capability;
	@FindBy(how=How.XPATH,using="//*[text()='Authentication Entity:']/following::td[1]")
	WebElement TAI_Authentication_Entity;
	@FindBy(how=How.XPATH,using="//*[text()='Authentication Method:']/following::td[1]")
	WebElement TAI_Authentication_Method;
	@FindBy(how=How.XPATH,using="//*[text()='Terminal Output Capability:']/following::td[1]")
	WebElement TAI_TerminalOutput_Capability;
	@FindBy(how=How.XPATH,using="//*[text()='Operating Environment:']/following::td[1]")
	WebElement TAI_Operating_Environment;
	@FindBy(how=How.XPATH,using="//*[text()='Account Qualifier 1:']/following::td[1]")
	WebElement CII_AccountQualifier1;
	@FindBy(how=How.XPATH,using="//*[text()='Account Qualifier 2:']/following::td[1]")
	WebElement CII_AccountQualifier2;
	@FindBy(how=How.XPATH,using="//*[text()='Message Type Identifier:']/following::td[1]")
	WebElement CII_MessageTypeIdentifier;
	@FindBy(how=How.XPATH,using="//*[text()='Financial Type:']/following::td[1]")
	WebElement CII_FinancialType;
	@FindBy(how=How.XPATH,using="//*[text()='Card Type:']/following::td[1]")
	WebElement CII_CardType;
	@FindBy(how=How.XPATH,using="//*[text()='Card Owner ID:']/following::td[1]")
	WebElement CII_CardOwnerID;
	@FindBy(how=How.XPATH,using="//*[text()='Service Code:']/following::td[1]")
	WebElement CII_ServiceCode;
	@FindBy(how=How.XPATH,using="//*[text()='Program ID:']/following::td[1]")
	WebElement CII_ProgramID;
	@FindBy(how=How.XPATH,using="//*[text()='Host Received:']/following::td[1]")
	WebElement FI_HostReceived;
	@FindBy(how=How.XPATH,using="//*[text()='Host Sent:']/following::td[1]")
	WebElement FI_HostSent;
	@FindBy(how=How.XPATH,using="//*[text()='AP Flag:']/following::td[1]")
	WebElement FI_APFlag;
	@FindBy(how=How.XPATH,using="//*[text()='Reversed By:']/following::td[1]")
	WebElement FI_ReversedBy;
	@FindBy(how=How.XPATH,using="//*[text()='Platform Product ID:']/following::td[1]")
	WebElement FI_PlatformProductID;
	@FindBy(how=How.XPATH,using="//*[text()='OAR Request:']/following::td[1]")
	WebElement FI_OARRequest;
    /*@FindBy(how=How.XPATH,using="//*[text()='Card Acceptor Name Location Formatted:']/following::td[1]")
	WebElement FI_CardAcceptorNameLocation_Formatted;*/
	@FindBy(how=How.XPATH,using="//*[text()='Pin Data Format:']/following::td[1]")
	WebElement AF_PinDataFormat;
	@FindBy(how=How.XPATH,using="//*[text()='PIN Results:']/following::td[1]")
	WebElement AF_PINResults;
	@FindBy(how=How.XPATH,using="//*[text()='PMC Error:']/following::td[1]")
	WebElement AF_PMCError;
	@FindBy(how=How.XPATH,using="//*[text()='Standin Option:']/following::td[1]")
	WebElement AF_StandinOption;
	@FindBy(how=How.XPATH,using="//*[text()='Standin Action:']/following::td[1]")
	WebElement AF_StandinAction;
	@FindBy(how=How.XPATH,using="//*[text()='AP Approval Code:']/following::td[1]")
	WebElement AP_ApprovalCode;
	@FindBy(how=How.XPATH,using="//*[text()='AP Card Group:']/following::td[1]")
	WebElement AP_CardGroup;
	@FindBy(how=How.XPATH,using="//*[text()='AP Data:']/following::td[1]")
	WebElement AP_Data;
	@FindBy(how=How.XPATH,using="//*[text()='AP Error:']/following::td[1]")
	WebElement AP_Error;
	@FindBy(how=How.XPATH,using="//*[text()='AP Error Trace Local:']/following::td[1]")
	WebElement AP_ErrorTraceLocal;
	@FindBy(how=How.XPATH,using="//*[text()='AP Reject Reason:']/following::td[1]")
	WebElement AP_RejectReason;
	@FindBy(how=How.XPATH,using="//*[@dntitle='instIdRecnAcqB']")
	WebElement SBA_ACQ_ReconInstID;
	@FindBy(how=How.XPATH,using="//*[@dntitle='procGrpIdAcqB']")
	WebElement SBA_ACQ_ProcessorGroupID;
	@FindBy(how=How.XPATH,using="//*[@dntitle='procIdAcqB']")
	WebElement SBA_ACQ_ProcessorID;
	@FindBy(how=How.XPATH,using="//*[text()='Reporting Level ID:']/following::td[1]")
	WebElement SBA_ACQ_ReportingLevelID;
	@FindBy(how=How.XPATH,using="//*[text()='Merchant Tier ID:']/following::td[1]")
	WebElement SBA_ACQ_MerchantTierID;
	@FindBy(how=How.XPATH,using="//*[@dntitle='instIdRecnIssB']")
	WebElement SBA_ISS_ReconInstID;
	@FindBy(how=How.XPATH,using="//*[@dntitle='procGrpIdIssB']")
	WebElement SBA_ISS_ProcessorGroupID;
	@FindBy(how=How.XPATH,using="//*[@dntitle='procIdIssB']")
	WebElement SBA_ISS_ProcessorID;
	@FindBy(how=How.XPATH,using="//*[text()='Dynamic CVV Result:']/following::td[1]")
	WebElement UTA_DynamicCVVResult;
	@FindBy(how=How.XPATH,using="//*[text()='ATC Results:']/following::td[1]")
	WebElement UTA_ATCResults;
	@FindBy(how=How.XPATH,using="//*[text()='CVV2/CVC2 Result:']/following::td[1]")
	WebElement UTA_CVV2_CVC2Result;
	@FindBy(how=How.XPATH,using="//*[text()='Track 1 Name Matching:']/following::td[1]")
	WebElement UTA_Track1_NameMatching;
	@FindBy(how=How.XPATH,using="//*[text()='CVV1/CVC1 Result:']/following::td[1]")
	WebElement UTA_CVV1_CVC1Result;
	@FindBy(how=How.XPATH,using="//*[text()='AVS Result:']/following::td[1]")
	WebElement UTA_AVSResult;
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@dntitle,'acqrReconAmt')]")
	WebElement F1_ACQ_ReconAmount;
	@FindBy(how=How.XPATH,using="//*[contains(@dntitle,'acqrReconCurCode')]")
	WebElement F1_ACQ_ReconCurrency;
	@FindBy(how=How.XPATH,using="//*[contains(@dntitle,'acqrReconConvRate')]")
	WebElement F1_ACQ_ConversionRate;
	@FindBy(how=How.XPATH,using="//*[contains(@dntitle,'issrReconAmt')]")
	WebElement F1_ISS_ReconAmount;
	@FindBy(how=How.XPATH,using="//*[contains(@dntitle,'issrReconCurCode')]")
	WebElement F1_ISS_ReconCurrency;
	@FindBy(how=How.XPATH,using="//*[contains(@dntitle,'issrReconConvRate')]")
	WebElement F1_ISS_ConversionRate;
	@FindBy(how=How.XPATH,using="//*[text()='Amount:']/following::td[1]")
	WebElement F1_Amount;
	@FindBy(how=How.XPATH,using="//*[text()='Currency:']/following::td[1]")
	WebElement F1_Currency;
	@FindBy(how=How.XPATH,using="//*[text()='Type:']/following::td[1]")
	WebElement F1_Type;
	@FindBy(how=How.XPATH,using="//*[text()='Indicator:']/following::td[1]")
	WebElement F1_Indicator;
	@FindBy(how=How.XPATH,using="//*[text()='Memo:']/following::td[1]")
	WebElement F1_Memo;
	@FindBy(how=How.XPATH,using="//*[text()='Network Recon Amount:']/following::td[1]")
	WebElement F1_NetworkReconAmount;
	
	@FindBy(how=How.XPATH,using="//*[text()='Recon Amount:']/following::div[2]/following::tr[1]/following::td[2]")
	WebElement F2_ACQ_ReconAmount;
	@FindBy(how=How.XPATH,using="//*[text()='Recon Currency:']/following::div[2]/following::tr[2]/following::td[2]")
	WebElement F2_ACQ_ReconCurrency;
	@FindBy(how=How.XPATH,using="//*[text()='Conversion Rate:']/following::div[2]/following::tr[3]/following::td[2]")
	WebElement F2_ACQ_ConversionRate;
	@FindBy(how=How.XPATH,using="//*[text()='Recon Amount:']/following::div[2]/following::tr[5]/following::td[2]")
	WebElement F2_ISS_ReconAmount;
	@FindBy(how=How.XPATH,using="//*[text()='Recon Currency:']/following::div[2]/following::tr[6]/following::td[2]")
	WebElement F2_ISS_ReconCurrency;
	@FindBy(how=How.XPATH,using="//*[text()='Recon Currency:']/following::div[2]/following::tr[7]/following::td[2]")
	WebElement F2_ISS_ConversionRate;
	@FindBy(how=How.XPATH,using="//*[text()='Amount:']/following::div[2]/following::tr[1]/child::td[4]")
	WebElement F2_Amount;
	@FindBy(how=How.XPATH,using="//*[text()='Currency:']/following::div[2]/following::tr[2]/child::td[4]")
	WebElement F2_Currency;
	@FindBy(how=How.XPATH,using="//*[text()='Type:']/following::div[2]/following::tr[3]/child::td[4]")
	WebElement F2_Type;
	@FindBy(how=How.XPATH,using="//*[text()='Indicator:']/following::div[2]/following::tr[4]/child::td[4]")
	WebElement F2_Indicator;
	@FindBy(how=How.XPATH,using="//*[text()='Memo:']/following::div[2]/following::tr[5]/child::td[4]")
	WebElement F2_Memo;
	@FindBy(how=How.XPATH,using="//*[text()='Network Recon Amount:']/following::div[2]/following::tr[6]/following::td[4]")
	WebElement F2_NetworkReconAmount;
	
	@FindBy(how=How.XPATH,using="//*[contains(@dntitle,'acqrReconAmt')]/following::div[5]/following::tr[1]/following::td[2]")
	WebElement F3_ACQ_ReconAmount;
	@FindBy(how=How.XPATH,using="//*[contains(@dntitle,'acqrReconAmt')]/following::div[4]/following::tr[2]/following::td[2]")
	WebElement F3_ACQ_ReconCurrency;
	@FindBy(how=How.XPATH,using="//*[contains(@dntitle,'acqrReconAmt')]/following::div[3]/following::tr[3]/following::td[2]")
	WebElement F3_ACQ_ConversionRate;
	@FindBy(how=How.XPATH,using="//*[contains(@dntitle,'acqrReconAmt')]/following::div[3]/following::tr[5]/following::td[2]")
	WebElement F3_ISS_ReconAmount;
	@FindBy(how=How.XPATH,using="//*[contains(@dntitle,'acqrReconAmt')]/following::div[3]/following::tr[6]/following::td[2]")
	WebElement F3_ISS_ReconCurrency;
	@FindBy(how=How.XPATH,using="//*[contains(@dntitle,'acqrReconAmt')]/following::div[3]/following::tr[7]/following::td[2]")
	WebElement F3_ISS_ConversionRate;
	@FindBy(how=How.XPATH,using="//*[contains(@dntitle,'acqrReconAmt')]/following::div[5]/following::tr[1]/child::td[4]")
	WebElement F3_Amount;
	@FindBy(how=How.XPATH,using="//*[contains(@dntitle,'acqrReconAmt')]/following::div[5]/following::tr[2]/child::td[4]")
	WebElement F3_Currency;
	@FindBy(how=How.XPATH,using="//*[contains(@dntitle,'acqrReconAmt')]/following::div[5]/following::tr[3]/child::td[4]")
	WebElement F3_Type;
	@FindBy(how=How.XPATH,using="//*[contains(@dntitle,'acqrReconAmt')]/following::div[5]/following::tr[4]/child::td[4]")
	WebElement F3_Indicator;
	@FindBy(how=How.XPATH,using="//*[contains(@dntitle,'acqrReconAmt')]/following::div[5]/following::tr[5]/child::td[4]")
	WebElement F3_Memo;
	@FindBy(how=How.XPATH,using="//*[text()='Network Recon Amount:']/following::div[3]/following::tr[6]/following::td[4]")
	WebElement F3_NetworkReconAmount;
	
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems0']")
	WebElement Denomination_C1;
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems1']")
	WebElement Denomination_C2;
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems2']")
	WebElement Denomination_C3;
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems3']")
	WebElement Denomination_C4;
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems4']")
	WebElement Denomination_C5;
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems5']")
	WebElement Denomination_C6;
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems6']")
	WebElement Denomination_C7;
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems7']")
	WebElement Denomination_C8;
	
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems7']/following::tr[1]/child::td[2]")
	WebElement Original_Items_C1;
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems7']/following::tr[1]/child::td[3]")
	WebElement Original_Items_C2;
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems7']/following::tr[1]/child::td[4]")
	WebElement Original_Items_C3;
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems7']/following::tr[1]/child::td[5]")
	WebElement Original_Items_C4;
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems7']/following::tr[1]/child::td[6]")
	WebElement Original_Items_C5;
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems7']/following::tr[1]/child::td[7]")
	WebElement Original_Items_C6;
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems7']/following::tr[1]/child::td[8]")
	WebElement Original_Items_C7;
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems7']/following::tr[1]/child::td[9]")
	WebElement Original_Items_C8;
	
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems7']/following::tr[1]/following::td[2]")
	WebElement Dispensed_C1;
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems7']/following::tr[1]/following::td[3]")
	WebElement Dispensed_C2;
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems7']/following::tr[1]/following::td[4]")
	WebElement Dispensed_C3;
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems7']/following::tr[1]/following::td[5]")
	WebElement Dispensed_C4;
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems7']/following::tr[1]/following::td[6]")
	WebElement Dispensed_C5;
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems7']/following::tr[1]/following::td[7]")
	WebElement Dispensed_C6;
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems7']/following::tr[1]/following::td[8]")
	WebElement Dispensed_C7;
	@FindBy(how=How.XPATH,using="//*[@dntitle='canOrigNbrItems7']/following::tr[1]/following::td[9]")
	WebElement Dispensed_C8;
	
	@FindBy(how=How.XPATH,using="//*[@dntitle='timeSpentRqstSwitch']")
	WebElement TimeSpentRqstSwitch;
	@FindBy(how=How.XPATH,using="//*[@dntitle='timeSpentRespSwitch']")
	WebElement TimeSpentRespSwitch;
	@FindBy(how=How.XPATH,using="//*[@dntitle='timeSpentIssr']")
	WebElement TimeSpentIssuer;
	@FindBy(how=How.XPATH,using="//*[@dntitle='timeSpentRqstQueued']")
	WebElement TimeSpentRqstQueued;
	@FindBy(how=How.XPATH,using="//*[@dntitle='timeSpentRespQueued']")
	WebElement TimeSpentRespQueued;
	@FindBy(how=How.XPATH,using="//*[@dntitle='timeSpentAP']")
	WebElement TimeSpentAP;
	
	
	

public void additionalTabPageDN() {
	
	
	AdditionalTabData.click();
	
	//TAI-> Terminal Authorization Indicators
	
	String tAI_Present_L=TAI_Present_L.getText();

	transDnPojo.setTAI_Present_L(tAI_Present_L);
	System.out.println("tAI_Present_L is "+transDnPojo.getTAI_Present_L());
	
	String tAI_Capture_Capability=TAI_Capture_Capability.getText();

	transDnPojo.setTAI_Capture_Capability(tAI_Capture_Capability);
	System.out.println("tAI_Capture_Capability is "+transDnPojo.getTAI_Capture_Capability());
	
	
	String tAI_Input_Capability=TAI_Input_Capability.getText();

	transDnPojo.setTAI_Input_Capability(tAI_Input_Capability);
	System.out.println("tAI_Input_Capability is "+transDnPojo.getTAI_Input_Capability());
	
	String tAI_Input_Mode=TAI_Input_Mode.getText();

	transDnPojo.setTAI_Input_Mode(tAI_Input_Mode);
	System.out.println("tAI_Input_Mode is "+transDnPojo.getTAI_Input_Mode());
	
	String tAI_Output_Capability=TAI_Output_Capability.getText();

	transDnPojo.setTAI_Output_Capability(tAI_Output_Capability);
	System.out.println("tAI_Output_Capability is "+transDnPojo.getTAI_Output_Capability());
	
	String tAI_PIN_Capture_Capability=TAI_PIN_Capture_Capability.getText();

	transDnPojo.setTAI_PIN_Capture_Capability(tAI_PIN_Capture_Capability);
	System.out.println("tAI_PIN_Capture_Capability is "+transDnPojo.getTAI_PIN_Capture_Capability());
	
	String tAI_Present_R=TAI_Present_R.getText();

	transDnPojo.setTAI_Present_R(tAI_Present_R);
	System.out.println("tAI_Present_R is "+transDnPojo.getTAI_Present_R());
	
	String tAI_Authentication_Capability=TAI_Authentication_Capability.getText();

	transDnPojo.setTAI_Authentication_Capability(tAI_Authentication_Capability);
	System.out.println("tAI_Authentication_Capability is "+transDnPojo.getTAI_Authentication_Capability());
	
	String tAI_Authentication_Entity=TAI_Authentication_Entity.getText();

	transDnPojo.setTAI_Authentication_Entity(tAI_Authentication_Entity);
	System.out.println("tAI_Authentication_Entity is "+transDnPojo.getTAI_Authentication_Entity());
	
	String tAI_Authentication_Method=TAI_Authentication_Method.getText();

	transDnPojo.setTAI_Authentication_Method(tAI_Authentication_Method);
	System.out.println("tAI_Authentication_Method is "+transDnPojo.getTAI_Authentication_Method());
	
	String tAI_TerminalOutput_Capability=TAI_TerminalOutput_Capability.getText();

	transDnPojo.setTAI_TerminalOutput_Capability(tAI_TerminalOutput_Capability);
	System.out.println("tAI_TerminalOutput_Capability is "+transDnPojo.getTAI_TerminalOutput_Capability());
	

	String tAI_Operating_Environment=TAI_Operating_Environment.getText();

	transDnPojo.setTAI_Operating_Environment(tAI_Operating_Environment);
	System.out.println("tAI_Operating_Environment is "+transDnPojo.getTAI_Operating_Environment());
	
	//CII-> Card Identifier Information
	
	String cII_AccountQualifier1=CII_AccountQualifier1.getText();

	transDnPojo.setCII_AccountQualifier1(cII_AccountQualifier1);
	System.out.println("cII_AccountQualifier1 is "+transDnPojo.getCII_AccountQualifier1());
	
	String cII_AccountQualifier2=CII_AccountQualifier2.getText();

	transDnPojo.setCII_AccountQualifier2(cII_AccountQualifier2);
	System.out.println("cII_AccountQualifier2 is "+transDnPojo.getCII_AccountQualifier2());
	
	String cII_MessageTypeIdentifier=CII_MessageTypeIdentifier.getText();

	transDnPojo.setCII_MessageTypeIdentifier(cII_MessageTypeIdentifier);
	System.out.println("cII_MessageTypeIdentifier is "+transDnPojo.getCII_MessageTypeIdentifier());
	
	String cII_FinancialType=CII_FinancialType.getText();

	transDnPojo.setCII_FinancialType(cII_FinancialType);
	System.out.println("cII_FinancialType is "+transDnPojo.getCII_FinancialType());
	
	String cII_CardType=CII_CardType.getText();

	transDnPojo.setCII_CardType(cII_CardType);
	System.out.println("cII_CardType is "+transDnPojo.getCII_CardType());
	
	String cII_CardOwnerID=CII_CardOwnerID.getText();

	transDnPojo.setCII_CardOwnerID(cII_CardOwnerID);
	System.out.println("cII_CardOwnerID is "+transDnPojo.getCII_CardOwnerID());
	
	
	String cII_ServiceCode=CII_ServiceCode.getText();

	transDnPojo.setCII_ServiceCode(cII_ServiceCode);
	System.out.println("cII_ServiceCode is "+transDnPojo.getCII_ServiceCode());
	

	String cII_ProgramID=CII_ProgramID.getText();

	transDnPojo.setCII_ProgramID(cII_ProgramID);
	System.out.println("cII_ProgramID is "+transDnPojo.getCII_ProgramID());
	
	//FI-> Flag Information
	
	String fI_HostReceived=FI_HostReceived.getText();

	transDnPojo.setFI_HostReceived(fI_HostReceived);
	System.out.println("fI_HostReceived is "+transDnPojo.getFI_HostReceived());
	
	
	String fI_HostSent=FI_HostSent.getText();

	transDnPojo.setFI_HostSent(fI_HostSent);
	System.out.println("fI_HostSent is "+transDnPojo.getFI_HostSent());
	

	String fI_APFlag=FI_APFlag.getText();

	transDnPojo.setFI_APFlag(fI_APFlag);
	System.out.println("fI_APFlag is "+transDnPojo.getFI_APFlag());
	

	String fI_ReversedBy=FI_ReversedBy.getText();

	transDnPojo.setFI_ReversedBy(fI_ReversedBy);
	System.out.println("fI_ReversedBy is "+transDnPojo.getFI_ReversedBy());
	
	String fI_PlatformProductID=FI_PlatformProductID.getText();

	transDnPojo.setFI_PlatformProductID(fI_PlatformProductID);
	System.out.println("fI_PlatformProductID is "+transDnPojo.getFI_PlatformProductID());
	
	String fI_OARRequest=FI_OARRequest.getText();

	transDnPojo.setFI_OARRequest(fI_OARRequest);
	System.out.println("FI_OARRequest is "+transDnPojo.getFI_OARRequest());
	
	/*String fI_CardAcceptorNameLocation_Formatted=FI_CardAcceptorNameLocation_Formatted.getText();

	transDnPojo.setFI_CardAcceptorNameLocation_Formatted(fI_CardAcceptorNameLocation_Formatted);
	System.out.println("fI_CardAcceptorNameLocation_Formatted is "+transDnPojo.getFI_CardAcceptorNameLocation_Formatted());*/
	

	//AF-> Additional Flags
	
	String aF_PinDataFormat=AF_PinDataFormat.getText();

	transDnPojo.setAF_PinDataFormat(aF_PinDataFormat);
	System.out.println("aF_PinDataFormat is "+transDnPojo.getAF_PinDataFormat());
	
	String aF_PINResults=AF_PINResults.getText();

	transDnPojo.setAF_PINResults(aF_PINResults);
	System.out.println("aF_PINResults is "+transDnPojo.getAF_PINResults());
	
	
	String aF_PMCError=AF_PMCError.getText();

	transDnPojo.setAF_PMCError(aF_PMCError);
	System.out.println("aF_PMCError is "+transDnPojo.getAF_PMCError());
	
	String aF_StandinOption=AF_StandinOption.getText();

	transDnPojo.setAF_StandinOption(aF_StandinOption);
	System.out.println("aF_StandinOption is "+transDnPojo.getAF_StandinOption());
	
	String aF_StandinAction=AF_StandinAction.getText();

	transDnPojo.setAF_StandinAction(aF_StandinAction);
	System.out.println("aF_StandinAction is "+transDnPojo.getAF_StandinAction());
	
	//AP Fields

	String aP_ApprovalCode=AP_ApprovalCode.getText();

	transDnPojo.setAPApprovalCode(aP_ApprovalCode);
	System.out.println("aP_ApprovalCode is "+transDnPojo.getAPApprovalCode());
	
	String aP_CardGroup=AP_CardGroup.getText();

	transDnPojo.setAPCardGroup(aP_CardGroup);
	System.out.println("aP_CardGroup is "+transDnPojo.getAPCardGroup());
	
	String aP_Data=AP_Data.getText();

	transDnPojo.setAPData(aP_Data);
	System.out.println("aP_Data is "+transDnPojo.getAPData());
	
	String aP_Error=AP_Error.getText();

	transDnPojo.setAPError(aP_Error);
	System.out.println("aP_Error is "+transDnPojo.getAPError());
	
	String aP_ErrorTraceLocal=AP_ErrorTraceLocal.getText();

	transDnPojo.setAPErrorTraceLocal(aP_ErrorTraceLocal);
	System.out.println("aP_ErrorTraceLocal is "+transDnPojo.getAPErrorTraceLocal());
	
	String aP_RejectReason=AP_RejectReason.getText();

	transDnPojo.setAPRejectReason(aP_RejectReason);
	System.out.println("aP_RejectReason is "+transDnPojo.getAPRejectReason());
	
	
	//SBA-> Settlement Business Values
	
	
	String sBA_ACQ_ReconInstID=SBA_ACQ_ReconInstID.getText();

	transDnPojo.setSBA_ACQ_ReconInstID(sBA_ACQ_ReconInstID);
	System.out.println("sBA_ACQ_ReconInstID is "+transDnPojo.getSBA_ACQ_ReconInstID());
	
	String sBA_ACQ_ProcessorGroupID=SBA_ACQ_ProcessorGroupID.getText();

	transDnPojo.setSBA_ACQ_ProcessorGroupID(sBA_ACQ_ProcessorGroupID);
	System.out.println("sBA_ACQ_ProcessorGroupID is "+transDnPojo.getSBA_ACQ_ProcessorGroupID());
	
	String sBA_ACQ_ProcessorID=SBA_ACQ_ProcessorID.getText();

	transDnPojo.setSBA_ACQ_ProcessorID(sBA_ACQ_ProcessorID);
	System.out.println("sBA_ACQ_ProcessorID is "+transDnPojo.getSBA_ACQ_ProcessorID());
	
	String sBA_ACQ_ReportingLevelID=SBA_ACQ_ReportingLevelID.getText();

	transDnPojo.setSBA_ACQ_ReportingLevelID(sBA_ACQ_ReportingLevelID);
	System.out.println("tAI_Present_L is "+transDnPojo.getSBA_ACQ_ReportingLevelID());
	
	
	String sBA_ACQ_MerchantTierID=SBA_ACQ_MerchantTierID.getText();

	transDnPojo.setSBA_ACQ_MerchantTierID(sBA_ACQ_MerchantTierID);
	System.out.println("sBA_ACQ_MerchantTierID is "+transDnPojo.getSBA_ACQ_MerchantTierID());
	
	String sBA_ISS_ReconInstID=SBA_ISS_ReconInstID.getText();

	transDnPojo.setSBA_ISS_ReconInstID(sBA_ISS_ReconInstID);
	System.out.println("sBA_ISS_ReconInstID is "+transDnPojo.getSBA_ISS_ReconInstID());
	
	String sBA_ISS_ProcessorGroupID=SBA_ISS_ProcessorGroupID.getText();

	transDnPojo.setSBA_ISS_ProcessorGroupID(sBA_ISS_ProcessorGroupID);
	System.out.println("sBA_ISS_ProcessorGroupID is "+transDnPojo.getSBA_ISS_ProcessorGroupID());
	
	String sBA_ISS_ProcessorID=SBA_ISS_ProcessorID.getText();

	transDnPojo.setSBA_ISS_ProcessorID(sBA_ISS_ProcessorID);
	System.out.println("sBA_ISS_ProcessorID is "+transDnPojo.getSBA_ISS_ProcessorID());
	
	
	//UAT-> Unique Transaction Data
	
	String uTA_DynamicCVVResult=UTA_DynamicCVVResult.getText();

	transDnPojo.setUTA_DynamicCVVResult(uTA_DynamicCVVResult);
	System.out.println("uTA_DynamicCVVResult is "+transDnPojo.getUTA_DynamicCVVResult());
	
	String uTA_ATCResults=UTA_ATCResults.getText();

	transDnPojo.setUTA_ATCResults(uTA_ATCResults);
	System.out.println("uTA_ATCResults is "+transDnPojo.getUTA_ATCResults());
	
	String uTA_CVV2_CVC2Result=UTA_CVV2_CVC2Result.getText();

	transDnPojo.setUTA_CVV2_CVC2Result(uTA_CVV2_CVC2Result);
	System.out.println("uTA_CVV2_CVC2Result is "+transDnPojo.getUTA_CVV2_CVC2Result());
	
	String uTA_Track1_NameMatching=UTA_Track1_NameMatching.getText();

	transDnPojo.setUTA_Track1_NameMatching(uTA_Track1_NameMatching);
	System.out.println("uTA_CVV2_CVC2Result is "+transDnPojo.getUTA_Track1_NameMatching());
	
	String uTA_CVV1_CVC1Result=UTA_CVV1_CVC1Result.getText();

	transDnPojo.setUTA_CVV1_CVC1Result(uTA_CVV1_CVC1Result);
	System.out.println("uTA_CVV2_CVC2Result is "+transDnPojo.getUTA_CVV1_CVC1Result());
	
	String uTA_AVSResult=UTA_AVSResult.getText();

	transDnPojo.setUTA_AVSResult(uTA_AVSResult);
	System.out.println("uTA_AVSResult is "+transDnPojo.getUTA_AVSResult());
	
	
	
	
	try {
		
		//F1-> Fee 1 Information
		
		String f1_ACQ_ReconAmount=F1_ACQ_ReconAmount.getText();

		transDnPojo.setF1_ACQ_ReconAmount(f1_ACQ_ReconAmount);;
		System.out.println("f1_ACQ_ReconCurrency is "+transDnPojo.getF1_ACQ_ReconAmount());
		
		String f1_ACQ_ReconCurrency=F1_ACQ_ReconCurrency.getText();

		transDnPojo.setF1_ACQ_ReconCurrency(f1_ACQ_ReconCurrency);;
		System.out.println("f1_ACQ_ReconCurrency is "+transDnPojo.getF1_ACQ_ReconCurrency());
		
		String f1_ACQ_ConversionRate=F1_ACQ_ConversionRate.getText();

		transDnPojo.setF1_ACQ_ConversionRate(f1_ACQ_ConversionRate);;
		System.out.println("f1_ACQ_ConversionRate is "+transDnPojo.getF1_ACQ_ConversionRate());
		
		String f1_ISS_ReconAmount=F1_ISS_ReconAmount.getText();

		transDnPojo.setF1_ISS_ReconAmount(f1_ISS_ReconAmount);;
		System.out.println("f1_ISS_ReconAmount is "+transDnPojo.getF1_ISS_ReconAmount());
		
		String f1_ISS_ReconCurrency=F1_ISS_ReconCurrency.getText();

		transDnPojo.setF1_ISS_ReconCurrency(f1_ISS_ReconCurrency);
		System.out.println("f1_ISS_ReconCurrency is "+transDnPojo.getF1_ISS_ReconCurrency());
		

		String f1_ISS_ConversionRate=F1_ISS_ConversionRate.getText();

		transDnPojo.setF1_ISS_ConversionRate(f1_ISS_ConversionRate);
		System.out.println("f1_ISS_ConversionRate is "+transDnPojo.getF1_ISS_ConversionRate());
		
		
		String f1_Amount=F1_Amount.getText();

		transDnPojo.setF1_Amount(f1_Amount);
		System.out.println("f1_Amount is "+transDnPojo.getF1_Amount());
		
		String f1_Currency=F1_Currency.getText();

		transDnPojo.setF1_Currency(f1_Currency);;
		System.out.println("f1_Currency is "+transDnPojo.getF1_Currency());
		
		String f1_Type=F1_Type.getText();

		transDnPojo.setF1_Type(f1_Type);
		System.out.println("f1_Type is "+transDnPojo.getF1_Type());
		
		String f1_Indicator=F1_Indicator.getText();

		transDnPojo.setF1_Indicator(f1_Indicator);
		System.out.println("f1_Indicator is "+transDnPojo.getF1_Indicator());
		
		String f1_Memo=F1_Memo.getText();

		transDnPojo.setF1_Memo(f1_Memo);
		System.out.println("f1_Memo is "+transDnPojo.getF1_Memo());
		
		String f1_NetworkReconAmount=F1_NetworkReconAmount.getText();

		transDnPojo.setF1_NetworkReconAmount(f1_NetworkReconAmount);
		System.out.println("f1_NetworkReconAmount is "+transDnPojo.getF1_NetworkReconAmount());
		

		//F2-> Fee 2 Information

	String f2_ACQ_ReconAmount=F2_ACQ_ReconAmount.getText();

	transDnPojo.setF2_ACQ_ReconAmount(f2_ACQ_ReconAmount);;
	System.out.println("f2_ACQ_ReconAmount is "+transDnPojo.getF2_ACQ_ReconAmount());

	String f2_ACQ_ReconCurrency=F2_ACQ_ReconCurrency.getText();

	transDnPojo.setF2_ACQ_ReconCurrency(f2_ACQ_ReconCurrency);;
	System.out.println("f2_ACQ_ReconCurrency is "+transDnPojo.getF2_ACQ_ReconCurrency());

	String f2_ACQ_ConversionRate=F2_ACQ_ConversionRate.getText();

	transDnPojo.setF2_ACQ_ConversionRate(f2_ACQ_ConversionRate);;
	System.out.println("f2_ACQ_ConversionRate is "+transDnPojo.getF2_ACQ_ConversionRate());

	String f2_ISS_ReconAmount=F2_ISS_ReconAmount.getText();

	transDnPojo.setF2_ISS_ReconAmount(f2_ISS_ReconAmount);;
	System.out.println("f2_ISS_ReconAmount is "+transDnPojo.getF2_ISS_ReconAmount());

	String f2_ISS_ReconCurrency=F2_ISS_ReconCurrency.getText();

	transDnPojo.setF2_ISS_ReconCurrency(f2_ISS_ReconCurrency);
	System.out.println("f2_ISS_ReconCurrency is "+transDnPojo.getF2_ISS_ReconCurrency());


	String f2_ISS_ConversionRate=F2_ISS_ConversionRate.getText();

	transDnPojo.setF2_ISS_ConversionRate(f2_ISS_ConversionRate);
	System.out.println("f2_ISS_ConversionRate is "+transDnPojo.getF2_ISS_ConversionRate());


	String f2_Amount=F2_Amount.getText();

	transDnPojo.setF2_Amount(f2_Amount);
	System.out.println("f2_Amount is "+transDnPojo.getF2_Amount());

	String f2_Currency=F2_Currency.getText();

	transDnPojo.setF2_Currency(f2_Currency);;
	System.out.println("f2_Currency is "+transDnPojo.getF2_Currency());

	String f2_Type=F2_Type.getText();

	transDnPojo.setF2_Type(f2_Type);
	System.out.println("f2_Type is "+transDnPojo.getF2_Type());

	String f2_Indicator=F2_Indicator.getText();

	transDnPojo.setF2_Indicator(f2_Indicator);
	System.out.println("f2_Indicator is "+transDnPojo.getF2_Indicator());

	String f2_Memo=F2_Memo.getText();

	transDnPojo.setF2_Memo(f2_Memo);
	System.out.println("F2_Memo is "+transDnPojo.getF2_Memo());

	String f2_NetworkReconAmount=F2_NetworkReconAmount.getText();

	transDnPojo.setF2_NetworkReconAmount(f2_NetworkReconAmount);
	System.out.println("F2_NetworkReconAmount is "+transDnPojo.getF2_NetworkReconAmount());


	//F3-> Fee 3 Information

	String f3_ACQ_ReconAmount=F3_ACQ_ReconAmount.getText();

	transDnPojo.setF3_ACQ_ReconAmount(f3_ACQ_ReconAmount);;
	System.out.println("f3_ACQ_ReconAmount is "+transDnPojo.getF3_ACQ_ReconAmount());

	String f3_ACQ_ReconCurrency=F3_ACQ_ReconCurrency.getText();

	transDnPojo.setF3_ACQ_ReconCurrency(f3_ACQ_ReconCurrency);;
	System.out.println("f3_ACQ_ReconCurrency is "+transDnPojo.getF3_ACQ_ReconCurrency());

	String f3_ACQ_ConversionRate=F3_ACQ_ConversionRate.getText();

	transDnPojo.setF3_ACQ_ConversionRate(f3_ACQ_ConversionRate);;
	System.out.println("f3_ACQ_ConversionRate is "+transDnPojo.getF3_ACQ_ConversionRate());

	String f3_ISS_ReconAmount=F3_ISS_ReconAmount.getText();

	transDnPojo.setF3_ISS_ReconAmount(f3_ISS_ReconAmount);;
	System.out.println("f3_ISS_ReconAmount is "+transDnPojo.getF3_ISS_ReconAmount());

	String f3_ISS_ReconCurrency=F3_ISS_ReconCurrency.getText();

	transDnPojo.setF3_ISS_ReconCurrency(f3_ISS_ReconCurrency);
	System.out.println("f3_ISS_ReconCurrency is "+transDnPojo.getF3_ISS_ReconCurrency());


	String f3_ISS_ConversionRate=F3_ISS_ConversionRate.getText();

	transDnPojo.setF3_ISS_ConversionRate(f3_ISS_ConversionRate);
	System.out.println("f3_ISS_ConversionRate is "+transDnPojo.getF3_ISS_ConversionRate());


	String f3_Amount=F3_Amount.getText();

	transDnPojo.setF3_Amount(f3_Amount);
	System.out.println("f3_Amount is "+transDnPojo.getF3_Amount());

	String f3_Currency=F3_Currency.getText();

	transDnPojo.setF3_Currency(f3_Currency);;
	System.out.println("f3_Currency is "+transDnPojo.getF3_Currency());

	String f3_Type=F3_Type.getText();

	transDnPojo.setF3_Type(f3_Type);
	System.out.println("f3_Type is "+transDnPojo.getF3_Type());

	String f3_Indicator=F3_Indicator.getText();

	transDnPojo.setF3_Indicator(f3_Indicator);
	System.out.println("f3_Indicator is "+transDnPojo.getF3_Indicator());

	String f3_Memo=F3_Memo.getText();

	transDnPojo.setF3_Memo(f3_Memo);
	System.out.println("F3_Memo is "+transDnPojo.getF3_Memo());

	String f3_NetworkReconAmount=F3_NetworkReconAmount.getText();

	transDnPojo.setF3_NetworkReconAmount(f3_NetworkReconAmount);
	System.out.println("F3_NetworkReconAmount is "+transDnPojo.getF3_NetworkReconAmount());
		
	} catch (Exception e) {
		
		e.printStackTrace();
		System.out.println("This Transaction is not having Fee 1 & fee2 & fee 3 info ");
		// TODO: handle exception
	}
	
	

//Canister Management


String denomination_C1=Denomination_C1.getText();

transDnPojo.setDenomination_C1(denomination_C1);
System.out.println("denomination_C1 is "+transDnPojo.getDenomination_C1());

String denomination_C2=Denomination_C2.getText();

transDnPojo.setDenomination_C2(denomination_C2);
System.out.println("denomination_C2 is "+transDnPojo.getDenomination_C2());


String denomination_C3=Denomination_C3.getText();

transDnPojo.setDenomination_C3(denomination_C3);
System.out.println("denomination_C3 is "+transDnPojo.getDenomination_C3());

String denomination_C4=Denomination_C4.getText();

transDnPojo.setDenomination_C4(denomination_C4);
System.out.println("denomination_C4 is "+transDnPojo.getDenomination_C4());

String denomination_C5=Denomination_C5.getText();

transDnPojo.setDenomination_C5(denomination_C5);
System.out.println("denomination_C5 is "+transDnPojo.getDenomination_C5());

String denomination_C6=Denomination_C6.getText();

transDnPojo.setDenomination_C6(denomination_C6);
System.out.println("denomination_C6 is "+transDnPojo.getDenomination_C6());

String denomination_C7=Denomination_C7.getText();

transDnPojo.setDenomination_C7(denomination_C7);
System.out.println("denomination_C7 is "+transDnPojo.getDenomination_C7());

String denomination_C8=Denomination_C8.getText();

transDnPojo.setDenomination_C8(denomination_C8);
System.out.println("denomination_C8 is "+transDnPojo.getDenomination_C8());


String original_Items_C1=Original_Items_C1.getText();

transDnPojo.setOriginal_Items_C1(original_Items_C1);
System.out.println("original_Items_C1 is "+transDnPojo.getOriginal_Items_C1());

String original_Items_C2=Original_Items_C2.getText();

transDnPojo.setOriginal_Items_C2(original_Items_C2);
System.out.println("original_Items_C2 is "+transDnPojo.getOriginal_Items_C2());

String original_Items_C3=Original_Items_C3.getText();

transDnPojo.setOriginal_Items_C3(original_Items_C3);
System.out.println("original_Items_C3 is "+transDnPojo.getOriginal_Items_C3());

String original_Items_C4=Original_Items_C4.getText();

transDnPojo.setOriginal_Items_C4(original_Items_C4);
System.out.println("original_Items_C4 is "+transDnPojo.getOriginal_Items_C4());

String original_Items_C5=Original_Items_C5.getText();

transDnPojo.setOriginal_Items_C5(original_Items_C5);
System.out.println("original_Items_C5 is "+transDnPojo.getOriginal_Items_C5());

String original_Items_C6=Original_Items_C6.getText();

transDnPojo.setOriginal_Items_C6(original_Items_C6);
System.out.println("original_Items_C6 is "+transDnPojo.getOriginal_Items_C6());

String original_Items_C7=Original_Items_C7.getText();

transDnPojo.setOriginal_Items_C7(original_Items_C7);
System.out.println("original_Items_C7 is "+transDnPojo.getOriginal_Items_C7());

String original_Items_C8=Original_Items_C8.getText();

transDnPojo.setOriginal_Items_C8(original_Items_C8);
System.out.println("original_Items_C8 is "+transDnPojo.getOriginal_Items_C8());	

String dispensed_C1=Dispensed_C1.getText();

transDnPojo.setDispensed_C1(dispensed_C1);
System.out.println("dispensed_C1 is "+transDnPojo.getDispensed_C1());

String dispensed_C2=Dispensed_C2.getText();

transDnPojo.setDispensed_C2(dispensed_C2);
System.out.println("dispensed_C2 is "+transDnPojo.getDispensed_C2());

String dispensed_C3=Dispensed_C3.getText();

transDnPojo.setDispensed_C3(dispensed_C3);
System.out.println("dispensed_C3 is "+transDnPojo.getDispensed_C3());

String dispensed_C4=Dispensed_C4.getText();

transDnPojo.setDispensed_C4(dispensed_C4);
System.out.println("dispensed_C4 is "+transDnPojo.getDispensed_C4());

String dispensed_C5=Dispensed_C5.getText();

transDnPojo.setDispensed_C5(dispensed_C5);
System.out.println("dispensed_C5 is "+transDnPojo.getDispensed_C5());

String dispensed_C6=Dispensed_C6.getText();

transDnPojo.setDispensed_C6(dispensed_C6);
System.out.println("dispensed_C6 is "+transDnPojo.getDispensed_C6());


String dispensed_C7=Dispensed_C7.getText();

transDnPojo.setDispensed_C7(dispensed_C7);
System.out.println("dispensed_C7 is "+transDnPojo.getDispensed_C7());

String dispensed_C8=Dispensed_C8.getText();

transDnPojo.setDispensed_C8(dispensed_C8);
System.out.println("dispensed_C8 is "+transDnPojo.getDispensed_C8());

//Milestone Time Information

String timeSpentRqstSwitch=TimeSpentRqstSwitch.getText();

transDnPojo.setTimeSpentRqstSwitch(timeSpentRqstSwitch);
System.out.println("timeSpentRqstSwitch is "+transDnPojo.getTimeSpentRqstSwitch());

String timeSpentRespSwitch=TimeSpentRespSwitch.getText();

transDnPojo.setTimeSpentRespSwitch(timeSpentRespSwitch);
System.out.println("timeSpentRqstSwitch is "+transDnPojo.getTimeSpentRespSwitch());

String timeSpentIssuer=TimeSpentIssuer.getText();

transDnPojo.setTimeSpentIssuer(timeSpentIssuer);
System.out.println("timeSpentRqstSwitch is "+transDnPojo.getTimeSpentIssuer());

String timeSpentRqstQueued=TimeSpentRqstQueued.getText();

transDnPojo.setTimeSpentRqstQueued(timeSpentRqstQueued);
System.out.println("timeSpentRqstSwitch is "+transDnPojo.getTimeSpentRqstQueued());

String timeSpentRespQueued=TimeSpentRespQueued.getText();

transDnPojo.setTimeSpentRespQueued(timeSpentRespQueued);
System.out.println("timeSpentRqstSwitch is "+transDnPojo.getTimeSpentRespQueued());

String timeSpentAP=TimeSpentAP.getText();

transDnPojo.setTimeSpentAP(timeSpentAP);
System.out.println("timeSpentRqstSwitch is "+transDnPojo.getTimeSpentAP());

	
	
}

}
