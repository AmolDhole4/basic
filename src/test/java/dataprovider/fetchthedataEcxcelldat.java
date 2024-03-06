package dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fetchthedataEcxcelldat {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream fil=new FileInputStream("C:\\screenshot\\Desktop\\Book1.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fil);
		
		XSSFSheet she=workbook.getSheet("Sheet1");
		int NoOfRows=she.getLastRowNum();
		
		int NoOfColumns=she.getRow(0).getLastCellNum();
		String [][] val=new String [NoOfRows][NoOfColumns];
		for(int i=0;i<NoOfRows;i++) {
		for(int j=0;j<NoOfColumns;j++) {
			 val [i][j] = she.getRow(i).getCell(j).getStringCellValue();
			
			 
			
				 System.out.println((val[i][j]));
				 System.out.println("================================================");
		
	
				 
			 }
			
		}
		}
	}


