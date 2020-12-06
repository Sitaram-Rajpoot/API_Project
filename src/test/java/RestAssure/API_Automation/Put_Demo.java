package RestAssure.API_Automation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put_Demo {
	@Test
	public void APIDemo() {

		RequestSpecification request = RestAssured.given();

		request.headers("Content-Type", "application/json");

		JSONObject json = new JSONObject();
		json.put("id", "12");
		json.put("title", "Selenium");
		json.put("author", "Sitaram Rajpoot");

		request.body(json.toJSONString());
Response response = request.put("http://localhost:3000/posts/12");

System.out.println("Response Code"+response);

	}

}
