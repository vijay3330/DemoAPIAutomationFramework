package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListeners.class)
public class LoginApiTest3 {
	
	@Test(description = "Verify that login api is working.")
	public void loginTest()
	{
		LoginRequest loginRequest= new LoginRequest("string", "string");
		AuthService authService = new AuthService();	
		Response response = authService.login(loginRequest);
		 LoginResponse loginResponse = response.as(LoginResponse.class);
		
		System.out.println(response.asPrettyString());
		System.out.println(loginResponse.getToken());
		System.out.println(loginResponse.getType());
		System.out.println(loginResponse.getId());
		System.out.println(loginResponse.getUsername());
		System.out.println(loginResponse.getEmail());
		
		Assert.assertTrue(loginResponse.getType() != null);
		Assert.assertEquals(loginResponse.getType(), "Bearer");
		Assert.assertEquals(loginResponse.getId(), 38);

	}

}
