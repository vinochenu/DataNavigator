package DN_GUI;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.checkerframework.common.reflection.qual.GetMethod;



public class SWITCH_DB_Connect {

	ArrayList<Object> rows;
	ArrayList<String> columns;
	
	int 	msgtype_1;
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
    char    pos_pin_cap_code;
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
    char    alpharesponsecode;
    char    chip_type;
    char    chip_index;
    String      processor_busday;
	int seq_trace_no;
    String seg_req;
    String seg_resp;
    short   site_id;
    short   version;
    short   src_node;
    short   dest_node;


	public List<Shclog> ist_DB( ) throws SQLException, ClassNotFoundException, IOException {

		List<Shclog> shclogList = new ArrayList<>();
		Class.forName("oracle.jdbc.driver.OracleDriver");


		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1534/SWTSITA4","A1SWTS","sit#123");


		Statement statement=connection.createStatement();

		ResultSet rs=statement.executeQuery("select  * from SHCLOG where LOCAL_DATE='30-APR-20' and REFNUM='012117230058'\r\n" + 
				"");

		while(rs.next()) {

			
			Shclog shclog = new Shclog();
			
			shclog.setMsgtype(rs.getInt(0));
			shclog.setPan(rs.getString(1));
			shclog.setMask_pan(rs.getString(2));
			shclog.setPcode(rs.getInt(3));
			shclog.setTxntype(rs.getInt(4));
			shclog.setAmount(rs.getFloat(5));
			shclog.setAval_balance(rs.getFloat(6));
			shclog.setAmount_equiv(rs.getFloat(7));
			shclog.setCash_back(rs.getFloat(8));
			shclog.setIss_conv_rate(rs.getFloat(8));
			shclog.setIss_currency_code(rs.getShort(9));
			shclog.setIss_conv_date(rs.getString(10));
			shclog.setAcq_conv_rate(rs.getFloat(11));
			shclog.setAcq_currency_code(rs.getShort(12));
			shclog.setAcq_conv_date(rs.getString(13));
			shclog.setTra_amount(rs.getFloat(14));
			shclog.setTra_conv_rate(rs.getFloat(15));
			shclog.setTra_currency_code(rs.getShort(16));
			shclog.setTra_conv_date(rs.getString(17));
			shclog.setFee(rs.getFloat(18));
			shclog.setNew_fee(rs.getFloat(19));
			shclog.setNew_amount(rs.getFloat(20));
			shclog.setNew_setl_amount(rs.getFloat(21));
			shclog.setSettlement_fee(rs.getFloat(22));
			shclog.setSettlement_rate(rs.getFloat(23));
			shclog.setSettlement_code(rs.getShort(24));
			shclog.setSettlement_amount(rs.getFloat(25));
			shclog.setTrandate(rs.getString(26));
			shclog.setTrantime(rs.getInt(27));
			shclog.setTrace(rs.getInt(28));
			shclog.setLocal_time(rs.getInt(29));
			shclog.setLocal_date(rs.getString(30));
			shclog.setSettlement_date(rs.getString(31));
			shclog.setCap_date(rs.getString(32));
			shclog.setPos_entry_code(rs.getShort(33));
			shclog.setPos_condition_code(rs.getShort(34));
			shclog.setPos_pin_cap_code(rs.getString(35));
			shclog.setPos_cap_code(rs.getShort(36));
			shclog.setLife_cycle(rs.getInt(37));
			shclog.setAcquirer(rs.getString(38));
			shclog.setIssuer(rs.getString(39));
			shclog.setTransferee(rs.getString(40));
		    shclog.setOriginator(rs.getString(41));
			shclog.setMember_id(rs.getString(42));
			shclog.setF_id(rs.getString(43));
			shclog.setTxnsrc(rs.getString(44));
			shclog.setTxndest(rs.getString(45));
			shclog.setAlternateacquirer(rs.getString(46));
			shclog.setEntityid(rs.getString(47));
			shclog.setIss_entityid(rs.getString(48));
			shclog.setCardproduct(rs.getString(49));
			shclog.setMvv(rs.getString(50));
			shclog.setInvoice_number(rs.getString(51));
			shclog.setTrans_id(rs.getString(52));
			shclog.setFpi(rs.getString(53));
			shclog.setTxn_start_time(rs.getInt(54));
			shclog.setTxn_end_time(rs.getInt(54));
			shclog.setDevice_cap(rs.getInt(55));
			shclog.setRespcode(rs.getInt(56));
			shclog.setRevcode(rs.getInt(57));
			shclog.setShcerror(rs.getInt(58));
			shclog.setSaf(rs.getShort(59));
			shclog.setOrigmsg(rs.getShort(60));
			shclog.setOrigflippedmsg(rs.getShort(61));
			
			
			
			
			shclogList.add(shclog);
			}
		
		
		}
			
		
		
        
			
			
			
        
		}
	
	

	









