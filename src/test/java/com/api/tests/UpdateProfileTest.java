package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagmentService;
import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponce;

import io.restassured.response.Response;

public class UpdateProfileTest {
	
	@Test
	public void updateProfileTest()
	{
		AuthService authService = new AuthService();
		Response responce = authService.login(new LoginRequest("uday1234", "uday12345"));
		LoginResponse loginResponce = responce.as(LoginResponse.class);
		System.out.println(responce.asPrettyString());
		
		System.out.println("=====================================");
		
		UserProfileManagmentService userProfileManagmentService = new UserProfileManagmentService();
		responce = userProfileManagmentService.getProfile(loginResponce.getToken());
		System.out.println(responce.asPrettyString());
		UserProfileResponce UserProfileResponce = responce.as(UserProfileResponce.class);
		Assert.assertEquals(UserProfileResponce.getUsername(), "uday1234");
		
		System.out.println("===========================================");
		
		ProfileRequest profileRequest = new ProfileRequest.Builder()
				.firstName("Rohit")
				.lastName("Tatpuje")
				.email("rohitt@gmail.com")
				.mobileNumber("8411861413")
				.build();
		responce = userProfileManagmentService.updateProfile(loginResponce.getToken(), profileRequest);
		System.out.println(responce.asPrettyString());

	}

}
