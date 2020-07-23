package fis.DataNavigator;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class DNFieldSeparation {

	public static DNFieldSeparation dnFieldSeparation=null;

	private DNFieldSeparation() {

	}

	public static DNFieldSeparation getInstance() {

		if(dnFieldSeparation==null)

			dnFieldSeparation=new DNFieldSeparation();
		return dnFieldSeparation;
	}


	//Global Declaration 
	static StringBuilder dnSegments=new StringBuilder();
	static  StringBuilder bbldnSegments=new StringBuilder();
	static StringBuilder emvSegments=new StringBuilder();

	static DNSegmentSeparation DN_SEGMENT=DNSegmentSeparation.getinstance();//creating instance to access SegmentDNSeparation Singleton class

	static ShcgenericlogPojo shcgenericlogPojo_BBL_DnSegment=ShcgenericlogPojo.getinstance(); //creating instance for shcgenericlog pojo class to set values 

	static Logger logger=Logger.getLogger(DNFieldSeparation.class);


	//This method is for split the EMV SEGMENT into each field
	public static ShcgenericlogPojo fieldEMV() throws ClassNotFoundException, IOException, SQLException  {


		DN_SEGMENT.splitSegement();
		

		emvSegments.append(DN_SEGMENT.EMV_Segment);

		System.out.println(emvSegments); 

		int offset=0;

		shcgenericlogPojo_BBL_DnSegment.setTerm_txn_date(emvSegments.substring(offset,offset+12));
		System.out.println("Term_txn_date is "+shcgenericlogPojo_BBL_DnSegment.getTerm_txn_date());
		offset=offset+shcgenericlogPojo_BBL_DnSegment.getTerm_txn_date().length();
		//System.out.println("offset is "+offset);

		String Cvv_res_code=emvSegments.substring(offset, offset+2);
		int Cvv_res_code1=Integer.parseInt(Cvv_res_code, 16);
		String cvv_res_code=String.valueOf(Cvv_res_code1);
		shcgenericlogPojo_BBL_DnSegment.setCvv_res_code(cvv_res_code);
		System.out.println("Cvv_res_code is "+shcgenericlogPojo_BBL_DnSegment.getCvv_res_code());
		offset=offset+Cvv_res_code.length();
        
		
		String Card_auth_res_code=emvSegments.substring(offset, offset+2);
		int Card_auth_res_code_1=Integer.parseInt(Card_auth_res_code, 16);
		String card_auth_res_code=String.valueOf(Card_auth_res_code_1);
		shcgenericlogPojo_BBL_DnSegment.setCard_auth_res_code(card_auth_res_code);
		System.out.println("Card_auth_res_code is "+shcgenericlogPojo_BBL_DnSegment.getCard_auth_res_code());
		offset=offset+Card_auth_res_code.length();
		
		
		/*shcgenericlogPojo_BBL_DnSegment.setCard_auth_res_code(emvSegments.substring(offset, offset+2));
		System.out.println("Card_auth_res_code is "+shcgenericlogPojo_BBL_DnSegment.getCard_auth_res_code());
		offset=offset+shcgenericlogPojo_BBL_DnSegment.getCard_auth_res_code().length();*/
		
		String Term_type=emvSegments.substring(offset, offset+4);
		int Term_type1=Integer.parseInt(Term_type, 16);
		String term_type=String.valueOf(Term_type1);
		shcgenericlogPojo_BBL_DnSegment.setTerm_type(term_type);
		System.out.println("Term type is "+shcgenericlogPojo_BBL_DnSegment.getTerm_type());
		offset=offset+Term_type.length();


		String Term_entry_cap=emvSegments.substring(offset, offset+4);
		int Term_entry_cap1=Integer.parseInt(Term_entry_cap, 16);
		String term_entry_cap=String.valueOf(Term_entry_cap1);
		shcgenericlogPojo_BBL_DnSegment.setTerm_entry_cap(term_entry_cap);
		System.out.println("Term_entry_cap is "+shcgenericlogPojo_BBL_DnSegment.getTerm_entry_cap());
		offset=offset+Term_entry_cap.length();
		
		
		String Chip_cond_code=emvSegments.substring(offset, offset+4);
		int Chip_cond_code1=Integer.parseInt(Chip_cond_code, 16);
		String chip_cond_code=String.valueOf(Chip_cond_code1);
		shcgenericlogPojo_BBL_DnSegment.setChip_cond_code(chip_cond_code);
		System.out.println("Chip_cond_code is "+shcgenericlogPojo_BBL_DnSegment.getChip_cond_code());
		offset=offset+Chip_cond_code.length();

		String Ccps_txn_ind=emvSegments.substring(offset, offset+4);
		int Ccps_txn_ind1=Integer.parseInt(Ccps_txn_ind, 16);
		String ccps_txn_ind=String.valueOf(Ccps_txn_ind1);
		shcgenericlogPojo_BBL_DnSegment.setCcps_txn_ind(ccps_txn_ind);
		System.out.println("Ccps_txn_ind is "+shcgenericlogPojo_BBL_DnSegment.getCcps_txn_ind());
		offset=offset+Ccps_txn_ind.length();

		String Card_auth_rel_ind=emvSegments.substring(offset, offset+4);
		int Card_auth_rel_ind1=Integer.parseInt(Card_auth_rel_ind, 16);
		String card_auth_rel_ind=String.valueOf(Card_auth_rel_ind1);
		shcgenericlogPojo_BBL_DnSegment.setCard_auth_rel_ind(card_auth_rel_ind);
		System.out.println("Card_auth_rel_ind is "+shcgenericlogPojo_BBL_DnSegment.getCard_auth_rel_ind());
		offset=offset+Card_auth_rel_ind.length();

		String Msg_reason_code=emvSegments.substring(offset, offset+4);
		int Msg_reason_code1=Integer.parseInt(Msg_reason_code, 16);
		String msg_reason_code=String.valueOf(Msg_reason_code1);
		shcgenericlogPojo_BBL_DnSegment.setMsg_reason_code(msg_reason_code);
		System.out.println("Msg_reason_code is "+shcgenericlogPojo_BBL_DnSegment.getMsg_reason_code());
		offset=offset+Msg_reason_code.length();
		
		String Deri_key_idx=emvSegments.substring(offset, offset+4);
		int Deri_key_idx1=Integer.parseInt(Deri_key_idx, 16);
		String deri_key_idx=String.valueOf(Deri_key_idx1);
		shcgenericlogPojo_BBL_DnSegment.setDeri_key_idx(deri_key_idx);
		System.out.println("Deri_key_idx is "+shcgenericlogPojo_BBL_DnSegment.getDeri_key_idx());
		offset=offset+Deri_key_idx.length();

		String Crypto_version=emvSegments.substring(offset, offset+4);
		int Crypto_version1=Integer.parseInt(Crypto_version, 16);
		String crypto_version=String.valueOf(Crypto_version1);
		shcgenericlogPojo_BBL_DnSegment.setCrypto_version(crypto_version);
		System.out.println("Crypto_version is "+shcgenericlogPojo_BBL_DnSegment.getCrypto_version());
		offset=offset+Crypto_version.length();
		
		String Crypto_txn_type=emvSegments.substring(offset, offset+4);
		int Crypto_txn_type1=Integer.parseInt(Crypto_txn_type, 16);
		String crypto_txn_type=String.valueOf(Crypto_txn_type1);
		shcgenericlogPojo_BBL_DnSegment.setCrypto_txn_type(crypto_txn_type);
		System.out.println("Crypto_txn_type is "+shcgenericlogPojo_BBL_DnSegment.getCrypto_txn_type());
		offset=offset+Crypto_txn_type.length();

		
		String Term_country_code=emvSegments.substring(offset, offset+4);
		int Term_country_code1=Integer.parseInt(Term_country_code, 16);
		String term_country_code=String.valueOf(Term_country_code1);
		shcgenericlogPojo_BBL_DnSegment.setTerm_country_code(term_country_code);
		System.out.println("Term_country_code is "+shcgenericlogPojo_BBL_DnSegment.getTerm_country_code());
		offset=offset+Term_country_code.length();
		
		String Crypto_curr_code=emvSegments.substring(offset, offset+4);
		int Crypto_curr_code1=Integer.parseInt(Crypto_curr_code, 16);
		String crypto_curr_code=String.valueOf(Crypto_curr_code1);
		shcgenericlogPojo_BBL_DnSegment.setCrypto_curr_code(crypto_curr_code);
		System.out.println("Crypto_curr_code is "+shcgenericlogPojo_BBL_DnSegment.getCrypto_curr_code());
		offset=offset+Crypto_curr_code.length();

		String Neg_file_version=emvSegments.substring(offset, offset+4);
		int Neg_file_version1=Integer.parseInt(Neg_file_version, 16);
		String neg_file_version=String.valueOf(Neg_file_version1);
		shcgenericlogPojo_BBL_DnSegment.setNeg_file_version(neg_file_version);
		System.out.println("Neg_file_version is "+shcgenericlogPojo_BBL_DnSegment.getNeg_file_version());
		offset=offset+Neg_file_version.length();
		
		
		String Ccard_pa_trace=emvSegments.substring(offset, offset+4);
		int Ccard_pa_trace1=Integer.parseInt(Ccard_pa_trace, 16);
		String ccard_pa_trace=String.valueOf(Ccard_pa_trace1);
		shcgenericlogPojo_BBL_DnSegment.setCcard_pa_trace(ccard_pa_trace);
		System.out.println("Ccard_pa_trace is "+shcgenericlogPojo_BBL_DnSegment.getCcard_pa_trace());
		offset=offset+Ccard_pa_trace.length();

		
		String Ccard_purch_trace=emvSegments.substring(offset, offset+4);
		int Ccard_purch_trace1=Integer.parseInt(Ccard_purch_trace, 16);
		String ccard_purch_trace=String.valueOf(Ccard_purch_trace1);
		shcgenericlogPojo_BBL_DnSegment.setCcard_purch_trace(ccard_purch_trace);
		System.out.println("Ccard_purch_trace is "+shcgenericlogPojo_BBL_DnSegment.getCcard_purch_trace());
		offset=offset+Ccard_purch_trace.length();

		String Ccard_crypto_trace=emvSegments.substring(offset, offset+4);
		int Ccard_crypto_trace1=Integer.parseInt(Ccard_crypto_trace, 16);
		String ccard_crypto_trace=String.valueOf(Ccard_crypto_trace1);
		shcgenericlogPojo_BBL_DnSegment.setCcard_crypto_trace(ccard_crypto_trace);
		System.out.println("Ccard_crypto_trace is "+shcgenericlogPojo_BBL_DnSegment.getCcard_crypto_trace());
		offset=offset+Ccard_crypto_trace.length();

		String Mcard_batch_trace=emvSegments.substring(offset, offset+4);
		int Mcard_batch_trace1=Integer.parseInt(Mcard_batch_trace, 16);
		String mcard_batch_trace=String.valueOf(Mcard_batch_trace1);
		shcgenericlogPojo_BBL_DnSegment.setMcard_batch_trace(mcard_batch_trace);
		System.out.println("Mcard_batch_trace is "+shcgenericlogPojo_BBL_DnSegment.getMcard_batch_trace());
		offset=offset+Mcard_batch_trace.length();

		String Mcard_txn_trace=emvSegments.substring(offset, offset+4);
		int Mcard_txn_trace1=Integer.parseInt(Mcard_txn_trace, 16);
		String mcard_txn_trace=String.valueOf(Mcard_txn_trace1);
		shcgenericlogPojo_BBL_DnSegment.setMcard_txn_trace(mcard_txn_trace);
		System.out.println("Mcard_txn_trace is "+shcgenericlogPojo_BBL_DnSegment.getMcard_txn_trace());
		offset=offset+Mcard_txn_trace.length();

		/*String Crypto_amount=emvSegments.substring(offset, offset+60);
		int Crypto_amount1=Integer.parseInt(Crypto_amount, 16);
		String crypto_amount=String.valueOf(Crypto_amount1);*/
		shcgenericlogPojo_BBL_DnSegment.setCrypto_amount(emvSegments.substring(offset,offset+60));
		System.out.println("Crypto_amount is "+shcgenericlogPojo_BBL_DnSegment.getCrypto_amount());
		offset=offset+shcgenericlogPojo_BBL_DnSegment.getCrypto_amount().length();

		
		shcgenericlogPojo_BBL_DnSegment.setCrypto_cb_amount(emvSegments.substring(offset,offset+60));
		System.out.println("Crypto_cb_amount is "+shcgenericlogPojo_BBL_DnSegment.getCrypto_cb_amount());
		offset=offset+shcgenericlogPojo_BBL_DnSegment.getCrypto_cb_amount().length();

		String Srv_restrict_code=emvSegments.substring(offset, offset+8);
		int Srv_restrict_code1=Integer.parseInt(Srv_restrict_code, 16);
		String srv_restrict_code=String.valueOf(Srv_restrict_code1);
		shcgenericlogPojo_BBL_DnSegment.setSrv_restrict_code(srv_restrict_code);
		System.out.println("Srv_restrict_code is "+shcgenericlogPojo_BBL_DnSegment.getSrv_restrict_code());
		offset=offset+Srv_restrict_code.length();
		
		StringBuilder term_cap_profile=new StringBuilder();
		String Term_cap_profile=emvSegments.substring(offset, offset+14);
		for(int i=0;i<Term_cap_profile.length();i=i+2)
		{

			String Term_cap_profile1=Term_cap_profile.substring(i, i+2);
			int term_cap_profile1=Integer.valueOf(Term_cap_profile1,16);
			
			term_cap_profile.append((char)term_cap_profile1);

		}
		
		
		shcgenericlogPojo_BBL_DnSegment.setTerm_cap_profile(term_cap_profile.toString());
		System.out.println("Term_cap_profile is "+shcgenericlogPojo_BBL_DnSegment.getTerm_cap_profile());
		offset=offset+Term_cap_profile.length();
		
		StringBuilder tvr=new StringBuilder();
		String Tvr=emvSegments.substring(offset, offset+22);
		for(int i=0;i<Tvr.length();i=i+2)
		{

			String Tvr1=Tvr.substring(i, i+2);
			int tvr1=Integer.valueOf(Tvr1,16);
			
			tvr.append((char)tvr1);

		}
	
		shcgenericlogPojo_BBL_DnSegment.setTvr(tvr.toString());
		System.out.println("Term_cap_profile is "+shcgenericlogPojo_BBL_DnSegment.getTvr());
		offset=offset+Tvr.length();


		StringBuilder unpredictable_num=new StringBuilder();
		String Unpredictable_num=emvSegments.substring(offset, offset+18);
		for(int i=0;i<Unpredictable_num.length();i=i+2)
		{

			String Unpredictable_num1=Unpredictable_num.substring(i, i+2);
			int unpredictable_num1=Integer.valueOf(Unpredictable_num1,16);
			
			unpredictable_num.append((char)unpredictable_num1);

		}

		
		shcgenericlogPojo_BBL_DnSegment.setUnpredictable_num(unpredictable_num.toString());
		System.out.println("Unpredictable_num is "+shcgenericlogPojo_BBL_DnSegment.getUnpredictable_num());
		offset=offset+Unpredictable_num.length();
		
		
		StringBuilder term_ser_num=new StringBuilder();
		String Term_ser_num=emvSegments.substring(offset, offset+18);
		for(int i=0;i<Term_ser_num.length();i=i+2)
		{

			String Term_ser_num1=Term_ser_num.substring(i, i+2);
			int term_ser_num1=Integer.valueOf(Term_ser_num1,16);
			
			term_ser_num.append((char)term_ser_num1);

		}

		shcgenericlogPojo_BBL_DnSegment.setTerm_ser_num(term_ser_num.toString());
		System.out.println("Term_ser_num is "+shcgenericlogPojo_BBL_DnSegment.getTerm_ser_num());
		offset=offset+Term_ser_num.length();

		StringBuilder cvr=new StringBuilder();
		String Cvr=emvSegments.substring(offset, offset+14);
		for(int i=0;i<Cvr.length();i=i+2)
		{

			String Cvr1=Cvr.substring(i, i+2);
			int cvr1=Integer.valueOf(Cvr1,16);
			
			cvr.append((char)cvr1);

		}
		
		
		shcgenericlogPojo_BBL_DnSegment.setCvr(cvr.toString());
		System.out.println("Cvr is "+shcgenericlogPojo_BBL_DnSegment.getCvr());
		offset=offset+Cvr.length();
		
		StringBuilder issuer_discre_data=new StringBuilder();
		String Issuer_discre_data=emvSegments.substring(offset, offset+66);
		for(int i=0;i<Issuer_discre_data.length();i=i+2)
		{

			String Issuer_discre_data1=Issuer_discre_data.substring(i, i+2);
			int issuer_discre_data1=Integer.valueOf(Issuer_discre_data1,16);
			
			issuer_discre_data.append((char)issuer_discre_data1);

		}
		

		shcgenericlogPojo_BBL_DnSegment.setIssuer_discre_data(issuer_discre_data.toString());
		System.out.println("Issuer_discre_data is "+shcgenericlogPojo_BBL_DnSegment.getIssuer_discre_data());
		offset=offset+Issuer_discre_data.length();
		
		StringBuilder cryptogram=new StringBuilder();
		String Cryptogram=emvSegments.substring(offset, offset+34);
		for(int i=0;i<Cryptogram.length();i=i+2)
		{

			String Cryptogram1=Cryptogram.substring(i, i+2);
			int cryptogram1=Integer.valueOf(Cryptogram1,16);
			
			cryptogram.append((char)cryptogram1);

		}

		shcgenericlogPojo_BBL_DnSegment.setCryptogram(cryptogram.toString());
		System.out.println("Cryptogram is "+shcgenericlogPojo_BBL_DnSegment.getCryptogram());
		offset=offset+Cryptogram.length();

		StringBuilder app_txn_counter=new StringBuilder();
		String App_txn_counter=emvSegments.substring(offset, offset+10);
		for(int i=0;i<App_txn_counter.length();i=i+2)
		{

			String App_txn_counter1=App_txn_counter.substring(i, i+2);
			int app_txn_counter1=Integer.valueOf(App_txn_counter1,16);
			
			app_txn_counter.append((char)app_txn_counter1);

		}
		
		
		
		shcgenericlogPojo_BBL_DnSegment.setApp_txn_counter(app_txn_counter.toString());
		System.out.println("App_txn_counter is "+shcgenericlogPojo_BBL_DnSegment.getApp_txn_counter());
		offset=offset+App_txn_counter.length();
		
		StringBuilder app_ichg_profile=new StringBuilder();
		String App_ichg_profile=emvSegments.substring(offset, offset+10);
		for(int i=0;i<App_ichg_profile.length();i=i+2)
		{

			String App_ichg_profile1=App_ichg_profile.substring(i, i+2);
			int app_ichg_profile1=Integer.valueOf(App_ichg_profile1,16);
			
			app_ichg_profile.append((char)app_ichg_profile1);

		}
		

		shcgenericlogPojo_BBL_DnSegment.setApp_ichg_profile(app_ichg_profile.toString());
		System.out.println("App_ichg_profile is "+shcgenericlogPojo_BBL_DnSegment.getApp_ichg_profile());
		offset=offset+App_ichg_profile.length();
		
		

		shcgenericlogPojo_BBL_DnSegment.setArpc_cryptogram(emvSegments.substring(offset,offset+34));
		System.out.println("Arpc_cryptogram is "+shcgenericlogPojo_BBL_DnSegment.getArpc_cryptogram());
		offset=offset+shcgenericlogPojo_BBL_DnSegment.getArpc_cryptogram().length();

		shcgenericlogPojo_BBL_DnSegment.setArpc_respcode(emvSegments.substring(offset,offset+6));
		System.out.println("Arpc_respcode is "+shcgenericlogPojo_BBL_DnSegment.getArpc_respcode());
		offset=offset+shcgenericlogPojo_BBL_DnSegment.getArpc_respcode().length();


		shcgenericlogPojo_BBL_DnSegment.setIssuer_script_res(emvSegments.substring(offset,offset+82));
		System.out.println("Issuer_script_res is "+shcgenericlogPojo_BBL_DnSegment.getIssuer_script_res());
		offset=offset+shcgenericlogPojo_BBL_DnSegment.getIssuer_script_res().length();

		shcgenericlogPojo_BBL_DnSegment.setCcard_sch_crypto(emvSegments.substring(offset,offset+34));
		System.out.println("Ccard_sch_crypto is "+shcgenericlogPojo_BBL_DnSegment.getCcard_sch_crypto());
		offset=offset+shcgenericlogPojo_BBL_DnSegment.getCcard_sch_crypto().length();


		/*shcgenericlogPojo_BBL_DnSegment.setChip_type(emvSegments.substring(offset,offset+2));
		System.out.println("Chip_type is "+shcgenericlogPojo_BBL_DnSegment.getChip_type());
		offset=offset+shcgenericlogPojo_BBL_DnSegment.getChip_type().length();*/
		
		
		StringBuilder issuer_app_data=new StringBuilder();
		String Issuer_app_data=emvSegments.substring(offset, offset+130);
		for(int i=0;i<Issuer_app_data.length();i=i+2)
		{

			String Issuer_app_data1=Issuer_app_data.substring(i, i+2);
			int issuer_app_data1=Integer.valueOf(Issuer_app_data1,16);
			
			issuer_app_data.append((char)issuer_app_data1);

		}

		shcgenericlogPojo_BBL_DnSegment.setIssuer_app_data(issuer_app_data.toString());
		System.out.println("Issuer_app_data is "+shcgenericlogPojo_BBL_DnSegment.getIssuer_app_data());
		offset=offset+Issuer_app_data.length();
		
		StringBuilder cvm_results=new StringBuilder();
		String Cvm_results=emvSegments.substring(offset, offset+14);
		for(int i=0;i<Cvm_results.length();i=i+2)
		{

			String Cvm_results1=Cvm_results.substring(i, i+2);
			int cvm_results1=Integer.valueOf(Cvm_results1,16);
			
			cvm_results.append((char)cvm_results1);
			
			

		}
		

		shcgenericlogPojo_BBL_DnSegment.setCvm_results(cvm_results.toString());
		System.out.println("Cvm_results is "+shcgenericlogPojo_BBL_DnSegment.getCvm_results());
		offset=offset+Cvm_results.length();
		
		
		StringBuilder bitmap=new StringBuilder();
		String Bitmap=emvSegments.substring(offset, offset+28);
		for(int i=0;i<Bitmap.length();i=i+2)
		{

			String Bitmap1=Bitmap.substring(i, i+2);
			int bitmap1=Integer.valueOf(Bitmap1,16);
			
			bitmap.append((char)bitmap1);
			
			

		}
		
		
		shcgenericlogPojo_BBL_DnSegment.setBitmap(bitmap.toString());
		System.out.println("Bitmap is "+shcgenericlogPojo_BBL_DnSegment.getBitmap());
		offset=offset+Bitmap.length();
		
		
		String Tvr_cvr_status=emvSegments.substring(offset, offset+2);
		int Tvr_cvr_status1=Integer.parseInt(Tvr_cvr_status, 16);
		String tvr_cvr_status=String.valueOf(Tvr_cvr_status1);
		shcgenericlogPojo_BBL_DnSegment.setTvr_cvr_status(tvr_cvr_status);
		System.out.println("Tvr_cvr_status is "+shcgenericlogPojo_BBL_DnSegment.getTvr_cvr_status());
		offset=offset+Tvr_cvr_status.length();
		
		StringBuilder issuer_auth_data=new StringBuilder();
		String Issuer_auth_data=emvSegments.substring(offset, offset+128);
		for(int i=0;i<Issuer_auth_data.length();i=i+2)
		{

			String Issuer_auth_data1=Issuer_auth_data.substring(i, i+2);
			int issuer_auth_data1=Integer.valueOf(Issuer_auth_data1,16);
			
			issuer_auth_data.append((char)issuer_auth_data1);
	
		}
		

		shcgenericlogPojo_BBL_DnSegment.setIssuer_auth_data(issuer_auth_data.toString());
		System.out.println("Issuer_auth_data is "+shcgenericlogPojo_BBL_DnSegment.getIssuer_auth_data());
		offset=offset+Issuer_auth_data.length();


		shcgenericlogPojo_BBL_DnSegment.setSite_id(emvSegments.substring(offset,offset+4));
		System.out.println("Site_id is "+shcgenericlogPojo_BBL_DnSegment.getSite_id());
		offset=offset+shcgenericlogPojo_BBL_DnSegment.getSite_id().length();

		return shcgenericlogPojo_BBL_DnSegment;
		
	}


	//This method is for split the DN SEGMENT into each field
	public static ShcgenericlogPojo fieldDnSegment() throws ClassNotFoundException, IOException, SQLException {

		PropertyConfigurator.configure("DNlogs.properties");

		try {


			DN_SEGMENT.splitSegement();//calling splitSegment() method to assign all segment group values into string based on id & if condition


			//converting hex to ASCII 
			for(int i=0;i<DN_SEGMENT.DN_SEGMENT_Segment.length();i=i+2)
			{

				String dnSegment=DN_SEGMENT.DN_SEGMENT_Segment.substring(i, i+2);
				int dnsegment=Integer.valueOf(dnSegment,16);
				dnSegments.append((char)dnsegment);

			}
			System.out.println(dnSegments);

			//Set values to shcgenericlog pojo for ATM DN Segment (ID-23014)

			shcgenericlogPojo_BBL_DnSegment.setShclog_id(dnSegments.substring(0, 21));
			System.out.println("shclog_id is "+shcgenericlogPojo_BBL_DnSegment.getShclog_id());

			shcgenericlogPojo_BBL_DnSegment.setAlt_merchant_id(dnSegments.substring(21, 37));
			System.out.println("setAlt_merchant_id is "+shcgenericlogPojo_BBL_DnSegment.getAlt_merchant_id());

			shcgenericlogPojo_BBL_DnSegment.setAlt_terminal_id(dnSegments.substring(37, 46));
			System.out.println("Alt_terminal_id is "+shcgenericlogPojo_BBL_DnSegment.getAlt_terminal_id());

			shcgenericlogPojo_BBL_DnSegment.setCard_category(dnSegments.substring(46, 47));
			System.out.println("Card_category is "+shcgenericlogPojo_BBL_DnSegment.getCard_category());

			shcgenericlogPojo_BBL_DnSegment.setClerk_id(dnSegments.substring(47, 51));
			System.out.println("Clerk_id is "+shcgenericlogPojo_BBL_DnSegment.getClerk_id());

			shcgenericlogPojo_BBL_DnSegment.setDebit_proc_busday(dnSegments.substring(51, 55));
			System.out.println("Debit_proc_busday is "+shcgenericlogPojo_BBL_DnSegment.getDebit_proc_busday());

			shcgenericlogPojo_BBL_DnSegment.setDevice_type(dnSegments.substring(55, 59));
			System.out.println("Device_type is "+shcgenericlogPojo_BBL_DnSegment.getDevice_type());

			shcgenericlogPojo_BBL_DnSegment.setIssuer_proc_id(dnSegments.substring(59, 70));
			System.out.println("Issuer_proc_id is "+shcgenericlogPojo_BBL_DnSegment.getIssuer_proc_id());

			shcgenericlogPojo_BBL_DnSegment.setPos_geo_location(dnSegments.substring(70, 89));
			System.out.println("Pos_geo_location is "+shcgenericlogPojo_BBL_DnSegment.getPos_geo_location());

			shcgenericlogPojo_BBL_DnSegment.setCustomer_id(dnSegments.substring(70, 89));
			System.out.println("Customer_id is "+shcgenericlogPojo_BBL_DnSegment.getCustomer_id());

			shcgenericlogPojo_BBL_DnSegment.setAcquiring_channel(dnSegments.substring(89, 92));
			System.out.println("Acquiring_channel is "+shcgenericlogPojo_BBL_DnSegment.getAcquiring_channel());

			shcgenericlogPojo_BBL_DnSegment.setTransaction_group(dnSegments.substring(92, 97));
			System.out.println("Transaction_group is "+shcgenericlogPojo_BBL_DnSegment.getTransaction_group());

			shcgenericlogPojo_BBL_DnSegment.setMessage_mode(dnSegments.substring(97, 98));
			System.out.println("Message_mode is "+shcgenericlogPojo_BBL_DnSegment.getMessage_mode());



		}

		catch (ClassNotFoundException |IOException  | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Issue with Database or file import or Date Parsing");
			logger.error("Issue with Database or file import or Date Parsing",e);

		}

		return shcgenericlogPojo_BBL_DnSegment;
	}


	//This method is for split the BBL DN SEGMENT into each field
	public static  ShcgenericlogPojo fieldBBLDnSegment() throws ClassNotFoundException, IOException, SQLException {

		PropertyConfigurator.configure("DNlogs.properties");

		try {

			DN_SEGMENT.splitSegement();//calling splitSegment() method to assign all segment group values into string based on id & if condition


			//converting hex to ASCII 
			for(int i=0;i<DN_SEGMENT.BBL_DN_SEGMENT_Segment.length();i=i+2)
			{

				String bbldnSegment=DN_SEGMENT.BBL_DN_SEGMENT_Segment.substring(i, i+2);
				int bbldnsegment=Integer.valueOf(bbldnSegment,16);
				bbldnSegments.append((char)bbldnsegment);

			}
			System.out.println(bbldnSegments);



			//Set values to shcgenericlog pojo for BBL DN Segment (ID-50001)

			shcgenericlogPojo_BBL_DnSegment.setCrossBorderFlag(bbldnSegments.substring(0, 1));
			System.out.println("CrossBroderFlas is "+shcgenericlogPojo_BBL_DnSegment.getCrossBorderFlag());

			shcgenericlogPojo_BBL_DnSegment.setCard_scheme(bbldnSegments.substring(1, 4));
			System.out.println("Card Scheme is "+shcgenericlogPojo_BBL_DnSegment.getCard_scheme());

			shcgenericlogPojo_BBL_DnSegment.setCardBrand(bbldnSegments.substring(4, 15));
			System.out.println("Card Brand is "+shcgenericlogPojo_BBL_DnSegment.getCardBrand());

			shcgenericlogPojo_BBL_DnSegment.setCard_location(bbldnSegments.substring(15, 16));
			System.out.println("Card Location is "+shcgenericlogPojo_BBL_DnSegment.getCard_location());

			shcgenericlogPojo_BBL_DnSegment.setTxn_service(bbldnSegments.substring(16, 23));
			System.out.println("Txn_Service is "+shcgenericlogPojo_BBL_DnSegment.getTxn_service());

			shcgenericlogPojo_BBL_DnSegment.setDeviceTypeChannel(bbldnSegments.substring(23, 27));
			System.out.println("DeviceTypeChannel is "+shcgenericlogPojo_BBL_DnSegment.getDeviceTypeChannel());

			shcgenericlogPojo_BBL_DnSegment.setBbl_private(bbldnSegments.substring(27, 78));
			System.out.println("Bbl_private is "+shcgenericlogPojo_BBL_DnSegment.getBbl_private());

			shcgenericlogPojo_BBL_DnSegment.setATCResult(bbldnSegments.substring(78, 79));
			System.out.println("ATCResult is "+shcgenericlogPojo_BBL_DnSegment.getATCResult());

			shcgenericlogPojo_BBL_DnSegment.setCVV1_Result(bbldnSegments.substring(78, 79));
			System.out.println("CVV1_Result is "+shcgenericlogPojo_BBL_DnSegment.getCVV1_Result());

			shcgenericlogPojo_BBL_DnSegment.setCVV1_Result(bbldnSegments.substring(79, 80));
			System.out.println("CVV1_Result is "+shcgenericlogPojo_BBL_DnSegment.getCVV1_Result());

			shcgenericlogPojo_BBL_DnSegment.setCVV1_CVC1_Result(bbldnSegments.substring(80, 81));
			System.out.println("CVV1_CVC1_Result is "+shcgenericlogPojo_BBL_DnSegment.getCVV1_CVC1_Result());

			shcgenericlogPojo_BBL_DnSegment.setCVV2AcquirerResult(bbldnSegments.substring(81, 82));
			System.out.println("CVV2AcquirerResult is "+shcgenericlogPojo_BBL_DnSegment.getCVV2AcquirerResult());

			shcgenericlogPojo_BBL_DnSegment.setCVV2IssuerResult(bbldnSegments.substring(82, 83));
			System.out.println("CVV2IssuerResult is "+shcgenericlogPojo_BBL_DnSegment.getCVV2IssuerResult());

			shcgenericlogPojo_BBL_DnSegment.setCVV2PresenceIndicator(bbldnSegments.substring(83, 84));
			System.out.println("CVV2PresenceIndicator is "+shcgenericlogPojo_BBL_DnSegment.getCVV2PresenceIndicator());

			shcgenericlogPojo_BBL_DnSegment.setCVV2ResponseIndicator(bbldnSegments.substring(84, 85));
			System.out.println("CVV2ResponseIndicator is "+shcgenericlogPojo_BBL_DnSegment.getCVV2ResponseIndicator());

			shcgenericlogPojo_BBL_DnSegment.setIST_StandIn_Ind(bbldnSegments.substring(85, 86));
			System.out.println("IST_StandIn_In is "+shcgenericlogPojo_BBL_DnSegment.getIST_StandIn_Ind());

			shcgenericlogPojo_BBL_DnSegment.setPrivateData(bbldnSegments.substring(86, 187));
			System.out.println("PrivateData is "+shcgenericlogPojo_BBL_DnSegment.getPrivateData());

			shcgenericlogPojo_BBL_DnSegment.setQRCVoucher(bbldnSegments.substring(187, 208));
			System.out.println("QRCVoucher is "+shcgenericlogPojo_BBL_DnSegment.getQRCVoucher());


			shcgenericlogPojo_BBL_DnSegment.setBblFiller3(bbldnSegments.substring(208,330));
			System.out.println("BblFiller3 is "+shcgenericlogPojo_BBL_DnSegment.getBblFiller3()); 

			shcgenericlogPojo_BBL_DnSegment.setBblFiller4(bbldnSegments.substring(330,452));
			System.out.println("BblFiller4 is "+shcgenericlogPojo_BBL_DnSegment.getBblFiller4()); 

			shcgenericlogPojo_BBL_DnSegment.setAcqFee(bbldnSegments.substring(452,468));
			System.out.println("AcqFee is "+shcgenericlogPojo_BBL_DnSegment.getAcqFee()); 

			shcgenericlogPojo_BBL_DnSegment.setIssuerFee(bbldnSegments.substring(468,484));
			System.out.println("IssuerFee is "+shcgenericlogPojo_BBL_DnSegment.getIssuerFee()); 

			shcgenericlogPojo_BBL_DnSegment.setSwitchFee(bbldnSegments.substring(484,500));
			System.out.println("SwitchFee is "+shcgenericlogPojo_BBL_DnSegment.getSwitchFee()); 

			shcgenericlogPojo_BBL_DnSegment.setBblFiller(bbldnSegments.substring(500,551));//doubht 
			System.out.println("BblFiller is "+shcgenericlogPojo_BBL_DnSegment.getBblFiller()); 


			shcgenericlogPojo_BBL_DnSegment.setAcqRoutingNo(bbldnSegments.substring(551,562));
			System.out.println("AcqRoutingNo is "+shcgenericlogPojo_BBL_DnSegment.getAcqRoutingNo()); 

			shcgenericlogPojo_BBL_DnSegment.setIssRoutingNo(bbldnSegments.substring(562,573));
			System.out.println("IssRoutingNo is "+shcgenericlogPojo_BBL_DnSegment.getIssRoutingNo()); 

			shcgenericlogPojo_BBL_DnSegment.setTraRoutingNo(bbldnSegments.substring(573,584));
			System.out.println("TraRoutingNo is "+shcgenericlogPojo_BBL_DnSegment.getTraRoutingNo()); 


			shcgenericlogPojo_BBL_DnSegment.setDestRoutingNo(bbldnSegments.substring(584,595));
			System.out.println("DestRoutingNo is "+shcgenericlogPojo_BBL_DnSegment.getDestRoutingNo()); 

			shcgenericlogPojo_BBL_DnSegment.setTransfereeFee(bbldnSegments.substring(595,611));
			System.out.println("TransfereeFee is "+shcgenericlogPojo_BBL_DnSegment.getTransfereeFee()); 


			shcgenericlogPojo_BBL_DnSegment.setPayeeName(bbldnSegments.substring(611,637));
			System.out.println("PayeeName is "+shcgenericlogPojo_BBL_DnSegment.getPayeeName()); 

			shcgenericlogPojo_BBL_DnSegment.setITMXTraceNo(bbldnSegments.substring(637,650));
			System.out.println("ITMXTraceNo is "+shcgenericlogPojo_BBL_DnSegment.getITMXTraceNo()); 

			shcgenericlogPojo_BBL_DnSegment.setBblFiller2(bbldnSegments.substring(650,701));
			System.out.println("BblFiller2 is "+shcgenericlogPojo_BBL_DnSegment.getBblFiller2()); 

			shcgenericlogPojo_BBL_DnSegment.setOriginal_Card_Owner(bbldnSegments.substring(701,706));
			System.out.println("Original_Card_Owner is "+shcgenericlogPojo_BBL_DnSegment.getOriginal_Card_Owner()); 



			shcgenericlogPojo_BBL_DnSegment.setCard_Owner(bbldnSegments.substring(706,711));
			System.out.println("Card_Owner is "+shcgenericlogPojo_BBL_DnSegment.getCard_Owner()); 


			shcgenericlogPojo_BBL_DnSegment.setCard_Owner_BranchCode(bbldnSegments.substring(711,716));
			System.out.println("Card_Owner_BranchCode is "+shcgenericlogPojo_BBL_DnSegment.getCard_Owner_BranchCode()); 


			shcgenericlogPojo_BBL_DnSegment.setOriginal_Terminal_Owner(bbldnSegments.substring(716,721));
			System.out.println("Original_Terminal_Owner is "+shcgenericlogPojo_BBL_DnSegment.getOriginal_Terminal_Owner());

			shcgenericlogPojo_BBL_DnSegment.setTerminal_Owner_BranchCode(bbldnSegments.substring(721,726));
			System.out.println("Terminal_Owner_BranchCode is "+shcgenericlogPojo_BBL_DnSegment.getTerminal_Owner_BranchCode());


			shcgenericlogPojo_BBL_DnSegment.setATM_Terminal_ID(bbldnSegments.substring(726,743));
			System.out.println("ATM_Terminal_ID is "+shcgenericlogPojo_BBL_DnSegment.getATM_Terminal_ID()); 


			shcgenericlogPojo_BBL_DnSegment.setBblATM_Terminal_ID(bbldnSegments.substring(743,760));
			System.out.println("BblATM_Terminal_ID is "+shcgenericlogPojo_BBL_DnSegment.getBblATM_Terminal_ID()); 


			shcgenericlogPojo_BBL_DnSegment.setPartial_Reverse_Amount(bbldnSegments.substring(760,773));
			System.out.println("Partial_Reverse_Amount is "+shcgenericlogPojo_BBL_DnSegment.getPartial_Reverse_Amount()); 


			shcgenericlogPojo_BBL_DnSegment.setDCC_Home_CCY_Name(bbldnSegments.substring(773,777));
			System.out.println("DCC_Home_CCY_Name is "+shcgenericlogPojo_BBL_DnSegment.getDCC_Home_CCY_Name()); 

			shcgenericlogPojo_BBL_DnSegment.setTerminal_State(bbldnSegments.substring(777,780));;
			System.out.println("Terminal_State is "+shcgenericlogPojo_BBL_DnSegment.getTerminal_State()); 

			shcgenericlogPojo_BBL_DnSegment.setTerminal_Provice_RegionID(bbldnSegments.substring(780,785));
			System.out.println("Terminal_Provice_RegionID is "+shcgenericlogPojo_BBL_DnSegment.getTerminal_Provice_RegionID()); 


			shcgenericlogPojo_BBL_DnSegment.setFrAcct_Owner_Branch(bbldnSegments.substring(785,790));
			System.out.println("FrAcct_Owner_Branch is "+shcgenericlogPojo_BBL_DnSegment.getFrAcct_Owner_Branch()); 

			shcgenericlogPojo_BBL_DnSegment.setToAcct_Owner_Branch(bbldnSegments.substring(790,795));;
			System.out.println("ToAcct_Owner_Branch is "+shcgenericlogPojo_BBL_DnSegment.getToAcct_Owner_Branch()); 

			shcgenericlogPojo_BBL_DnSegment.setOth_Bank_Use_Counter(bbldnSegments.substring(795,798));
			System.out.println("Oth_Bank_Use_Counter is "+shcgenericlogPojo_BBL_DnSegment.getOth_Bank_Use_Counter()); 

			shcgenericlogPojo_BBL_DnSegment.setIR_Flag(bbldnSegments.substring(798,801));
			System.out.println("IR_Flag is "+shcgenericlogPojo_BBL_DnSegment.getIR_Flag()); 

			shcgenericlogPojo_BBL_DnSegment.setIR_Counter(bbldnSegments.substring(801,804));
			System.out.println("IR_Counter is "+shcgenericlogPojo_BBL_DnSegment.getIR_Counter()); 

			shcgenericlogPojo_BBL_DnSegment.setRecvProxyID(bbldnSegments.substring(804,933));
			System.out.println("RecvProxyID is "+shcgenericlogPojo_BBL_DnSegment.getRecvProxyID()); 

			shcgenericlogPojo_BBL_DnSegment.setSendProxyID(bbldnSegments.substring(933,1062));
			System.out.println("SendProxyID is "+shcgenericlogPojo_BBL_DnSegment.getSendProxyID()); 


			shcgenericlogPojo_BBL_DnSegment.setSendProxyType(bbldnSegments.substring(1062,1075));
			System.out.println("SendProxyType is "+shcgenericlogPojo_BBL_DnSegment.getSendProxyType()); 


			shcgenericlogPojo_BBL_DnSegment.setRecvProxyType(bbldnSegments.substring(1075,1088));
			System.out.println("RecvProxyType is "+shcgenericlogPojo_BBL_DnSegment.getRecvProxyType()); 

			shcgenericlogPojo_BBL_DnSegment.setSenderTaxID(bbldnSegments.substring(1088,1108));;
			System.out.println("SenderTaxID is "+shcgenericlogPojo_BBL_DnSegment.getSenderTaxID()); 

			shcgenericlogPojo_BBL_DnSegment.setReceiverTaxID(bbldnSegments.substring(1108,1128));
			System.out.println("ReceiverTaxID is "+shcgenericlogPojo_BBL_DnSegment.getReceiverTaxID()); 

			shcgenericlogPojo_BBL_DnSegment.setVatRate(bbldnSegments.substring(1128,1133));
			System.out.println("VatRate is "+shcgenericlogPojo_BBL_DnSegment.getVatRate()); 

			shcgenericlogPojo_BBL_DnSegment.setVat(bbldnSegments.substring(1133,1146));
			System.out.println("Vat is "+shcgenericlogPojo_BBL_DnSegment.getVat()); 

			shcgenericlogPojo_BBL_DnSegment.setWHTTaxRate(bbldnSegments.substring(1146,1151));
			System.out.println("WHTTaxRate is "+shcgenericlogPojo_BBL_DnSegment.getWHTTaxRate()); 

			shcgenericlogPojo_BBL_DnSegment.setWHTTax(bbldnSegments.substring(1151,1164));
			System.out.println("WHTTax is "+shcgenericlogPojo_BBL_DnSegment.getWHTTax()); 

			shcgenericlogPojo_BBL_DnSegment.setWHTTaxCon(bbldnSegments.substring(1164,1165));
			System.out.println("WHTTaxCon is "+shcgenericlogPojo_BBL_DnSegment.getWHTTaxCon()); 

			shcgenericlogPojo_BBL_DnSegment.setTraRefNo(bbldnSegments.substring(1165,1182));
			System.out.println("TraRefNo is "+shcgenericlogPojo_BBL_DnSegment.getTraRefNo()); 

			shcgenericlogPojo_BBL_DnSegment.setSendRefNo(bbldnSegments.substring(1182,1203));
			System.out.println("SendRefNo is "+shcgenericlogPojo_BBL_DnSegment.getSendRefNo()); 

			shcgenericlogPojo_BBL_DnSegment.setRefNo(bbldnSegments.substring(1203,1254));
			System.out.println("RefNo is "+shcgenericlogPojo_BBL_DnSegment.getRefNo()); 

			shcgenericlogPojo_BBL_DnSegment.setBBLRefNo(bbldnSegments.substring(1254,1280));
			System.out.println("BBLRefNo is "+shcgenericlogPojo_BBL_DnSegment.getBBLRefNo()); 
			System.out.println("BBLREFNO length is "+shcgenericlogPojo_BBL_DnSegment.getBBLRefNo().length());

			shcgenericlogPojo_BBL_DnSegment.setToAcctDispName(bbldnSegments.substring(1280,1331));
			System.out.println("ToAcctDispName is "+shcgenericlogPojo_BBL_DnSegment.getToAcctDispName()); 


			shcgenericlogPojo_BBL_DnSegment.setToAcctName(bbldnSegments.substring(1331,1382));
			System.out.println("ToAcctName is "+shcgenericlogPojo_BBL_DnSegment.getToAcctName());

			shcgenericlogPojo_BBL_DnSegment.setFromAcctDispName(bbldnSegments.substring(1382,1433));
			System.out.println("FromAcctDispName is "+shcgenericlogPojo_BBL_DnSegment.getFromAcctDispName()); 


			shcgenericlogPojo_BBL_DnSegment.setTaxInvoice(bbldnSegments.substring(1433,1484));
			System.out.println("TaxInvoice is "+shcgenericlogPojo_BBL_DnSegment.getTaxInvoice()); 


			shcgenericlogPojo_BBL_DnSegment.setTypeOfIncome(bbldnSegments.substring(1484,1488));
			System.out.println("TypeOfIncome is "+shcgenericlogPojo_BBL_DnSegment.getTypeOfIncome()); 

			shcgenericlogPojo_BBL_DnSegment.setBillReference(bbldnSegments.substring(1488,1551));
			System.out.println("BillReference is "+shcgenericlogPojo_BBL_DnSegment.getBillReference()); 


			shcgenericlogPojo_BBL_DnSegment.setBp_due_rtp_expDate(bbldnSegments.substring(1551,1568));
			System.out.println("Bp_due_rtp_expDate is "+shcgenericlogPojo_BBL_DnSegment.getBp_due_rtp_expDate()); 


			shcgenericlogPojo_BBL_DnSegment.setCredit_notif_ref(bbldnSegments.substring(1568,1585));
			System.out.println("Credit_notif_ref is "+shcgenericlogPojo_BBL_DnSegment.getCredit_notif_ref()); 

			shcgenericlogPojo_BBL_DnSegment.setBpURL(bbldnSegments.substring(1585,1686));
			System.out.println("BpURL is "+shcgenericlogPojo_BBL_DnSegment.getBpURL()); 

			shcgenericlogPojo_BBL_DnSegment.setSendCompTaxID(bbldnSegments.substring(1686,1706));
			System.out.println("SendCompTaxID is "+shcgenericlogPojo_BBL_DnSegment.getSendCompTaxID()); 

			shcgenericlogPojo_BBL_DnSegment.setSendCompAcctNo(bbldnSegments.substring(1706,1726));
			System.out.println("SendCompAcctNo is "+shcgenericlogPojo_BBL_DnSegment.getSendCompAcctNo()); 

			shcgenericlogPojo_BBL_DnSegment.setReceiverCompTaxID(bbldnSegments.substring(1726,1746));
			System.out.println("ReceiverCompTaxID is "+shcgenericlogPojo_BBL_DnSegment.getReceiverCompTaxID()); 


			shcgenericlogPojo_BBL_DnSegment.setReceiverCompAcctNo(bbldnSegments.substring(1746,1766));
			System.out.println("ReceiverCompAcctNo is "+shcgenericlogPojo_BBL_DnSegment.getReceiverCompAcctNo()); 

			shcgenericlogPojo_BBL_DnSegment.setCompCode(bbldnSegments.substring(1766,1774));
			System.out.println("CompCode is "+shcgenericlogPojo_BBL_DnSegment.getCompCode()); 

			shcgenericlogPojo_BBL_DnSegment.setServCode(bbldnSegments.substring(1774,1787));
			System.out.println("ServCode is "+shcgenericlogPojo_BBL_DnSegment.getServCode()); 

			shcgenericlogPojo_BBL_DnSegment.setFlags(bbldnSegments.substring(1787,1838));
			System.out.println("Flags is "+shcgenericlogPojo_BBL_DnSegment.getFlags()); 


			shcgenericlogPojo_BBL_DnSegment.setBillReference2(bbldnSegments.substring(1838,1880));
			System.out.println("BillReference2 is "+shcgenericlogPojo_BBL_DnSegment.getBillReference2()); 

			shcgenericlogPojo_BBL_DnSegment.setUserData1(bbldnSegments.substring(1880,1906));
			System.out.println("UserData1 is "+shcgenericlogPojo_BBL_DnSegment.getUserData1()); 


			shcgenericlogPojo_BBL_DnSegment.setUserData2(bbldnSegments.substring(1906,1932));
			System.out.println("UserData2 is "+shcgenericlogPojo_BBL_DnSegment.getUserData2()); 


			shcgenericlogPojo_BBL_DnSegment.setUserData3(bbldnSegments.substring(1932,1958));
			System.out.println("UserData3 is "+shcgenericlogPojo_BBL_DnSegment.getUserData3()); 


			shcgenericlogPojo_BBL_DnSegment.setUserData4(bbldnSegments.substring(1958,1984));
			System.out.println("UserData4 is "+shcgenericlogPojo_BBL_DnSegment.getUserData4()); 

			shcgenericlogPojo_BBL_DnSegment.setUserData5(bbldnSegments.substring(1984,2010));
			System.out.println("UserData5 is "+shcgenericlogPojo_BBL_DnSegment.getUserData5()); 

			shcgenericlogPojo_BBL_DnSegment.setPayment1(bbldnSegments.substring(2010,2031));
			System.out.println("Payment1 is "+shcgenericlogPojo_BBL_DnSegment.getPayment1()); 

			shcgenericlogPojo_BBL_DnSegment.setPayment2(bbldnSegments.substring(2031,2052));
			System.out.println("Payment2 is "+shcgenericlogPojo_BBL_DnSegment.getPayment2()); 

			shcgenericlogPojo_BBL_DnSegment.setPayment3(bbldnSegments.substring(2052,2073));
			System.out.println("Payment3 is "+shcgenericlogPojo_BBL_DnSegment.getPayment3()); 

			shcgenericlogPojo_BBL_DnSegment.setSms_fee(bbldnSegments.substring(2073,2080));
			System.out.println("Sms_fee is "+shcgenericlogPojo_BBL_DnSegment.getSms_fee()); 

			shcgenericlogPojo_BBL_DnSegment.setSms_mobile(bbldnSegments.substring(2080,2096));
			System.out.println("Sms_mobile is "+shcgenericlogPojo_BBL_DnSegment.getSms_mobile()); 

			shcgenericlogPojo_BBL_DnSegment.setOTP(bbldnSegments.substring(2096,2120));
			System.out.println("OTP is "+shcgenericlogPojo_BBL_DnSegment.getOTP()); 

			shcgenericlogPojo_BBL_DnSegment.setAcct_info1(bbldnSegments.substring(2120,2225));
			System.out.println("Acct_info1 is "+shcgenericlogPojo_BBL_DnSegment.getAcct_info1()); 

			shcgenericlogPojo_BBL_DnSegment.setAcct_info2(bbldnSegments.substring(2225,2330));
			System.out.println("Acct_info2 is "+shcgenericlogPojo_BBL_DnSegment.getAcct_info2()); 

			shcgenericlogPojo_BBL_DnSegment.setFrm_FundCode(bbldnSegments.substring(2330,2346));
			System.out.println("Frm_FundCode is "+shcgenericlogPojo_BBL_DnSegment.getFrm_FundCode()); 

			shcgenericlogPojo_BBL_DnSegment.setTo_FundCode(bbldnSegments.substring(2346,2362));
			System.out.println("To_FundCode is "+shcgenericlogPojo_BBL_DnSegment.getTo_FundCode()); 

			shcgenericlogPojo_BBL_DnSegment.setUnit(bbldnSegments.substring(2362,2394));
			System.out.println("Unit is "+shcgenericlogPojo_BBL_DnSegment.getUnit()); 

			shcgenericlogPojo_BBL_DnSegment.setUnitPrice(bbldnSegments.substring(2394,2406));
			System.out.println("UnitPrice is "+shcgenericlogPojo_BBL_DnSegment.getUnitPrice()); 

			shcgenericlogPojo_BBL_DnSegment.setBondYield(bbldnSegments.substring(2406,2413));
			System.out.println("BondYield is "+shcgenericlogPojo_BBL_DnSegment.getBondYield()); 

			shcgenericlogPojo_BBL_DnSegment.setSurcharge_Fee(bbldnSegments.substring(2413,2427));
			System.out.println("Surcharge_Fee is "+shcgenericlogPojo_BBL_DnSegment.getSurcharge_Fee()); 

			shcgenericlogPojo_BBL_DnSegment.setExtFromAcctType(bbldnSegments.substring(2427,2430));
			System.out.println("ExtFromAcctType is "+shcgenericlogPojo_BBL_DnSegment.getExtFromAcctType()); 

			shcgenericlogPojo_BBL_DnSegment.setExtToAcctType(bbldnSegments.substring(2430,2433));
			System.out.println("ExtToAcctType is "+shcgenericlogPojo_BBL_DnSegment.getExtToAcctType()); 

			shcgenericlogPojo_BBL_DnSegment.setFromAcctName(bbldnSegments.substring(2433,2484));
			System.out.println("FromAcctName is "+shcgenericlogPojo_BBL_DnSegment.getFromAcctName()); //not displayed (doubht- need to check ist code)

			shcgenericlogPojo_BBL_DnSegment.setCDM_data(bbldnSegments.substring(2484,2585));
			System.out.println("CDM_data is "+shcgenericlogPojo_BBL_DnSegment.getCDM_data()); 

			shcgenericlogPojo_BBL_DnSegment.setBblFiller5(bbldnSegments.substring(2585,2707));
			System.out.println("BblFiller5 is "+shcgenericlogPojo_BBL_DnSegment.getBblFiller5());




		}
		catch (ClassNotFoundException |IOException  | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Issue with Database or file import or Date Parsing");
			logger.error("Issue with Database or file import or Date Parsing",e);

		}

		return shcgenericlogPojo_BBL_DnSegment;
	}	




	/*public void fieldDnDataReq() {
		System.out.println(dnSeparation.ATM_DN_DATA_REQ_Segment);

	}

	public void fieldNetworkSettlementData() {
		System.out.println(dnSeparation.NETWORK_SETTLEMENT_DATA_Segment);

	}



	public void fieldBBLAdminUsgSegment() {
		System.out.println(dnSeparation.BBL_ADMIN_USG_SEGMENT_Segment);

	}*/

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {

		DNFieldSeparation fieldDNSeparation=new DNFieldSeparation();
		fieldDNSeparation.fieldEMV();
		//fieldDNSeparation.fieldDnSegment();
		//fieldDNSeparation.fieldBBLDnSegment();
		/*fieldDNSeparation.fieldDnDataReq();
		fieldDNSeparation.fieldNetworkSettlementData();

		fieldDNSeparation.fieldBBLAdminUsgSegment();*/
	}
}
