package com.userdemo.userservice.controller;

import java.util.List;

import com.userdemo.userservice.VO.UserResponseTemplate;
import com.userdemo.userservice.model.User;
import com.userdemo.userservice.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        logger.info("inside of save user from userController");
        return userService.save(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userService.findAllUser();
    }
    @GetMapping("/find/{id}")
    public User findOneUser(@PathVariable("id") Long userId){
        return userService.findOne(userId);
    }
    
    @GetMapping("/details/{id}")
    public UserResponseTemplate findOneUserDetails(@PathVariable("id") Long userId){
        return userService.findUserDetails(userId);
    }


    
}
