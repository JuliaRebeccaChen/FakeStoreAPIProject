package com.apiture.tests;

import org.testng.annotations.Test;

import com.apiture.utils.Constants;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GET_SingleProduct {

	@Test
	public void getSingleProduct() {
		
		String payload = "";
		
		RestAssured.baseURI = Constants.BASE_URI;
		
		RestAssured
		.given()
			.body(payload)
			.contentType(ContentType.HTML)
		.when()
			.get(Constants.SINGLE_PRODUCT_ENDPOINT("1"))
			.prettyPeek()
		.then()
			.assertThat().statusCode(200);

	}


}
