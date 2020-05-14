package DN_GUI;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/*
public class Shclog
{
	
	ArrayList<Object> rows;
	ArrayList<String> columns;
    
  int 	msgtype;
    int 	flipped_msgtype;
    String  pan;
    String  mask_pan;
    int     pcode;
    int txntype;
    float     amount;
    float     aval_balance;
    float     amount_equiv;
    float     cash_back;
    float     iss_conv_rate;
    short   iss_currency_code;
    String      iss_conv_date;
    float     acq_conv_rate;
    short   acq_currency_code;
    String      acq_conv_date;
    float     tra_amount;
    float     tra_conv_rate;
    short   tra_currency_code;
    String      tra_conv_date;
    float     fee;
    float     new_fee;
    float     new_amount;
    float     new_setl_amount;
    float     settlement_fee;
    float     settlement_rate;
    short   settlement_code;
    float     settlement_amount;
    String      trandate;
	int trantime;
    int trace;
    int local_time;
    String      local_date;
    String      settlement_date;
    String      cap_date;
    short   pos_entry_code;
    short   pos_condition_code;
    String    pos_pin_cap_code;
    short   pos_cap_code;
    int life_cycle;
    String    acquirer;
    String    issuer;
    String    transferee;
    String    originator;
    String    member_id;
    String    f_id;
    String    txnsrc;
    String    txndest;
    String    alternateacquirer;
    String    entityid;
    String    iss_entityid;
    String    cardproduct;
    String    mvv;
    String    invoice_number;
    String    trans_id;
    String    fpi;
	int txn_start_time;
    int txn_end_time;
    int device_cap;
    int respcode;
    int reason_code;
    int revcode;
    int shcerror;
    short   saf;
    short   origmsg;
    short   origflippedmsg;
    int origtrace;
    String      origdate;
    int origtime;
    short   merchant_type;
    short   acq_country;
    String    refnum;
    String    authnum;
    String    termid;
    String    acceptorname;
    String    termloc;
    String    addresponse;
    String    acctnum;
    short   branch;
    int serial_1;
    int serial_2;
    int storeid;
    int lane;
    int terminal_trace;
    int checker_id;
    int supervisor;
    int shift_number;
    int batch_id;
    int device_devcap;
    int shc_devcap;
	int formatter_devcap;
    int auth_devcap;
    String    filler1;
    String    filler2;
    String    filler3;
    String    filler4;
    String    issuer_data;
    String    acquirer_data;
    float     new_amount_equiv;
    float     acq_aval_balance;
    float     acq_ledger_balance;
    float     setl_aval_balance;
    float     setl_ledger_balance;
    short   aval_balance_type;
    short   ledger_balance_type;
    float     new_setl_fee;
    float     txn_amount;
    float     txn_new_amount;
    short   txn_currency_code;
    float     txn_conv_rate;
    String      txn_conv_date;
    float     ch_amount;
    float     ch_new_amount;
    short   ch_currency_code;
    float     ch_conv_rate;
    String      ch_conv_date;
    float     ledger_balance;
    short   slot_num;
    float     device_fee;
    String   shc_data_buffer;
    short   card_seqno;
    String    alpharesponsecode;
    String    chip_type;
    String    chip_index;
    String      processor_busday;
	int seq_trace_no;
    String seg_req;
    String seg_resp;
    short   site_id;
    short   version;
    short   src_node;
    short   dest_node;
	
    public int getMsgtype() {
		return msgtype;
	}
	public void setMsgtype(int msgtype) {
		this.msgtype = msgtype;
	}
	public int getFlipped_msgtype() {
		return flipped_msgtype;
	}
	public void setFlipped_msgtype(int flipped_msgtype) {
		this.flipped_msgtype = flipped_msgtype;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getMask_pan() {
		return mask_pan;
	}
	public void setMask_pan(String mask_pan) {
		this.mask_pan = mask_pan;
	}
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public int getTxntype() {
		return txntype;
	}
	public void setTxntype(int txntype) {
		this.txntype = txntype;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public float getAval_balance() {
		return aval_balance;
	}
	public void setAval_balance(float aval_balance) {
		this.aval_balance = aval_balance;
	}
	public float getAmount_equiv() {
		return amount_equiv;
	}
	public void setAmount_equiv(float amount_equiv) {
		this.amount_equiv = amount_equiv;
	}
	public float getCash_back() {
		return cash_back;
	}
	public void setCash_back(float cash_back) {
		this.cash_back = cash_back;
	}
	public float getIss_conv_rate() {
		return iss_conv_rate;
	}
	public void setIss_conv_rate(float iss_conv_rate) {
		this.iss_conv_rate = iss_conv_rate;
	}
	public short getIss_currency_code() {
		return iss_currency_code;
	}
	public void setIss_currency_code(short iss_currency_code) {
		this.iss_currency_code = iss_currency_code;
	}
	public String getIss_conv_date() {
		return iss_conv_date;
	}
	public void setIss_conv_date(String iss_conv_date) {
		this.iss_conv_date = iss_conv_date;
	}
	public float getAcq_conv_rate() {
		return acq_conv_rate;
	}
	public void setAcq_conv_rate(float acq_conv_rate) {
		this.acq_conv_rate = acq_conv_rate;
	}
	public short getAcq_currency_code() {
		return acq_currency_code;
	}
	public void setAcq_currency_code(short acq_currency_code) {
		this.acq_currency_code = acq_currency_code;
	}
	public String getAcq_conv_date() {
		return acq_conv_date;
	}
	public void setAcq_conv_date(String acq_conv_date) {
		this.acq_conv_date = acq_conv_date;
	}
	public float getTra_amount() {
		return tra_amount;
	}
	public void setTra_amount(float tra_amount) {
		this.tra_amount = tra_amount;
	}
	public float getTra_conv_rate() {
		return tra_conv_rate;
	}
	public void setTra_conv_rate(float tra_conv_rate) {
		this.tra_conv_rate = tra_conv_rate;
	}
	public short getTra_currency_code() {
		return tra_currency_code;
	}
	public void setTra_currency_code(short tra_currency_code) {
		this.tra_currency_code = tra_currency_code;
	}
	public String getTra_conv_date() {
		return tra_conv_date;
	}
	public void setTra_conv_date(String tra_conv_date) {
		this.tra_conv_date = tra_conv_date;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	public float getNew_fee() {
		return new_fee;
	}
	public void setNew_fee(float new_fee) {
		this.new_fee = new_fee;
	}
	public float getNew_amount() {
		return new_amount;
	}
	public void setNew_amount(float new_amount) {
		this.new_amount = new_amount;
	}
	public float getNew_setl_amount() {
		return new_setl_amount;
	}
	public void setNew_setl_amount(float new_setl_amount) {
		this.new_setl_amount = new_setl_amount;
	}
	public float getSettlement_fee() {
		return settlement_fee;
	}
	public void setSettlement_fee(float settlement_fee) {
		this.settlement_fee = settlement_fee;
	}
	public float getSettlement_rate() {
		return settlement_rate;
	}
	public void setSettlement_rate(float settlement_rate) {
		this.settlement_rate = settlement_rate;
	}
	public short getSettlement_code() {
		return settlement_code;
	}
	public void setSettlement_code(short settlement_code) {
		this.settlement_code = settlement_code;
	}
	public float getSettlement_amount() {
		return settlement_amount;
	}
	public void setSettlement_amount(float settlement_amount) {
		this.settlement_amount = settlement_amount;
	}
	public String getTrandate() {
		return trandate;
	}
	public void setTrandate(String trandate) {
		this.trandate = trandate;
	}
	public int getTrantime() {
		return trantime;
	}
	public void setTrantime(int trantime) {
		this.trantime = trantime;
	}
	public int getTrace() {
		return trace;
	}
	public void setTrace(int trace) {
		this.trace = trace;
	}
	public int getLocal_time() {
		return local_time;
	}
	public void setLocal_time(int local_time) {
		this.local_time = local_time;
	}
	public String getLocal_date() {
		return local_date;
	}
	public void setLocal_date(String local_date) {
		this.local_date = local_date;
	}
	public String getSettlement_date() {
		return settlement_date;
	}
	public void setSettlement_date(String settlement_date) {
		this.settlement_date = settlement_date;
	}
	public String getCap_date() {
		return cap_date;
	}
	public void setCap_date(String cap_date) {
		this.cap_date = cap_date;
	}
	public short getPos_entry_code() {
		return pos_entry_code;
	}
	public void setPos_entry_code(short pos_entry_code) {
		this.pos_entry_code = pos_entry_code;
	}
	public short getPos_condition_code() {
		return pos_condition_code;
	}
	public void setPos_condition_code(short pos_condition_code) {
		this.pos_condition_code = pos_condition_code;
	}
	public String getPos_pin_cap_code() {
		return pos_pin_cap_code;
	}
	public void setPos_pin_cap_code(String pos_pin_cap_code) {
		this.pos_pin_cap_code = pos_pin_cap_code;
	}
	public short getPos_cap_code() {
		return pos_cap_code;
	}
	public void setPos_cap_code(short pos_cap_code) {
		this.pos_cap_code = pos_cap_code;
	}
	public int getLife_cycle() {
		return life_cycle;
	}
	public void setLife_cycle(int life_cycle) {
		this.life_cycle = life_cycle;
	}
	public String getAcquirer() {
		return acquirer;
	}
	public void setAcquirer(String acquirer) {
		this.acquirer = acquirer;
	}
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	public String getTransferee() {
		return transferee;
	}
	public void setTransferee(String transferee) {
		this.transferee = transferee;
	}
	public String getOriginator() {
		return originator;
	}
	public void setOriginator(String originator) {
		this.originator = originator;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getF_id() {
		return f_id;
	}
	public void setF_id(String f_id) {
		this.f_id = f_id;
	}
	public String getTxnsrc() {
		return txnsrc;
	}
	public void setTxnsrc(String txnsrc) {
		this.txnsrc = txnsrc;
	}
	public String getTxndest() {
		return txndest;
	}
	public void setTxndest(String txndest) {
		this.txndest = txndest;
	}
	public String getAlternateacquirer() {
		return alternateacquirer;
	}
	public void setAlternateacquirer(String alternateacquirer) {
		this.alternateacquirer = alternateacquirer;
	}
	public String getEntityid() {
		return entityid;
	}
	public void setEntityid(String entityid) {
		this.entityid = entityid;
	}
	public String getIss_entityid() {
		return iss_entityid;
	}
	public void setIss_entityid(String iss_entityid) {
		this.iss_entityid = iss_entityid;
	}
	public String getCardproduct() {
		return cardproduct;
	}
	public void setCardproduct(String cardproduct) {
		this.cardproduct = cardproduct;
	}
	public String getMvv() {
		return mvv;
	}
	public void setMvv(String mvv) {
		this.mvv = mvv;
	}
	public String getInvoice_number() {
		return invoice_number;
	}
	public void setInvoice_number(String invoice_number) {
		this.invoice_number = invoice_number;
	}
	public String getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
	}
	public String getFpi() {
		return fpi;
	}
	public void setFpi(String fpi) {
		this.fpi = fpi;
	}
	public int getTxn_start_time() {
		return txn_start_time;
	}
	public void setTxn_start_time(int txn_start_time) {
		this.txn_start_time = txn_start_time;
	}
	public int getTxn_end_time() {
		return txn_end_time;
	}
	public void setTxn_end_time(int txn_end_time) {
		this.txn_end_time = txn_end_time;
	}
	public int getDevice_cap() {
		return device_cap;
	}
	public void setDevice_cap(int device_cap) {
		this.device_cap = device_cap;
	}
	public int getRespcode() {
		return respcode;
	}
	public void setRespcode(int respcode) {
		this.respcode = respcode;
	}
	public int getReason_code() {
		return reason_code;
	}
	public void setReason_code(int reason_code) {
		this.reason_code = reason_code;
	}
	public int getRevcode() {
		return revcode;
	}
	public void setRevcode(int revcode) {
		this.revcode = revcode;
	}
	public int getShcerror() {
		return shcerror;
	}
	public void setShcerror(int shcerror) {
		this.shcerror = shcerror;
	}
	public short getSaf() {
		return saf;
	}
	public void setSaf(short saf) {
		this.saf = saf;
	}
	public short getOrigmsg() {
		return origmsg;
	}
	public void setOrigmsg(short origmsg) {
		this.origmsg = origmsg;
	}
	public short getOrigflippedmsg() {
		return origflippedmsg;
	}
	public void setOrigflippedmsg(short origflippedmsg) {
		this.origflippedmsg = origflippedmsg;
	}
	public int getOrigtrace() {
		return origtrace;
	}
	public void setOrigtrace(int origtrace) {
		this.origtrace = origtrace;
	}
	public String getOrigdate() {
		return origdate;
	}
	public void setOrigdate(String origdate) {
		this.origdate = origdate;
	}
	public int getOrigtime() {
		return origtime;
	}
	public void setOrigtime(int origtime) {
		this.origtime = origtime;
	}
	public short getMerchant_type() {
		return merchant_type;
	}
	public void setMerchant_type(short merchant_type) {
		this.merchant_type = merchant_type;
	}
	public short getAcq_country() {
		return acq_country;
	}
	public void setAcq_country(short acq_country) {
		this.acq_country = acq_country;
	}
	public String getRefnum() {
		return refnum;
	}
	public void setRefnum(String refnum) {
		this.refnum = refnum;
	}
	public String getAuthnum() {
		return authnum;
	}
	public void setAuthnum(String authnum) {
		this.authnum = authnum;
	}
	public String getTermid() {
		return termid;
	}
	public void setTermid(String termid) {
		this.termid = termid;
	}
	public String getAcceptorname() {
		return acceptorname;
	}
	public void setAcceptorname(String acceptorname) {
		this.acceptorname = acceptorname;
	}
	public String getTermloc() {
		return termloc;
	}
	public void setTermloc(String termloc) {
		this.termloc = termloc;
	}
	public String getAddresponse() {
		return addresponse;
	}
	public void setAddresponse(String addresponse) {
		this.addresponse = addresponse;
	}
	public String getAcctnum() {
		return acctnum;
	}
	public void setAcctnum(String acctnum) {
		this.acctnum = acctnum;
	}
	public short getBranch() {
		return branch;
	}
	public void setBranch(short branch) {
		this.branch = branch;
	}
	public int getSerial_1() {
		return serial_1;
	}
	public void setSerial_1(int serial_1) {
		this.serial_1 = serial_1;
	}
	public int getSerial_2() {
		return serial_2;
	}
	public void setSerial_2(int serial_2) {
		this.serial_2 = serial_2;
	}
	public int getStoreid() {
		return storeid;
	}
	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}
	public int getLane() {
		return lane;
	}
	public void setLane(int lane) {
		this.lane = lane;
	}
	public int getTerminal_trace() {
		return terminal_trace;
	}
	public void setTerminal_trace(int terminal_trace) {
		this.terminal_trace = terminal_trace;
	}
	public int getChecker_id() {
		return checker_id;
	}
	public void setChecker_id(int checker_id) {
		this.checker_id = checker_id;
	}
	public int getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(int supervisor) {
		this.supervisor = supervisor;
	}
	public int getShift_number() {
		return shift_number;
	}
	public void setShift_number(int shift_number) {
		this.shift_number = shift_number;
	}
	public int getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}
	public int getDevice_devcap() {
		return device_devcap;
	}
	public void setDevice_devcap(int device_devcap) {
		this.device_devcap = device_devcap;
	}
	public int getShc_devcap() {
		return shc_devcap;
	}
	public void setShc_devcap(int shc_devcap) {
		this.shc_devcap = shc_devcap;
	}
	public int getFormatter_devcap() {
		return formatter_devcap;
	}
	public void setFormatter_devcap(int formatter_devcap) {
		this.formatter_devcap = formatter_devcap;
	}
	public int getAuth_devcap() {
		return auth_devcap;
	}
	public void setAuth_devcap(int auth_devcap) {
		this.auth_devcap = auth_devcap;
	}
	public String getFiller1() {
		return filler1;
	}
	public void setFiller1(String filler1) {
		this.filler1 = filler1;
	}
	public String getFiller2() {
		return filler2;
	}
	public void setFiller2(String filler2) {
		this.filler2 = filler2;
	}
	public String getFiller3() {
		return filler3;
	}
	public void setFiller3(String filler3) {
		this.filler3 = filler3;
	}
	public String getFiller4() {
		return filler4;
	}
	public void setFiller4(String filler4) {
		this.filler4 = filler4;
	}
	public String getIssuer_data() {
		return issuer_data;
	}
	public void setIssuer_data(String issuer_data) {
		this.issuer_data = issuer_data;
	}
	public String getAcquirer_data() {
		return acquirer_data;
	}
	public void setAcquirer_data(String acquirer_data) {
		this.acquirer_data = acquirer_data;
	}
	public float getNew_amount_equiv() {
		return new_amount_equiv;
	}
	public void setNew_amount_equiv(float new_amount_equiv) {
		this.new_amount_equiv = new_amount_equiv;
	}
	public float getAcq_aval_balance() {
		return acq_aval_balance;
	}
	public void setAcq_aval_balance(float acq_aval_balance) {
		this.acq_aval_balance = acq_aval_balance;
	}
	public float getAcq_ledger_balance() {
		return acq_ledger_balance;
	}
	public void setAcq_ledger_balance(float acq_ledger_balance) {
		this.acq_ledger_balance = acq_ledger_balance;
	}
	public float getSetl_aval_balance() {
		return setl_aval_balance;
	}
	public void setSetl_aval_balance(float setl_aval_balance) {
		this.setl_aval_balance = setl_aval_balance;
	}
	public float getSetl_ledger_balance() {
		return setl_ledger_balance;
	}
	public void setSetl_ledger_balance(float setl_ledger_balance) {
		this.setl_ledger_balance = setl_ledger_balance;
	}
	public short getAval_balance_type() {
		return aval_balance_type;
	}
	public void setAval_balance_type(short aval_balance_type) {
		this.aval_balance_type = aval_balance_type;
	}
	public short getLedger_balance_type() {
		return ledger_balance_type;
	}
	public void setLedger_balance_type(short ledger_balance_type) {
		this.ledger_balance_type = ledger_balance_type;
	}
	public float getNew_setl_fee() {
		return new_setl_fee;
	}
	public void setNew_setl_fee(float new_setl_fee) {
		this.new_setl_fee = new_setl_fee;
	}
	public float getTxn_amount() {
		return txn_amount;
	}
	public void setTxn_amount(float txn_amount) {
		this.txn_amount = txn_amount;
	}
	public float getTxn_new_amount() {
		return txn_new_amount;
	}
	public void setTxn_new_amount(float txn_new_amount) {
		this.txn_new_amount = txn_new_amount;
	}
	public short getTxn_currency_code() {
		return txn_currency_code;
	}
	public void setTxn_currency_code(short txn_currency_code) {
		this.txn_currency_code = txn_currency_code;
	}
	public float getTxn_conv_rate() {
		return txn_conv_rate;
	}
	public void setTxn_conv_rate(float txn_conv_rate) {
		this.txn_conv_rate = txn_conv_rate;
	}
	public String getTxn_conv_date() {
		return txn_conv_date;
	}
	public void setTxn_conv_date(String txn_conv_date) {
		this.txn_conv_date = txn_conv_date;
	}
	public float getCh_amount() {
		return ch_amount;
	}
	public void setCh_amount(float ch_amount) {
		this.ch_amount = ch_amount;
	}
	public float getCh_new_amount() {
		return ch_new_amount;
	}
	public void setCh_new_amount(float ch_new_amount) {
		this.ch_new_amount = ch_new_amount;
	}
	public short getCh_currency_code() {
		return ch_currency_code;
	}
	public void setCh_currency_code(short ch_currency_code) {
		this.ch_currency_code = ch_currency_code;
	}
	public float getCh_conv_rate() {
		return ch_conv_rate;
	}
	public void setCh_conv_rate(float ch_conv_rate) {
		this.ch_conv_rate = ch_conv_rate;
	}
	public String getCh_conv_date() {
		return ch_conv_date;
	}
	public void setCh_conv_date(String ch_conv_date) {
		this.ch_conv_date = ch_conv_date;
	}
	public float getLedger_balance() {
		return ledger_balance;
	}
	public void setLedger_balance(float ledger_balance) {
		this.ledger_balance = ledger_balance;
	}
	public short getSlot_num() {
		return slot_num;
	}
	public void setSlot_num(short slot_num) {
		this.slot_num = slot_num;
	}
	public float getDevice_fee() {
		return device_fee;
	}
	public void setDevice_fee(float device_fee) {
		this.device_fee = device_fee;
	}
	public String getShc_data_buffer() {
		return shc_data_buffer;
	}
	public void setShc_data_buffer(String shc_data_buffer) {
		this.shc_data_buffer = shc_data_buffer;
	}
	public short getCard_seqno() {
		return card_seqno;
	}
	public void setCard_seqno(short card_seqno) {
		this.card_seqno = card_seqno;
	}
	public String getAlpharesponsecode() {
		return alpharesponsecode;
	}
	public void setAlpharesponsecode(String alpharesponsecode) {
		this.alpharesponsecode = alpharesponsecode;
	}
	public String getChip_type() {
		return chip_type;
	}
	public void setChip_type(String chip_type) {
		this.chip_type = chip_type;
	}
	public String getChip_index() {
		return chip_index;
	}
	public void setChip_index(String chip_index) {
		this.chip_index = chip_index;
	}
	public String getProcessor_busday() {
		return processor_busday;
	}
	public void setProcessor_busday(String processor_busday) {
		this.processor_busday = processor_busday;
	}
	public int getSeq_trace_no() {
		return seq_trace_no;
	}
	public void setSeq_trace_no(int seq_trace_no) {
		this.seq_trace_no = seq_trace_no;
	}
	public String getSeg_req() {
		return seg_req;
	}
	public void setSeg_req(String seg_req) {
		this.seg_req = seg_req;
	}
	public String getSeg_resp() {
		return seg_resp;
	}
	public void setSeg_resp(String seg_resp) {
		this.seg_resp = seg_resp;
	}
	public short getSite_id() {
		return site_id;
	}
	public void setSite_id(short site_id) {
		this.site_id = site_id;
	}
	public short getVersion() {
		return version;
	}
	public void setVersion(short version) {
		this.version = version;
	}
	public short getSrc_node() {
		return src_node;
	}
	public void setSrc_node(short src_node) {
		this.src_node = src_node;
	}
	public short getDest_node() {
		return dest_node;
	}
	public void setDest_node(short dest_node) {
		this.dest_node = dest_node;
	}
	
	
		
	
	
	
}*/
