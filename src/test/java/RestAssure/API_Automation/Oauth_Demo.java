package RestAssure.API_Automation;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Oauth_Demo extends BaseTest {
	
	
	@Test
	public void RestOathDemo()
	{
		
		int code=RestAssured.given()
		.when()
		.get()
		.getStatusCode();
		
		System.out.println("Server code is"+code);
		
	}

}
