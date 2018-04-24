package keywordDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static XSSFWorkbook book1;
	public static XSSFSheet sheet;
	public static XSSFCell cell;
	public static void setExcelFile(String path,String Sheetname) throws Exception
	{
		File file=new File("D:\\Selinium-Getsy\\Selinium\\src\\keywordDriven\\keywordforFacebook.xlsx");
		FileInputStream input=new FileInputStream(file);
		book1=new XSSFWorkbook(input);
		sheet=book1.getSheet(Sheetname);
	}
	public static String getCellData(int rownum,int colnum)
	{
		cell=sheet.getRow(rownum).getCell(colnum);
		String CellData =cell.getStringCellValue();
		return CellData;
	}
	

}
