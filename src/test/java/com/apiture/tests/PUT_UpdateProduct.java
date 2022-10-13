package com.apiture.tests;

import org.testng.annotations.Test;

import com.apiture.utils.Constants;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PUT_UpdateProduct {

	@Test
	public void updateProduct() {
		
		String payload = "";
		
		RestAssured.baseURI = Constants.BASE_URI;
		
		RestAssured.given()
		.body(payload)
		.contentType(ContentType.HTML)
		.when()
		.put(Constants.SINGLE_PRODUCT_ENDPOINT("5"))
		.prettyPeek()
		.then()
		.assertThat().statusCode(201);

	}

}
