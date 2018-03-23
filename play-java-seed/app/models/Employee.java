package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Employee extends Model {

    @Id
    private Long employeeNum;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String email;

    @Constraints.Required
    private String department;

    @Constraints.Required
    private String DOB;

    public Employee(){

    }

    public Employee(Long employeeNum, String name, String email, String department, String DOB) {
        this.employeeNum = employeeNum;
        this.name = name;
        this.email = email;
        this.department = department;
        this.DOB = DOB;
    }

    public static final Finder<String, Employee> find = new Finder<>(Employee.class);

    public static final List<Employee> findAll(){
        return Employee.find.all();
    }

    public Long getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(Long employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }


}