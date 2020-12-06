package RestAssure.API_Automation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class OauthDemo {

	@Test
	public void OauthDemo() {

		Response response = RestAssured.given().auth().oauth("", "", "", "").post("");

		String format = response.getBody().jsonPath().prettify();
		System.out.println("Formatted Body " + format);

		JsonPath jpath = response.jsonPath();
		String key = jpath.get("Str");
		System.out.println(key);

	}

}
