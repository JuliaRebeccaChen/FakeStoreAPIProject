package com.apiture.tests;

import org.testng.annotations.Test;

import com.apiture.utils.Constants;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GET_LimitedNumberOfCarts {
		
		@Test
		public void getLimitedNumberOfCarts() {
			
			String payload = "";
			
			RestAssured.baseURI = Constants.BASE_URI;
			
			RestAssured
			.given()
				.body(payload)
				.contentType(ContentType.HTML)
			.when()
				.get(Constants.GET_LIMITED_NUMBER_OF_CARTS_ENDPOINT(null) + "3")
				.prettyPeek()
			.then()
				.assertThat().statusCode(200);
		}

}
