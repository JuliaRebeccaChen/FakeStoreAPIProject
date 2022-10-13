package com.apiture.tests;

import org.testng.annotations.Test;

import com.apiture.utils.Constants;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Login {
	
	@Test
	public void login() {
		
		String payload = "";
		
		RestAssured.baseURI = Constants.BASE_URI;
		
		RestAssured
		.given()
			.body(payload)
			.contentType(ContentType.HTML)
		.when()
			.post(Constants.LOGIN_ENDPOINT)
			.prettyPeek()
		.then()
			.assertThat().statusCode(200);

	}

}
