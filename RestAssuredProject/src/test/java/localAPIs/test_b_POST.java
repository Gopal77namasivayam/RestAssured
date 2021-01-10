package localAPIs;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

//import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

import static io.restassured.response.Response.*;

import static io.restassured.matcher.RestAssuredMatchers.*;

import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;


public class test_b_POST {
	
	@Test
	
	 public void test_POST() {
		
		
		
		// using JSONObject --> we are preparing input payload JSON 
		
				JSONObject request = new JSONObject();
				
				request.put("firstname", "Subbu");
				request.put("lastname", "Mani");
				request.put("subjectid", 1);
				
				baseURI = "http://localhost:3000";
				
				given().
				  
			       header("Content Type","aaplication/json").
			       contentType(ContentType.JSON).
			       accept(ContentType.JSON).
			       body(request.toJSONString()).
			       
			  when().
			  
			         post("/users").
			    
			  then().
			  
			          statusCode(200).
			          log().all();
		
	}

}
