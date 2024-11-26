package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders 
{

	// Data Provider 1
	
	@DataProvider(name ="loginData")
	public String [][] getData() throws IOException
	{
		//taking Excel file from TestData
		String path=".\\TestData\\AutomationTestStore_Login_Data.xlsx";  //  /AutomationTestStore/TestData/AutomationTestStore_Login_Data.xlsx
		
		ExcelUtility xlUtil=new ExcelUtility(path);
		
		int totalRows=xlUtil.getRowCount("Sheet1");
		int totalColumns=xlUtil.getcellCount("Sheet1", 1);
		
		String loginData[][] =new String[totalRows][totalColumns];
		
		for(int i=1;i<=totalRows;i++)
		{
			for(int j=0;j<totalColumns;j++)
			{
				loginData[i-1][j]=xlUtil.getCellData("Sheet1", i, j);
			}
		}
		
		return loginData ;
		
	}
}
