package com.apiture.tests;

import org.testng.annotations.Test;

import com.apiture.utils.Constants;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GET_LimitedNumberOfProducts {
	
	@Test
	public void getLimitedNumberOfProducts() {
		
		String payload = "";
		
		RestAssured.baseURI = Constants.BASE_URI;
		
		RestAssured
		.given()
			.body(payload)
			.contentType(ContentType.HTML)
		.when()
			.get(Constants.GET_LIMITED_NUMBER_OF_PRODUCTS_ENDPOINT("2"))
			.prettyPeek()
		.then()
			.assertThat().statusCode(200);

	}

}
