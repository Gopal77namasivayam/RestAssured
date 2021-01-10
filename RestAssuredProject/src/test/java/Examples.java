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


public class Examples {
	
	@Test
  public void test_get() {
		
		baseURI = "http://localhost:3000/";
		
		given().
		     get("/users").
		     
		then(). 
		      statusCode(200).
		      log().all();
		
	}
		
		
	  @Test
	  
  public void test_post() {
		  
		  baseURI = "http://localhost:3000/";
		  
		  JSONObject request = new JSONObject();
			
			request.put("firstName", "Subbu");
			request.put("lastName", "Mani");
			request.put("SubjectId", 1);
		  
			given().
			  
			    accept(ContentType.JSON). body(request.toJSONString()).
		       
		  when().
		  
		         post("/users").
		    
		  then().
		  
		          statusCode(200).
		          log().all();
	
		  
		  
	  }
	  
  @Test
  public void test_patch() {
	  
	  baseURI = "http://localhost:3000/";
	  
	//using JSONObject --> we are preparing input payload JSON 
		
			JSONObject request = new JSONObject();
			
			   request.put("lastName", "sigicherla");
			   
			   
			   System.out.println(request.toString());
			   
			// PATCH method triggering using BDD 

			   given().
				  
		       header("Content Type","aaplication/json").
		       contentType(ContentType.JSON).
		       accept(ContentType.JSON).
		       body(request.toJSONString()).
		       
		  when().
		  
		         post("/users/2").
		    
		  then().
		  
		          statusCode(200).
		          log().all();

  }
  
  @Test
  
  public void test_put() {
	  
	  baseURI = "http://localhost:3000";
	  
	// Using Map topic we are preparing input payload JSON 
		
		JSONObject request = new JSONObject();
		
		request.put("firstName", "Subbu");
		request.put("lastName", "Mani");
		request.put("SubjectId", 2);
		
	   // System.out.println(request);
		
		System.out.println(request.toJSONString());
		
		
		  // Triggering PUT request using BDD
		
		   
		   given().
		          header("Content-Type","application/json").
		          contentType(ContentType.JSON).
		          accept(ContentType.JSON).	
		          body(request.toJSONString()).
		   
		   when().
		   
		         put("/users/2").
		   
		   then().
			  
	             statusCode(200).
	             log().all();
	             

		}
	
  
  @Test
  
  public void test_delete() {
	  
	  baseURI = "http://localhost:3000";
	  
	
			
			// DELETE  method triggering using BDD 
			   
			   
				given().
				
				   header("Content Type","aaplication/json").
			       contentType(ContentType.JSON).
			       accept(ContentType.JSON).

			    when().
			         
			        delete("/users/2").
			        
			    then().
			      
			       statusCode(200).
			       log().all();
			
	  
  }
	  
  }
  
  
	
	

