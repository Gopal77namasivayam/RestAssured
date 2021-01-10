import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

//import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

import static io.restassured.response.Response.*;

import static io.restassured.matcher.RestAssuredMatchers.*;

import static org.hamcrest.Matchers.*;



public class Test01_GET {
	
	@Test
	
	void GET() {
		
		//if static import is done then follow below get directly 
		
		Response rsp = get ("https://reqres.in/api/users?page=2");
		
	   //Response rsp =	RestAssured.get("https://reqres.in/api/users?page=2");
		
		// Response body elements validation 
		
	   System.out.println(rsp.asString());
	   
	   System.out.println(rsp.getBody().asString());
		
		System.out.println(rsp.statusCode());
		
		System.out.println(rsp.getStatusLine());
		
		System.out.println(rsp.getTime());
		
		System.out.println(rsp.getHeader("content-type"));
		
		
		// Assertions 
		
		int statusCode = rsp.getStatusCode();
		
		Assert.assertEquals(statusCode, 200);
		
		
	}
	
	@Test
	
	void Test_02() {
		
		given()
		      .get("https://reqres.in/api/users?page=2")
		.then()
		      .statusCode(200) 
		      .body ("data.id[0]",equalTo(7));
		
		
		
		
		
	}

}
