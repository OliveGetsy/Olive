/**
 * 
 */
package selinium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test1 {

	
	public static void main(String[] args) throws Exception {
File file=new File("D:\\Selinium-Getsy\\test.xlsx");
FileInputStream input=new FileInputStream(file);
XSSFWorkbook book=new XSSFWorkbook(input);
XSSFSheet sheet=book.getSheetAt(0);
int rowcount=sheet.getLastRowNum();//index
System.out.println(rowcount);

for(int i=0;i<=rowcount;i++)
{
	String s=sheet.getRow(i).getCell(0).getStringCellValue();
	System.out.println(s);
}


	}

}



/*String s1=sheet.getRow(0).getCell(0).getStringCellValue();
System.out.print(s1);
System.out.println();
String s2=sheet.getRow(5).getCell(1).getStringCellValue();
System.out.print(s2);
*/