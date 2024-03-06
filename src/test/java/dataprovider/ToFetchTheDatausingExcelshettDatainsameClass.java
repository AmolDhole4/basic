package dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ToFetchTheDatausingExcelshettDatainsameClass {
	
	@DataProvider
	public  String [][] getDaata() throws IOException {
		
		
		FileInputStream fil=new FileInputStream("C:\\screenshot\\Desktop\\Book1.xlsx");
		
	XSSFWorkbook workbook=new XSSFWorkbook(fil);
	
	XSSFSheet she=workbook.getSheet("Sheet1");
	int NoOfRows=she.getLastRowNum();
	
	int NoOfColumns=she.getRow(0).getLastCellNum();
	String [][] val=new String [NoOfRows-1][NoOfColumns];
	for(int i=1;i<NoOfRows-1;i++) {
	for(int j=0;j<NoOfColumns;j++) {
		 val [i][j] = she.getRow(i).getCell(j).getStringCellValue();
		
		 
		
	}
	}
	
  return val;
	}

}
