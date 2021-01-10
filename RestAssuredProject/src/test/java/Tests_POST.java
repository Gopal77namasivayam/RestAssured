import org.json.simple.JSONObject;
import org.testng.Assert;
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



public class Tests_POST {
	
	@Test
	public void test_02_POST() {
		
     // Using Map topic we are preparing input payload JSON 
		
		/*Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "Subbu");
		map.put("Job", "Soldier");
		
		System.out.println(map);
		
		JSONObject request = new JSONObject(map);
		
		System.out.println(request);
		
		System.out.println(request.toJSONString());*/
		
		
		
// using JSONObject --> we are preparing input payload JSON 
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Subbu");
		request.put("Job", "Soldier");
		
       // System.out.println(request);
		
		System.out.println(request.toJSONString());
		
		// POST method triggering using BDD 
		
		  given().
		  
		       accept(ContentType.JSON). body(request.toJSONString()).
		       
		  when().
		  
		         post("https://reqres.in/api/users").
		    
		  then().
		  
		          statusCode(201);
		 
		  
		  
		
		
	
		
	}

}
