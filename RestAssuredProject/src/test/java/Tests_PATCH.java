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

public class Tests_PATCH {
	
	@Test
	public void test_03_PATCH() {
		

//using JSONObject --> we are preparing input payload JSON 
		
		JSONObject request = new JSONObject();
		
		   request.put("name", "subbu");
		   request.put("Job", "Farmer");
		   
		   System.out.println(request.toString());
		   
		// PATCH method triggering using BDD 
		   
		   
		given().
		
		   header("Content Type","aaplication/json").
	       contentType(ContentType.JSON).
	       accept(ContentType.JSON).
	       body(request.toJSONString()).
	       
	    when().
	         
	        patch("https://reqres.in/api/users/2").
	        
	    then().
	      
	       statusCode(200).
	       log().all();

}}
