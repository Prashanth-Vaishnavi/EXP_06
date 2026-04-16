package com.example.jwt_auth.controllers;

import com.example.jwt_auth.utils.JwtUtil;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthController {

    private final JwtUtil jwtUtil = new JwtUtil();

    // Dummy login (no DB for now)
    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> user) {

        String username = user.get("username");
        String password = user.get("password");

        // Dummy validation
        if ("user123".equals(username) && "password123".equals(password)) {
            String token = jwtUtil.generateToken(username);

            Map<String, String> response = new HashMap<>();
            response.put("token", token);
            return response;
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }

    @GetMapping("/protected")
    public String protectedRoute() {
        return "You have accessed a protected route!";
    }

}