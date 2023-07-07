package com.example.login.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {
    private String usernameOrEmail;
    private String password;
	public String getUsernameOrEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
}
