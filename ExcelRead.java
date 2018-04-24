package trail;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static XSSFWorkbook book;
	public static  XSSFSheet sheet;
	public static void getCellData(String path,String sheetName) throws Exception
	{
		File file=new File("D:\\Selinium-Getsy\\Selinium\\src\\trail\\datadriven.xlsx");
		FileInputStream in=new FileInputStream(file);
		book=new XSSFWorkbook(in);
		sheet =book.getSheet(sheetName);
	}
	public static String getCellData(int rownum,int colnum)
	{
		return sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		
	}

}
