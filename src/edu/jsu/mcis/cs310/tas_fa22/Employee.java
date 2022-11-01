package edu.jsu.mcis.cs310.tas_fa22;

import java.time.LocalDateTime;

public class Employee {

    private Integer id;
    private String firstname, middlename, lastname;
    private LocalDateTime active;
    private Badge badge;
    private Department department; // Location of Employees working Department
    private Shift shift; // Assigned Work Shift
    private String employeeType; // temporary/part-time or full-time

    // Constructor
    public Employee(Integer id, String firstname, String middlename, 
            String lastname, LocalDateTime active, Badge badge, 
            Department department, Shift shift, String employeeType) 
    {
        this.id = id;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.active = active;
        this.badge = badge;
        this.department = department;
        this.shift = shift;
        this.employeeType = employeeType;
    }
    
    public Integer getId() {
        return id;
    }
    
    public String getFirstname() {
        return firstname;
    }
    
    public String getMiddlename() {
        return middlename;
    }
    
    public String getLastname() {
        return lastname;
    }
    
    public LocalDateTime getActive() {
        return active;
    }
    
    public Badge getBadge() {
        return badge;
    }
    
    public Department getDepartment() {
        return department;
    }
    
    public Shift getShift() {
        return shift;
    }
    
    public String getEmployeeType() {
        return employeeType;
    }
    
    @Override
    public String toString() {
        
        return "id: " +id+": "+lastname+", "+firstname+" "+middlename+""
                + " (#"+badge+"), "+employeeType+", +department+"+active;
    }
}