package com.simple_crud.crud.controller;

import com.simple_crud.crud.entites.User;
import com.simple_crud.crud.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/signup")
    public String showSignUpForm(User user){
        return  "add-user";
    }
}
