package com.userdemo.userservice.service;

import java.util.List;

import com.userdemo.userservice.VO.Department;
import com.userdemo.userservice.VO.UserResponseTemplate;
import com.userdemo.userservice.model.User;
import com.userdemo.userservice.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User save(User user){
        return userRepository.save(user);
    }
    public User findOne(Long userId){
        return userRepository.findByUserId(userId);
    }
    public List<User> findAllUser(){
        return userRepository.findAll();
    }
    
    public UserResponseTemplate findUserDetails(Long userId) {
        UserResponseTemplate vo = new UserResponseTemplate();
        User user = userRepository.findByUserId(userId);
        vo.setUser(user);
        // Department dep = restTemplate.getForObject("http://localhost:9001/departments/find/"+user.getDepartmentId(), Department.class);
        Department dep = restTemplate.getForObject("http://DEPARTMENT-SVC/departments/find/"+user.getDepartmentId(), Department.class);

        vo.setDepartment(dep);
        return vo;
    }
}
