package org.example.inheritance;

import java.time.LocalDate;

public class Employee {
     String id; // package protected
    private String name;
    private String departmentName;
    private Double salary;
    private LocalDate birthDate;
    private LocalDate joinDate;

    public Employee() {
    }

    public Employee(String id, String name, String departmentName, Double salary, LocalDate birthDate, LocalDate joinDate) {
        this.id = id;
        this.name = name;
        this.departmentName = departmentName;
        this.salary = salary;
        this.birthDate = birthDate;
        this.joinDate = joinDate;
    }

    public Employee(String id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Double getSalary() {
        return salary;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthDate +
                ", joinDate=" + joinDate +
                '}';
    }
}
