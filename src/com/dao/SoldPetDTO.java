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
public class SoldPetDTO extends ProductDTO{
    private String gender;
    private String breedId;
    private String color;
    private int weight;
    private LocalDate date;
    private String customerID;

    public String getGender() {
        return gender;
    }

    public String getBreedId() {
        return breedId;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBreedId(String breedId) {
        this.breedId = breedId;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    
    
}
