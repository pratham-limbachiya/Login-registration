package com.example.login.Dto;

public class UserDto {

	private String fullname;
	
	private String email;
	
	private String password;
	
	private String role;

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDto(String fullname, String email, String password, String role) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserDto [fullname=" + fullname + ", email=" + email + ", password=" + password + ", role=" + role + "]";
	}

	
}
