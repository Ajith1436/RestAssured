package github;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRepo {

	@Test
	public void test1() {
		
		RestAssured.baseURI = "https://api.github.com/user/repos";
		RequestSpecification request = RestAssured.given();
		
		Response response = request.auth().oauth2("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").delete();
		
	}
}
