package renner.base.DriverUtils;

public class DriverProvider {
  public IDriver getDriver(String typeOfDriverExecution){
	     switch(typeOfDriverExecution){
	     case "local":
	        return new LocalDriver();
	     default :
	        return new LocalDriver();
	     }
	  }
}
