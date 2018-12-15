import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class example {
	
	@Test(dataProvider="getData")
	public void print(Hashtable<String, String> data){
		System.out.println(data);
		//System.out.println(data.get("Username"));
	}
	
	
	@DataProvider
	public Object[][] getData() throws IOException{
		
		
		File file = new File("D:\\Testing.xlsx");
		FileInputStream fis = new FileInputStream(file);		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheetAt(0);
		
		int rows = sh.getPhysicalNumberOfRows();
		int cells = sh.getRow(0).getLastCellNum();
		
		
		Hashtable<String, String> table = null;
		Object[][] data = new Object[rows-1][1];
		
		
		
		for(int i=1; i<rows; i++){
			table = new Hashtable<String, String>();
			for(int j=0; j<cells; j++ ){
				//data[i-1][j]= sh.getRow(i).getCell(j).getStringCellValue();
				table.put(sh.getRow(0).getCell(j).getStringCellValue(), sh.getRow(i).getCell(j).getStringCellValue());
				data[i-1][0]=table;
			}
			
		}
		
		wb.close();
		return data;
	}
}
