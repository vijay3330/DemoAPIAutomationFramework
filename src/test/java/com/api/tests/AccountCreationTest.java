package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AccountCreationTest {
	
	
	@Test(description = "Verify if Login apis is working.....")
	public void createAccountTest()
	{
		SignUpRequest signUpRequest= new SignUpRequest.Builder().userName("vijay33")
		.email("vijayghadge772@gmail.com")
		.firstName("vijay")
		.password("vijay123")
		.lastName("ghadge")
		.mobileNumber("7777777779").build();
		
		AuthService authService = new AuthService();
		Response responce = authService.signUp(signUpRequest);
//		System.out.println(responce.asPrettyString());
		Assert.assertEquals(responce.asPrettyString(), "User registered successfully!");
	}
	

}
