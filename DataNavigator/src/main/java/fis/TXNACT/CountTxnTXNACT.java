package fis.TXNACT;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;

public class CountTxnTXNACT {
	
	int txncount;
	
	public void readfileTXNACT() throws FileNotFoundException {
		
		try {
		
		File file=new File("C:\\vinoth\\vinoth-Automation\\FIS_DataNavigator\\TXNACT_ATM_vino_sample.txt");
		FileInputStream fileInputStream=new FileInputStream(file);
		
		
		
		byte[] bytearray=new byte[(int)file.length()];
		fileInputStream.read(bytearray);
		
		String data=new String(bytearray);
		
		String[] stringarray=data.split("\r\n"); //used "/r/n" to split the row to count
		
		
		
		txncount=stringarray.length-2; //subtracted by 2 (header & footer)
		System.out.println("no of transactions in the TXNACT file is "+txncount);
	
		
		fileInputStream.close();
		}
			
			
		
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		CountTxnTXNACT readfileTXNACT=new CountTxnTXNACT();
		readfileTXNACT.readfileTXNACT();

	}

}
