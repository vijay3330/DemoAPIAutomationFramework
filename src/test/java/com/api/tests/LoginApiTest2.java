package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginApiTest2 {

	
	@Test(description = "Verify if Login apis is working.....")
	public void loginTest()
	{
			
		Response responce =given().baseUri("http://64.227.160.186:8080")
				.header("Content-Type","application/json")
				.body("{\"username\": \"uday1234\", \"password\": \"uday12345\"}")
				.post("api/auth/login");
		System.out.println(responce.asPrettyString());
		
		Assert.assertEquals(responce.getStatusCode(), 200);
		
	}

	
	
}
