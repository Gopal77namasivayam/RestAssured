package restAssuredDataDrivenTesting;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import groovy.util.logging.Log;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

import static io.restassured.response.Response.*;

import static io.restassured.matcher.RestAssuredMatchers.*;

import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class DataDrivenExamples1 extends TestData {

	
	  /* @DataProvider(name = "DataforPost")
	  
	  public Object[][] dataforPOST() {
	  
	  
	   Object[][] data = new Object[2][3];
	  
	  data[0][0] = "Ram"; data[0][1] = "Mohan"; data[0][2] = 1;
	  
	  data[1][0] = "Seeta"; data[1][1] = "s"; data[1][2] = 2;
	  
	  return data ;
	 
		 

		
		  return new Object[][] {
		  
		  { "Graham", "Bell", 1 }, { "Bell", "Graham", 2 }
		  
		  };
		 
	} */

	// Inheriting test data from other class using inheritance concept 
	
	
	@Test(dataProvider = "DataforPost")

	public void test_post(String firstname, String lastname, int SubjectId) {

		baseURI = "http://localhost:3000/";

		JSONObject request = new JSONObject();

		request.put("firstname", firstname);
		request.put("lastname", lastname);
		request.put("SubjectId", SubjectId);

		
		  given().
		  
		  //header("Content Type","aaplication/json"). contentType(ContentType.JSON).
		  accept(ContentType.JSON). body(request.toJSONString()).
		 

		when().

				post("/users").

				then().

				statusCode(201).log().all();

	}

	/*@DataProvider(name = "deleteUser")

	public Object[] dataforDelete() {

		return new Object[] {

				16, 17,18,19,20,21,22,23

		};
	}*/
	
// Inheriting test data from other class using inheritance concept

	@Parameters({"userId"})
	
	@Test()

	public void test_delete(int userId) {

		System.out.println(userId);
		
		baseURI = "http://localhost:3000/";

		// DELETE method triggering using BDD

		when().

				delete("/users/" + userId).

				then().

				statusCode(200).log().all();

	}

}
