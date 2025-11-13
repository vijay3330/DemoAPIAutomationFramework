package com.api.models.response;

import java.util.List;

public class LoginResponse {
	
	private String token;
	private String type;
	private int id;
	private String username;
	private String email;
	private List<String> roles;
	private String timestamp;
	private String status;
	
	public LoginResponse()
	{
		
	}
	
	public LoginResponse(String token, String type, int id, String username, String email, List<String> roles, String timestamp, String status ) {
		super();
		this.token = token;
		this.type = type;
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
		this.timestamp=timestamp;
		this.status=status;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return "LoginResponse [token=" + token + ", type=" + type + ", id=" + id + ", username=" + username + ", email="
				+ email + ", roles=" + roles + ", timestamp=" + timestamp + ", status=" + status+ " ]";
	}
	
	

	

}
