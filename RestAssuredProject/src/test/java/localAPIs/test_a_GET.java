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



public class test_a_GET {

	@Test
	public void test_get() {
		
		baseURI = "http://localhost:3000/";
		
		  given().
		      param("name","Automation").
		      get("/subjects").
		      
		  then().
		  
		     statusCode(200).
		     log().all();
		      
		
}}
