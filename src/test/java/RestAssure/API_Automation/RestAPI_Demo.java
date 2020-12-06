package RestAssure.API_Automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAPI_Demo {
	@Test
	public void TestAPI() {

		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		String body = response.getBody().asString();
		System.out.println("Body" + body);
		String headerValue = response.getHeader("headerName");
		System.out.println("Header" + headerValue);
		String cookieValue = response.getCookie("cookieName");
		System.out.println("CookiesName" + cookieValue);
		
		int code= response.getStatusCode();
		System.out.print("Status Code"+code);
		Assert.assertEquals(code, 200);

	}

}
