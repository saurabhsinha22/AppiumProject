package pac.practice;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Launchapp {

 public static void main(String[] args) throws MalformedURLException {
  
  
  DesiredCapabilities dc = new DesiredCapabilities();
 
  dc.setCapability("deviceName", "Redmi");  
  dc.setCapability("automationName", "appium");
  dc.setCapability("platformName", "Android");
  dc.setCapability("platformVersion", "7.0");
  dc.setCapability("UDID", "d6c768cf9804");
  
  dc.setCapability("appPackage", "com.miui.calculator");
  dc.setCapability("appActivity", ".cal.AllInOneCalculatorActivity");
  

  URL url = new URL("http://localhost:4723/wd/hub");
  
  AndroidDriver driver = new AndroidDriver(url, dc);

  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
 

 }

}




	


