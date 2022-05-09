package com.departmentservice.departmentservice.service;

import java.util.List;

import com.departmentservice.departmentservice.model.Department;
import com.departmentservice.departmentservice.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveOne(Department dep){
        return departmentRepository.save(dep);
    }


    public Department findOne(Long depId){
        return departmentRepository.findByDepartmentId(depId);
    }
    public List<Department> findAll(){
        return departmentRepository.findAll();
    }
   


    public List<Department> findAllDepartment() {
        return departmentRepository.findAll();
    }


    public Department save(Department department) {
        return departmentRepository.save(department);
    }

}
