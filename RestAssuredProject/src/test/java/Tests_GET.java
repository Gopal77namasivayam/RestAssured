import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

//import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

import static io.restassured.response.Response.*;

import static io.restassured.matcher.RestAssuredMatchers.*;

import static org.hamcrest.Matchers.*;

public class Tests_GET {
	
	
	@Test
public void test_01_GET() {
		
		
		given().
		get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200).
		// display response on console
		log().all().
		// response value validtion
		body("data.id[4]",equalTo(11)).
		//validate response items 
		body("data.first_name",hasItems("Michael","Lindsay","Tobias"));
		
		
		
		
		
	}	
	
	

}
