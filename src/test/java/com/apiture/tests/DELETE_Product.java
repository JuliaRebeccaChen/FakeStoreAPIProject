package com.apiture.tests;

import org.testng.annotations.Test;

import com.apiture.utils.Constants;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DELETE_Product {
	
	@Test
	public void deleteProduct() {
		
		String payload = "";
		
		RestAssured.baseURI = Constants.BASE_URI;
		
		RestAssured
		.given()
			.body(payload)
			.contentType(ContentType.HTML)
		.when()
			.delete(Constants.PRODUCT + "/10")
			.prettyPeek()
		.then()
			.assertThat().statusCode(204);

	}

}
