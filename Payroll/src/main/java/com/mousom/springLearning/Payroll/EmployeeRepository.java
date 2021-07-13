package com.mousom.springLearning.Payroll;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

//Spring makes accessing data easy. By simply declaring the following EmployeeRepository interface we automatically will be able to
//
//Create new Employees
//
//Update existing ones
//
//Delete Employees
//
//Find Employees (one, all, or search by simple or complex properties)
