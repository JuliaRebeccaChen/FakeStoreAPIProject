package com.apiture.tests;

import org.testng.annotations.Test;

import com.apiture.utils.Constants;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GET_All {

	@Test
	public void getAllCarts() {

		String payload = "";

		RestAssured.baseURI = Constants.BASE_URI;

		RestAssured.given().body(payload).contentType(ContentType.HTML).when().get(Constants.GET_ALL_CARTS_ENDPOINT)
				.prettyPeek().then().assertThat().statusCode(200);
	}

	@Test
	public void getAllProductTest() {

		String payload = "";

		RestAssured.baseURI = Constants.BASE_URI;

		RestAssured.given().body(payload).contentType(ContentType.HTML).when().get(Constants.PRODUCT).prettyPeek()
				.then().assertThat().statusCode(200);
	}

	@Test
	public void getAllUsers() {

		String payload = "";

		RestAssured.baseURI = Constants.BASE_URI;

		RestAssured.given().body(payload).contentType(ContentType.HTML).when().get(Constants.GET_ALL_USERS_ENDPOINT)
				.prettyPeek().then().assertThat().statusCode(200);
	}

	@Test
	public void getAllCategories() {

		String payload = "";

		RestAssured.baseURI = Constants.BASE_URI;

		RestAssured.given().body(payload).contentType(ContentType.HTML).when()
				.get(Constants.GET_ALL_CATEGORIES_ENDPOINT).prettyPeek().then().assertThat().statusCode(200);

	}

}
