package RestAssure.API_Automation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.Assert;

public class OAuth2Demo {

	@Test
	public void AccessValidAPI() {

		// access token

		Response request = RestAssured.given().formParam("client_id", "LearnAPI_Auth2.0_Testing")
				.formParam("client_secret", "d155169f4035df810b6772b988110f8e")
				.formParam("grant_type", "client_credentials").post("http://coop.apps.symfonycasts.com/token");
		String tokenCode = request.jsonPath().get("access_token");
		// System.out.println(request.getBody().asString());
		System.out.println("Status code" + request.getStatusCode());
		System.out.println("tokenCode=  " + tokenCode);

		Response resp = RestAssured.given().auth().oauth2("9e38e2b495cbaaa3610b991fd02eaea79c7b6109")
				.post("http://coop.apps.symfonycasts.com/api/1540/chickens-feed");
		System.out.println("Success Code = " + resp.getStatusCode());

		Assert.assertEquals(resp.getStatusCode(), 200);

	}

	@Test
	public void AccessInvalid() {

		// access token

		Response request = RestAssured.given().formParam("client_id", "LearnAPI_Auth2.0_Testing")
				.formParam("client_secret", "d155169f4035df810b6772b988110f8e")
				.formParam("grant_type", "client_credentials").post("http://coop.apps.symfonycasts.com/token");
		String tokenCode = request.jsonPath().get("access_token");
		// System.out.println(request.getBody().asString());
		System.out.println("Status code" + request.getStatusCode());
		System.out.println("tokenCode=  " + tokenCode);

		Response resp = RestAssured.given().auth().oauth2("9e38e2b495cbaaa3610b991fd02eaea79c7b6109")
				.post("http://coop.apps.symfonycasts.com/api/1540/eggs-collect");
		System.out.println(resp.getBody().asString());
		System.out.println("Success Code = " + resp.getStatusCode());

		Assert.assertEquals(resp.getStatusCode(), 401);

	}
}
