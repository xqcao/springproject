package com.departmentservice.departmentservice.repository;

import com.departmentservice.departmentservice.model.Department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    Department findByDepartmentId(Long depId);


    
}
