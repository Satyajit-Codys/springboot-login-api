package com.example.login.service;

import com.example.login.payload.LoginDto;
import com.example.login.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}