package RestAssure.API_Automation;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;

public class BaseTest {
	@BeforeTest
	public void init() {
		RestAssured.authentication = RestAssured.preemptive().basic("ToolsQA", "TestPassword");
		RestAssured.baseURI = "https://restapi.demoqa.com/authentication/CheckForAuthentication";

	}

}
