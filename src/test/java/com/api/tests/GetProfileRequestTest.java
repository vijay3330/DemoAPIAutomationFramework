package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagmentService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponce;

import io.restassured.response.Response;

public class GetProfileRequestTest {
	
		
	@Test
	public void getProfileInfoTest()
	{
		AuthService authService= new AuthService();
		Response response = authService.login(new LoginRequest("uday1234", "uday12345"));
		LoginResponse loginResponce = response.as(LoginResponse.class);
		System.out.println(loginResponce.getToken());
		
		UserProfileManagmentService userProfileManagmentService = new UserProfileManagmentService();
		response = userProfileManagmentService.getProfile(loginResponce.getToken());
		UserProfileResponce userProfileResponce = response.as(UserProfileResponce.class);
		System.out.println(userProfileResponce.getUsername());
	}

}
