package selinium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ttt {

	public static void main(String[] args) throws Exception {
File file=new File("D:\\Selinium-Getsy\\test.xlsx");
FileInputStream input=new FileInputStream(file);
XSSFWorkbook sheet=new XSSFWorkbook(input);
XSSFSheet s=sheet.getSheetAt(0);
int a=s.getLastRowNum();
System.out.println(a);
	}

}
