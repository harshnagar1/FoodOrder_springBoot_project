package com.harsh.Food.Ordering.controller;

import com.harsh.Food.Ordering.Config.JwtProvider;
import com.harsh.Food.Ordering.Repository.UserRepository;
import com.harsh.Food.Ordering.services.CustomerUserDetailService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/auth")
public class AuthController {

    private UserRepository userRepository;

    private PasswordEncoder passwordEncoder;

    private JwtProvider jwtProvider;

    private CustomerUserDetailService customerUserDetailService;

    private
}
