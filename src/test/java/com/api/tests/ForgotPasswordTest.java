package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgotPasswordTest {
	
	@Test(description = "Verify if forgot Password Test apis is working.....")
	
	public void forgotPasswordTest()
	{
		AuthService authservice = new AuthService();
		Response responce = authservice.forgotPassword("vijayghadge772@gmail.com");
		System.out.println(responce.asPrettyString()); 
	}

}
