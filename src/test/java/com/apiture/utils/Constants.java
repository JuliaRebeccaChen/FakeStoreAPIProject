package com.apiture.utils;

public class Constants {
	
	public static final String BASE_URI = "https://fakestoreapi.com";

	public static final String PRODUCT = "/products";
	public static final String CART = "/carts";
	public static final String USER = "/users";

	// GET All
	public static final String GET_ALL_PRODUCTS_ENDPOINT = PRODUCT;
	public static final String GET_ALL_CATEGORIES_ENDPOINT = PRODUCT + "/categories";
	public static final String GET_ALL_CARTS_ENDPOINT = CART;
	public static final String GET_ALL_USERS_ENDPOINT = USER;

	// GET/PUT/UPDATE/PATCH/DELETE Single
	public static final String SINGLE_PRODUCT_ENDPOINT(String productId) {
		return PRODUCT + "/" + productId;
	}

	public static final String SINGLE_CATEGORY_ENDPOINT(String category) {
		return PRODUCT + "/category" + "/" + category;
	}

	public static final String SINGLE_CART_ENDPOINT(String cartId) {
		return CART + "/" + cartId;
	}

	public static final String SINGLE_USER_ENDPOINT(String userId) {
		return USER + "/" + userId;
	}

	// GET limited number
	public static final String GET_LIMITED_NUMBER_OF_PRODUCTS_ENDPOINT(String limit) {
		return PRODUCT + "?limit=" + limit;
	}

	public static final String GET_LIMITED_NUMBER_OF_CARTS_ENDPOINT(String limit) {
		return CART + "?limit=" + limit;
	}

	public static final String GET_LIMITED_NUMBER_OF_USERS_ENDPOINT(String limit) {
		return USER + "?limit=" + limit;
	}

	// GET in order
	public static final String GET_PRODUCT_ASD_ORDER_ENDPOINT = PRODUCT + "?sort=asc";
	public static final String GET_PRODUCT_DESC_ORDER_ENDPOINT = PRODUCT + "?sort=desc";

	public static final String GET_CART_ASD_ORDER_ENDPOINT = CART + "?sort=asc";
	public static final String GET_CART_DESC_ORDER_ENDPOINT = CART + "?sort=desc";

	public static final String GET_USER_ASD_ORDER_ENDPOINT = USER + "?sort=asc";
	public static final String GET_USER_DESC_ORDER_ENDPOINT = USER + "?sort=desc";

	// GET others
	public static String GET_CARTS_WITH_DATE_RANGE_ENDPOINT(String startDate, String endDate) {
		return "/carts/startdate=" + startDate + "&enddate=" + endDate;
	}

	public static final String GET_USER_CART(String userId) {
		return "/carts/user" + "/" + userId;
	}

	// Token
	public static final String LOGIN_ENDPOINT = "/auth/login";

}
