package com.apiture.tests;

import org.testng.annotations.Test;

import com.apiture.utils.Constants;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class POST_AddNewProduct {

	@Test
	public void addNewProduct() {
		
		String payload = " {\n"
				+ "                id:31,\n"
				+ "                title:'...',\n"
				+ "                price:'...',\n"
				+ "                category:'...',\n"
				+ "                description:'...',\n"
				+ "                image:'...'\n"
				+ "            }";
		
		RestAssured.baseURI = Constants.BASE_URI;
		
		RestAssured.given()
		.body(payload)
		.contentType(ContentType.HTML)
		.when()
		.post(Constants.PRODUCT)
		.prettyPeek()
		.then()
		.assertThat().statusCode(201);

	}
}
