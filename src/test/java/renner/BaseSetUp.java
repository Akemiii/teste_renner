package renner;

import org.openqa.selenium.WebDriver;

import renner.base.DataUtils.DataHelperProvider;
import renner.base.DataUtils.IDataProvider;
import renner.base.DriverUtils.DriverProvider;

public class BaseSetUp {

	public WebDriver driver;
	DriverProvider browserProvider = new DriverProvider();
	DataHelperProvider datahelperProvider = new DataHelperProvider();
	IDataProvider dataProvider = datahelperProvider.getDataHelperProvider("properties");
	public final String configProperties = "..\\renner\\src\\main\\config.properties";
	public String url = dataProvider.fetchData(configProperties, "url");
	String modeOfExecution = dataProvider.fetchData(configProperties, "modeOfExecution");
	String browserName = dataProvider.fetchData(configProperties, "browser");
	public String email = dataProvider.fetchData(configProperties, "email");
	public String password = dataProvider.fetchData(configProperties, "password");

	public WebDriver getDriver() {
		return driver;
	}

	protected void setDriver() {
		driver = browserProvider.getDriver(modeOfExecution).init(browserName);
	}
	
	protected void killDriver() {
		driver.close();
	}

}
