package com.apiture.tests;

import org.testng.annotations.Test;

import com.apiture.utils.Constants;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GET_CartsWithDateRange {

	@Test
	public void getCartsWithDateRange() {
		
		String payload = "";
		
		RestAssured.baseURI = Constants.BASE_URI;
		
		RestAssured
		.given()
			.body(payload)
			.contentType(ContentType.HTML)
		.when()
			.get(Constants.GET_CARTS_WITH_DATE_RANGE_ENDPOINT("2019-12-10", "2020-10-10"))
			.prettyPeek()
		.then()
			.assertThat().statusCode(200);
	}
	
}
