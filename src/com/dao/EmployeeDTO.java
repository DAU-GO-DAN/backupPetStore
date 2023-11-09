/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import java.time.LocalDate;

/**
 *
 * @author DUC PHU
 */
public class EmployeeDTO {
    private String id;
    private String name;
    private String phone;
    private String address;
    private LocalDate createdDate;
    private String role;
    private long salary;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String id, String name, String phone, String address, LocalDate createdDate, String role, long salary) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.createdDate = createdDate;
        this.role = role;
        this.salary = salary;
    }

    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public String getRole() {
        return role;
    }

    public long getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    
    
}
