package com.apiture.tests;

import org.testng.annotations.Test;

import com.apiture.utils.Constants;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GET_ProductsInAsdOrder {
	
	@Test
	public void getProductsInAsdOrder() {
		
		String payload = "";
		
		RestAssured.baseURI = Constants.BASE_URI;
		
		RestAssured
		.given()
			.body(payload)
			.contentType(ContentType.HTML)
		.when()
			.get(Constants.GET_PRODUCT_ASD_ORDER_ENDPOINT)
			.prettyPeek()
		.then()
			.assertThat().statusCode(200);

	}
}


