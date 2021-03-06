package com.mousom.springLearning.Payroll;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Employee {
    @GeneratedValue @Id
    private Long id;

    private String name;
    private String role;

    public Employee() {
    }

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name,this.id,this.role);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if(!(obj instanceof Employee))
            return false;

        Employee employee =(Employee) obj;

        return Objects.equals(this.id,employee.id) && Objects.equals(this.name,employee.name) && Objects.equals(this.role,employee.role);


    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
