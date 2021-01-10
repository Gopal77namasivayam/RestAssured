package restAssuredDataDrivenTesting;
import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name = "DataforPost")

	public Object[][] dataforPOST() {

		
		/*
		 * Object[][] data = new Object[2][3];
		 * 
		 * data[0][0] = "Ram"; data[0][1] = "Mohan"; data[0][2] = 1;
		 * 
		 * data[1][0] = "Seeta"; data[1][1] = "s"; data[1][2] = 2;
		 * 
		 * return data ;
		 */
		 

		
		  return new Object[][] {
		  
		  { "Graham", "Bell", 1 }, { "Bell", "Graham", 2 }
		  
		  };
		 
	}
	
	@DataProvider(name = "deleteUser")

	public Object[] dataforDelete() {

		return new Object[] {

		21,22,23

		};
	}

	
	

}
