package com.example.demo.controller;

import com.example.demo.model.AuthRequest;
import com.example.demo.model.AuthResponse;
import com.example.demo.model.User;
import com.example.demo.service.AuthenticationService;
import com.example.demo.service.JwtService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtService JwtService;
    @Autowired
    private UserService userService;
    @Autowired
    private AuthenticationService authenticationService;
/*
    @PostMapping("/login")
    public ResponseEntity<AuthResponse> authenticate(@RequestBody AuthRequest authRequest) {
        String token = authenticationService.authenticate(authRequest.getEmail(), authRequest.getPassword());
        return ResponseEntity.ok(new AuthResponse(token));
    }

 */
}
    /*
    @PostMapping("/login") public ResponseEntity<?> authenticate(@RequestBody AuthRequest authRequest) {
        try {
        //authenticate credentials
            authenticationManager.authenticate(new EmailPasswordAuthenticationToken(authRequest.getEmail(), authRequest.getPassword()));
            //Get user and generate JWT
            User user = userService.getUserByEmail(authRequest.getEmail());
            JwtService.generateToken(user);
            //Return token
            return ResponseEntity.ok(new AuthResponse(token));
        }
        catch (AuthenticationException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials!!");
        }
    }

     */
