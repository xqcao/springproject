package com.departmentservice.departmentservice.controller;

import java.util.List;

import com.departmentservice.departmentservice.model.Department;
import com.departmentservice.departmentservice.service.DepartmentService;

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
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    Logger logger = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department){
        logger.info("inside of save Department from DepartmentController");
        return departmentService.save(department);
    }

    @GetMapping("/all")
    public List<Department> getAllDepartments(){
        return departmentService.findAllDepartment();
    }
    @GetMapping("/find/{id}")
    public Department findOneDepartment(@PathVariable("id") Long departmentId){
        return departmentService.findOne(departmentId);
    }
}
