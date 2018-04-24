package trail1;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read {
	public static XSSFWorkbook Book;
	public static XSSFSheet sheet;
	public static void getCellData(String Excel_path,String Sheet) throws Exception
	{
		File file=new File("D:\\Selinium-Getsy\\Selinium\\src\\trail1\\tnstc.xlsx");
		FileInputStream input=new FileInputStream(file);
		Book= new XSSFWorkbook(input);
		sheet=Book.getSheet(Sheet);
	}
	public static String getCellData(int rownum,int colnum)
	{
	return sheet.getRow(rownum).getCell(colnum).getStringCellValue();
	}
	

}
