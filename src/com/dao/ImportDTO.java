/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

/**
 *
 * @author DUC PHU
 */
public class ImportDTO {
    private String importID;
    private String createdDate;
    private long totalAmount;
    private String employeeID;
    public ImportDTO(){
        
    }
    public ImportDTO(String importID,String createdDate, long amount, String empId) {
        this.importID=importID;
        this.createdDate = createdDate;
        this.totalAmount = amount;
        this.employeeID = empId;
    }

    public String getImportID() {
        return importID;
    }
    
    public String getCreatedDate() {
        return createdDate;
    }

    public long getTotalAmount() {
        return totalAmount;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setImportID(String importID) {
        this.importID = importID;
    }
    
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public void setAmount(int amount) {
        this.totalAmount = amount;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    
    
}