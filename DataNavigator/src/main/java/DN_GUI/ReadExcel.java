package DN_GUI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcel {
	
public static ArrayList<String>  readInputExcel() throws IOException {
	
		
	File file=new File("C:\\vinoth\\Selenium\\Test Data_Excel\\Data_credential.xlsx");
	
	FileInputStream Fis=new FileInputStream(file);
	
	XSSFWorkbook workbook=new XSSFWorkbook(Fis);
	
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	
	int rowcount=sheet.getLastRowNum();
	
	System.out.println("row count is "+rowcount);
	
	ArrayList<String> excelInput=new ArrayList<String>();
		
		//String [][] credential=new String[rowcount+1][2];
		for (int i=0;i<=rowcount;i++) {
			
			/*credential[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
			credential[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();*/
			excelInput.add(sheet.getRow(i).getCell(0).getStringCellValue());
			excelInput.add(sheet.getRow(i).getCell(1).getStringCellValue());
		}
		
		workbook.close();
		
	return excelInput;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println(readInputExcel().get(0));

	}

}
