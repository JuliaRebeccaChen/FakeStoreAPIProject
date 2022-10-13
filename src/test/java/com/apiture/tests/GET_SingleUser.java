package com.apiture.tests;

import org.testng.annotations.Test;

import com.apiture.utils.Constants;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GET_SingleUser {
	
	@Test
	public void getSingleUser() {
		
		String payload = "";
		
		RestAssured.baseURI = Constants.BASE_URI;
		
		RestAssured
		.given()
			.body(payload)
			.contentType(ContentType.HTML)
		.when()
			.get(Constants.SINGLE_USER_ENDPOINT("3"))
			.prettyPeek()
		.then()
			.assertThat().statusCode(200);
	}

}
