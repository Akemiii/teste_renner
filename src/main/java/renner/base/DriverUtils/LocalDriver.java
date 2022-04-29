package renner.base.DriverUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalDriver implements IDriver{

	@Override
	public WebDriver init(String browserName) {
	     switch (browserName) {
	     case "firefox":
	        return new FirefoxDriver();
	 
	     case "chrome":
	        System.setProperty("webdriver.chrome.driver",
	              "..\\renner\\driverExe\\chromedriver.exe");
	        return new ChromeDriver();
	 
	     default:
	        return new ChromeDriver();
	     }
	  }

}
