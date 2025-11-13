package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginApiTest {
	
	
	@Test(description = "Verify if Login apis is working.....")
	public void loginTest()
	{
		RestAssured.baseURI="http://64.227.160.186:8080";
		RequestSpecification x = RestAssured.given();	
		RequestSpecification y = x.header("Content-Type","application/json");
		RequestSpecification z = y.body("{\"username\": \"uday1234\", \"password\": \"uday12345\"}");
		Response responce = z.post("api/auth/login");
		System.out.println(responce.asPrettyString());
		
		Assert.assertEquals(responce.getStatusCode(), 20);
		
	}

}
