package renner.base.DataUtils;

public class DataHelperProvider {
	  public IDataProvider getDataHelperProvider(String typeOfDataHandler) {
		     switch (typeOfDataHandler) {
		     case "properties":
		        return new PropertiesDataProvider();
		     }
		     return null;
		 
		  }
}
