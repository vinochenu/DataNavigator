package fis.DataNavigator;

import java.awt.List;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import org.apache.commons.collections4.map.HashedMap;

import java.sql.*;

public class ResultsetInMap {
	
	//static ArrayList<HashMap<String, Object>> list=new ArrayList<>();
	
	
	 ArrayList<Object> list;
	 HashMap<String, Object> row;
	
	public  ArrayList<Object> database() throws SQLException, ClassNotFoundException, IOException {


		FileInputStream fileInputStream=new FileInputStream("configDN.properties");
		Properties properties=new Properties();
		properties.load(fileInputStream);

		String databasedriver=properties.getProperty("DatabaseDriver");
		String databaseurl=properties.getProperty("DatabaseUrl");
		String databasequery=properties.getProperty("DatabaseQuery1");
		String databaseuserID=properties.getProperty("DatabaseID");
		String databasepassword=properties.getProperty("DatabasePassword");


		Class.forName(databasedriver);

		Connection connection = DriverManager.getConnection(databaseurl,databaseuserID,databasepassword);

		Statement statement = connection.createStatement();

		ResultSet rs = statement.executeQuery(databasequery);
		
		ResultSetMetaData md=rs.getMetaData();
		
	
		int columncount=md.getColumnCount();
		
		
	
		
		while(rs.next()) {

			list=new ArrayList<>();
			
			for(int i=1;i<columncount;i++) {
				 row=new HashMap<String,Object>();
				row.put(md.getColumnName(i), rs.getObject(i));
				
			}
			list.add(row);
			
			
		}
		
		return list;
		
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		
		ResultsetInMap obj=new ResultsetInMap();
		
		System.out.println(obj.database());
		
		

	}

}
