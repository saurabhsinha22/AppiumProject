package pac.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFrmPropertiesFile {
	@Test
	public void readDataTest() throws Throwable {
		//Read the Data From Properties File
		FileInputStream fis=new FileInputStream("/Data/commonData1.properties");
		
		Properties pObj=new Properties();
		pObj.load(fis);
		String URL=pObj.getProperty("url");
		System.out.println(URL);
		
	}

}
