package fis.DataNavigator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Connect_DN_DB {


	ArrayList<Object> result;

	ArrayList<String> column;

	@Test(priority=2)
	public void transaction_validation() throws ClassNotFoundException, SQLException {

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");

		Connection connection=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BBLU","DNSERVER","DNSERVER");

		Statement statement=connection.createStatement();
		ResultSet query_result=statement.executeQuery("select * from\r\n" + 
				"DNUCBBLU.fin_l202004");


		int columnCount = query_result.getMetaData().getColumnCount();

		while(query_result.next())

		{  


			result= new ArrayList<Object>();

			column = new ArrayList<String>();

			for (int i=1; i <columnCount ; i++)
			{
				column.add(query_result.getString(i));		
			}

			result.add(column);
			System.out.println(result.get(0));
		}

		// To print the first row only
		/*ArrayList< Object> verifydata=new ArrayList<Object>();
		verifydata=(ArrayList<Object>) result.get(1);

		System.out.println(verifydata);*/



		//To print all all the rows
		
		/*for (Object Totalresult : result) 
			{
				System.out.println(Totalresult);



				//result.stream().forEach(row1 -> System.out.println(row1));
				result.stream().forEach(row1 -> {
				    	System.out.println(((ArrayList)row1).get(0));
				    });
				}


			}*/


	}

}
