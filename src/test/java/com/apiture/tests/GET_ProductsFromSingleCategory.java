package com.apiture.tests;

import org.testng.annotations.Test;

import com.apiture.utils.Constants;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GET_ProductsFromSingleCategory {
	
	@Test
	public void getProductsFromSingleCategory() {
		
		String payload = "";
		
		RestAssured.baseURI = Constants.BASE_URI;
		
		RestAssured
		.given()
			.body(payload)
			.contentType(ContentType.HTML)
		.when()
			.get(Constants.SINGLE_CATEGORY_ENDPOINT("jewelery"))
			.prettyPeek()
		.then()
			.assertThat().statusCode(200);

	}

}
