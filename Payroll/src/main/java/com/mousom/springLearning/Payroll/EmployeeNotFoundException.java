package com.mousom.springLearning.Payroll;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long  id) {
        super("Cound not find employee " + id);
    }
}
