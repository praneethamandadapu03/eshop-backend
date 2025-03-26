package com.example.eshop.backend.api.service;



import com.example.eshop.backend.api.entity.Role;
import com.example.eshop.backend.api.payload.LoginDto;
import com.example.eshop.backend.api.payload.RegisterDto;

import java.util.List;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    String createRole(Role role);
    String deleteRole(String name);
    List<Role> getAllRoles();
    String getRoleByName(String name);

}