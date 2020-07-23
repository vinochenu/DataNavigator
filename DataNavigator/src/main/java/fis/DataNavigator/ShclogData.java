package fis.DataNavigator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.Test;

public class ShclogData {

	public static ShclogData shclogfields=null;

	private ShclogData() {

	}

	public static ShclogData getinstance() {
		if(shclogfields==null)
			shclogfields=new ShclogData();
		return shclogfields;
	}


	static ShclogPojo shclogdata=ShclogPojo.getinstance();

	static Logger logger=Logger.getLogger(ShclogData.class);


	public static  ShclogPojo getShclogData() throws IOException, ClassNotFoundException, SQLException {

		PropertyConfigurator.configure("DNlogs.properties");

		try {

			FileInputStream fileInputStream=new FileInputStream("configDN.properties");
			Properties properties=new Properties();
			properties.load(fileInputStream);

			String databasedriver=properties.getProperty("DatabaseDriver");
			String databaseurl=properties.getProperty("DatabaseUrl");
			String databasequery=properties.getProperty("DatabaseQuery");
			String databaseuserID=properties.getProperty("DatabaseID");
			String databasepassword=properties.getProperty("DatabasePassword");


			Class.forName(databasedriver);

			Connection connection = DriverManager.getConnection(databaseurl,databaseuserID,databasepassword);

			Statement statement = connection.createStatement();

			ResultSet rs = statement.executeQuery(databasequery);

			ResultSetMetaData rm=rs.getMetaData();

			int columncount=rm.getColumnCount();
			logger.info("shclog Columncount is "+columncount);
			//System.out.println("column count is "+columncount);





			while(rs.next()) {

				shclogdata.setMSGTYPE(rs.getString(1));
				shclogdata.setFLIPPED_MSGTYPE(rs.getString(2));
				shclogdata.setPAN(rs.getString(3));
				shclogdata.setMASK_PAN(rs.getString(4));
				shclogdata.setPCODE(rs.getString(5));
				shclogdata.setTXNTYPE(rs.getString(6));
				shclogdata.setAMOUNT(rs.getString(7));
				shclogdata.setAVAL_BALANCE(rs.getString(8));
				shclogdata.setAMOUNT_EQUIV(rs.getString(9));
				shclogdata.setCASH_BACK(rs.getString(10));
				shclogdata.setISS_CONV_RATE(rs.getString(11));
				shclogdata.setISS_CURRENCY_CODE(rs.getString(12));
				shclogdata.setISS_CONV_DATE(rs.getString(13));
				shclogdata.setACQ_CONV_RATE(rs.getString(14));
				shclogdata.setACQ_CURRENCY_CODE(rs.getString(15));
				shclogdata.setACQ_CONV_DATE(rs.getString(16));
				shclogdata.setTRA_AMOUNT(rs.getString(17));
				shclogdata.setTRA_CONV_RATE(rs.getString(18));
				shclogdata.setTRA_CURRENCY_CODE(rs.getString(19));
				shclogdata.setTRA_CONV_DATE(rs.getString(20));
				shclogdata.setFEE(rs.getString(21));
				shclogdata.setNEW_FEE(rs.getString(22));
				shclogdata.setNEW_AMOUNT(rs.getString(23));
				shclogdata.setNEW_SETL_AMOUNT(rs.getString(24));
				shclogdata.setSETTLEMENT_FEE(rs.getString(25));

				shclogdata.setSETTLEMENT_RATE(rs.getString(26));
				shclogdata.setSETTLEMENT_CODE(rs.getString(27));
				shclogdata.setSETTLEMENT_AMOUNT(rs.getString(28));
				shclogdata.setTRANDATE(rs.getString(29));
				shclogdata.setTRANTIME(rs.getString(30));
				shclogdata.setTRACE(rs.getString(31));
				shclogdata.setLOCAL_TIME(rs.getString(32));
				shclogdata.setLOCAL_DATE(rs.getString(33));
				shclogdata.setSETTLEMENT_DATE(rs.getString(34));

				shclogdata.setCAP_DATE(rs.getString(35));
				shclogdata.setPOS_ENTRY_CODE(rs.getString(36));
				shclogdata.setPOS_CONDITION_CODE(rs.getString(37));

				shclogdata.setPOS_PIN_CAP_CODE(rs.getString(38));
				shclogdata.setPOS_CAP_CODE(rs.getString(39));
				shclogdata.setLIFE_CYCLE(rs.getString(40));
				shclogdata.setACQUIRER(rs.getString(41));
				shclogdata.setISSUER(rs.getString(42));
				shclogdata.setTRANSFEREE(rs.getString(43));
				shclogdata.setORIGINATOR(rs.getString(44));


				shclogdata.setMEMBER_ID(rs.getString(45));
				shclogdata.setF_ID(rs.getString(46));
				shclogdata.setTXNSRC(rs.getString(47));
				shclogdata.setTXNDEST(rs.getString(48));
				shclogdata.setALTERNATEACQUIRER(rs.getString(49));

				shclogdata.setENTITYID(rs.getString(50));
				shclogdata.setISS_ENTITYID(rs.getString(51));

				shclogdata.setCARDPRODUCT(rs.getString(52));
				shclogdata.setMVV(rs.getString(53));
				shclogdata.setINVOICE_NUMBER(rs.getString(54));

				shclogdata.setTRANS_ID(rs.getString(55));
				shclogdata.setFPI(rs.getString(56));
				shclogdata.setTXN_START_TIME(rs.getString(57));
				shclogdata.setTXN_END_TIME(rs.getString(58));
				shclogdata.setDEVICE_CAP(rs.getString(59));
				shclogdata.setRESPCODE(rs.getString(60));
				shclogdata.setREASON_CODE(rs.getString(61));
				shclogdata.setREVCODE(rs.getString(62));
				shclogdata.setSHCERROR(rs.getString(63));

				shclogdata.setSAF(rs.getString(64));
				shclogdata.setORIGMSG(rs.getString(65));
				shclogdata.setORIGFLIPPEDMSG(rs.getString(66));
				shclogdata.setORIGTRACE(rs.getString(67));
				shclogdata.setORIGDATE(rs.getString(68));
				shclogdata.setORIGTIME(rs.getString(69));
				shclogdata.setMERCHANT_TYPE(rs.getString(70));
				shclogdata.setACQ_COUNTRY(rs.getString(71));
				shclogdata.setREFNUM(rs.getString(72));

				shclogdata.setAUTHNUM(rs.getString(73));
				shclogdata.setTERMID(rs.getString(74));
				shclogdata.setACCEPTORNAME(rs.getString(75));
				shclogdata.setTERMLOC(rs.getString(76));
				shclogdata.setADDRESPONSE(rs.getString(77));
				shclogdata.setACCTNUM(rs.getString(78));
				shclogdata.setBRANCH(rs.getString(79));
				shclogdata.setSERIAL_1(rs.getString(80));
				shclogdata.setSERIAL_2(rs.getString(81));

				shclogdata.setSTOREID(rs.getString(82));
				shclogdata.setLANE(rs.getString(83));
				shclogdata.setTERMINAL_TRACE(rs.getString(84));
				shclogdata.setCHECKER_ID(rs.getString(85));
				shclogdata.setSUPERVISOR(rs.getString(86));
				shclogdata.setSHIFT_NUMBER(rs.getString(87));
				shclogdata.setBATCH_ID(rs.getString(88));
				shclogdata.setDEVICE_DEVCAP(rs.getString(89));
				shclogdata.setSHC_DEVCAP(rs.getString(90));

				shclogdata.setFORMATTER_DEVCAP(rs.getString(91));
				shclogdata.setAUTH_DEVCAP(rs.getString(92));
				shclogdata.setFILLER1(rs.getString(93));
				shclogdata.setFILLER2(rs.getString(94));
				shclogdata.setFILLER3(rs.getString(95));
				shclogdata.setFILLER4(rs.getString(96));
				shclogdata.setISSUER_DATA(rs.getString(97));
				shclogdata.setACQUIRER_DATA(rs.getString(98));
				shclogdata.setNEW_AMOUNT_EQUIV(rs.getString(99));


				shclogdata.setACQ_AVAL_BALANCE(rs.getString(100));
				shclogdata.setACQ_LEDGER_BALANCE(rs.getString(101));
				shclogdata.setSETL_AVAL_BALANCE(rs.getString(102));
				shclogdata.setSETL_LEDGER_BALANCE(rs.getString(103));
				shclogdata.setAVAL_BALANCE_TYPE(rs.getString(104));
				shclogdata.setLEDGER_BALANCE_TYPE(rs.getString(105));
				shclogdata.setNEW_SETL_FEE(rs.getString(106));
				shclogdata.setTXN_AMOUNT(rs.getString(107));
				shclogdata.setTXN_NEW_AMOUNT(rs.getString(108));

				shclogdata.setTXN_CURRENCY_CODE(rs.getString(109));
				shclogdata.setTXN_CONV_RATE(rs.getString(110));
				shclogdata.setTXN_CONV_DATE(rs.getString(111));
				shclogdata.setCH_AMOUNT(rs.getString(112));
				shclogdata.setCH_NEW_AMOUNT(rs.getString(113));
				shclogdata.setCH_CURRENCY_CODE(rs.getString(114));
				shclogdata.setCH_CONV_RATE(rs.getString(115));
				shclogdata.setCH_CONV_DATE(rs.getString(116));
				shclogdata.setLEDGER_BALANCE(rs.getString(117));

				shclogdata.setSLOT_NUM(rs.getString(118));
				shclogdata.setDEVICE_FEE(rs.getString(119));
				shclogdata.setCARD_SEQNO(rs.getString(120));
				shclogdata.setALPHARESPONSECODE(rs.getString(121));
				shclogdata.setCHIP_TYPE(rs.getString(122));
				shclogdata.setCHIP_INDEX(rs.getString(123));
				shclogdata.setPROCESSOR_BUSDAY(rs.getString(124));
				shclogdata.setSEQ_TRACE_NO(rs.getString(125));
				shclogdata.setSEG_REQ(rs.getString(126));

				shclogdata.setSEG_RESP(rs.getString(127));
				shclogdata.setSITE_ID(rs.getString(128));
				shclogdata.setVERSION(rs.getString(129));
				shclogdata.setDEST_NODE(rs.getString(130));
				shclogdata.setSRC_NODE(rs.getString(131));
				shclogdata.setSHC_DATA_BUFFER(rs.getString(132));

			}

		}
		catch (ClassNotFoundException | SQLException | IOException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("Shclog Table: Issue with Database or file import or Date Parsing",e);
			
			System.out.println("Issue with Database or file import or Date Parsing");
		}

		return shclogdata;

	}
	
	/*public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println(getShclogData().REFNUM);
		
	}*/


	
}



