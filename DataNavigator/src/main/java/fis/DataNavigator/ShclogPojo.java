package fis.DataNavigator;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ShclogPojo

{
	
public static ShclogPojo shclogData=null;

private ShclogPojo(){
	
}

public static ShclogPojo getinstance() {
	
	if(shclogData==null)
		shclogData=new ShclogPojo();
		
	return shclogData;
}


String    MSGTYPE                ;
String    FLIPPED_MSGTYPE        ;
String    PAN                    ;
String    MASK_PAN               ;
String    PCODE                  ;
String    TXNTYPE                ;
String    AMOUNT                 ;
String    AVAL_BALANCE           ;
String    AMOUNT_EQUIV           ;
String    CASH_BACK              ;
String    ISS_CONV_RATE          ;
String    ISS_CURRENCY_CODE      ;
String    ISS_CONV_DATE          ;
String    ACQ_CONV_RATE          ;
String    ACQ_CURRENCY_CODE      ;
String    ACQ_CONV_DATE          ;
String    TRA_AMOUNT             ;
String    TRA_CONV_RATE          ;
String    TRA_CURRENCY_CODE      ;
String    TRA_CONV_DATE          ;
String    FEE                    ;
String    NEW_FEE                ;
String    NEW_AMOUNT             ;
String    NEW_SETL_AMOUNT        ;
String    SETTLEMENT_FEE         ;
String    SETTLEMENT_RATE        ;
String    SETTLEMENT_CODE        ;
String    SETTLEMENT_AMOUNT      ;
String    TRANDATE               ;
String    TRANTIME               ;
String    TRACE                  ;
String    LOCAL_TIME             ;
String    LOCAL_DATE             ;
String    SETTLEMENT_DATE        ;
String    CAP_DATE               ;
String    POS_ENTRY_CODE         ;
String    POS_CONDITION_CODE     ;
String    POS_PIN_CAP_CODE       ;
String    POS_CAP_CODE           ;
String    LIFE_CYCLE             ;
String    ACQUIRER               ;
String    ISSUER                 ;
String    TRANSFEREE             ;
String    ORIGINATOR             ;
String    MEMBER_ID              ;
String    F_ID                   ;
String    TXNSRC                 ;
String    TXNDEST                ;
String    ALTERNATEACQUIRER      ;
String    ENTITYID               ;
String    ISS_ENTITYID           ;
String    CARDPRODUCT            ;
String    MVV                    ;
String    INVOICE_NUMBER         ;
String    TRANS_ID               ;
String    FPI                    ;
String    TXN_START_TIME         ;
String    TXN_END_TIME           ;
String    DEVICE_CAP             ;
String    RESPCODE               ;
String    REASON_CODE            ;
String    REVCODE                ;
String    SHCERROR               ;
String    SAF                    ;
String    ORIGMSG                ;
String    ORIGFLIPPEDMSG         ;
String    ORIGTRACE              ;
String    ORIGDATE               ;
String    ORIGTIME               ;
String    MERCHANT_TYPE          ;
String    ACQ_COUNTRY            ;
String    REFNUM                 ;
String    AUTHNUM                ;
String    TERMID                 ;
String    ACCEPTORNAME           ;
String    TERMLOC                ;
String    ADDRESPONSE            ;
String    ACCTNUM                ;
String    BRANCH                 ;
String    SERIAL_1               ;
String    SERIAL_2               ;
String    STOREID                ;
String    LANE                   ;
String    TERMINAL_TRACE         ;
String    CHECKER_ID             ;
String    SUPERVISOR             ;
String    SHIFT_NUMBER           ;
String    BATCH_ID               ;
String    DEVICE_DEVCAP          ;
String    SHC_DEVCAP             ;
String    FORMATTER_DEVCAP       ;
String    AUTH_DEVCAP            ;
String    FILLER1                ;
String    FILLER2                ;
String    FILLER3                ;
String    FILLER4                ;
String    ISSUER_DATA            ;
String    ACQUIRER_DATA          ;
String    NEW_AMOUNT_EQUIV       ;
String    ACQ_AVAL_BALANCE       ;
String    ACQ_LEDGER_BALANCE     ;
String    SETL_AVAL_BALANCE      ;
String    SETL_LEDGER_BALANCE    ;
String    AVAL_BALANCE_TYPE      ;
String    LEDGER_BALANCE_TYPE    ;
String    NEW_SETL_FEE           ;
String    TXN_AMOUNT             ;
String    TXN_NEW_AMOUNT         ;
String    TXN_CURRENCY_CODE      ;
String    TXN_CONV_RATE          ;
String    TXN_CONV_DATE          ;
String    CH_AMOUNT              ;
String    CH_NEW_AMOUNT          ;
String    CH_CURRENCY_CODE       ;
String    CH_CONV_RATE           ;
String    CH_CONV_DATE           ;
String    LEDGER_BALANCE         ;
String    SLOT_NUM               ;
String    DEVICE_FEE             ;
String    CARD_SEQNO             ;
String    ALPHARESPONSECODE      ;
String    CHIP_TYPE              ;
String    CHIP_INDEX         ;
String    PROCESSOR_BUSDAY    ;   
String    SEQ_TRACE_NO         ;  
String    SEG_REQ               ; 
String    SEG_RESP               ;
String    SITE_ID                ;
String    VERSION                ;
String    DEST_NODE              ;
String    SRC_NODE               ;
String    SHC_DATA_BUFFER        ;
public String getMSGTYPE() {
	return MSGTYPE;
}
public void setMSGTYPE(String mSGTYPE) {
	MSGTYPE = mSGTYPE;
}
public String getFLIPPED_MSGTYPE() {
	return FLIPPED_MSGTYPE;
}
public void setFLIPPED_MSGTYPE(String fLIPPED_MSGTYPE) {
	FLIPPED_MSGTYPE = fLIPPED_MSGTYPE;
}
public String getPAN() {
	return PAN;
}
public void setPAN(String pAN) {
	PAN = pAN;
}
public String getMASK_PAN() {
	return MASK_PAN;
}
public void setMASK_PAN(String mASK_PAN) {
	MASK_PAN = mASK_PAN;
}
public String getPCODE() {
	return PCODE;
}
public void setPCODE(String pCODE) {
	PCODE = pCODE;
}
public String getTXNTYPE() {
	return TXNTYPE;
}
public void setTXNTYPE(String tXNTYPE) {
	TXNTYPE = tXNTYPE;
}
public String getAMOUNT() {
	return AMOUNT;
}
public void setAMOUNT(String aMOUNT) {
	AMOUNT = aMOUNT;
}
public String getAVAL_BALANCE() {
	return AVAL_BALANCE;
}
public void setAVAL_BALANCE(String aVAL_BALANCE) {
	AVAL_BALANCE = aVAL_BALANCE;
}
public String getAMOUNT_EQUIV() {
	return AMOUNT_EQUIV;
}
public void setAMOUNT_EQUIV(String aMOUNT_EQUIV) {
	AMOUNT_EQUIV = aMOUNT_EQUIV;
}
public String getCASH_BACK() {
	return CASH_BACK;
}
public void setCASH_BACK(String cASH_BACK) {
	CASH_BACK = cASH_BACK;
}
public String getISS_CONV_RATE() {
	return ISS_CONV_RATE;
}
public void setISS_CONV_RATE(String iSS_CONV_RATE) {
	ISS_CONV_RATE = iSS_CONV_RATE;
}
public String getISS_CURRENCY_CODE() {
	return ISS_CURRENCY_CODE;
}
public void setISS_CURRENCY_CODE(String iSS_CURRENCY_CODE) {
	ISS_CURRENCY_CODE = iSS_CURRENCY_CODE;
}
public String getISS_CONV_DATE() {
	return ISS_CONV_DATE;
}
public void setISS_CONV_DATE(String iSS_CONV_DATE) {
	ISS_CONV_DATE = iSS_CONV_DATE;
}
public String getACQ_CONV_RATE() {
	return ACQ_CONV_RATE;
}
public void setACQ_CONV_RATE(String aCQ_CONV_RATE) {
	ACQ_CONV_RATE = aCQ_CONV_RATE;
}
public String getACQ_CURRENCY_CODE() {
	return ACQ_CURRENCY_CODE;
}
public void setACQ_CURRENCY_CODE(String aCQ_CURRENCY_CODE) {
	ACQ_CURRENCY_CODE = aCQ_CURRENCY_CODE;
}
public String getACQ_CONV_DATE() {
	return ACQ_CONV_DATE;
}
public void setACQ_CONV_DATE(String aCQ_CONV_DATE) {
	ACQ_CONV_DATE = aCQ_CONV_DATE;
}
public String getTRA_AMOUNT() {
	return TRA_AMOUNT;
}
public void setTRA_AMOUNT(String tRA_AMOUNT) {
	TRA_AMOUNT = tRA_AMOUNT;
}
public String getTRA_CONV_RATE() {
	return TRA_CONV_RATE;
}
public void setTRA_CONV_RATE(String tRA_CONV_RATE) {
	TRA_CONV_RATE = tRA_CONV_RATE;
}
public String getTRA_CURRENCY_CODE() {
	return TRA_CURRENCY_CODE;
}
public void setTRA_CURRENCY_CODE(String tRA_CURRENCY_CODE) {
	TRA_CURRENCY_CODE = tRA_CURRENCY_CODE;
}
public String getTRA_CONV_DATE() {
	return TRA_CONV_DATE;
}
public void setTRA_CONV_DATE(String tRA_CONV_DATE) {
	TRA_CONV_DATE = tRA_CONV_DATE;
}
public String getFEE() {
	return FEE;
}
public void setFEE(String fEE) {
	FEE = fEE;
}
public String getNEW_FEE() {
	return NEW_FEE;
}
public void setNEW_FEE(String nEW_FEE) {
	NEW_FEE = nEW_FEE;
}
public String getNEW_AMOUNT() {
	return NEW_AMOUNT;
}
public void setNEW_AMOUNT(String nEW_AMOUNT) {
	NEW_AMOUNT = nEW_AMOUNT;
}
public String getNEW_SETL_AMOUNT() {
	return NEW_SETL_AMOUNT;
}
public void setNEW_SETL_AMOUNT(String nEW_SETL_AMOUNT) {
	NEW_SETL_AMOUNT = nEW_SETL_AMOUNT;
}
public String getSETTLEMENT_FEE() {
	return SETTLEMENT_FEE;
}
public void setSETTLEMENT_FEE(String sETTLEMENT_FEE) {
	SETTLEMENT_FEE = sETTLEMENT_FEE;
}
public String getSETTLEMENT_RATE() {
	return SETTLEMENT_RATE;
}
public void setSETTLEMENT_RATE(String sETTLEMENT_RATE) {
	SETTLEMENT_RATE = sETTLEMENT_RATE;
}
public String getSETTLEMENT_CODE() {
	return SETTLEMENT_CODE;
}
public void setSETTLEMENT_CODE(String sETTLEMENT_CODE) {
	SETTLEMENT_CODE = sETTLEMENT_CODE;
}
public String getSETTLEMENT_AMOUNT() {
	return SETTLEMENT_AMOUNT;
}
public void setSETTLEMENT_AMOUNT(String sETTLEMENT_AMOUNT) {
	SETTLEMENT_AMOUNT = sETTLEMENT_AMOUNT;
}
public String getTRANDATE() {
	return TRANDATE;
}
public void setTRANDATE(String tRANDATE) {
	TRANDATE = tRANDATE;
}
public String getTRANTIME() {
	return TRANTIME;
}
public void setTRANTIME(String tRANTIME) {
	TRANTIME = tRANTIME;
}
public String getTRACE() {
	return TRACE;
}
public void setTRACE(String tRACE) {
	TRACE = tRACE;
}
public String getLOCAL_TIME() {
	return LOCAL_TIME;
}
public void setLOCAL_TIME(String lOCAL_TIME) {
	LOCAL_TIME = lOCAL_TIME;
}
public String getLOCAL_DATE() {
	return LOCAL_DATE;
}
public void setLOCAL_DATE(String lOCAL_DATE) {
	LOCAL_DATE = lOCAL_DATE;
}
public String getSETTLEMENT_DATE() {
	return SETTLEMENT_DATE;
}
public void setSETTLEMENT_DATE(String sETTLEMENT_DATE) {
	SETTLEMENT_DATE = sETTLEMENT_DATE;
}
public String getCAP_DATE() {
	return CAP_DATE;
}
public void setCAP_DATE(String cAP_DATE) {
	CAP_DATE = cAP_DATE;
}
public String getPOS_ENTRY_CODE() {
	return POS_ENTRY_CODE;
}
public void setPOS_ENTRY_CODE(String pOS_ENTRY_CODE) {
	POS_ENTRY_CODE = pOS_ENTRY_CODE;
}
public String getPOS_CONDITION_CODE() {
	return POS_CONDITION_CODE;
}
public void setPOS_CONDITION_CODE(String pOS_CONDITION_CODE) {
	POS_CONDITION_CODE = pOS_CONDITION_CODE;
}
public String getPOS_PIN_CAP_CODE() {
	return POS_PIN_CAP_CODE;
}
public void setPOS_PIN_CAP_CODE(String pOS_PIN_CAP_CODE) {
	POS_PIN_CAP_CODE = pOS_PIN_CAP_CODE;
}
public String getPOS_CAP_CODE() {
	return POS_CAP_CODE;
}
public void setPOS_CAP_CODE(String pOS_CAP_CODE) {
	POS_CAP_CODE = pOS_CAP_CODE;
}
public String getLIFE_CYCLE() {
	return LIFE_CYCLE;
}
public void setLIFE_CYCLE(String lIFE_CYCLE) {
	LIFE_CYCLE = lIFE_CYCLE;
}
public String getACQUIRER() {
	return ACQUIRER;
}
public void setACQUIRER(String aCQUIRER) {
	ACQUIRER = aCQUIRER;
}
public String getISSUER() {
	return ISSUER;
}
public void setISSUER(String iSSUER) {
	ISSUER = iSSUER;
}
public String getTRANSFEREE() {
	return TRANSFEREE;
}
public void setTRANSFEREE(String tRANSFEREE) {
	TRANSFEREE = tRANSFEREE;
}
public String getORIGINATOR() {
	return ORIGINATOR;
}
public void setORIGINATOR(String oRIGINATOR) {
	ORIGINATOR = oRIGINATOR;
}
public String getMEMBER_ID() {
	return MEMBER_ID;
}
public void setMEMBER_ID(String mEMBER_ID) {
	MEMBER_ID = mEMBER_ID;
}
public String getF_ID() {
	return F_ID;
}
public void setF_ID(String f_ID) {
	F_ID = f_ID;
}
public String getTXNSRC() {
	return TXNSRC;
}
public void setTXNSRC(String tXNSRC) {
	TXNSRC = tXNSRC;
}
public String getTXNDEST() {
	return TXNDEST;
}
public void setTXNDEST(String tXNDEST) {
	TXNDEST = tXNDEST;
}
public String getALTERNATEACQUIRER() {
	return ALTERNATEACQUIRER;
}
public void setALTERNATEACQUIRER(String aLTERNATEACQUIRER) {
	ALTERNATEACQUIRER = aLTERNATEACQUIRER;
}
public String getENTITYID() {
	return ENTITYID;
}
public void setENTITYID(String eNTITYID) {
	ENTITYID = eNTITYID;
}
public String getISS_ENTITYID() {
	return ISS_ENTITYID;
}
public void setISS_ENTITYID(String iSS_ENTITYID) {
	ISS_ENTITYID = iSS_ENTITYID;
}
public String getCARDPRODUCT() {
	return CARDPRODUCT;
}
public void setCARDPRODUCT(String cARDPRODUCT) {
	CARDPRODUCT = cARDPRODUCT;
}
public String getMVV() {
	return MVV;
}
public void setMVV(String mVV) {
	MVV = mVV;
}
public String getINVOICE_NUMBER() {
	return INVOICE_NUMBER;
}
public void setINVOICE_NUMBER(String iNVOICE_NUMBER) {
	INVOICE_NUMBER = iNVOICE_NUMBER;
}
public String getTRANS_ID() {
	return TRANS_ID;
}
public void setTRANS_ID(String tRANS_ID) {
	TRANS_ID = tRANS_ID;
}
public String getFPI() {
	return FPI;
}
public void setFPI(String fPI) {
	FPI = fPI;
}
public String getTXN_START_TIME() {
	return TXN_START_TIME;
}
public void setTXN_START_TIME(String tXN_START_TIME) {
	TXN_START_TIME = tXN_START_TIME;
}
public String getTXN_END_TIME() {
	return TXN_END_TIME;
}
public void setTXN_END_TIME(String tXN_END_TIME) {
	TXN_END_TIME = tXN_END_TIME;
}
public String getDEVICE_CAP() {
	return DEVICE_CAP;
}
public void setDEVICE_CAP(String dEVICE_CAP) {
	DEVICE_CAP = dEVICE_CAP;
}
public String getRESPCODE() {
	return RESPCODE;
}
public void setRESPCODE(String rESPCODE) {
	RESPCODE = rESPCODE;
}
public String getREASON_CODE() {
	return REASON_CODE;
}
public void setREASON_CODE(String rEASON_CODE) {
	REASON_CODE = rEASON_CODE;
}
public String getREVCODE() {
	return REVCODE;
}
public void setREVCODE(String rEVCODE) {
	REVCODE = rEVCODE;
}
public String getSHCERROR() {
	return SHCERROR;
}
public void setSHCERROR(String sHCERROR) {
	SHCERROR = sHCERROR;
}
public String getSAF() {
	return SAF;
}
public void setSAF(String sAF) {
	SAF = sAF;
}
public String getORIGMSG() {
	return ORIGMSG;
}
public void setORIGMSG(String oRIGMSG) {
	ORIGMSG = oRIGMSG;
}
public String getORIGFLIPPEDMSG() {
	return ORIGFLIPPEDMSG;
}
public void setORIGFLIPPEDMSG(String oRIGFLIPPEDMSG) {
	ORIGFLIPPEDMSG = oRIGFLIPPEDMSG;
}
public String getORIGTRACE() {
	return ORIGTRACE;
}
public void setORIGTRACE(String oRIGTRACE) {
	ORIGTRACE = oRIGTRACE;
}
public String getORIGDATE() {
	return ORIGDATE;
}
public void setORIGDATE(String oRIGDATE) {
	ORIGDATE = oRIGDATE;
}
public String getORIGTIME() {
	return ORIGTIME;
}
public void setORIGTIME(String oRIGTIME) {
	ORIGTIME = oRIGTIME;
}
public String getMERCHANT_TYPE() {
	return MERCHANT_TYPE;
}
public void setMERCHANT_TYPE(String mERCHANT_TYPE) {
	MERCHANT_TYPE = mERCHANT_TYPE;
}
public String getACQ_COUNTRY() {
	return ACQ_COUNTRY;
}
public void setACQ_COUNTRY(String aCQ_COUNTRY) {
	ACQ_COUNTRY = aCQ_COUNTRY;
}
public String getREFNUM() {
	return REFNUM;
}
public void setREFNUM(String rEFNUM) {
	REFNUM = rEFNUM;
}
public String getAUTHNUM() {
	return AUTHNUM;
}
public void setAUTHNUM(String aUTHNUM) {
	AUTHNUM = aUTHNUM;
}
public String getTERMID() {
	return TERMID;
}
public void setTERMID(String tERMID) {
	TERMID = tERMID;
}
public String getACCEPTORNAME() {
	return ACCEPTORNAME;
}
public void setACCEPTORNAME(String aCCEPTORNAME) {
	ACCEPTORNAME = aCCEPTORNAME;
}
public String getTERMLOC() {
	return TERMLOC;
}
public void setTERMLOC(String tERMLOC) {
	TERMLOC = tERMLOC;
}
public String getADDRESPONSE() {
	return ADDRESPONSE;
}
public void setADDRESPONSE(String aDDRESPONSE) {
	ADDRESPONSE = aDDRESPONSE;
}
public String getACCTNUM() {
	return ACCTNUM;
}
public void setACCTNUM(String aCCTNUM) {
	ACCTNUM = aCCTNUM;
}
public String getBRANCH() {
	return BRANCH;
}
public void setBRANCH(String bRANCH) {
	BRANCH = bRANCH;
}
public String getSERIAL_1() {
	return SERIAL_1;
}
public void setSERIAL_1(String sERIAL_1) {
	SERIAL_1 = sERIAL_1;
}
public String getSERIAL_2() {
	return SERIAL_2;
}
public void setSERIAL_2(String sERIAL_2) {
	SERIAL_2 = sERIAL_2;
}
public String getSTOREID() {
	return STOREID;
}
public void setSTOREID(String sTOREID) {
	STOREID = sTOREID;
}
public String getLANE() {
	return LANE;
}
public void setLANE(String lANE) {
	LANE = lANE;
}
public String getTERMINAL_TRACE() {
	return TERMINAL_TRACE;
}
public void setTERMINAL_TRACE(String tERMINAL_TRACE) {
	TERMINAL_TRACE = tERMINAL_TRACE;
}
public String getCHECKER_ID() {
	return CHECKER_ID;
}
public void setCHECKER_ID(String cHECKER_ID) {
	CHECKER_ID = cHECKER_ID;
}
public String getSUPERVISOR() {
	return SUPERVISOR;
}
public void setSUPERVISOR(String sUPERVISOR) {
	SUPERVISOR = sUPERVISOR;
}
public String getSHIFT_NUMBER() {
	return SHIFT_NUMBER;
}
public void setSHIFT_NUMBER(String sHIFT_NUMBER) {
	SHIFT_NUMBER = sHIFT_NUMBER;
}
public String getBATCH_ID() {
	return BATCH_ID;
}
public void setBATCH_ID(String bATCH_ID) {
	BATCH_ID = bATCH_ID;
}
public String getDEVICE_DEVCAP() {
	return DEVICE_DEVCAP;
}
public void setDEVICE_DEVCAP(String dEVICE_DEVCAP) {
	DEVICE_DEVCAP = dEVICE_DEVCAP;
}
public String getSHC_DEVCAP() {
	return SHC_DEVCAP;
}
public void setSHC_DEVCAP(String sHC_DEVCAP) {
	SHC_DEVCAP = sHC_DEVCAP;
}
public String getFORMATTER_DEVCAP() {
	return FORMATTER_DEVCAP;
}
public void setFORMATTER_DEVCAP(String fORMATTER_DEVCAP) {
	FORMATTER_DEVCAP = fORMATTER_DEVCAP;
}
public String getAUTH_DEVCAP() {
	return AUTH_DEVCAP;
}
public void setAUTH_DEVCAP(String aUTH_DEVCAP) {
	AUTH_DEVCAP = aUTH_DEVCAP;
}
public String getFILLER1() {
	return FILLER1;
}
public void setFILLER1(String fILLER1) {
	FILLER1 = fILLER1;
}
public String getFILLER2() {
	return FILLER2;
}
public void setFILLER2(String fILLER2) {
	FILLER2 = fILLER2;
}
public String getFILLER3() {
	return FILLER3;
}
public void setFILLER3(String fILLER3) {
	FILLER3 = fILLER3;
}
public String getFILLER4() {
	return FILLER4;
}
public void setFILLER4(String fILLER4) {
	FILLER4 = fILLER4;
}
public String getISSUER_DATA() {
	return ISSUER_DATA;
}
public void setISSUER_DATA(String iSSUER_DATA) {
	ISSUER_DATA = iSSUER_DATA;
}
public String getACQUIRER_DATA() {
	return ACQUIRER_DATA;
}
public void setACQUIRER_DATA(String aCQUIRER_DATA) {
	ACQUIRER_DATA = aCQUIRER_DATA;
}
public String getNEW_AMOUNT_EQUIV() {
	return NEW_AMOUNT_EQUIV;
}
public void setNEW_AMOUNT_EQUIV(String nEW_AMOUNT_EQUIV) {
	NEW_AMOUNT_EQUIV = nEW_AMOUNT_EQUIV;
}
public String getACQ_AVAL_BALANCE() {
	return ACQ_AVAL_BALANCE;
}
public void setACQ_AVAL_BALANCE(String aCQ_AVAL_BALANCE) {
	ACQ_AVAL_BALANCE = aCQ_AVAL_BALANCE;
}
public String getACQ_LEDGER_BALANCE() {
	return ACQ_LEDGER_BALANCE;
}
public void setACQ_LEDGER_BALANCE(String aCQ_LEDGER_BALANCE) {
	ACQ_LEDGER_BALANCE = aCQ_LEDGER_BALANCE;
}
public String getSETL_AVAL_BALANCE() {
	return SETL_AVAL_BALANCE;
}
public void setSETL_AVAL_BALANCE(String sETL_AVAL_BALANCE) {
	SETL_AVAL_BALANCE = sETL_AVAL_BALANCE;
}
public String getSETL_LEDGER_BALANCE() {
	return SETL_LEDGER_BALANCE;
}
public void setSETL_LEDGER_BALANCE(String sETL_LEDGER_BALANCE) {
	SETL_LEDGER_BALANCE = sETL_LEDGER_BALANCE;
}
public String getAVAL_BALANCE_TYPE() {
	return AVAL_BALANCE_TYPE;
}
public void setAVAL_BALANCE_TYPE(String aVAL_BALANCE_TYPE) {
	AVAL_BALANCE_TYPE = aVAL_BALANCE_TYPE;
}
public String getLEDGER_BALANCE_TYPE() {
	return LEDGER_BALANCE_TYPE;
}
public void setLEDGER_BALANCE_TYPE(String lEDGER_BALANCE_TYPE) {
	LEDGER_BALANCE_TYPE = lEDGER_BALANCE_TYPE;
}
public String getNEW_SETL_FEE() {
	return NEW_SETL_FEE;
}
public void setNEW_SETL_FEE(String nEW_SETL_FEE) {
	NEW_SETL_FEE = nEW_SETL_FEE;
}
public String getTXN_AMOUNT() {
	return TXN_AMOUNT;
}
public void setTXN_AMOUNT(String tXN_AMOUNT) {
	TXN_AMOUNT = tXN_AMOUNT;
}
public String getTXN_NEW_AMOUNT() {
	return TXN_NEW_AMOUNT;
}
public void setTXN_NEW_AMOUNT(String tXN_NEW_AMOUNT) {
	TXN_NEW_AMOUNT = tXN_NEW_AMOUNT;
}
public String getTXN_CURRENCY_CODE() {
	return TXN_CURRENCY_CODE;
}
public void setTXN_CURRENCY_CODE(String tXN_CURRENCY_CODE) {
	TXN_CURRENCY_CODE = tXN_CURRENCY_CODE;
}
public String getTXN_CONV_RATE() {
	return TXN_CONV_RATE;
}
public void setTXN_CONV_RATE(String tXN_CONV_RATE) {
	TXN_CONV_RATE = tXN_CONV_RATE;
}
public String getTXN_CONV_DATE() {
	return TXN_CONV_DATE;
}
public void setTXN_CONV_DATE(String tXN_CONV_DATE) {
	TXN_CONV_DATE = tXN_CONV_DATE;
}
public String getCH_AMOUNT() {
	return CH_AMOUNT;
}
public void setCH_AMOUNT(String cH_AMOUNT) {
	CH_AMOUNT = cH_AMOUNT;
}
public String getCH_NEW_AMOUNT() {
	return CH_NEW_AMOUNT;
}
public void setCH_NEW_AMOUNT(String cH_NEW_AMOUNT) {
	CH_NEW_AMOUNT = cH_NEW_AMOUNT;
}
public String getCH_CURRENCY_CODE() {
	return CH_CURRENCY_CODE;
}
public void setCH_CURRENCY_CODE(String cH_CURRENCY_CODE) {
	CH_CURRENCY_CODE = cH_CURRENCY_CODE;
}
public String getCH_CONV_RATE() {
	return CH_CONV_RATE;
}
public void setCH_CONV_RATE(String cH_CONV_RATE) {
	CH_CONV_RATE = cH_CONV_RATE;
}
public String getCH_CONV_DATE() {
	return CH_CONV_DATE;
}
public void setCH_CONV_DATE(String cH_CONV_DATE) {
	CH_CONV_DATE = cH_CONV_DATE;
}
public String getLEDGER_BALANCE() {
	return LEDGER_BALANCE;
}
public void setLEDGER_BALANCE(String lEDGER_BALANCE) {
	LEDGER_BALANCE = lEDGER_BALANCE;
}
public String getSLOT_NUM() {
	return SLOT_NUM;
}
public void setSLOT_NUM(String sLOT_NUM) {
	SLOT_NUM = sLOT_NUM;
}
public String getDEVICE_FEE() {
	return DEVICE_FEE;
}
public void setDEVICE_FEE(String dEVICE_FEE) {
	DEVICE_FEE = dEVICE_FEE;
}
public String getCARD_SEQNO() {
	return CARD_SEQNO;
}
public void setCARD_SEQNO(String cARD_SEQNO) {
	CARD_SEQNO = cARD_SEQNO;
}
public String getALPHARESPONSECODE() {
	return ALPHARESPONSECODE;
}
public void setALPHARESPONSECODE(String aLPHARESPONSECODE) {
	ALPHARESPONSECODE = aLPHARESPONSECODE;
}
public String getCHIP_TYPE() {
	return CHIP_TYPE;
}
public void setCHIP_TYPE(String cHIP_TYPE) {
	CHIP_TYPE = cHIP_TYPE;
}
public String getCHIP_INDEX() {
	return CHIP_INDEX;
}
public void setCHIP_INDEX(String cHIP_INDEX) {
	CHIP_INDEX = cHIP_INDEX;
}
public String getPROCESSOR_BUSDAY() {
	return PROCESSOR_BUSDAY;
}
public void setPROCESSOR_BUSDAY(String pROCESSOR_BUSDAY) {
	PROCESSOR_BUSDAY = pROCESSOR_BUSDAY;
}
public String getSEQ_TRACE_NO() {
	return SEQ_TRACE_NO;
}
public void setSEQ_TRACE_NO(String sEQ_TRACE_NO) {
	SEQ_TRACE_NO = sEQ_TRACE_NO;
}
public String getSEG_REQ() {
	return SEG_REQ;
}
public void setSEG_REQ(String sEG_REQ) {
	SEG_REQ = sEG_REQ;
}
public String getSEG_RESP() {
	return SEG_RESP;
}
public void setSEG_RESP(String sEG_RESP) {
	SEG_RESP = sEG_RESP;
}
public String getSITE_ID() {
	return SITE_ID;
}
public void setSITE_ID(String sITE_ID) {
	SITE_ID = sITE_ID;
}
public String getVERSION() {
	return VERSION;
}
public void setVERSION(String vERSION) {
	VERSION = vERSION;
}
public String getDEST_NODE() {
	return DEST_NODE;
}
public void setDEST_NODE(String dEST_NODE) {
	DEST_NODE = dEST_NODE;
}
public String getSRC_NODE() {
	return SRC_NODE;
}
public void setSRC_NODE(String sRC_NODE) {
	SRC_NODE = sRC_NODE;
}
public String getSHC_DATA_BUFFER() {
	return SHC_DATA_BUFFER;
}
public void setSHC_DATA_BUFFER(String sHC_DATA_BUFFER) {
	SHC_DATA_BUFFER = sHC_DATA_BUFFER;
}



	
}

	

