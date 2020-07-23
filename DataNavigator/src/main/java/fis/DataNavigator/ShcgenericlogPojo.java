package fis.DataNavigator;

public class ShcgenericlogPojo {
	
	//creation of singleton class object
	
	public static ShcgenericlogPojo shcgenericlogPojo=new ShcgenericlogPojo();
	
	private ShcgenericlogPojo() {
		
	}
	
	public static ShcgenericlogPojo getinstance() {
		return shcgenericlogPojo;
	}
	
	
	//DNSEGMENT

	   String CrossBorderFlag;           
	   String card_scheme;          
	   String cardBrand;           
	   String card_location;             
	   String txn_service;            
	   String deviceTypeChannel;    
	   String bbl_private;         
	   String ATCResult;                 
	   String CVV1_Result;               
	   String CVV1_CVC1_Result;          
	   String CVV2AcquirerResult;        
	   String CVV2IssuerResult;          
	   String CVV2PresenceIndicator;     
	   String CVV2ResponseIndicator;     
	   String IST_StandIn_Ind;           
	   String PrivateData;          
	   String QRCVoucher;
	   String bblFiller3;
	   String bblFiller4;
	   String AcqFee;              
	   String IssuerFee;           
	   String SwitchFee;           
	   String bblFiller;           
	   String AcqRoutingNo;          
	   String IssRoutingNo;          
	   String TraRoutingNo;          
	   String DestRoutingNo;         
	   String TransfereeFee;         
	   String PayeeName;             
	   String ITMXTraceNo;           
	   String bblFiller2;            
	   String Original_Card_Owner;  
	   String Card_Owner;           
	   String Card_Owner_BranchCode;
	      String Original_Terminal_Owner;  
	      String Terminal_Owner_BranchCode;
	      String ATM_Terminal_ID;         
	      String bblATM_Terminal_ID;      
	      String Partial_Reverse_Amount;  
	     String DCC_Home_CCY_Name;         
	      String Terminal_State;           
	      String Terminal_Provice_RegionID;
	      String FrAcct_Owner_Branch;      
	      String ToAcct_Owner_Branch;      
	      String Oth_Bank_Use_Counter;     
	      String IR_Flag;                  
	      String IR_Counter;               
	      
	      String RecvProxyID;            
	      String SendProxyID;            
	      String SendProxyType;           
	      String RecvProxyType;           
	      String SenderTaxID;             
	      String ReceiverTaxID;           
	      String VatRate;                  
	      String Vat;                     
	      String WHTTaxRate;               
	      String WHTTax;                  
	      String WHTTaxCon;                     
	      String TraRefNo;                
	      String SendRefNo;               
	      String RefNo;                   
	      String BBLRefNo;                
	      String ToAcctDispName;          
	      String ToAcctName;                   
	      String FromAcctName;            
	      String TaxInvoice;              
	      String TypeOfIncome; 

	String billReference;
	   String bp_due_rtp_expDate;
	   String credit_notif_ref;
	   String bpURL;
	   String SendCompTaxID;
	   String SendCompAcctNo;
	   String ReceiverCompTaxID;
	   String ReceiverCompAcctNo;	

	String CompCode;
	   String ServCode;
	   String Flags;
	   String BillReference2;
	   String UserData1;
	   String UserData2;
	   String UserData3;
	   String UserData4;
	   String UserData5;
	   String Payment1;
	   String Payment2;
	   String Payment3;
	   String sms_fee;
	   String sms_mobile;
	   String OTP;
	   String acct_info1;
	   String acct_info2;
	   String Frm_FundCode;
	   String To_FundCode;
	   String Unit;
	   String UnitPrice;
	   String BondYield;
	   String Surcharge_Fee;
	   String ExtFromAcctType;
	   String ExtToAcctType;
	String FromAcctDispName;     
	String CDM_data;         
	String bblFiller5; 
	
	//ATM_DN_DATA_REQ
	
	String    shclog_id;
    String    alt_merchant_id;
    String    alt_terminal_id;
    String    card_category;
    String   clerk_id;
    String  debit_proc_busday;
    String    device_type;
    String    issuer_proc_id;
    String    pos_geo_location;
    String    customer_id;
    String    acquiring_channel;
    String    transaction_group;
    String message_mode;
    
    //EMV_BUF
    

    String      term_txn_date;         
    String      cvv_res_code;               
    String      card_auth_res_code;         
    String      term_type;                  
    String      term_entry_cap;             
    String      chip_cond_code;             
    String      ccps_txn_ind;               
    String      card_auth_rel_ind;          
    String      msg_reason_code;            
    String      deri_key_idx;               
    String      crypto_version;             
    String      crypto_txn_type;            
    String      term_country_code;          
    String      crypto_curr_code;           
    String      neg_file_version;           
    String      ccard_pa_trace;             
    String      ccard_purch_trace;          
    String      ccard_crypto_trace;         
    String      mcard_batch_trace;          
    String      mcard_txn_trace;            
    String      crypto_amount;              
    String      crypto_cb_amount;           
    String        srv_restrict_code;    
    String        term_cap_profile;     
    String        tvr;                 
    String        unpredictable_num;    
    String        term_ser_num;         
    String        cvr;                  
    String        issuer_discre_data;  
    String        cryptogram;          
    String        app_txn_counter;      
    String        app_ichg_profile;     
    String        arpc_cryptogram;     
    String        issuer_script_res; 
   String        arpc_respcode;                           
   String        ccard_sch_crypto;
  String       chip_type;
  String    issuer_app_data;
  int      trans_seq_counter;   		
  String        cvm_results; 
  String  bitmap;
  String       tvr_cvr_status;
  String            issuer_auth_data;
  String        form_factor;
  String site_id;
  
  
  
  
public String getSite_id() {
	return site_id;
}

public void setSite_id(String site_id) {
	this.site_id = site_id;
}

public String getCrossBorderFlag() {
	return CrossBorderFlag;
}
public void setCrossBorderFlag(String crossBorderFlag) {
	CrossBorderFlag = crossBorderFlag;
}
public String getCard_scheme() {
	return card_scheme;
}
public void setCard_scheme(String card_scheme) {
	this.card_scheme = card_scheme;
}
public String getCardBrand() {
	return cardBrand;
}
public void setCardBrand(String cardBrand) {
	this.cardBrand = cardBrand;
}
public String getCard_location() {
	return card_location;
}
public void setCard_location(String card_location) {
	this.card_location = card_location;
}
public String getTxn_service() {
	return txn_service;
}
public void setTxn_service(String txn_service) {
	this.txn_service = txn_service;
}
public String getDeviceTypeChannel() {
	return deviceTypeChannel;
}
public void setDeviceTypeChannel(String deviceTypeChannel) {
	this.deviceTypeChannel = deviceTypeChannel;
}
public String getBbl_private() {
	return bbl_private;
}
public void setBbl_private(String bbl_private) {
	this.bbl_private = bbl_private;
}
public String getATCResult() {
	return ATCResult;
}
public void setATCResult(String aTCResult) {
	ATCResult = aTCResult;
}
public String getCVV1_Result() {
	return CVV1_Result;
}
public void setCVV1_Result(String cVV1_Result) {
	CVV1_Result = cVV1_Result;
}
public String getCVV1_CVC1_Result() {
	return CVV1_CVC1_Result;
}
public void setCVV1_CVC1_Result(String cVV1_CVC1_Result) {
	CVV1_CVC1_Result = cVV1_CVC1_Result;
}
public String getCVV2AcquirerResult() {
	return CVV2AcquirerResult;
}
public void setCVV2AcquirerResult(String cVV2AcquirerResult) {
	CVV2AcquirerResult = cVV2AcquirerResult;
}
public String getCVV2IssuerResult() {
	return CVV2IssuerResult;
}
public void setCVV2IssuerResult(String cVV2IssuerResult) {
	CVV2IssuerResult = cVV2IssuerResult;
}
public String getCVV2PresenceIndicator() {
	return CVV2PresenceIndicator;
}
public void setCVV2PresenceIndicator(String cVV2PresenceIndicator) {
	CVV2PresenceIndicator = cVV2PresenceIndicator;
}
public String getCVV2ResponseIndicator() {
	return CVV2ResponseIndicator;
}
public void setCVV2ResponseIndicator(String cVV2ResponseIndicator) {
	CVV2ResponseIndicator = cVV2ResponseIndicator;
}
public String getIST_StandIn_Ind() {
	return IST_StandIn_Ind;
}
public void setIST_StandIn_Ind(String iST_StandIn_Ind) {
	IST_StandIn_Ind = iST_StandIn_Ind;
}
public String getPrivateData() {
	return PrivateData;
}
public void setPrivateData(String privateData) {
	PrivateData = privateData;
}
public String getQRCVoucher() {
	return QRCVoucher;
}
public void setQRCVoucher(String qRCVoucher) {
	QRCVoucher = qRCVoucher;
}
public String getBblFiller3() {
	return bblFiller3;
}
public void setBblFiller3(String bblFiller3) {
	this.bblFiller3 = bblFiller3;
}
public String getBblFiller4() {
	return bblFiller4;
}
public void setBblFiller4(String bblFiller4) {
	this.bblFiller4 = bblFiller4;
}
public String getAcqFee() {
	return AcqFee;
}
public void setAcqFee(String acqFee) {
	AcqFee = acqFee;
}
public String getIssuerFee() {
	return IssuerFee;
}
public void setIssuerFee(String issuerFee) {
	IssuerFee = issuerFee;
}
public String getSwitchFee() {
	return SwitchFee;
}
public void setSwitchFee(String switchFee) {
	SwitchFee = switchFee;
}
public String getBblFiller() {
	return bblFiller;
}
public void setBblFiller(String bblFiller) {
	this.bblFiller = bblFiller;
}
public String getAcqRoutingNo() {
	return AcqRoutingNo;
}
public void setAcqRoutingNo(String acqRoutingNo) {
	AcqRoutingNo = acqRoutingNo;
}
public String getIssRoutingNo() {
	return IssRoutingNo;
}
public void setIssRoutingNo(String issRoutingNo) {
	IssRoutingNo = issRoutingNo;
}
public String getTraRoutingNo() {
	return TraRoutingNo;
}
public void setTraRoutingNo(String traRoutingNo) {
	TraRoutingNo = traRoutingNo;
}
public String getDestRoutingNo() {
	return DestRoutingNo;
}
public void setDestRoutingNo(String destRoutingNo) {
	DestRoutingNo = destRoutingNo;
}
public String getTransfereeFee() {
	return TransfereeFee;
}
public void setTransfereeFee(String transfereeFee) {
	TransfereeFee = transfereeFee;
}
public String getPayeeName() {
	return PayeeName;
}
public void setPayeeName(String payeeName) {
	PayeeName = payeeName;
}
public String getITMXTraceNo() {
	return ITMXTraceNo;
}
public void setITMXTraceNo(String iTMXTraceNo) {
	ITMXTraceNo = iTMXTraceNo;
}
public String getBblFiller2() {
	return bblFiller2;
}
public void setBblFiller2(String bblFiller2) {
	this.bblFiller2 = bblFiller2;
}
public String getOriginal_Card_Owner() {
	return Original_Card_Owner;
}
public void setOriginal_Card_Owner(String original_Card_Owner) {
	Original_Card_Owner = original_Card_Owner;
}
public String getCard_Owner() {
	return Card_Owner;
}
public void setCard_Owner(String card_Owner) {
	Card_Owner = card_Owner;
}
public String getCard_Owner_BranchCode() {
	return Card_Owner_BranchCode;
}
public void setCard_Owner_BranchCode(String card_Owner_BranchCode) {
	Card_Owner_BranchCode = card_Owner_BranchCode;
}
public String getOriginal_Terminal_Owner() {
	return Original_Terminal_Owner;
}
public void setOriginal_Terminal_Owner(String original_Terminal_Owner) {
	Original_Terminal_Owner = original_Terminal_Owner;
}
public String getTerminal_Owner_BranchCode() {
	return Terminal_Owner_BranchCode;
}
public void setTerminal_Owner_BranchCode(String terminal_Owner_BranchCode) {
	Terminal_Owner_BranchCode = terminal_Owner_BranchCode;
}
public String getATM_Terminal_ID() {
	return ATM_Terminal_ID;
}
public void setATM_Terminal_ID(String aTM_Terminal_ID) {
	ATM_Terminal_ID = aTM_Terminal_ID;
}
public String getBblATM_Terminal_ID() {
	return bblATM_Terminal_ID;
}
public void setBblATM_Terminal_ID(String bblATM_Terminal_ID) {
	this.bblATM_Terminal_ID = bblATM_Terminal_ID;
}
public String getPartial_Reverse_Amount() {
	return Partial_Reverse_Amount;
}
public void setPartial_Reverse_Amount(String partial_Reverse_Amount) {
	Partial_Reverse_Amount = partial_Reverse_Amount;
}
public String getDCC_Home_CCY_Name() {
	return DCC_Home_CCY_Name;
}
public void setDCC_Home_CCY_Name(String dCC_Home_CCY_Name) {
	DCC_Home_CCY_Name = dCC_Home_CCY_Name;
}
public String getTerminal_State() {
	return Terminal_State;
}
public void setTerminal_State(String terminal_State) {
	Terminal_State = terminal_State;
}
public String getTerminal_Provice_RegionID() {
	return Terminal_Provice_RegionID;
}
public void setTerminal_Provice_RegionID(String terminal_Provice_RegionID) {
	Terminal_Provice_RegionID = terminal_Provice_RegionID;
}
public String getFrAcct_Owner_Branch() {
	return FrAcct_Owner_Branch;
}
public void setFrAcct_Owner_Branch(String frAcct_Owner_Branch) {
	FrAcct_Owner_Branch = frAcct_Owner_Branch;
}
public String getToAcct_Owner_Branch() {
	return ToAcct_Owner_Branch;
}
public void setToAcct_Owner_Branch(String toAcct_Owner_Branch) {
	ToAcct_Owner_Branch = toAcct_Owner_Branch;
}
public String getOth_Bank_Use_Counter() {
	return Oth_Bank_Use_Counter;
}
public void setOth_Bank_Use_Counter(String oth_Bank_Use_Counter) {
	Oth_Bank_Use_Counter = oth_Bank_Use_Counter;
}
public String getIR_Flag() {
	return IR_Flag;
}
public void setIR_Flag(String iR_Flag) {
	IR_Flag = iR_Flag;
}
public String getIR_Counter() {
	return IR_Counter;
}
public void setIR_Counter(String iR_Counter) {
	IR_Counter = iR_Counter;
}
public String getRecvProxyID() {
	return RecvProxyID;
}
public void setRecvProxyID(String recvProxyID) {
	RecvProxyID = recvProxyID;
}
public String getSendProxyID() {
	return SendProxyID;
}
public void setSendProxyID(String sendProxyID) {
	SendProxyID = sendProxyID;
}
public String getSendProxyType() {
	return SendProxyType;
}
public void setSendProxyType(String sendProxyType) {
	SendProxyType = sendProxyType;
}
public String getRecvProxyType() {
	return RecvProxyType;
}
public void setRecvProxyType(String recvProxyType) {
	RecvProxyType = recvProxyType;
}
public String getSenderTaxID() {
	return SenderTaxID;
}
public void setSenderTaxID(String senderTaxID) {
	SenderTaxID = senderTaxID;
}
public String getReceiverTaxID() {
	return ReceiverTaxID;
}
public void setReceiverTaxID(String receiverTaxID) {
	ReceiverTaxID = receiverTaxID;
}
public String getVatRate() {
	return VatRate;
}
public void setVatRate(String vatRate) {
	VatRate = vatRate;
}
public String getVat() {
	return Vat;
}
public void setVat(String vat) {
	Vat = vat;
}
public String getWHTTaxRate() {
	return WHTTaxRate;
}
public void setWHTTaxRate(String wHTTaxRate) {
	WHTTaxRate = wHTTaxRate;
}
public String getWHTTax() {
	return WHTTax;
}
public void setWHTTax(String wHTTax) {
	WHTTax = wHTTax;
}
public String getWHTTaxCon() {
	return WHTTaxCon;
}
public void setWHTTaxCon(String wHTTaxCon) {
	WHTTaxCon = wHTTaxCon;
}
public String getTraRefNo() {
	return TraRefNo;
}
public void setTraRefNo(String traRefNo) {
	TraRefNo = traRefNo;
}
public String getSendRefNo() {
	return SendRefNo;
}
public void setSendRefNo(String sendRefNo) {
	SendRefNo = sendRefNo;
}
public String getRefNo() {
	return RefNo;
}
public void setRefNo(String refNo) {
	RefNo = refNo;
}
public String getBBLRefNo() {
	return BBLRefNo;
}
public void setBBLRefNo(String bBLRefNo) {
	BBLRefNo = bBLRefNo;
}
public String getToAcctDispName() {
	return ToAcctDispName;
}
public void setToAcctDispName(String toAcctDispName) {
	ToAcctDispName = toAcctDispName;
}
public String getToAcctName() {
	return ToAcctName;
}
public void setToAcctName(String toAcctName) {
	ToAcctName = toAcctName;
}
public String getFromAcctName() {
	return FromAcctName;
}
public void setFromAcctName(String fromAcctName) {
	FromAcctName = fromAcctName;
}
public String getTaxInvoice() {
	return TaxInvoice;
}
public void setTaxInvoice(String taxInvoice) {
	TaxInvoice = taxInvoice;
}
public String getTypeOfIncome() {
	return TypeOfIncome;
}
public void setTypeOfIncome(String typeOfIncome) {
	TypeOfIncome = typeOfIncome;
}
public String getBillReference() {
	return billReference;
}
public void setBillReference(String billReference) {
	this.billReference = billReference;
}
public String getBp_due_rtp_expDate() {
	return bp_due_rtp_expDate;
}
public void setBp_due_rtp_expDate(String bp_due_rtp_expDate) {
	this.bp_due_rtp_expDate = bp_due_rtp_expDate;
}
public String getCredit_notif_ref() {
	return credit_notif_ref;
}
public void setCredit_notif_ref(String credit_notif_ref) {
	this.credit_notif_ref = credit_notif_ref;
}
public String getBpURL() {
	return bpURL;
}
public void setBpURL(String bpURL) {
	this.bpURL = bpURL;
}
public String getSendCompTaxID() {
	return SendCompTaxID;
}
public void setSendCompTaxID(String sendCompTaxID) {
	SendCompTaxID = sendCompTaxID;
}
public String getSendCompAcctNo() {
	return SendCompAcctNo;
}
public void setSendCompAcctNo(String sendCompAcctNo) {
	SendCompAcctNo = sendCompAcctNo;
}
public String getReceiverCompTaxID() {
	return ReceiverCompTaxID;
}
public void setReceiverCompTaxID(String receiverCompTaxID) {
	ReceiverCompTaxID = receiverCompTaxID;
}
public String getReceiverCompAcctNo() {
	return ReceiverCompAcctNo;
}
public void setReceiverCompAcctNo(String receiverCompAcctNo) {
	ReceiverCompAcctNo = receiverCompAcctNo;
}
public String getCompCode() {
	return CompCode;
}
public void setCompCode(String compCode) {
	CompCode = compCode;
}
public String getServCode() {
	return ServCode;
}
public void setServCode(String servCode) {
	ServCode = servCode;
}
public String getFlags() {
	return Flags;
}
public void setFlags(String flags) {
	Flags = flags;
}
public String getBillReference2() {
	return BillReference2;
}
public void setBillReference2(String billReference2) {
	BillReference2 = billReference2;
}
public String getUserData1() {
	return UserData1;
}
public void setUserData1(String userData1) {
	UserData1 = userData1;
}
public String getUserData2() {
	return UserData2;
}
public void setUserData2(String userData2) {
	UserData2 = userData2;
}
public String getUserData3() {
	return UserData3;
}
public void setUserData3(String userData3) {
	UserData3 = userData3;
}
public String getUserData4() {
	return UserData4;
}
public void setUserData4(String userData4) {
	UserData4 = userData4;
}
public String getUserData5() {
	return UserData5;
}
public void setUserData5(String userData5) {
	UserData5 = userData5;
}
public String getPayment1() {
	return Payment1;
}
public void setPayment1(String payment1) {
	Payment1 = payment1;
}
public String getPayment2() {
	return Payment2;
}
public void setPayment2(String payment2) {
	Payment2 = payment2;
}
public String getPayment3() {
	return Payment3;
}
public void setPayment3(String payment3) {
	Payment3 = payment3;
}
public String getSms_fee() {
	return sms_fee;
}
public void setSms_fee(String sms_fee) {
	this.sms_fee = sms_fee;
}
public String getSms_mobile() {
	return sms_mobile;
}
public void setSms_mobile(String sms_mobile) {
	this.sms_mobile = sms_mobile;
}
public String getOTP() {
	return OTP;
}
public void setOTP(String oTP) {
	OTP = oTP;
}
public String getAcct_info1() {
	return acct_info1;
}
public void setAcct_info1(String acct_info1) {
	this.acct_info1 = acct_info1;
}
public String getAcct_info2() {
	return acct_info2;
}
public void setAcct_info2(String acct_info2) {
	this.acct_info2 = acct_info2;
}
public String getFrm_FundCode() {
	return Frm_FundCode;
}
public void setFrm_FundCode(String frm_FundCode) {
	Frm_FundCode = frm_FundCode;
}
public String getTo_FundCode() {
	return To_FundCode;
}
public void setTo_FundCode(String to_FundCode) {
	To_FundCode = to_FundCode;
}
public String getUnit() {
	return Unit;
}
public void setUnit(String unit) {
	Unit = unit;
}
public String getUnitPrice() {
	return UnitPrice;
}
public void setUnitPrice(String unitPrice) {
	UnitPrice = unitPrice;
}
public String getBondYield() {
	return BondYield;
}
public void setBondYield(String bondYield) {
	BondYield = bondYield;
}
public String getSurcharge_Fee() {
	return Surcharge_Fee;
}
public void setSurcharge_Fee(String surcharge_Fee) {
	Surcharge_Fee = surcharge_Fee;
}
public String getExtFromAcctType() {
	return ExtFromAcctType;
}
public void setExtFromAcctType(String extFromAcctType) {
	ExtFromAcctType = extFromAcctType;
}
public String getExtToAcctType() {
	return ExtToAcctType;
}
public void setExtToAcctType(String extToAcctType) {
	ExtToAcctType = extToAcctType;
}
public String getFromAcctDispName() {
	return FromAcctDispName;
}
public void setFromAcctDispName(String fromAcctDispName) {
	FromAcctDispName = fromAcctDispName;
}
public String getCDM_data() {
	return CDM_data;
}
public void setCDM_data(String cDM_data) {
	CDM_data = cDM_data;
}
public String getBblFiller5() {
	return bblFiller5;
}
public void setBblFiller5(String bblFiller5) {
	this.bblFiller5 = bblFiller5;
}
public String getShclog_id() {
	return shclog_id;
}
public void setShclog_id(String shclog_id) {
	this.shclog_id = shclog_id;
}
public String getAlt_merchant_id() {
	return alt_merchant_id;
}
public void setAlt_merchant_id(String alt_merchant_id) {
	this.alt_merchant_id = alt_merchant_id;
}
public String getAlt_terminal_id() {
	return alt_terminal_id;
}
public void setAlt_terminal_id(String alt_terminal_id) {
	this.alt_terminal_id = alt_terminal_id;
}
public String getCard_category() {
	return card_category;
}
public void setCard_category(String card_category) {
	this.card_category = card_category;
}
public String getClerk_id() {
	return clerk_id;
}
public void setClerk_id(String clerk_id) {
	this.clerk_id = clerk_id;
}
public String getDebit_proc_busday() {
	return debit_proc_busday;
}
public void setDebit_proc_busday(String debit_proc_busday) {
	this.debit_proc_busday = debit_proc_busday;
}
public String getDevice_type() {
	return device_type;
}
public void setDevice_type(String device_type) {
	this.device_type = device_type;
}
public String getIssuer_proc_id() {
	return issuer_proc_id;
}
public void setIssuer_proc_id(String issuer_proc_id) {
	this.issuer_proc_id = issuer_proc_id;
}
public String getPos_geo_location() {
	return pos_geo_location;
}
public void setPos_geo_location(String pos_geo_location) {
	this.pos_geo_location = pos_geo_location;
}
public String getCustomer_id() {
	return customer_id;
}
public void setCustomer_id(String customer_id) {
	this.customer_id = customer_id;
}
public String getAcquiring_channel() {
	return acquiring_channel;
}
public void setAcquiring_channel(String acquiring_channel) {
	this.acquiring_channel = acquiring_channel;
}
public String getTransaction_group() {
	return transaction_group;
}
public void setTransaction_group(String transaction_group) {
	this.transaction_group = transaction_group;
}
public String getMessage_mode() {
	return message_mode;
}
public void setMessage_mode(String message_mode) {
	this.message_mode = message_mode;
}
public String getTerm_txn_date() {
	return term_txn_date;
}
public void setTerm_txn_date(String term_txn_date) {
	this.term_txn_date = term_txn_date;
}
public String getCvv_res_code() {
	return cvv_res_code;
}
public void setCvv_res_code(String cvv_res_code) {
	this.cvv_res_code = cvv_res_code;
}
public String getCard_auth_res_code() {
	return card_auth_res_code;
}
public void setCard_auth_res_code(String card_auth_res_code) {
	this.card_auth_res_code = card_auth_res_code;
}
public String getTerm_type() {
	return term_type;
}
public void setTerm_type(String term_type) {
	this.term_type = term_type;
}
public String getTerm_entry_cap() {
	return term_entry_cap;
}
public void setTerm_entry_cap(String term_entry_cap) {
	this.term_entry_cap = term_entry_cap;
}
public String getChip_cond_code() {
	return chip_cond_code;
}
public void setChip_cond_code(String chip_cond_code) {
	this.chip_cond_code = chip_cond_code;
}
public String getCcps_txn_ind() {
	return ccps_txn_ind;
}
public void setCcps_txn_ind(String ccps_txn_ind) {
	this.ccps_txn_ind = ccps_txn_ind;
}
public String getCard_auth_rel_ind() {
	return card_auth_rel_ind;
}
public void setCard_auth_rel_ind(String card_auth_rel_ind) {
	this.card_auth_rel_ind = card_auth_rel_ind;
}
public String getMsg_reason_code() {
	return msg_reason_code;
}
public void setMsg_reason_code(String msg_reason_code) {
	this.msg_reason_code = msg_reason_code;
}
public String getDeri_key_idx() {
	return deri_key_idx;
}
public void setDeri_key_idx(String deri_key_idx) {
	this.deri_key_idx = deri_key_idx;
}
public String getCrypto_version() {
	return crypto_version;
}
public void setCrypto_version(String crypto_version) {
	this.crypto_version = crypto_version;
}
public String getCrypto_txn_type() {
	return crypto_txn_type;
}
public void setCrypto_txn_type(String crypto_txn_type) {
	this.crypto_txn_type = crypto_txn_type;
}
public String getTerm_country_code() {
	return term_country_code;
}
public void setTerm_country_code(String term_country_code) {
	this.term_country_code = term_country_code;
}
public String getCrypto_curr_code() {
	return crypto_curr_code;
}
public void setCrypto_curr_code(String crypto_curr_code) {
	this.crypto_curr_code = crypto_curr_code;
}
public String getNeg_file_version() {
	return neg_file_version;
}
public void setNeg_file_version(String neg_file_version) {
	this.neg_file_version = neg_file_version;
}
public String getCcard_pa_trace() {
	return ccard_pa_trace;
}
public void setCcard_pa_trace(String ccard_pa_trace) {
	this.ccard_pa_trace = ccard_pa_trace;
}
public String getCcard_purch_trace() {
	return ccard_purch_trace;
}
public void setCcard_purch_trace(String ccard_purch_trace) {
	this.ccard_purch_trace = ccard_purch_trace;
}
public String getCcard_crypto_trace() {
	return ccard_crypto_trace;
}
public void setCcard_crypto_trace(String ccard_crypto_trace) {
	this.ccard_crypto_trace = ccard_crypto_trace;
}
public String getMcard_batch_trace() {
	return mcard_batch_trace;
}
public void setMcard_batch_trace(String mcard_batch_trace) {
	this.mcard_batch_trace = mcard_batch_trace;
}
public String getMcard_txn_trace() {
	return mcard_txn_trace;
}
public void setMcard_txn_trace(String mcard_txn_trace) {
	this.mcard_txn_trace = mcard_txn_trace;
}
public String getCrypto_amount() {
	return crypto_amount;
}
public void setCrypto_amount(String crypto_amount) {
	this.crypto_amount = crypto_amount;
}
public String getCrypto_cb_amount() {
	return crypto_cb_amount;
}
public void setCrypto_cb_amount(String crypto_cb_amount) {
	this.crypto_cb_amount = crypto_cb_amount;
}
public String getSrv_restrict_code() {
	return srv_restrict_code;
}
public void setSrv_restrict_code(String srv_restrict_code) {
	this.srv_restrict_code = srv_restrict_code;
}
public String getTerm_cap_profile() {
	return term_cap_profile;
}
public void setTerm_cap_profile(String term_cap_profile) {
	this.term_cap_profile = term_cap_profile;
}
public String getTvr() {
	return tvr;
}
public void setTvr(String tvr) {
	this.tvr = tvr;
}
public String getUnpredictable_num() {
	return unpredictable_num;
}
public void setUnpredictable_num(String unpredictable_num) {
	this.unpredictable_num = unpredictable_num;
}
public String getTerm_ser_num() {
	return term_ser_num;
}
public void setTerm_ser_num(String term_ser_num) {
	this.term_ser_num = term_ser_num;
}
public String getCvr() {
	return cvr;
}
public void setCvr(String cvr) {
	this.cvr = cvr;
}
public String getIssuer_discre_data() {
	return issuer_discre_data;
}
public void setIssuer_discre_data(String issuer_discre_data) {
	this.issuer_discre_data = issuer_discre_data;
}
public String getCryptogram() {
	return cryptogram;
}
public void setCryptogram(String cryptogram) {
	this.cryptogram = cryptogram;
}
public String getApp_txn_counter() {
	return app_txn_counter;
}
public void setApp_txn_counter(String app_txn_counter) {
	this.app_txn_counter = app_txn_counter;
}
public String getApp_ichg_profile() {
	return app_ichg_profile;
}
public void setApp_ichg_profile(String app_ichg_profile) {
	this.app_ichg_profile = app_ichg_profile;
}
public String getArpc_cryptogram() {
	return arpc_cryptogram;
}
public void setArpc_cryptogram(String arpc_cryptogram) {
	this.arpc_cryptogram = arpc_cryptogram;
}
public String getIssuer_script_res() {
	return issuer_script_res;
}
public void setIssuer_script_res(String issuer_script_res) {
	this.issuer_script_res = issuer_script_res;
}
public String getArpc_respcode() {
	return arpc_respcode;
}
public void setArpc_respcode(String arpc_respcode) {
	this.arpc_respcode = arpc_respcode;
}
public String getCcard_sch_crypto() {
	return ccard_sch_crypto;
}
public void setCcard_sch_crypto(String ccard_sch_crypto) {
	this.ccard_sch_crypto = ccard_sch_crypto;
}
public String getChip_type() {
	return chip_type;
}
public void setChip_type(String chip_type) {
	this.chip_type = chip_type;
}
public String getIssuer_app_data() {
	return issuer_app_data;
}
public void setIssuer_app_data(String issuer_app_data) {
	this.issuer_app_data = issuer_app_data;
}
public int getTrans_seq_counter() {
	return trans_seq_counter;
}
public void setTrans_seq_counter(int trans_seq_counter) {
	this.trans_seq_counter = trans_seq_counter;
}
public String getCvm_results() {
	return cvm_results;
}
public void setCvm_results(String cvm_results) {
	this.cvm_results = cvm_results;
}
public String getBitmap() {
	return bitmap;
}
public void setBitmap(String bitmap) {
	this.bitmap = bitmap;
}
public String getTvr_cvr_status() {
	return tvr_cvr_status;
}
public void setTvr_cvr_status(String tvr_cvr_status) {
	this.tvr_cvr_status = tvr_cvr_status;
}
public String getIssuer_auth_data() {
	return issuer_auth_data;
}
public void setIssuer_auth_data(String issuer_auth_data) {
	this.issuer_auth_data = issuer_auth_data;
}
public String getForm_factor() {
	return form_factor;
}
public void setForm_factor(String form_factor) {
	this.form_factor = form_factor;
}  
  
  
  

}
