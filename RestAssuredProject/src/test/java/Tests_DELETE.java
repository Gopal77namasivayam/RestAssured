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

public class Tests_DELETE {
	
	@Test
	public void test_04_DELETE() {
		

		   
// DELETE  method triggering using BDD 
		   
		   
			given().
			
			   header("Content Type","aaplication/json").
		       contentType(ContentType.JSON).
		       accept(ContentType.JSON).

		    when().
		         
		        delete("https://reqres.in/api/users/2").
		        
		    then().
		      
		       statusCode(204).
		       log().all();
		

}}
