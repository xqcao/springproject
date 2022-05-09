package com.userdemo.userservice.VO;

import com.userdemo.userservice.model.User;

public class UserResponseTemplate {
    private User user;
    private Department department;
    public UserResponseTemplate() {
    }
    public UserResponseTemplate(User user, Department department) {
        this.user = user;
        this.department = department;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    
}
