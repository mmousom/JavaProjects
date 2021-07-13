package com.mousom.springLearning.Payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

@Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository) {
    return x ->{
        log.info("Preloading" + employeeRepository.save(new Employee("Bilbo Baggins","burglar")));
        log.info("Preloading "+employeeRepository.save(new Employee("Frodo Bagging","Thief")) );
    };
}
}
