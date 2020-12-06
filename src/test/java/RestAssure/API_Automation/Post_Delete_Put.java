package RestAssure.API_Automation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Delete_Put {
	@Test
	public void APIDemo() {

		RequestSpecification request = RestAssured.given();

		//request.headers("Content-Type", "application/json");

		 
		Response response = request.delete("http://localhost:3000/posts/12");

		System.out.println("Response Code" + response);

	}

}
