package keywordDriven;

public class Facebook {
	public static void main(String args[]) throws Exception
	{
		ExcelRead.setExcelFile(FaceBookConstant.excelPath + FaceBookConstant.excelName ,FaceBookConstant.sheetName);
		for(int i=1;i<=6;i++)
		{
			String ActionsKeyword=ExcelRead.getCellData(i,2);
			if(ActionsKeyword.equals("openBrowser"))
			{
				GetKeyword.openBrowser();
			}
			else if(ActionsKeyword.equals("navigateUrl"))
			{
				GetKeyword.navigateUrl();
			}
			else if(ActionsKeyword.equals("inputUsername"))
			{
				GetKeyword.inputUsername();
			}
			else if(ActionsKeyword.equals("inputsurname"))
			{
				GetKeyword.inputsurname();
			}
			else if(ActionsKeyword.equals("inputEmailorMobile"))
			{
				GetKeyword.inputEmailorMobile();
			}
			else if(ActionsKeyword.equals("InputPassword"))
			{
				GetKeyword.InputPassword();
			}
			
			
		}
	}
	

}




