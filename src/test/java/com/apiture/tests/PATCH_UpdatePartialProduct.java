package com.apiture.tests;

import org.testng.annotations.Test;

import com.apiture.utils.Constants;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PATCH_UpdatePartialProduct {
	
	@Test
	public void updatePartialProduct() {
		
		String payload = "";
		
		RestAssured.baseURI = Constants.BASE_URI;
		
		RestAssured.given()
		.body(payload)
		.contentType(ContentType.HTML)
		.when()
		.patch(Constants.PRODUCT + "/7")
		.prettyPeek()
		.then()
		.assertThat().statusCode(201);

	}

}
